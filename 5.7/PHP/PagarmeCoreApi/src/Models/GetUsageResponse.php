<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib\Models;

use PagarmeCoreApiLib\Utils\DateTimeHelper;
use stdClass;

/**
 * Response object for getting a usage
 */
class GetUsageResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $id;

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
     * @var \DateTime
     */
    private $createdAt;

    /**
     * @var string
     */
    private $status;

    /**
     * @var \DateTime|null
     */
    private $deletedAt;

    /**
     * @var GetSubscriptionItemResponse
     */
    private $subscriptionItem;

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
     * @param string $id
     * @param int $quantity
     * @param string $description
     * @param \DateTime $usedAt
     * @param \DateTime $createdAt
     * @param string $status
     * @param GetSubscriptionItemResponse $subscriptionItem
     */
    public function __construct(
        string $id,
        int $quantity,
        string $description,
        \DateTime $usedAt,
        \DateTime $createdAt,
        string $status,
        GetSubscriptionItemResponse $subscriptionItem
    ) {
        $this->id = $id;
        $this->quantity = $quantity;
        $this->description = $description;
        $this->usedAt = $usedAt;
        $this->createdAt = $createdAt;
        $this->status = $status;
        $this->subscriptionItem = $subscriptionItem;
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
     * Returns Quantity.
     * Quantity
     */
    public function getQuantity(): int
    {
        return $this->quantity;
    }

    /**
     * Sets Quantity.
     * Quantity
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
     * Returns Used At.
     * Used at
     */
    public function getUsedAt(): \DateTime
    {
        return $this->usedAt;
    }

    /**
     * Sets Used At.
     * Used at
     *
     * @required
     * @maps used_at
     * @factory \PagarmeCoreApiLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setUsedAt(\DateTime $usedAt): void
    {
        $this->usedAt = $usedAt;
    }

    /**
     * Returns Created At.
     * Creation date
     */
    public function getCreatedAt(): \DateTime
    {
        return $this->createdAt;
    }

    /**
     * Sets Created At.
     * Creation date
     *
     * @required
     * @maps created_at
     * @factory \PagarmeCoreApiLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setCreatedAt(\DateTime $createdAt): void
    {
        $this->createdAt = $createdAt;
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
     * @factory \PagarmeCoreApiLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setDeletedAt(?\DateTime $deletedAt): void
    {
        $this->deletedAt = $deletedAt;
    }

    /**
     * Returns Subscription Item.
     * Subscription item
     */
    public function getSubscriptionItem(): GetSubscriptionItemResponse
    {
        return $this->subscriptionItem;
    }

    /**
     * Sets Subscription Item.
     * Subscription item
     *
     * @required
     * @maps subscription_item
     */
    public function setSubscriptionItem(GetSubscriptionItemResponse $subscriptionItem): void
    {
        $this->subscriptionItem = $subscriptionItem;
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
     * Identification group in the client system
     */
    public function getGroup(): ?string
    {
        return $this->group;
    }

    /**
     * Sets Group.
     * Identification group in the client system
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
        $json['id']                = $this->id;
        $json['quantity']          = $this->quantity;
        $json['description']       = $this->description;
        $json['used_at']           = DateTimeHelper::toRfc3339DateTime($this->usedAt);
        $json['created_at']        = DateTimeHelper::toRfc3339DateTime($this->createdAt);
        $json['status']            = $this->status;
        if (isset($this->deletedAt)) {
            $json['deleted_at']    = DateTimeHelper::toRfc3339DateTime($this->deletedAt);
        }
        $json['subscription_item'] = $this->subscriptionItem;
        if (isset($this->code)) {
            $json['code']          = $this->code;
        }
        if (isset($this->group)) {
            $json['group']         = $this->group;
        }
        if (isset($this->amount)) {
            $json['amount']        = $this->amount;
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
