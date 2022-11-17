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
 * Request for creating a plan item
 */
class CreatePlanItemRequest implements \JsonSerializable
{
    /**
     * @var string
     */
    private $name;

    /**
     * @var CreatePricingSchemeRequest
     */
    private $pricingScheme;

    /**
     * @var string
     */
    private $id;

    /**
     * @var string
     */
    private $description;

    /**
     * @var int|null
     */
    private $cycles;

    /**
     * @var int|null
     */
    private $quantity;

    /**
     * @param string $name
     * @param CreatePricingSchemeRequest $pricingScheme
     * @param string $id
     * @param string $description
     */
    public function __construct(
        string $name,
        CreatePricingSchemeRequest $pricingScheme,
        string $id,
        string $description
    ) {
        $this->name = $name;
        $this->pricingScheme = $pricingScheme;
        $this->id = $id;
        $this->description = $description;
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
     * Returns Pricing Scheme.
     * Item's pricing scheme
     */
    public function getPricingScheme(): CreatePricingSchemeRequest
    {
        return $this->pricingScheme;
    }

    /**
     * Sets Pricing Scheme.
     * Item's pricing scheme
     *
     * @required
     * @maps pricing_scheme
     */
    public function setPricingScheme(CreatePricingSchemeRequest $pricingScheme): void
    {
        $this->pricingScheme = $pricingScheme;
    }

    /**
     * Returns Id.
     * Item's id
     */
    public function getId(): string
    {
        return $this->id;
    }

    /**
     * Sets Id.
     * Item's id
     *
     * @required
     * @maps id
     */
    public function setId(string $id): void
    {
        $this->id = $id;
    }

    /**
     * Returns Description.
     * Item's description
     */
    public function getDescription(): string
    {
        return $this->description;
    }

    /**
     * Sets Description.
     * Item's description
     *
     * @required
     * @maps description
     */
    public function setDescription(string $description): void
    {
        $this->description = $description;
    }

    /**
     * Returns Cycles.
     * Number of cycles where the item will be charged
     */
    public function getCycles(): ?int
    {
        return $this->cycles;
    }

    /**
     * Sets Cycles.
     * Number of cycles where the item will be charged
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
        $json['name']           = $this->name;
        $json['pricing_scheme'] = $this->pricingScheme;
        $json['id']             = $this->id;
        $json['description']    = $this->description;
        if (isset($this->cycles)) {
            $json['cycles']     = $this->cycles;
        }
        if (isset($this->quantity)) {
            $json['quantity']   = $this->quantity;
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
