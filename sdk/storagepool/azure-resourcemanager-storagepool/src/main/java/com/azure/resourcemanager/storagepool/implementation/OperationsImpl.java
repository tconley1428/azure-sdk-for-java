// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagepool.fluent.OperationsClient;
import com.azure.resourcemanager.storagepool.fluent.models.StoragePoolRPOperationInner;
import com.azure.resourcemanager.storagepool.models.Operations;
import com.azure.resourcemanager.storagepool.models.StoragePoolRPOperation;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.storagepool.StoragePoolManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient, com.azure.resourcemanager.storagepool.StoragePoolManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StoragePoolRPOperation> list() {
        PagedIterable<StoragePoolRPOperationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new StoragePoolRPOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<StoragePoolRPOperation> list(Context context) {
        PagedIterable<StoragePoolRPOperationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new StoragePoolRPOperationImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagepool.StoragePoolManager manager() {
        return this.serviceManager;
    }
}