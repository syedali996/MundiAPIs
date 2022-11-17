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
 * Bank transfer checkout response
 */
class GetCheckoutBankTransferPaymentResponse implements \JsonSerializable
{
    /**
     * @var string[]
     */
    private $bank;

    /**
     * @param string[] $bank
     */
    public function __construct(array $bank)
    {
        $this->bank = $bank;
    }

    /**
     * Returns Bank.
     * bank list response
     *
     * @return string[]
     */
    public function getBank(): array
    {
        return $this->bank;
    }

    /**
     * Sets Bank.
     * bank list response
     *
     * @required
     * @maps bank
     *
     * @param string[] $bank
     */
    public function setBank(array $bank): void
    {
        $this->bank = $bank;
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
        $json['bank'] = $this->bank;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
