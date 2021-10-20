// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The folder that this Spark job definition is in. If not specified, this Spark job definition will appear at the root
 * level.
 */
@Fluent
public final class SparkJobDefinitionFolder {
    /*
     * The name of the folder that this Spark job definition is in.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: The name of the folder that this Spark job definition is in.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the folder that this Spark job definition is in.
     *
     * @param name the name value to set.
     * @return the SparkJobDefinitionFolder object itself.
     */
    public SparkJobDefinitionFolder setName(String name) {
        this.name = name;
        return this;
    }
}