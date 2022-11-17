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
 * Request for updating a pricing scheme
 */
class UpdatePricingSchemeRequest implements \JsonSerializable
{
    /**
     * @var string
     */
    private $schemeType;

    /**
     * @var UpdatePriceBracketRequest[]
     */
    private $priceBrackets;

    /**
     * @var int|null
     */
    private $price;

    /**
     * @var int|null
     */
    private $minimumPrice;

    /**
     * @var float|null
     */
    private $percentage;

    /**
     * @param string $schemeType
     * @param UpdatePriceBracketRequest[] $priceBrackets
     */
    public function __construct(string $schemeType, array $priceBrackets)
    {
        $this->schemeType = $schemeType;
        $this->priceBrackets = $priceBrackets;
    }

    /**
     * Returns Scheme Type.
     * Scheme type
     */
    public function getSchemeType(): string
    {
        return $this->schemeType;
    }

    /**
     * Sets Scheme Type.
     * Scheme type
     *
     * @required
     * @maps scheme_type
     */
    public function setSchemeType(string $schemeType): void
    {
        $this->schemeType = $schemeType;
    }

    /**
     * Returns Price Brackets.
     * Price brackets
     *
     * @return UpdatePriceBracketRequest[]
     */
    public function getPriceBrackets(): array
    {
        return $this->priceBrackets;
    }

    /**
     * Sets Price Brackets.
     * Price brackets
     *
     * @required
     * @maps price_brackets
     *
     * @param UpdatePriceBracketRequest[] $priceBrackets
     */
    public function setPriceBrackets(array $priceBrackets): void
    {
        $this->priceBrackets = $priceBrackets;
    }

    /**
     * Returns Price.
     * Price
     */
    public function getPrice(): ?int
    {
        return $this->price;
    }

    /**
     * Sets Price.
     * Price
     *
     * @maps price
     */
    public function setPrice(?int $price): void
    {
        $this->price = $price;
    }

    /**
     * Returns Minimum Price.
     * Minimum price
     */
    public function getMinimumPrice(): ?int
    {
        return $this->minimumPrice;
    }

    /**
     * Sets Minimum Price.
     * Minimum price
     *
     * @maps minimum_price
     */
    public function setMinimumPrice(?int $minimumPrice): void
    {
        $this->minimumPrice = $minimumPrice;
    }

    /**
     * Returns Percentage.
     * percentual value used in pricing_scheme Percent
     */
    public function getPercentage(): ?float
    {
        return $this->percentage;
    }

    /**
     * Sets Percentage.
     * percentual value used in pricing_scheme Percent
     *
     * @maps percentage
     */
    public function setPercentage(?float $percentage): void
    {
        $this->percentage = $percentage;
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
        $json['scheme_type']       = $this->schemeType;
        $json['price_brackets']    = $this->priceBrackets;
        if (isset($this->price)) {
            $json['price']         = $this->price;
        }
        if (isset($this->minimumPrice)) {
            $json['minimum_price'] = $this->minimumPrice;
        }
        if (isset($this->percentage)) {
            $json['percentage']    = $this->percentage;
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
