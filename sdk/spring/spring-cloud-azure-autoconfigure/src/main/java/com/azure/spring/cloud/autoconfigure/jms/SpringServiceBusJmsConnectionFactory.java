// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.jms;

import com.microsoft.azure.servicebus.jms.ServiceBusJmsConnectionFactory;
import com.microsoft.azure.servicebus.jms.ServiceBusJmsConnectionFactorySettings;


/**
 * A subclass of JmsConnectionFactory to set customized user agent.
 */
public class SpringServiceBusJmsConnectionFactory extends ServiceBusJmsConnectionFactory {
    /**
     * Creates a new instance of {@link SpringServiceBusJmsConnectionFactory}.
     *
     * @param connectionString the connection string
     * @param settings the ServiceBus JMS connection factory settings
     */
    public SpringServiceBusJmsConnectionFactory(
        String connectionString,
        ServiceBusJmsConnectionFactorySettings settings
    ) {
        super(connectionString, settings);
    }


    /**
     * Set customized user agent.
     *
     * @param customUserAgent the customized user agent
     */
    public void setCustomUserAgent(String customUserAgent) {
        super.setCustomUserAgent(customUserAgent);
    }
}