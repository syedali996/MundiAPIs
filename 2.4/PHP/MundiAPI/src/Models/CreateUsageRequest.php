<?php

declare(strict_types=1);

/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace MundiAPILib\Models;

use MundiAPILib\Utils\DateTimeHelper;
use stdClass;

/**
 * Request for creating a usage
 */
class CreateUsageRequest implements \JsonSerializable
{
    /**
     * @var int
     */
    private $quantity;

    /**
     * @var string
     */
    private $description;

    /**
     * @var \DateTime
     */
    private $usedAt;

    /**
     * @var string|null
     */
    private $code;

    /**
     * @var string|null
     */
    private $group;

    /**
     * @var int|null
     */
    private $amount;

    /**
     * @param int $quantity
     * @param string $description
     * @param \DateTime $usedAt
     */
    public function __construct(int $quantity, string $description, \DateTime $usedAt)
    {
        $this->quantity = $quantity;
        $this->description = $description;
        $this->usedAt = $usedAt;
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
     * Returns Used At.
     */
    public function getUsedAt(): \DateTime
    {
        return $this->usedAt;
    }

    /**
     * Sets Used At.
     *
     * @required
     * @maps used_at
     * @factory \MundiAPILib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setUsedAt(\DateTime $usedAt): void
    {
        $this->usedAt = $usedAt;
    }

    /**
     * Returns Code.
     * Identification code in the client system
     */
    public function getCode(): ?string
    {
        return $this->code;
    }

    /**
     * Sets Code.
     * Identification code in the client system
     *
     * @maps code
     */
    public function setCode(?string $code): void
    {
        $this->code = $code;
    }

    /**
     * Returns Group.
     * identification group in the client system
     */
    public function getGroup(): ?string
    {
        return $this->group;
    }

    /**
     * Sets Group.
     * identification group in the client system
     *
     * @maps group
     */
    public function setGroup(?string $group): void
    {
        $this->group = $group;
    }

    /**
     * Returns Amount.
     * Field used in item scheme type 'Percent'
     */
    public function getAmount(): ?int
    {
        return $this->amount;
    }

    /**
     * Sets Amount.
     * Field used in item scheme type 'Percent'
     *
     * @maps amount
     */
    public function setAmount(?int $amount): void
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
        $json['quantity']    = $this->quantity;
        $json['description'] = $this->description;
        $json['used_at']     = DateTimeHelper::toRfc3339DateTime($this->usedAt);
        if (isset($this->code)) {
            $json['code']    = $this->code;
        }
        if (isset($this->group)) {
            $json['group']   = $this->group;
        }
        if (isset($this->amount)) {
            $json['amount']  = $this->amount;
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
