// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.dataprotection.fluent.models.OperationResourceInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of OperationResource. */
public interface OperationResource {
    /**
     * Gets the endTime property: End time of the operation.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the error property: Required if status == failed or status == canceled. This is the OData v4 error format,
     * used by the RPC and will go into the v2.2 Azure REST API guidelines. The full set of optional properties (e.g.
     * inner errors / details) can be found in the "Error Response" section.
     *
     * @return the error value.
     */
    ManagementError error();

    /**
     * Gets the id property: It should match what is used to GET the operation result.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: It must match the last segment of the "id" field, and will typically be a GUID / system
     * generated value.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the properties property: OperationExtendedInfo End time of the operation.
     *
     * @return the properties value.
     */
    OperationExtendedInfo properties();

    /**
     * Gets the startTime property: Start time of the operation.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the status property: The status property.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the inner com.azure.resourcemanager.dataprotection.fluent.models.OperationResourceInner object.
     *
     * @return the inner object.
     */
    OperationResourceInner innerModel();
}