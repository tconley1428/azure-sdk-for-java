// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.Context;

/** Samples for Backups GetStatus. */
public final class BackupsGetStatusSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2022-01-01/examples/Volumes_BackupStatus.json
     */
    /**
     * Sample code: Volumes_BackupStatus.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesBackupStatus(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.backups().getStatusWithResponse("myRG", "account1", "pool1", "volume1", Context.NONE);
    }
}
