// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.dataprotection.fluent.BackupInstancesClient;
import com.azure.resourcemanager.dataprotection.fluent.BackupPoliciesClient;
import com.azure.resourcemanager.dataprotection.fluent.BackupVaultOperationResultsClient;
import com.azure.resourcemanager.dataprotection.fluent.BackupVaultsClient;
import com.azure.resourcemanager.dataprotection.fluent.DataProtectionClient;
import com.azure.resourcemanager.dataprotection.fluent.DataProtectionOperationsClient;
import com.azure.resourcemanager.dataprotection.fluent.DataProtectionsClient;
import com.azure.resourcemanager.dataprotection.fluent.ExportJobsClient;
import com.azure.resourcemanager.dataprotection.fluent.ExportJobsOperationResultsClient;
import com.azure.resourcemanager.dataprotection.fluent.JobsClient;
import com.azure.resourcemanager.dataprotection.fluent.OperationResultsClient;
import com.azure.resourcemanager.dataprotection.fluent.OperationStatusClient;
import com.azure.resourcemanager.dataprotection.fluent.RecoveryPointsClient;
import com.azure.resourcemanager.dataprotection.fluent.ResourceGuardsClient;
import com.azure.resourcemanager.dataprotection.fluent.RestorableTimeRangesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the DataProtectionClientImpl type. */
@ServiceClient(builder = DataProtectionClientBuilder.class)
public final class DataProtectionClientImpl implements DataProtectionClient {
    private final ClientLogger logger = new ClientLogger(DataProtectionClientImpl.class);

    /** The subscription Id. */
    private final String subscriptionId;

    /**
     * Gets The subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The BackupVaultsClient object to access its operations. */
    private final BackupVaultsClient backupVaults;

    /**
     * Gets the BackupVaultsClient object to access its operations.
     *
     * @return the BackupVaultsClient object.
     */
    public BackupVaultsClient getBackupVaults() {
        return this.backupVaults;
    }

    /** The OperationResultsClient object to access its operations. */
    private final OperationResultsClient operationResults;

    /**
     * Gets the OperationResultsClient object to access its operations.
     *
     * @return the OperationResultsClient object.
     */
    public OperationResultsClient getOperationResults() {
        return this.operationResults;
    }

    /** The OperationStatusClient object to access its operations. */
    private final OperationStatusClient operationStatus;

    /**
     * Gets the OperationStatusClient object to access its operations.
     *
     * @return the OperationStatusClient object.
     */
    public OperationStatusClient getOperationStatus() {
        return this.operationStatus;
    }

    /** The BackupVaultOperationResultsClient object to access its operations. */
    private final BackupVaultOperationResultsClient backupVaultOperationResults;

    /**
     * Gets the BackupVaultOperationResultsClient object to access its operations.
     *
     * @return the BackupVaultOperationResultsClient object.
     */
    public BackupVaultOperationResultsClient getBackupVaultOperationResults() {
        return this.backupVaultOperationResults;
    }

    /** The DataProtectionsClient object to access its operations. */
    private final DataProtectionsClient dataProtections;

    /**
     * Gets the DataProtectionsClient object to access its operations.
     *
     * @return the DataProtectionsClient object.
     */
    public DataProtectionsClient getDataProtections() {
        return this.dataProtections;
    }

    /** The DataProtectionOperationsClient object to access its operations. */
    private final DataProtectionOperationsClient dataProtectionOperations;

    /**
     * Gets the DataProtectionOperationsClient object to access its operations.
     *
     * @return the DataProtectionOperationsClient object.
     */
    public DataProtectionOperationsClient getDataProtectionOperations() {
        return this.dataProtectionOperations;
    }

    /** The BackupPoliciesClient object to access its operations. */
    private final BackupPoliciesClient backupPolicies;

    /**
     * Gets the BackupPoliciesClient object to access its operations.
     *
     * @return the BackupPoliciesClient object.
     */
    public BackupPoliciesClient getBackupPolicies() {
        return this.backupPolicies;
    }

    /** The BackupInstancesClient object to access its operations. */
    private final BackupInstancesClient backupInstances;

    /**
     * Gets the BackupInstancesClient object to access its operations.
     *
     * @return the BackupInstancesClient object.
     */
    public BackupInstancesClient getBackupInstances() {
        return this.backupInstances;
    }

    /** The RecoveryPointsClient object to access its operations. */
    private final RecoveryPointsClient recoveryPoints;

    /**
     * Gets the RecoveryPointsClient object to access its operations.
     *
     * @return the RecoveryPointsClient object.
     */
    public RecoveryPointsClient getRecoveryPoints() {
        return this.recoveryPoints;
    }

    /** The JobsClient object to access its operations. */
    private final JobsClient jobs;

    /**
     * Gets the JobsClient object to access its operations.
     *
     * @return the JobsClient object.
     */
    public JobsClient getJobs() {
        return this.jobs;
    }

    /** The RestorableTimeRangesClient object to access its operations. */
    private final RestorableTimeRangesClient restorableTimeRanges;

    /**
     * Gets the RestorableTimeRangesClient object to access its operations.
     *
     * @return the RestorableTimeRangesClient object.
     */
    public RestorableTimeRangesClient getRestorableTimeRanges() {
        return this.restorableTimeRanges;
    }

    /** The ExportJobsClient object to access its operations. */
    private final ExportJobsClient exportJobs;

    /**
     * Gets the ExportJobsClient object to access its operations.
     *
     * @return the ExportJobsClient object.
     */
    public ExportJobsClient getExportJobs() {
        return this.exportJobs;
    }

    /** The ExportJobsOperationResultsClient object to access its operations. */
    private final ExportJobsOperationResultsClient exportJobsOperationResults;

    /**
     * Gets the ExportJobsOperationResultsClient object to access its operations.
     *
     * @return the ExportJobsOperationResultsClient object.
     */
    public ExportJobsOperationResultsClient getExportJobsOperationResults() {
        return this.exportJobsOperationResults;
    }

    /** The ResourceGuardsClient object to access its operations. */
    private final ResourceGuardsClient resourceGuards;

    /**
     * Gets the ResourceGuardsClient object to access its operations.
     *
     * @return the ResourceGuardsClient object.
     */
    public ResourceGuardsClient getResourceGuards() {
        return this.resourceGuards;
    }

    /**
     * Initializes an instance of DataProtectionClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The subscription Id.
     * @param endpoint server parameter.
     */
    DataProtectionClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2021-07-01";
        this.backupVaults = new BackupVaultsClientImpl(this);
        this.operationResults = new OperationResultsClientImpl(this);
        this.operationStatus = new OperationStatusClientImpl(this);
        this.backupVaultOperationResults = new BackupVaultOperationResultsClientImpl(this);
        this.dataProtections = new DataProtectionsClientImpl(this);
        this.dataProtectionOperations = new DataProtectionOperationsClientImpl(this);
        this.backupPolicies = new BackupPoliciesClientImpl(this);
        this.backupInstances = new BackupInstancesClientImpl(this);
        this.recoveryPoints = new RecoveryPointsClientImpl(this);
        this.jobs = new JobsClientImpl(this);
        this.restorableTimeRanges = new RestorableTimeRangesClientImpl(this);
        this.exportJobs = new ExportJobsClientImpl(this);
        this.exportJobsOperationResults = new ExportJobsOperationResultsClientImpl(this);
        this.resourceGuards = new ResourceGuardsClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        for (Map.Entry<Object, Object> entry : this.getContext().getValues().entrySet()) {
            context = context.addData(entry.getKey(), entry.getValue());
        }
        return context;
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        logger.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }
}