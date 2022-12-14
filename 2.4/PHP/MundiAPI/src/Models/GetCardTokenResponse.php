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
 * Card token data
 */
class GetCardTokenResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $lastFourDigits;

    /**
     * @var string
     */
    private $holderName;

    /**
     * @var string
     */
    private $holderDocument;

    /**
     * @var string
     */
    private $expMonth;

    /**
     * @var string
     */
    private $expYear;

    /**
     * @var string
     */
    private $brand;

    /**
     * @var string
     */
    private $type;

    /**
     * @var string
     */
    private $label;

    /**
     * @param string $lastFourDigits
     * @param string $holderName
     * @param string $holderDocument
     * @param string $expMonth
     * @param string $expYear
     * @param string $brand
     * @param string $type
     * @param string $label
     */
    public function __construct(
        string $lastFourDigits,
        string $holderName,
        string $holderDocument,
        string $expMonth,
        string $expYear,
        string $brand,
        string $type,
        string $label
    ) {
        $this->lastFourDigits = $lastFourDigits;
        $this->holderName = $holderName;
        $this->holderDocument = $holderDocument;
        $this->expMonth = $expMonth;
        $this->expYear = $expYear;
        $this->brand = $brand;
        $this->type = $type;
        $this->label = $label;
    }

    /**
     * Returns Last Four Digits.
     */
    public function getLastFourDigits(): string
    {
        return $this->lastFourDigits;
    }

    /**
     * Sets Last Four Digits.
     *
     * @required
     * @maps last_four_digits
     */
    public function setLastFourDigits(string $lastFourDigits): void
    {
        $this->lastFourDigits = $lastFourDigits;
    }

    /**
     * Returns Holder Name.
     */
    public function getHolderName(): string
    {
        return $this->holderName;
    }

    /**
     * Sets Holder Name.
     *
     * @required
     * @maps holder_name
     */
    public function setHolderName(string $holderName): void
    {
        $this->holderName = $holderName;
    }

    /**
     * Returns Holder Document.
     */
    public function getHolderDocument(): string
    {
        return $this->holderDocument;
    }

    /**
     * Sets Holder Document.
     *
     * @required
     * @maps holder_document
     */
    public function setHolderDocument(string $holderDocument): void
    {
        $this->holderDocument = $holderDocument;
    }

    /**
     * Returns Exp Month.
     */
    public function getExpMonth(): string
    {
        return $this->expMonth;
    }

    /**
     * Sets Exp Month.
     *
     * @required
     * @maps exp_month
     */
    public function setExpMonth(string $expMonth): void
    {
        $this->expMonth = $expMonth;
    }

    /**
     * Returns Exp Year.
     */
    public function getExpYear(): string
    {
        return $this->expYear;
    }

    /**
     * Sets Exp Year.
     *
     * @required
     * @maps exp_year
     */
    public function setExpYear(string $expYear): void
    {
        $this->expYear = $expYear;
    }

    /**
     * Returns Brand.
     */
    public function getBrand(): string
    {
        return $this->brand;
    }

    /**
     * Sets Brand.
     *
     * @required
     * @maps brand
     */
    public function setBrand(string $brand): void
    {
        $this->brand = $brand;
    }

    /**
     * Returns Type.
     */
    public function getType(): string
    {
        return $this->type;
    }

    /**
     * Sets Type.
     *
     * @required
     * @maps type
     */
    public function setType(string $type): void
    {
        $this->type = $type;
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
        $json['last_four_digits'] = $this->lastFourDigits;
        $json['holder_name']      = $this->holderName;
        $json['holder_document']  = $this->holderDocument;
        $json['exp_month']        = $this->expMonth;
        $json['exp_year']         = $this->expYear;
        $json['brand']            = $this->brand;
        $json['type']             = $this->type;
        $json['label']            = $this->label;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
