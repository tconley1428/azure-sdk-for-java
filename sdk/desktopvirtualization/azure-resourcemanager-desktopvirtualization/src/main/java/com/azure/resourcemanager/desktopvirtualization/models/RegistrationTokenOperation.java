// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RegistrationTokenOperation. */
public final class RegistrationTokenOperation extends ExpandableStringEnum<RegistrationTokenOperation> {
    /** Static value Delete for RegistrationTokenOperation. */
    public static final RegistrationTokenOperation DELETE = fromString("Delete");

    /** Static value None for RegistrationTokenOperation. */
    public static final RegistrationTokenOperation NONE = fromString("None");

    /** Static value Update for RegistrationTokenOperation. */
    public static final RegistrationTokenOperation UPDATE = fromString("Update");

    /**
     * Creates or finds a RegistrationTokenOperation from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RegistrationTokenOperation.
     */
    @JsonCreator
    public static RegistrationTokenOperation fromString(String name) {
        return fromString(name, RegistrationTokenOperation.class);
    }

    /** @return known RegistrationTokenOperation values. */
    public static Collection<RegistrationTokenOperation> values() {
        return values(RegistrationTokenOperation.class);
    }
}