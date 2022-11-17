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
 * Request for updating a subscription item
 */
class UpdateSubscriptionItemRequest implements \JsonSerializable
{
    /**
     * @var string
     */
    private $description;

    /**
     * @var string
     */
    private $status;

    /**
     * @var UpdatePricingSchemeRequest
     */
    private $pricingScheme;

    /**
     * @var string
     */
    private $name;

    /**
     * @var int|null
     */
    private $cycles;

    /**
     * @var int|null
     */
    private $quantity;

    /**
     * @var int|null
     */
    private $minimumPrice;

    /**
     * @param string $description
     * @param string $status
     * @param UpdatePricingSchemeRequest $pricingScheme
     * @param string $name
     */
    public function __construct(
        string $description,
        string $status,
        UpdatePricingSchemeRequest $pricingScheme,
        string $name
    ) {
        $this->description = $description;
        $this->status = $status;
        $this->pricingScheme = $pricingScheme;
        $this->name = $name;
    }

    /**
     * Returns Description.
     * Description
     */
    public function getDescription(): string
    {
        return $this->description;
    }

    /**
     * Sets Description.
     * Description
     *
     * @required
     * @maps description
     */
    public function setDescription(string $description): void
    {
        $this->description = $description;
    }

    /**
     * Returns Status.
     * Status
     */
    public function getStatus(): string
    {
        return $this->status;
    }

    /**
     * Sets Status.
     * Status
     *
     * @required
     * @maps status
     */
    public function setStatus(string $status): void
    {
        $this->status = $status;
    }

    /**
     * Returns Pricing Scheme.
     * Pricing scheme
     */
    public function getPricingScheme(): UpdatePricingSchemeRequest
    {
        return $this->pricingScheme;
    }

    /**
     * Sets Pricing Scheme.
     * Pricing scheme
     *
     * @required
     * @maps pricing_scheme
     */
    public function setPricingScheme(UpdatePricingSchemeRequest $pricingScheme): void
    {
        $this->pricingScheme = $pricingScheme;
    }

    /**
     * Returns Name.
     * Item name
     */
    public function getName(): string
    {
        return $this->name;
    }

    /**
     * Sets Name.
     * Item name
     *
     * @required
     * @maps name
     */
    public function setName(string $name): void
    {
        $this->name = $name;
    }

    /**
     * Returns Cycles.
     * Number of cycles that the item will be charged
     */
    public function getCycles(): ?int
    {
        return $this->cycles;
    }

    /**
     * Sets Cycles.
     * Number of cycles that the item will be charged
     *
     * @maps cycles
     */
    public function setCycles(?int $cycles): void
    {
        $this->cycles = $cycles;
    }

    /**
     * Returns Quantity.
     * Quantity
     */
    public function getQuantity(): ?int
    {
        return $this->quantity;
    }

    /**
     * Sets Quantity.
     * Quantity
     *
     * @maps quantity
     */
    public function setQuantity(?int $quantity): void
    {
        $this->quantity = $quantity;
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
        $json['description']       = $this->description;
        $json['status']            = $this->status;
        $json['pricing_scheme']    = $this->pricingScheme;
        $json['name']              = $this->name;
        if (isset($this->cycles)) {
            $json['cycles']        = $this->cycles;
        }
        if (isset($this->quantity)) {
            $json['quantity']      = $this->quantity;
        }
        if (isset($this->minimumPrice)) {
            $json['minimum_price'] = $this->minimumPrice;
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
