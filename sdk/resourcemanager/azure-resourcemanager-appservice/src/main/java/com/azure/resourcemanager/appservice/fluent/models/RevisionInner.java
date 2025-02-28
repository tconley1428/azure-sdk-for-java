// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.appservice.models.RevisionHealthState;
import com.azure.resourcemanager.appservice.models.RevisionProvisioningState;
import com.azure.resourcemanager.appservice.models.Template;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Container App Revision. */
@Fluent
public final class RevisionInner extends Resource {
    /*
     * Revision resource specific properties
     */
    @JsonProperty(value = "properties")
    private RevisionProperties innerProperties;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the innerProperties property: Revision resource specific properties.
     *
     * @return the innerProperties value.
     */
    private RevisionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the RevisionInner object itself.
     */
    public RevisionInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RevisionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RevisionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the createdTime property: Timestamp describing when the revision was created by controller.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTime();
    }

    /**
     * Get the fqdn property: Fully qualified domain name of the revision.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().fqdn();
    }

    /**
     * Get the template property: Container App Revision Template with all possible settings and the defaults if user
     * did not provide them. The defaults are populated as they were at the creation time.
     *
     * @return the template value.
     */
    public Template template() {
        return this.innerProperties() == null ? null : this.innerProperties().template();
    }

    /**
     * Get the active property: Boolean describing if the Revision is Active.
     *
     * @return the active value.
     */
    public Boolean active() {
        return this.innerProperties() == null ? null : this.innerProperties().active();
    }

    /**
     * Get the replicas property: Number of pods currently running for this revision.
     *
     * @return the replicas value.
     */
    public Integer replicas() {
        return this.innerProperties() == null ? null : this.innerProperties().replicas();
    }

    /**
     * Get the trafficWeight property: Traffic weight assigned to this revision.
     *
     * @return the trafficWeight value.
     */
    public Integer trafficWeight() {
        return this.innerProperties() == null ? null : this.innerProperties().trafficWeight();
    }

    /**
     * Get the provisioningError property: Optional Field - Platform Error Message.
     *
     * @return the provisioningError value.
     */
    public String provisioningError() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningError();
    }

    /**
     * Get the healthState property: Current health State of the revision.
     *
     * @return the healthState value.
     */
    public RevisionHealthState healthState() {
        return this.innerProperties() == null ? null : this.innerProperties().healthState();
    }

    /**
     * Get the provisioningState property: Current provisioning State of the revision.
     *
     * @return the provisioningState value.
     */
    public RevisionProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
