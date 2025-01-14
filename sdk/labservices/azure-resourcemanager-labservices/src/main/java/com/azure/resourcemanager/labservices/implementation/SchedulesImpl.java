// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.fluent.SchedulesClient;
import com.azure.resourcemanager.labservices.fluent.models.ScheduleInner;
import com.azure.resourcemanager.labservices.models.Schedule;
import com.azure.resourcemanager.labservices.models.Schedules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SchedulesImpl implements Schedules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SchedulesImpl.class);

    private final SchedulesClient innerClient;

    private final com.azure.resourcemanager.labservices.LabServicesManager serviceManager;

    public SchedulesImpl(
        SchedulesClient innerClient, com.azure.resourcemanager.labservices.LabServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Schedule> listByLab(String resourceGroupName, String labName) {
        PagedIterable<ScheduleInner> inner = this.serviceClient().listByLab(resourceGroupName, labName);
        return Utils.mapPage(inner, inner1 -> new ScheduleImpl(inner1, this.manager()));
    }

    public PagedIterable<Schedule> listByLab(String resourceGroupName, String labName, String filter, Context context) {
        PagedIterable<ScheduleInner> inner =
            this.serviceClient().listByLab(resourceGroupName, labName, filter, context);
        return Utils.mapPage(inner, inner1 -> new ScheduleImpl(inner1, this.manager()));
    }

    public Schedule get(String resourceGroupName, String labName, String scheduleName) {
        ScheduleInner inner = this.serviceClient().get(resourceGroupName, labName, scheduleName);
        if (inner != null) {
            return new ScheduleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Schedule> getWithResponse(
        String resourceGroupName, String labName, String scheduleName, Context context) {
        Response<ScheduleInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, labName, scheduleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ScheduleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String labName, String scheduleName) {
        this.serviceClient().delete(resourceGroupName, labName, scheduleName);
    }

    public void delete(String resourceGroupName, String labName, String scheduleName, Context context) {
        this.serviceClient().delete(resourceGroupName, labName, scheduleName, context);
    }

    public Schedule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String scheduleName = Utils.getValueFromIdByName(id, "schedules");
        if (scheduleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'schedules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, labName, scheduleName, Context.NONE).getValue();
    }

    public Response<Schedule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String scheduleName = Utils.getValueFromIdByName(id, "schedules");
        if (scheduleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'schedules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, labName, scheduleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String scheduleName = Utils.getValueFromIdByName(id, "schedules");
        if (scheduleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'schedules'.", id)));
        }
        this.delete(resourceGroupName, labName, scheduleName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String scheduleName = Utils.getValueFromIdByName(id, "schedules");
        if (scheduleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'schedules'.", id)));
        }
        this.delete(resourceGroupName, labName, scheduleName, context);
    }

    private SchedulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.labservices.LabServicesManager manager() {
        return this.serviceManager;
    }

    public ScheduleImpl define(String name) {
        return new ScheduleImpl(name, this.manager());
    }
}
