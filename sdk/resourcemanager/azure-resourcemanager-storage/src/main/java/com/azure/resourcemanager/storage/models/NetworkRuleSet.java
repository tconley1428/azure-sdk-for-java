// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network rule set. */
@Fluent
public final class NetworkRuleSet {
    /*
     * Specifies whether traffic is bypassed for Logging/Metrics/AzureServices.
     * Possible values are any combination of Logging|Metrics|AzureServices
     * (For example, "Logging, Metrics"), or None to bypass none of those
     * traffics.
     */
    @JsonProperty(value = "bypass")
    private Bypass bypass;

    /*
     * Sets the resource access rules
     */
    @JsonProperty(value = "resourceAccessRules")
    private List<ResourceAccessRule> resourceAccessRules;

    /*
     * Sets the virtual network rules
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * Sets the IP ACL rules
     */
    @JsonProperty(value = "ipRules")
    private List<IpRule> ipRules;

    /*
     * Specifies the default action of allow or deny when no other rules match.
     */
    @JsonProperty(value = "defaultAction", required = true)
    private DefaultAction defaultAction;

    /**
     * Get the bypass property: Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values
     * are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of
     * those traffics.
     *
     * @return the bypass value.
     */
    public Bypass bypass() {
        return this.bypass;
    }

    /**
     * Set the bypass property: Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values
     * are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of
     * those traffics.
     *
     * @param bypass the bypass value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withBypass(Bypass bypass) {
        this.bypass = bypass;
        return this;
    }

    /**
     * Get the resourceAccessRules property: Sets the resource access rules.
     *
     * @return the resourceAccessRules value.
     */
    public List<ResourceAccessRule> resourceAccessRules() {
        return this.resourceAccessRules;
    }

    /**
     * Set the resourceAccessRules property: Sets the resource access rules.
     *
     * @param resourceAccessRules the resourceAccessRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withResourceAccessRules(List<ResourceAccessRule> resourceAccessRules) {
        this.resourceAccessRules = resourceAccessRules;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: Sets the virtual network rules.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: Sets the virtual network rules.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the ipRules property: Sets the IP ACL rules.
     *
     * @return the ipRules value.
     */
    public List<IpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: Sets the IP ACL rules.
     *
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withIpRules(List<IpRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the defaultAction property: Specifies the default action of allow or deny when no other rules match.
     *
     * @return the defaultAction value.
     */
    public DefaultAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the defaultAction property: Specifies the default action of allow or deny when no other rules match.
     *
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceAccessRules() != null) {
            resourceAccessRules().forEach(e -> e.validate());
        }
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
        if (defaultAction() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property defaultAction in model NetworkRuleSet"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkRuleSet.class);
}
