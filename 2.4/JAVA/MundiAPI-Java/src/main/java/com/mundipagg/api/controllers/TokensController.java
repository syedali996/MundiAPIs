/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.controllers;

import com.mundipagg.api.exceptions.ApiException;
import com.mundipagg.api.models.CreateTokenRequest;
import com.mundipagg.api.models.GetTokenResponse;
import java.io.IOException;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface TokensController {
    /**
     * @param  publicKey  Required parameter: Public key
     * @param  request  Required parameter: Request for creating a token
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetTokenResponse createToken(
            final String publicKey,
            final CreateTokenRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Gets a token from its id.
     * @param  id  Required parameter: Token id
     * @param  publicKey  Required parameter: Public key
     * @return    Returns the GetTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetTokenResponse getToken(
            final String id,
            final String publicKey) throws ApiException, IOException;

}