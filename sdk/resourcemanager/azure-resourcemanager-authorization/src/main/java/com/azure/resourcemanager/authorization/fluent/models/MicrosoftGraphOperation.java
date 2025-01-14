// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** operation. */
@Fluent
public class MicrosoftGraphOperation extends MicrosoftGraphEntity {
    /*
     * The start time of the operation.
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * The time of the last action of the operation.
     */
    @JsonProperty(value = "lastActionDateTime")
    private OffsetDateTime lastActionDateTime;

    /*
     * operationStatus
     */
    @JsonProperty(value = "status")
    private MicrosoftGraphOperationStatus status;

    /*
     * operation
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the createdDateTime property: The start time of the operation.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The start time of the operation.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphOperation object itself.
     */
    public MicrosoftGraphOperation withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the lastActionDateTime property: The time of the last action of the operation.
     *
     * @return the lastActionDateTime value.
     */
    public OffsetDateTime lastActionDateTime() {
        return this.lastActionDateTime;
    }

    /**
     * Set the lastActionDateTime property: The time of the last action of the operation.
     *
     * @param lastActionDateTime the lastActionDateTime value to set.
     * @return the MicrosoftGraphOperation object itself.
     */
    public MicrosoftGraphOperation withLastActionDateTime(OffsetDateTime lastActionDateTime) {
        this.lastActionDateTime = lastActionDateTime;
        return this;
    }

    /**
     * Get the status property: operationStatus.
     *
     * @return the status value.
     */
    public MicrosoftGraphOperationStatus status() {
        return this.status;
    }

    /**
     * Set the status property: operationStatus.
     *
     * @param status the status value to set.
     * @return the MicrosoftGraphOperation object itself.
     */
    public MicrosoftGraphOperation withStatus(MicrosoftGraphOperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the additionalProperties property: operation.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: operation.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOperation object itself.
     */
    public MicrosoftGraphOperation withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOperation withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
