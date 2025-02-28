// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LDAP search scope. */
@Fluent
public final class LdapSearchScopeOpt {
    /*
     * This specifies the user DN, which overrides the base DN for user
     * lookups.
     */
    @JsonProperty(value = "userDN")
    private String userDN;

    /*
     * This specifies the group DN, which overrides the base DN for group
     * lookups.
     */
    @JsonProperty(value = "groupDN")
    private String groupDN;

    /*
     * This specifies the custom LDAP search filter to be used when looking up
     * group membership from LDAP server.
     */
    @JsonProperty(value = "groupMembershipFilter")
    private String groupMembershipFilter;

    /**
     * Get the userDN property: This specifies the user DN, which overrides the base DN for user lookups.
     *
     * @return the userDN value.
     */
    public String userDN() {
        return this.userDN;
    }

    /**
     * Set the userDN property: This specifies the user DN, which overrides the base DN for user lookups.
     *
     * @param userDN the userDN value to set.
     * @return the LdapSearchScopeOpt object itself.
     */
    public LdapSearchScopeOpt withUserDN(String userDN) {
        this.userDN = userDN;
        return this;
    }

    /**
     * Get the groupDN property: This specifies the group DN, which overrides the base DN for group lookups.
     *
     * @return the groupDN value.
     */
    public String groupDN() {
        return this.groupDN;
    }

    /**
     * Set the groupDN property: This specifies the group DN, which overrides the base DN for group lookups.
     *
     * @param groupDN the groupDN value to set.
     * @return the LdapSearchScopeOpt object itself.
     */
    public LdapSearchScopeOpt withGroupDN(String groupDN) {
        this.groupDN = groupDN;
        return this;
    }

    /**
     * Get the groupMembershipFilter property: This specifies the custom LDAP search filter to be used when looking up
     * group membership from LDAP server.
     *
     * @return the groupMembershipFilter value.
     */
    public String groupMembershipFilter() {
        return this.groupMembershipFilter;
    }

    /**
     * Set the groupMembershipFilter property: This specifies the custom LDAP search filter to be used when looking up
     * group membership from LDAP server.
     *
     * @param groupMembershipFilter the groupMembershipFilter value to set.
     * @return the LdapSearchScopeOpt object itself.
     */
    public LdapSearchScopeOpt withGroupMembershipFilter(String groupMembershipFilter) {
        this.groupMembershipFilter = groupMembershipFilter;
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
