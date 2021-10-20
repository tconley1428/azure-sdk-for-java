// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Windows gMSA Profile in the managed cluster. */
@Fluent
public final class WindowsGmsaProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WindowsGmsaProfile.class);

    /*
     * Whether to enable Windows gMSA. Specifies whether to enable Windows gMSA
     * in the managed cluster.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Specifies the DNS server for Windows gMSA. <br><br> Set it to empty if
     * you have configured the DNS server in the vnet which is used to create
     * the managed cluster.
     */
    @JsonProperty(value = "dnsServer")
    private String dnsServer;

    /*
     * Specifies the root domain name for Windows gMSA. <br><br> Set it to
     * empty if you have configured the DNS server in the vnet which is used to
     * create the managed cluster.
     */
    @JsonProperty(value = "rootDomainName")
    private String rootDomainName;

    /**
     * Get the enabled property: Whether to enable Windows gMSA. Specifies whether to enable Windows gMSA in the managed
     * cluster.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether to enable Windows gMSA. Specifies whether to enable Windows gMSA in the managed
     * cluster.
     *
     * @param enabled the enabled value to set.
     * @return the WindowsGmsaProfile object itself.
     */
    public WindowsGmsaProfile withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the dnsServer property: Specifies the DNS server for Windows gMSA. &lt;br&gt;&lt;br&gt; Set it to empty if
     * you have configured the DNS server in the vnet which is used to create the managed cluster.
     *
     * @return the dnsServer value.
     */
    public String dnsServer() {
        return this.dnsServer;
    }

    /**
     * Set the dnsServer property: Specifies the DNS server for Windows gMSA. &lt;br&gt;&lt;br&gt; Set it to empty if
     * you have configured the DNS server in the vnet which is used to create the managed cluster.
     *
     * @param dnsServer the dnsServer value to set.
     * @return the WindowsGmsaProfile object itself.
     */
    public WindowsGmsaProfile withDnsServer(String dnsServer) {
        this.dnsServer = dnsServer;
        return this;
    }

    /**
     * Get the rootDomainName property: Specifies the root domain name for Windows gMSA. &lt;br&gt;&lt;br&gt; Set it to
     * empty if you have configured the DNS server in the vnet which is used to create the managed cluster.
     *
     * @return the rootDomainName value.
     */
    public String rootDomainName() {
        return this.rootDomainName;
    }

    /**
     * Set the rootDomainName property: Specifies the root domain name for Windows gMSA. &lt;br&gt;&lt;br&gt; Set it to
     * empty if you have configured the DNS server in the vnet which is used to create the managed cluster.
     *
     * @param rootDomainName the rootDomainName value to set.
     * @return the WindowsGmsaProfile object itself.
     */
    public WindowsGmsaProfile withRootDomainName(String rootDomainName) {
        this.rootDomainName = rootDomainName;
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