<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib\Models;

use stdClass;

class GetCheckoutCardInstallmentOptionsResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $number;

    /**
     * @var int
     */
    private $total;

    /**
     * @param string $number
     * @param int $total
     */
    public function __construct(string $number, int $total)
    {
        $this->number = $number;
        $this->total = $total;
    }

    /**
     * Returns Number.
     * Número de parcelas
     */
    public function getNumber(): string
    {
        return $this->number;
    }

    /**
     * Sets Number.
     * Número de parcelas
     *
     * @required
     * @maps number
     */
    public function setNumber(string $number): void
    {
        $this->number = $number;
    }

    /**
     * Returns Total.
     * Valor total da compra
     */
    public function getTotal(): int
    {
        return $this->total;
    }

    /**
     * Sets Total.
     * Valor total da compra
     *
     * @required
     * @maps total
     */
    public function setTotal(int $total): void
    {
        $this->total = $total;
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
        $json['number'] = $this->number;
        $json['total']  = $this->total;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
