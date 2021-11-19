// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The update audio routing group request. */
@Fluent
public final class UpdateAudioRoutingGroupRequest {
    /*
     * The target identities that would be receivers in the audio routing
     * group.
     */
    @JsonProperty(value = "targets", required = true)
    private List<CommunicationIdentifierModel> targets;

    /**
     * Get the targets property: The target identities that would be receivers in the audio routing group.
     *
     * @return the targets value.
     */
    public List<CommunicationIdentifierModel> getTargets() {
        return this.targets;
    }

    /**
     * Set the targets property: The target identities that would be receivers in the audio routing group.
     *
     * @param targets the targets value to set.
     * @return the UpdateAudioRoutingGroupRequest object itself.
     */
    public UpdateAudioRoutingGroupRequest setTargets(List<CommunicationIdentifierModel> targets) {
        this.targets = targets;
        return this;
    }
}