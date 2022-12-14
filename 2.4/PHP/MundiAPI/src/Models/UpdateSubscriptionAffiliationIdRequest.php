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
 * Request for updating a Subscription Affiliation Id
 */
class UpdateSubscriptionAffiliationIdRequest implements \JsonSerializable
{
    /**
     * @var string
     */
    private $gatewayAffiliationId;

    /**
     * @param string $gatewayAffiliationId
     */
    public function __construct(string $gatewayAffiliationId)
    {
        $this->gatewayAffiliationId = $gatewayAffiliationId;
    }

    /**
     * Returns Gateway Affiliation Id.
     */
    public function getGatewayAffiliationId(): string
    {
        return $this->gatewayAffiliationId;
    }

    /**
     * Sets Gateway Affiliation Id.
     *
     * @required
     * @maps gateway_affiliation_id
     */
    public function setGatewayAffiliationId(string $gatewayAffiliationId): void
    {
        $this->gatewayAffiliationId = $gatewayAffiliationId;
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
        $json['gateway_affiliation_id'] = $this->gatewayAffiliationId;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
