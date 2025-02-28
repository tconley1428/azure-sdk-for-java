// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The name of the extended location. */
@Fluent
public final class GalleryExtendedLocation {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * It is type of the extended location.
     */
    @JsonProperty(value = "type")
    private GalleryExtendedLocationType type;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the GalleryExtendedLocation object itself.
     */
    public GalleryExtendedLocation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: It is type of the extended location.
     *
     * @return the type value.
     */
    public GalleryExtendedLocationType type() {
        return this.type;
    }

    /**
     * Set the type property: It is type of the extended location.
     *
     * @param type the type value to set.
     * @return the GalleryExtendedLocation object itself.
     */
    public GalleryExtendedLocation withType(GalleryExtendedLocationType type) {
        this.type = type;
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
