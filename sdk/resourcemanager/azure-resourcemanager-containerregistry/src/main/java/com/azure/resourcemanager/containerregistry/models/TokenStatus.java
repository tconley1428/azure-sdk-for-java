// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TokenStatus. */
public final class TokenStatus extends ExpandableStringEnum<TokenStatus> {
    /** Static value enabled for TokenStatus. */
    public static final TokenStatus ENABLED = fromString("enabled");

    /** Static value disabled for TokenStatus. */
    public static final TokenStatus DISABLED = fromString("disabled");

    /**
     * Creates or finds a TokenStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TokenStatus.
     */
    @JsonCreator
    public static TokenStatus fromString(String name) {
        return fromString(name, TokenStatus.class);
    }

    /** @return known TokenStatus values. */
    public static Collection<TokenStatus> values() {
        return values(TokenStatus.class);
    }
}