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
 * Fine Response
 */
class GetFineResponse implements \JsonSerializable
{
    /**
     * @var int
     */
    private $days;

    /**
     * @var string
     */
    private $type;

    /**
     * @var int
     */
    private $amount;

    /**
     * @param int $days
     * @param string $type
     * @param int $amount
     */
    public function __construct(int $days, string $type, int $amount)
    {
        $this->days = $days;
        $this->type = $type;
        $this->amount = $amount;
    }

    /**
     * Returns Days.
     * Days
     */
    public function getDays(): int
    {
        return $this->days;
    }

    /**
     * Sets Days.
     * Days
     *
     * @required
     * @maps days
     */
    public function setDays(int $days): void
    {
        $this->days = $days;
    }

    /**
     * Returns Type.
     * Type
     */
    public function getType(): string
    {
        return $this->type;
    }

    /**
     * Sets Type.
     * Type
     *
     * @required
     * @maps type
     */
    public function setType(string $type): void
    {
        $this->type = $type;
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
        $json['days']   = $this->days;
        $json['type']   = $this->type;
        $json['amount'] = $this->amount;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
