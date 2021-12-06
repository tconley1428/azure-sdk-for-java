// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.Context;

/** Samples for Attestations ListByResourceGroup. */
public final class AttestationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2021-01-01/examples/Attestations_ListResourceGroupScope_WithQuery.json
     */
    /**
     * Sample code: List attestations at resource group scope with query parameters.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listAttestationsAtResourceGroupScopeWithQueryParameters(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .attestations()
            .listByResourceGroup(
                "myRg",
                1,
                "PolicyAssignmentId eq"
                    + " '/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5'"
                    + " AND PolicyDefinitionReferenceId eq '0b158b46-ff42-4799-8e39-08a5c23b4551'",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2021-01-01/examples/Attestations_ListResourceGroupScope.json
     */
    /**
     * Sample code: List attestations at resource group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listAttestationsAtResourceGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.attestations().listByResourceGroup("myRg", null, null, Context.NONE);
    }
}