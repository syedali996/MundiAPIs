<?php

declare(strict_types=1);

/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace MundiAPILib\Models;

use stdClass;

/**
 * The ApplePay Token Payment Request
 */
class CreateApplePayRequest implements \JsonSerializable
{
    /**
     * @var string
     */
    private $version;

    /**
     * @var string
     */
    private $data;

    /**
     * @var CreateApplePayHeaderRequest
     */
    private $header;

    /**
     * @var string
     */
    private $signature;

    /**
     * @var string
     */
    private $merchantIdentifier;

    /**
     * @param string $version
     * @param string $data
     * @param CreateApplePayHeaderRequest $header
     * @param string $signature
     * @param string $merchantIdentifier
     */
    public function __construct(
        string $version,
        string $data,
        CreateApplePayHeaderRequest $header,
        string $signature,
        string $merchantIdentifier
    ) {
        $this->version = $version;
        $this->data = $data;
        $this->header = $header;
        $this->signature = $signature;
        $this->merchantIdentifier = $merchantIdentifier;
    }

    /**
     * Returns Version.
     * The token version
     */
    public function getVersion(): string
    {
        return $this->version;
    }

    /**
     * Sets Version.
     * The token version
     *
     * @required
     * @maps version
     */
    public function setVersion(string $version): void
    {
        $this->version = $version;
    }

    /**
     * Returns Data.
     * The cryptography data
     */
    public function getData(): string
    {
        return $this->data;
    }

    /**
     * Sets Data.
     * The cryptography data
     *
     * @required
     * @maps data
     */
    public function setData(string $data): void
    {
        $this->data = $data;
    }

    /**
     * Returns Header.
     * The ApplePay header request
     */
    public function getHeader(): CreateApplePayHeaderRequest
    {
        return $this->header;
    }

    /**
     * Sets Header.
     * The ApplePay header request
     *
     * @required
     * @maps header
     */
    public function setHeader(CreateApplePayHeaderRequest $header): void
    {
        $this->header = $header;
    }

    /**
     * Returns Signature.
     * Detached PKCS #7 signature, Base64 encoded as string
     */
    public function getSignature(): string
    {
        return $this->signature;
    }

    /**
     * Sets Signature.
     * Detached PKCS #7 signature, Base64 encoded as string
     *
     * @required
     * @maps signature
     */
    public function setSignature(string $signature): void
    {
        $this->signature = $signature;
    }

    /**
     * Returns Merchant Identifier.
     * ApplePay Merchant identifier
     */
    public function getMerchantIdentifier(): string
    {
        return $this->merchantIdentifier;
    }

    /**
     * Sets Merchant Identifier.
     * ApplePay Merchant identifier
     *
     * @required
     * @maps merchant_identifier
     */
    public function setMerchantIdentifier(string $merchantIdentifier): void
    {
        $this->merchantIdentifier = $merchantIdentifier;
    }

    /**
     * Encode this object to JSON
     *
     * @param bool $asArrayWhenEmpty Whether to serialize this model as an array whenever no fields
     *        are set. (default: false)
     *
     * @return array|stdClass
     */
    #[\ReturnTypeWillChange] // @phan-suppress-current-line PhanUndeclaredClassAttribute for (php < 8.1)
    public function jsonSerialize(bool $asArrayWhenEmpty = false)
    {
        $json = [];
        $json['version']             = $this->version;
        $json['data']                = $this->data;
        $json['header']              = $this->header;
        $json['signature']           = $this->signature;
        $json['merchant_identifier'] = $this->merchantIdentifier;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}