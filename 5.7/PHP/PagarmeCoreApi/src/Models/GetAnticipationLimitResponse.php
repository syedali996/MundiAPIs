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
 * Anticipation limit
 */
class GetAnticipationLimitResponse implements \JsonSerializable
{
    /**
     * @var int
     */
    private $amount;

    /**
     * @var int
     */
    private $anticipationFee;

    /**
     * @param int $amount
     * @param int $anticipationFee
     */
    public function __construct(int $amount, int $anticipationFee)
    {
        $this->amount = $amount;
        $this->anticipationFee = $anticipationFee;
    }

    /**
     * Returns Amount.
     * Amount
     */
    public function getAmount(): int
    {
        return $this->amount;
    }

    /**
     * Sets Amount.
     * Amount
     *
     * @required
     * @maps amount
     */
    public function setAmount(int $amount): void
    {
        $this->amount = $amount;
    }

    /**
     * Returns Anticipation Fee.
     * Anticipation fee
     */
    public function getAnticipationFee(): int
    {
        return $this->anticipationFee;
    }

    /**
     * Sets Anticipation Fee.
     * Anticipation fee
     *
     * @required
     * @maps anticipation_fee
     */
    public function setAnticipationFee(int $anticipationFee): void
    {
        $this->anticipationFee = $anticipationFee;
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
        $json['amount']           = $this->amount;
        $json['anticipation_fee'] = $this->anticipationFee;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
