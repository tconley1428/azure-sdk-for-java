// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation for form parameters to be sent to a REST API Request URI.
 *
 * <p><strong>Example 1:</strong></p>
 *
 * <pre>
 * {@literal @}POST("spellcheck")
 * {@literal Mono<Response<ResponseBody>>} spellChecker(@Header("X-BingApis-SDK") String xBingApisSDK, @Query
 * ("UserId") String userId, @FormData("Text") String text);</pre>
 */
@Retention(RUNTIME)
@Target(PARAMETER)
public @interface FormData {
    /**
     * @return The name of the key in a key value pair as part of the form data.
     */
    String value();

    /**
     * Optional value to be provided if {@link FormData#value()} represents a file's contents.
     *
     * @return The name of the file that {@link FormData#value()} represents.
     */
    String filename() default "";
}