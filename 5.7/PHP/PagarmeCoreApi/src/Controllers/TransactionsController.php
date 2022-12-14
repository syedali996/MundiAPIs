<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib\Controllers;

use Core\Request\Parameters\TemplateParam;
use CoreInterfaces\Core\Request\RequestMethod;
use PagarmeCoreApiLib\Exceptions\ApiException;
use PagarmeCoreApiLib\Models\GetTransactionResponse;

class TransactionsController extends BaseController
{
    /**
     * @param string $transactionId
     *
     * @return GetTransactionResponse Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function getTransaction(string $transactionId): GetTransactionResponse
    {
        $_reqBuilder = $this->requestBuilder(RequestMethod::GET, '/transactions/{transaction_id}')
            ->auth('global')
            ->parameters(TemplateParam::init('transaction_id', $transactionId));

        $_resHandler = $this->responseHandler()->type(GetTransactionResponse::class);

        return $this->execute($_reqBuilder, $_resHandler);
    }
}
