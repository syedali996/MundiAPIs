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
 * Response object for getting a increment
 */
class GetIncrementResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $id;

    /**
     * @var float
     */
    private $value;

    /**
     * @var string
     */
    private $incrementType;

    /**
     * @var string
     */
    private $status;

    /**
     * @var \DateTime
     */
    private $createdAt;

    /**
     * @var int|null
     */
    private $cycles;

    /**
     * @var \DateTime|null
     */
    private $deletedAt;

    /**
     * @var string|null
     */
    private $description;

    /**
     * @var GetSubscriptionResponse|null
     */
    private $subscription;

    /**
     * @var GetSubscriptionItemResponse|null
     */
    private $subscriptionItem;

    /**
     * @param string $id
     * @param float $value
     * @param string $incrementType
     * @param string $status
     * @param \DateTime $createdAt
     */
    public function __construct(string $id, float $value, string $incrementType, string $status, \DateTime $createdAt)
    {
        $this->id = $id;
        $this->value = $value;
        $this->incrementType = $incrementType;
        $this->status = $status;
        $this->createdAt = $createdAt;
    }

    /**
     * Returns Id.
     */
    public function getId(): string
    {
        return $this->id;
    }

    /**
     * Sets Id.
     *
     * @required
     * @maps id
     */
    public function setId(string $id): void
    {
        $this->id = $id;
    }

    /**
     * Returns Value.
     */
    public function getValue(): float
    {
        return $this->value;
    }

    /**
     * Sets Value.
     *
     * @required
     * @maps value
     */
    public function setValue(float $value): void
    {
        $this->value = $value;
    }

    /**
     * Returns Increment Type.
     */
    public function getIncrementType(): string
    {
        return $this->incrementType;
    }

    /**
     * Sets Increment Type.
     *
     * @required
     * @maps increment_type
     */
    public function setIncrementType(string $incrementType): void
    {
        $this->incrementType = $incrementType;
    }

    /**
     * Returns Status.
     */
    public function getStatus(): string
    {
        return $this->status;
    }

    /**
     * Sets Status.
     *
     * @required
     * @maps status
     */
    public function setStatus(string $status): void
    {
        $this->status = $status;
    }

    /**
     * Returns Created At.
     */
    public function getCreatedAt(): \DateTime
    {
        return $this->createdAt;
    }

    /**
     * Sets Created At.
     *
     * @required
     * @maps created_at
     * @factory \MundiAPILib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setCreatedAt(\DateTime $createdAt): void
    {
        $this->createdAt = $createdAt;
    }

    /**
     * Returns Cycles.
     */
    public function getCycles(): ?int
    {
        return $this->cycles;
    }

    /**
     * Sets Cycles.
     *
     * @maps cycles
     */
    public function setCycles(?int $cycles): void
    {
        $this->cycles = $cycles;
    }

    /**
     * Returns Deleted At.
     */
    public function getDeletedAt(): ?\DateTime
    {
        return $this->deletedAt;
    }

    /**
     * Sets Deleted At.
     *
     * @maps deleted_at
     * @factory \MundiAPILib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setDeletedAt(?\DateTime $deletedAt): void
    {
        $this->deletedAt = $deletedAt;
    }

    /**
     * Returns Description.
     */
    public function getDescription(): ?string
    {
        return $this->description;
    }

    /**
     * Sets Description.
     *
     * @maps description
     */
    public function setDescription(?string $description): void
    {
        $this->description = $description;
    }

    /**
     * Returns Subscription.
     */
    public function getSubscription(): ?GetSubscriptionResponse
    {
        return $this->subscription;
    }

    /**
     * Sets Subscription.
     *
     * @maps subscription
     */
    public function setSubscription(?GetSubscriptionResponse $subscription): void
    {
        $this->subscription = $subscription;
    }

    /**
     * Returns Subscription Item.
     * The Subscription Item
     */
    public function getSubscriptionItem(): ?GetSubscriptionItemResponse
    {
        return $this->subscriptionItem;
    }

    /**
     * Sets Subscription Item.
     * The Subscription Item
     *
     * @maps subscription_item
     */
    public function setSubscriptionItem(?GetSubscriptionItemResponse $subscriptionItem): void
    {
        $this->subscriptionItem = $subscriptionItem;
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
        $json['id']                    = $this->id;
        $json['value']                 = $this->value;
        $json['increment_type']        = $this->incrementType;
        $json['status']                = $this->status;
        $json['created_at']            = DateTimeHelper::toRfc3339DateTime($this->createdAt);
        if (isset($this->cycles)) {
            $json['cycles']            = $this->cycles;
        }
        if (isset($this->deletedAt)) {
            $json['deleted_at']        = DateTimeHelper::toRfc3339DateTime($this->deletedAt);
        }
        if (isset($this->description)) {
            $json['description']       = $this->description;
        }
        if (isset($this->subscription)) {
            $json['subscription']      = $this->subscription;
        }
        if (isset($this->subscriptionItem)) {
            $json['subscription_item'] = $this->subscriptionItem;
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
