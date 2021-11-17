// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.stream.binder.eventhubs;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.context.TestPropertySource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = EventHubsBinderBatchModeIT.TestConfig.class)
@TestPropertySource(properties =
    {
    "spring.cloud.stream.eventhubs.bindings.consume-in-0.consumer.checkpoint.mode=BATCH",
    "spring.cloud.stream.bindings.consume-in-0.destination=test-eventhub-batch",
    "spring.cloud.stream.bindings.supply-out-0.destination=test-eventhub-batch",
    "spring.cloud.azure.eventhubs.processor.checkpoint-store.container-name=test-eventhub-batch"
    })
public class EventHubsBinderBatchModeIT {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventHubsBinderBatchModeIT.class);

    private static final String MESSAGE = UUID.randomUUID().toString();

    private static final CountDownLatch LATCH = new CountDownLatch(1);

    @Autowired
    private Sinks.Many<Message<String>> many;

    @EnableAutoConfiguration
    public static class TestConfig {

        @Bean
        public Sinks.Many<Message<String>> many() {
            return Sinks.many().unicast().onBackpressureBuffer();
        }

        @Bean
        public Supplier<Flux<Message<String>>> supply(Sinks.Many<Message<String>> many) {
            return () -> many.asFlux()
                             .doOnNext(m -> LOGGER.info("Manually sending message {}", m.getPayload()))
                             .doOnError(t -> LOGGER.error("Error encountered", t));
        }

        @Bean
        public Consumer<Message<String>> consume() {
            return message -> {
                LOGGER.info("EventHubBinderBatchModeIT: New message received: '{}'", message.getPayload());
                if (message.getPayload().equals(EventHubsBinderBatchModeIT.MESSAGE)) {
                    LATCH.countDown();
                }
            };
        }
    }

    @Test
    public void testSendAndReceiveMessage() throws InterruptedException {
        LOGGER.info("EventHubBinderBatchModeIT begin.");
        EventHubsBinderBatchModeIT.LATCH.await(15, TimeUnit.SECONDS);
        LOGGER.info("Send a message:" + MESSAGE + ".");
        many.emitNext(new GenericMessage<>(MESSAGE), Sinks.EmitFailureHandler.FAIL_FAST);
        assertThat(EventHubsBinderBatchModeIT.LATCH.await(600, TimeUnit.SECONDS)).isTrue();
        LOGGER.info("EventHubBinderBatchModeIT end.");
    }
}