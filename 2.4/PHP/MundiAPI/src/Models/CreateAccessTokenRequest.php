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
 * Request for creating a new Access Token
 */
class CreateAccessTokenRequest implements \JsonSerializable
{
    /**
     * @var int|null
     */
    private $expiresIn;

    /**
     * Returns Expires In.
     * Minutes to expire the token
     */
    public function getExpiresIn(): ?int
    {
        return $this->expiresIn;
    }

    /**
     * Sets Expires In.
     * Minutes to expire the token
     *
     * @maps expires_in
     */
    public function setExpiresIn(?int $expiresIn): void
    {
        $this->expiresIn = $expiresIn;
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
        if (isset($this->expiresIn)) {
            $json['expires_in'] = $this->expiresIn;
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}