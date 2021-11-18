// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of Cognitive Services account commitment plan. */
@Fluent
public final class CommitmentPlanProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CommitmentPlanProperties.class);

    /*
     * Account hosting model.
     */
    @JsonProperty(value = "hostingModel")
    private HostingModel hostingModel;

    /*
     * Commitment plan type.
     */
    @JsonProperty(value = "planType")
    private String planType;

    /*
     * Cognitive Services account commitment period.
     */
    @JsonProperty(value = "current")
    private CommitmentPeriod current;

    /*
     * AutoRenew commitment plan.
     */
    @JsonProperty(value = "autoRenew")
    private Boolean autoRenew;

    /*
     * Cognitive Services account commitment period.
     */
    @JsonProperty(value = "next")
    private CommitmentPeriod next;

    /*
     * Cognitive Services account commitment period.
     */
    @JsonProperty(value = "last", access = JsonProperty.Access.WRITE_ONLY)
    private CommitmentPeriod last;

    /**
     * Get the hostingModel property: Account hosting model.
     *
     * @return the hostingModel value.
     */
    public HostingModel hostingModel() {
        return this.hostingModel;
    }

    /**
     * Set the hostingModel property: Account hosting model.
     *
     * @param hostingModel the hostingModel value to set.
     * @return the CommitmentPlanProperties object itself.
     */
    public CommitmentPlanProperties withHostingModel(HostingModel hostingModel) {
        this.hostingModel = hostingModel;
        return this;
    }

    /**
     * Get the planType property: Commitment plan type.
     *
     * @return the planType value.
     */
    public String planType() {
        return this.planType;
    }

    /**
     * Set the planType property: Commitment plan type.
     *
     * @param planType the planType value to set.
     * @return the CommitmentPlanProperties object itself.
     */
    public CommitmentPlanProperties withPlanType(String planType) {
        this.planType = planType;
        return this;
    }

    /**
     * Get the current property: Cognitive Services account commitment period.
     *
     * @return the current value.
     */
    public CommitmentPeriod current() {
        return this.current;
    }

    /**
     * Set the current property: Cognitive Services account commitment period.
     *
     * @param current the current value to set.
     * @return the CommitmentPlanProperties object itself.
     */
    public CommitmentPlanProperties withCurrent(CommitmentPeriod current) {
        this.current = current;
        return this;
    }

    /**
     * Get the autoRenew property: AutoRenew commitment plan.
     *
     * @return the autoRenew value.
     */
    public Boolean autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set the autoRenew property: AutoRenew commitment plan.
     *
     * @param autoRenew the autoRenew value to set.
     * @return the CommitmentPlanProperties object itself.
     */
    public CommitmentPlanProperties withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Get the next property: Cognitive Services account commitment period.
     *
     * @return the next value.
     */
    public CommitmentPeriod next() {
        return this.next;
    }

    /**
     * Set the next property: Cognitive Services account commitment period.
     *
     * @param next the next value to set.
     * @return the CommitmentPlanProperties object itself.
     */
    public CommitmentPlanProperties withNext(CommitmentPeriod next) {
        this.next = next;
        return this;
    }

    /**
     * Get the last property: Cognitive Services account commitment period.
     *
     * @return the last value.
     */
    public CommitmentPeriod last() {
        return this.last;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (current() != null) {
            current().validate();
        }
        if (next() != null) {
            next().validate();
        }
        if (last() != null) {
            last().validate();
        }
    }
}