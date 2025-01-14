// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the cancelJob operation. */
public final class AnalyzeTextsCancelJobResponse extends ResponseBase<AnalyzeTextsCancelJobHeaders, Void> {
    /**
     * Creates an instance of AnalyzeTextsCancelJobResponse.
     *
     * @param request the request which resulted in this AnalyzeTextsCancelJobResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public AnalyzeTextsCancelJobResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Void value,
            AnalyzeTextsCancelJobHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
