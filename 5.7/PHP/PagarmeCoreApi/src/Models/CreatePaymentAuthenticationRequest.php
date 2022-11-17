<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib\Models;

use stdClass;

/**
 * The payment authentication request
 */
class CreatePaymentAuthenticationRequest implements \JsonSerializable
{
    /**
     * @var string
     */
    private $type;

    /**
     * @var CreateThreeDSecureRequest
     */
    private $threedSecure;

    /**
     * @param string $type
     * @param CreateThreeDSecureRequest $threedSecure
     */
    public function __construct(string $type, CreateThreeDSecureRequest $threedSecure)
    {
        $this->type = $type;
        $this->threedSecure = $threedSecure;
    }

    /**
     * Returns Type.
     * The Authentication type
     */
    public function getType(): string
    {
        return $this->type;
    }

    /**
     * Sets Type.
     * The Authentication type
     *
     * @required
     * @maps type
     */
    public function setType(string $type): void
    {
        $this->type = $type;
    }

    /**
     * Returns Threed Secure.
     * The 3D-S authentication object
     */
    public function getThreedSecure(): CreateThreeDSecureRequest
    {
        return $this->threedSecure;
    }

    /**
     * Sets Threed Secure.
     * The 3D-S authentication object
     *
     * @required
     * @maps threed_secure
     */
    public function setThreedSecure(CreateThreeDSecureRequest $threedSecure): void
    {
        $this->threedSecure = $threedSecure;
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
        $json['type']          = $this->type;
        $json['threed_secure'] = $this->threedSecure;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
