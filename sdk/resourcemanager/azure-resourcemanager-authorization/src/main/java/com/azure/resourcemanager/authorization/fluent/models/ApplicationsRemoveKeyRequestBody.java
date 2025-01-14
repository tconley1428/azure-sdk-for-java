// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/** The ApplicationsRemoveKeyRequestBody model. */
@Fluent
public final class ApplicationsRemoveKeyRequestBody {
    /*
     * The keyId property.
     */
    @JsonProperty(value = "keyId")
    private UUID keyId;

    /*
     * The proof property.
     */
    @JsonProperty(value = "proof")
    private String proof;

    /*
     * Dictionary of <AnyObject>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the keyId property: The keyId property.
     *
     * @return the keyId value.
     */
    public UUID keyId() {
        return this.keyId;
    }

    /**
     * Set the keyId property: The keyId property.
     *
     * @param keyId the keyId value to set.
     * @return the ApplicationsRemoveKeyRequestBody object itself.
     */
    public ApplicationsRemoveKeyRequestBody withKeyId(UUID keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get the proof property: The proof property.
     *
     * @return the proof value.
     */
    public String proof() {
        return this.proof;
    }

    /**
     * Set the proof property: The proof property.
     *
     * @param proof the proof value to set.
     * @return the ApplicationsRemoveKeyRequestBody object itself.
     */
    public ApplicationsRemoveKeyRequestBody withProof(String proof) {
        this.proof = proof;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;AnyObject&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;AnyObject&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ApplicationsRemoveKeyRequestBody object itself.
     */
    public ApplicationsRemoveKeyRequestBody withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
