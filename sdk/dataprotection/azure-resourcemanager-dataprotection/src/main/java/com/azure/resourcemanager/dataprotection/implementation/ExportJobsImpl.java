// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.ExportJobsClient;
import com.azure.resourcemanager.dataprotection.models.ExportJobs;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExportJobsImpl implements ExportJobs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportJobsImpl.class);

    private final ExportJobsClient innerClient;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public ExportJobsImpl(
        ExportJobsClient innerClient, com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void trigger(String resourceGroupName, String vaultName) {
        this.serviceClient().trigger(resourceGroupName, vaultName);
    }

    public void trigger(String resourceGroupName, String vaultName, Context context) {
        this.serviceClient().trigger(resourceGroupName, vaultName, context);
    }

    private ExportJobsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}