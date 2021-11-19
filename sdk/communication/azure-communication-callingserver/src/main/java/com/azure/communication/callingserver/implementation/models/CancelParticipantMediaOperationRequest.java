// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload for stopping a media operation for a participant. */
@Fluent
public final class CancelParticipantMediaOperationRequest {
    /*
     * The identifier of the participant.
     */
    @JsonProperty(value = "identifier", required = true)
    private CommunicationIdentifierModel identifier;

    /*
     * The operationId of the media operation to cancel.
     */
    @JsonProperty(value = "mediaOperationId", required = true)
    private String mediaOperationId;

    /**
     * Get the identifier property: The identifier of the participant.
     *
     * @return the identifier value.
     */
    public CommunicationIdentifierModel getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: The identifier of the participant.
     *
     * @param identifier the identifier value to set.
     * @return the CancelParticipantMediaOperationRequest object itself.
     */
    public CancelParticipantMediaOperationRequest setIdentifier(CommunicationIdentifierModel identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the mediaOperationId property: The operationId of the media operation to cancel.
     *
     * @return the mediaOperationId value.
     */
    public String getMediaOperationId() {
        return this.mediaOperationId;
    }

    /**
     * Set the mediaOperationId property: The operationId of the media operation to cancel.
     *
     * @param mediaOperationId the mediaOperationId value to set.
     * @return the CancelParticipantMediaOperationRequest object itself.
     */
    public CancelParticipantMediaOperationRequest setMediaOperationId(String mediaOperationId) {
        this.mediaOperationId = mediaOperationId;
        return this;
    }
}