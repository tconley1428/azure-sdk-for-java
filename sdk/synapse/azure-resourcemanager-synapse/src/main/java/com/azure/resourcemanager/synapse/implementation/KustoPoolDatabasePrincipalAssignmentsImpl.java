// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.KustoPoolDatabasePrincipalAssignmentsClient;
import com.azure.resourcemanager.synapse.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.synapse.fluent.models.DatabasePrincipalAssignmentInner;
import com.azure.resourcemanager.synapse.models.CheckNameResult;
import com.azure.resourcemanager.synapse.models.DatabasePrincipalAssignment;
import com.azure.resourcemanager.synapse.models.DatabasePrincipalAssignmentCheckNameRequest;
import com.azure.resourcemanager.synapse.models.KustoPoolDatabasePrincipalAssignments;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class KustoPoolDatabasePrincipalAssignmentsImpl implements KustoPoolDatabasePrincipalAssignments {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KustoPoolDatabasePrincipalAssignmentsImpl.class);

    private final KustoPoolDatabasePrincipalAssignmentsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public KustoPoolDatabasePrincipalAssignmentsImpl(
        KustoPoolDatabasePrincipalAssignmentsClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameResult checkNameAvailability(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String resourceGroupName,
        DatabasePrincipalAssignmentCheckNameRequest principalAssignmentName) {
        CheckNameResultInner inner =
            this
                .serviceClient()
                .checkNameAvailability(
                    workspaceName, kustoPoolName, databaseName, resourceGroupName, principalAssignmentName);
        if (inner != null) {
            return new CheckNameResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameResult> checkNameAvailabilityWithResponse(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String resourceGroupName,
        DatabasePrincipalAssignmentCheckNameRequest principalAssignmentName,
        Context context) {
        Response<CheckNameResultInner> inner =
            this
                .serviceClient()
                .checkNameAvailabilityWithResponse(
                    workspaceName, kustoPoolName, databaseName, resourceGroupName, principalAssignmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DatabasePrincipalAssignment> list(
        String workspaceName, String kustoPoolName, String databaseName, String resourceGroupName) {
        PagedIterable<DatabasePrincipalAssignmentInner> inner =
            this.serviceClient().list(workspaceName, kustoPoolName, databaseName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DatabasePrincipalAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabasePrincipalAssignment> list(
        String workspaceName, String kustoPoolName, String databaseName, String resourceGroupName, Context context) {
        PagedIterable<DatabasePrincipalAssignmentInner> inner =
            this.serviceClient().list(workspaceName, kustoPoolName, databaseName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new DatabasePrincipalAssignmentImpl(inner1, this.manager()));
    }

    public DatabasePrincipalAssignment get(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName) {
        DatabasePrincipalAssignmentInner inner =
            this
                .serviceClient()
                .get(workspaceName, kustoPoolName, databaseName, principalAssignmentName, resourceGroupName);
        if (inner != null) {
            return new DatabasePrincipalAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DatabasePrincipalAssignment> getWithResponse(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName,
        Context context) {
        Response<DatabasePrincipalAssignmentInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    workspaceName, kustoPoolName, databaseName, principalAssignmentName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabasePrincipalAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName) {
        this
            .serviceClient()
            .delete(workspaceName, kustoPoolName, databaseName, principalAssignmentName, resourceGroupName);
    }

    public void delete(
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName,
        Context context) {
        this
            .serviceClient()
            .delete(workspaceName, kustoPoolName, databaseName, principalAssignmentName, resourceGroupName, context);
    }

    public DatabasePrincipalAssignment getById(String id) {
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String kustoPoolName = Utils.getValueFromIdByName(id, "kustoPools");
        if (kustoPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'kustoPools'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this
            .getWithResponse(
                workspaceName, kustoPoolName, databaseName, principalAssignmentName, resourceGroupName, Context.NONE)
            .getValue();
    }

    public Response<DatabasePrincipalAssignment> getByIdWithResponse(String id, Context context) {
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String kustoPoolName = Utils.getValueFromIdByName(id, "kustoPools");
        if (kustoPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'kustoPools'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this
            .getWithResponse(
                workspaceName, kustoPoolName, databaseName, principalAssignmentName, resourceGroupName, context);
    }

    public void deleteById(String id) {
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String kustoPoolName = Utils.getValueFromIdByName(id, "kustoPools");
        if (kustoPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'kustoPools'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this
            .delete(
                workspaceName, kustoPoolName, databaseName, principalAssignmentName, resourceGroupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String kustoPoolName = Utils.getValueFromIdByName(id, "kustoPools");
        if (kustoPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'kustoPools'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String principalAssignmentName = Utils.getValueFromIdByName(id, "principalAssignments");
        if (principalAssignmentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'principalAssignments'.",
                                id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(workspaceName, kustoPoolName, databaseName, principalAssignmentName, resourceGroupName, context);
    }

    private KustoPoolDatabasePrincipalAssignmentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    public DatabasePrincipalAssignmentImpl define(String name) {
        return new DatabasePrincipalAssignmentImpl(name, this.manager());
    }
}