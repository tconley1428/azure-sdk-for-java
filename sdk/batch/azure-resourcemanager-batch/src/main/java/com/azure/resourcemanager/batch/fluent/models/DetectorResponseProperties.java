// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Detector response properties. */
@Fluent
public final class DetectorResponseProperties {
    /*
     * A base64 encoded string that represents the content of a detector.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the value property: A base64 encoded string that represents the content of a detector.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: A base64 encoded string that represents the content of a detector.
     *
     * @param value the value value to set.
     * @return the DetectorResponseProperties object itself.
     */
    public DetectorResponseProperties withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
