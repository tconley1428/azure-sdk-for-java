// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.autoconfigure.aad.implementation.webapi.validator;

import com.azure.spring.cloud.autoconfigure.aad.implementation.jwt.AADTrustedIssuerRepository;
import com.azure.spring.cloud.autoconfigure.aad.implementation.constants.AADTokenClaim;
import com.azure.spring.cloud.autoconfigure.aad.implementation.properties.AADAuthenticationProperties;
import org.junit.jupiter.api.Test;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.security.oauth2.jwt.Jwt;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AADJwtIssuerValidatorTest {

    private final AADAuthenticationProperties aadAuthenticationProperties = mock(AADAuthenticationProperties.class);
    private final Jwt jwt = mock(Jwt.class);
    private final AADTrustedIssuerRepository aadTrustedIssuerRepository = new AADTrustedIssuerRepository("fake-tenant"
        + "-id");

    @Test
    void testNoStructureIssuerSuccessVerify() {
        when(aadAuthenticationProperties.getTenantId()).thenReturn("fake-tenant-id");
        when(jwt.getClaim(AADTokenClaim.ISS)).thenReturn("https://sts.windows.net/fake-tenant-id/v2.0");

        AADJwtIssuerValidator validator = new AADJwtIssuerValidator();
        OAuth2TokenValidatorResult result = validator.validate(jwt);
        assertThat(result).isNotNull();
        assertThat(result.getErrors()).isEmpty();
    }

    @Test
    void testNoStructureIssuerFailureVerify() {
        when(aadAuthenticationProperties.getTenantId()).thenReturn("common");
        when(jwt.getClaim(AADTokenClaim.ISS)).thenReturn("https://sts.failure.net/fake-tenant-id/v2.0");

        AADJwtIssuerValidator validator = new AADJwtIssuerValidator();
        OAuth2TokenValidatorResult result = validator.validate(jwt);
        assertThat(result).isNotNull();
        assertThat(result.getErrors()).isNotEmpty();
    }

    @Test
    void testIssuerSuccessVerify() {
        when(aadAuthenticationProperties.getTenantId()).thenReturn("fake-tenant-id");
        when(jwt.getClaim(AADTokenClaim.ISS)).thenReturn("https://sts.windows.net/fake-tenant-id/v2.0");

        AADJwtIssuerValidator validator = new AADJwtIssuerValidator(aadTrustedIssuerRepository);
        OAuth2TokenValidatorResult result = validator.validate(jwt);
        assertThat(result).isNotNull();
        assertThat(result.getErrors()).isEmpty();
    }

    @Test
    void testIssuerFailureVerify() {
        when(aadAuthenticationProperties.getTenantId()).thenReturn("common");
        when(jwt.getClaim(AADTokenClaim.ISS)).thenReturn("https://sts.failure.net/fake-tenant-id/v2.0");

        AADJwtIssuerValidator validator = new AADJwtIssuerValidator(aadTrustedIssuerRepository);
        OAuth2TokenValidatorResult result = validator.validate(jwt);
        assertThat(result).isNotNull();
        assertThat(result.getErrors()).isNotEmpty();
    }

}