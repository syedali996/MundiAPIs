<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib;

use Core\Utils\CoreHelper;
use Core\Utils\JsonHelper;
use PagarmeCoreApiLib\Models;

/**
 * API utility class
 */
class ApiHelper
{
    /**
     * A map of all inherited models
     *
     * @var array
     */
    private const INHERITED_MODELS_MAP = [
        Models\GetTransactionResponse::class => [
            Models\GetBankTransferTransactionResponse::class,
            Models\GetSafetyPayTransactionResponse::class,
            Models\GetVoucherTransactionResponse::class,
            Models\GetBoletoTransactionResponse::class,
            Models\GetDebitCardTransactionResponse::class,
            Models\GetPrivateLabelTransactionResponse::class,
            Models\GetCashTransactionResponse::class,
            Models\GetCreditCardTransactionResponse::class,
            Models\GetPixTransactionResponse::class
        ]
    ];

    /**
     * @var JsonHelper
     */
    private static $jsonHelper;

    public static function getJsonHelper(): JsonHelper
    {
        if (self::$jsonHelper == null) {
            self::$jsonHelper = new JsonHelper(self::INHERITED_MODELS_MAP, null, 'PagarmeCoreApiLib\\Models');
        }
        return self::$jsonHelper;
    }

    /**
     * Serialize any given mixed value.
     *
     * @param mixed $value Any value to be serialized
     *
     * @return string|null serialized value
     */
    public static function serialize($value): ?string
    {
        return CoreHelper::serialize($value);
    }

    /**
     * Deserialize a Json string
     *
     * @param string $json A valid Json string
     *
     * @return mixed Decoded Json
     */
    public static function deserialize(string $json)
    {
        return CoreHelper::deserialize($json);
    }
}
