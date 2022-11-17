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
 * Response object for getting an order item
 */
class GetOrderItemResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $id;

    /**
     * @var int
     */
    private $amount;

    /**
     * @var string
     */
    private $description;

    /**
     * @var int
     */
    private $quantity;

    /**
     * @var string
     */
    private $category;

    /**
     * @var string
     */
    private $code;

    /**
     * @param string $id
     * @param int $amount
     * @param string $description
     * @param int $quantity
     * @param string $category
     * @param string $code
     */
    public function __construct(
        string $id,
        int $amount,
        string $description,
        int $quantity,
        string $category,
        string $code
    ) {
        $this->id = $id;
        $this->amount = $amount;
        $this->description = $description;
        $this->quantity = $quantity;
        $this->category = $category;
        $this->code = $code;
    }

    /**
     * Returns Id.
     * Id
     */
    public function getId(): string
    {
        return $this->id;
    }

    /**
     * Sets Id.
     * Id
     *
     * @required
     * @maps id
     */
    public function setId(string $id): void
    {
        $this->id = $id;
    }

    /**
     * Returns Amount.
     */
    public function getAmount(): int
    {
        return $this->amount;
    }

    /**
     * Sets Amount.
     *
     * @required
     * @maps amount
     */
    public function setAmount(int $amount): void
    {
        $this->amount = $amount;
    }

    /**
     * Returns Description.
     */
    public function getDescription(): string
    {
        return $this->description;
    }

    /**
     * Sets Description.
     *
     * @required
     * @maps description
     */
    public function setDescription(string $description): void
    {
        $this->description = $description;
    }

    /**
     * Returns Quantity.
     */
    public function getQuantity(): int
    {
        return $this->quantity;
    }

    /**
     * Sets Quantity.
     *
     * @required
     * @maps quantity
     */
    public function setQuantity(int $quantity): void
    {
        $this->quantity = $quantity;
    }

    /**
     * Returns Category.
     * Category
     */
    public function getCategory(): string
    {
        return $this->category;
    }

    /**
     * Sets Category.
     * Category
     *
     * @required
     * @maps category
     */
    public function setCategory(string $category): void
    {
        $this->category = $category;
    }

    /**
     * Returns Code.
     * Code
     */
    public function getCode(): string
    {
        return $this->code;
    }

    /**
     * Sets Code.
     * Code
     *
     * @required
     * @maps code
     */
    public function setCode(string $code): void
    {
        $this->code = $code;
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
        $json['id']          = $this->id;
        $json['amount']      = $this->amount;
        $json['description'] = $this->description;
        $json['quantity']    = $this->quantity;
        $json['category']    = $this->category;
        $json['code']        = $this->code;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
