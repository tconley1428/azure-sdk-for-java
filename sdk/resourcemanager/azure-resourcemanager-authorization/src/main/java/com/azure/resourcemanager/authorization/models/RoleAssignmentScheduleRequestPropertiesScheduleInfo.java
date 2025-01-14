// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schedule info of the role assignment schedule. */
@Fluent
public final class RoleAssignmentScheduleRequestPropertiesScheduleInfo {
    /*
     * Start DateTime of the role assignment schedule.
     */
    @JsonProperty(value = "startDateTime")
    private OffsetDateTime startDateTime;

    /*
     * Expiration of the role assignment schedule
     */
    @JsonProperty(value = "expiration")
    private RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration expiration;

    /**
     * Get the startDateTime property: Start DateTime of the role assignment schedule.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: Start DateTime of the role assignment schedule.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the RoleAssignmentScheduleRequestPropertiesScheduleInfo object itself.
     */
    public RoleAssignmentScheduleRequestPropertiesScheduleInfo withStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the expiration property: Expiration of the role assignment schedule.
     *
     * @return the expiration value.
     */
    public RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration property: Expiration of the role assignment schedule.
     *
     * @param expiration the expiration value to set.
     * @return the RoleAssignmentScheduleRequestPropertiesScheduleInfo object itself.
     */
    public RoleAssignmentScheduleRequestPropertiesScheduleInfo withExpiration(
        RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (expiration() != null) {
            expiration().validate();
        }
    }
}
