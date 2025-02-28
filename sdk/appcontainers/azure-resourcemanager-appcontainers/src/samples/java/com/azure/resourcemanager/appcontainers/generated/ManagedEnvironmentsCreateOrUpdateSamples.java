// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.resourcemanager.appcontainers.models.AppLogsConfiguration;
import com.azure.resourcemanager.appcontainers.models.LogAnalyticsConfiguration;

/** Samples for ManagedEnvironments CreateOrUpdate. */
public final class ManagedEnvironmentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-03-01/examples/ManagedEnvironments_CreateOrUpdate.json
     */
    /**
     * Sample code: Create environments.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createEnvironments(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .managedEnvironments()
            .define("testcontainerenv")
            .withRegion("East US")
            .withExistingResourceGroup("examplerg")
            .withDaprAIConnectionString(
                "InstrumentationKey=00000000-0000-0000-0000-000000000000;IngestionEndpoint=https://northcentralus-0.in.applicationinsights.azure.com/")
            .withAppLogsConfiguration(
                new AppLogsConfiguration()
                    .withLogAnalyticsConfiguration(
                        new LogAnalyticsConfiguration().withCustomerId("string").withSharedKey("string")))
            .withZoneRedundant(true)
            .create();
    }
}
