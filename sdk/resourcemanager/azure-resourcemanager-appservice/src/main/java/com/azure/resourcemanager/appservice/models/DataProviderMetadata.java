// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Additional configuration for a data providers. */
@Fluent
public final class DataProviderMetadata {
    /*
     * The providerName property.
     */
    @JsonProperty(value = "providerName")
    private String providerName;

    /*
     * Settings for the data provider
     */
    @JsonProperty(value = "propertyBag", access = JsonProperty.Access.WRITE_ONLY)
    private List<KeyValuePairStringObject> propertyBag;

    /**
     * Get the providerName property: The providerName property.
     *
     * @return the providerName value.
     */
    public String providerName() {
        return this.providerName;
    }

    /**
     * Set the providerName property: The providerName property.
     *
     * @param providerName the providerName value to set.
     * @return the DataProviderMetadata object itself.
     */
    public DataProviderMetadata withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * Get the propertyBag property: Settings for the data provider.
     *
     * @return the propertyBag value.
     */
    public List<KeyValuePairStringObject> propertyBag() {
        return this.propertyBag;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (propertyBag() != null) {
            propertyBag().forEach(e -> e.validate());
        }
    }
}
