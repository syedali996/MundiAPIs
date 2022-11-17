/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.controllers;

import java.io.IOException;
import me.pagar.api.exceptions.ApiException;
import me.pagar.api.models.GetTransactionResponse;

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