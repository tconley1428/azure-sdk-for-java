// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.util.Context;

/** Samples for FileShares List. */
public final class FileSharesListSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-04-01/examples/FileSharesList.json
     */
    /**
     * Sample code: ListShares.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listShares(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getFileShares()
            .list("res9290", "sto1590", null, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-04-01/examples/DeletedFileSharesList.json
     */
    /**
     * Sample code: ListDeletedShares.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listDeletedShares(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getFileShares()
            .list("res9290", "sto1590", null, null, "deleted", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-04-01/examples/FileShareSnapshotsList.json
     */
    /**
     * Sample code: ListShareSnapshots.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listShareSnapshots(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getFileShares()
            .list("res9290", "sto1590", null, null, "snapshots", Context.NONE);
    }
}