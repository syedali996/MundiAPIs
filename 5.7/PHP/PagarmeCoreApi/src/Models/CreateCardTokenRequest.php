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
 * Card token data
 */
class CreateCardTokenRequest implements \JsonSerializable
{
    /**
     * @var string
     */
    private $number;

    /**
     * @var string
     */
    private $holderName;

    /**
     * @var int
     */
    private $expMonth;

    /**
     * @var int
     */
    private $expYear;

    /**
     * @var string
     */
    private $cvv;

    /**
     * @var string
     */
    private $brand;

    /**
     * @var string
     */
    private $label;

    /**
     * @param string $number
     * @param string $holderName
     * @param int $expMonth
     * @param int $expYear
     * @param string $cvv
     * @param string $brand
     * @param string $label
     */
    public function __construct(
        string $number,
        string $holderName,
        int $expMonth,
        int $expYear,
        string $cvv,
        string $brand,
        string $label
    ) {
        $this->number = $number;
        $this->holderName = $holderName;
        $this->expMonth = $expMonth;
        $this->expYear = $expYear;
        $this->cvv = $cvv;
        $this->brand = $brand;
        $this->label = $label;
    }

    /**
     * Returns Number.
     * Credit card number
     */
    public function getNumber(): string
    {
        return $this->number;
    }

    /**
     * Sets Number.
     * Credit card number
     *
     * @required
     * @maps number
     */
    public function setNumber(string $number): void
    {
        $this->number = $number;
    }

    /**
     * Returns Holder Name.
     * Holder name, as written on the card
     */
    public function getHolderName(): string
    {
        return $this->holderName;
    }

    /**
     * Sets Holder Name.
     * Holder name, as written on the card
     *
     * @required
     * @maps holder_name
     */
    public function setHolderName(string $holderName): void
    {
        $this->holderName = $holderName;
    }

    /**
     * Returns Exp Month.
     * The expiration month
     */
    public function getExpMonth(): int
    {
        return $this->expMonth;
    }

    /**
     * Sets Exp Month.
     * The expiration month
     *
     * @required
     * @maps exp_month
     */
    public function setExpMonth(int $expMonth): void
    {
        $this->expMonth = $expMonth;
    }

    /**
     * Returns Exp Year.
     * The expiration year, that can be informed with 2 or 4 digits
     */
    public function getExpYear(): int
    {
        return $this->expYear;
    }

    /**
     * Sets Exp Year.
     * The expiration year, that can be informed with 2 or 4 digits
     *
     * @required
     * @maps exp_year
     */
    public function setExpYear(int $expYear): void
    {
        $this->expYear = $expYear;
    }

    /**
     * Returns Cvv.
     * The card's security code
     */
    public function getCvv(): string
    {
        return $this->cvv;
    }

    /**
     * Sets Cvv.
     * The card's security code
     *
     * @required
     * @maps cvv
     */
    public function setCvv(string $cvv): void
    {
        $this->cvv = $cvv;
    }

    /**
     * Returns Brand.
     * Card brand
     */
    public function getBrand(): string
    {
        return $this->brand;
    }

    /**
     * Sets Brand.
     * Card brand
     *
     * @required
     * @maps brand
     */
    public function setBrand(string $brand): void
    {
        $this->brand = $brand;
    }

    /**
     * Returns Label.
     */
    public function getLabel(): string
    {
        return $this->label;
    }

    /**
     * Sets Label.
     *
     * @required
     * @maps label
     */
    public function setLabel(string $label): void
    {
        $this->label = $label;
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
        $json['number']      = $this->number;
        $json['holder_name'] = $this->holderName;
        $json['exp_month']   = $this->expMonth;
        $json['exp_year']    = $this->expYear;
        $json['cvv']         = $this->cvv;
        $json['brand']       = $this->brand;
        $json['label']       = $this->label;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
