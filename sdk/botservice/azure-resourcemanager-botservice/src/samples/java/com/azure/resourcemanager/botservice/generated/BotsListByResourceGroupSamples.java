// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.generated;

import com.azure.core.util.Context;

/** Samples for Bots ListByResourceGroup. */
public final class BotsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/ListBotsByResourceGroup.json
     */
    /**
     * Sample code: List Bots by Resource Group.
     *
     * @param manager Entry point to BotServiceManager.
     */
    public static void listBotsByResourceGroup(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.bots().listByResourceGroup("OneResourceGroupName", Context.NONE);
    }
}