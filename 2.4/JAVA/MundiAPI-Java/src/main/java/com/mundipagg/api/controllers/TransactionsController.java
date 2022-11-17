/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.controllers;

import com.mundipagg.api.exceptions.ApiException;
import com.mundipagg.api.models.GetTransactionResponse;
import java.io.IOException;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface TransactionsController {
    /**
     * @param  transactionId  Required parameter: Example:
     * @return    Returns the GetTransactionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetTransactionResponse getTransaction(
            final String transactionId) throws ApiException, IOException;

}