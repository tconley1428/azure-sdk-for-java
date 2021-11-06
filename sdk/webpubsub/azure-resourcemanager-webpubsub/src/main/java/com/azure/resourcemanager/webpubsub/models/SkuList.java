// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.resourcemanager.webpubsub.fluent.models.SkuListInner;
import java.util.List;

/** An immutable client-side representation of SkuList. */
public interface SkuList {
    /**
     * Gets the value property: The list of skus available for the resource.
     *
     * @return the value value.
     */
    List<Sku> value();

    /**
     * Gets the nextLink property: The URL the client should use to fetch the next page (per server side paging). It's
     * null for now, added for future use.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.webpubsub.fluent.models.SkuListInner object.
     *
     * @return the inner object.
     */
    SkuListInner innerModel();
}