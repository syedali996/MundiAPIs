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
 * Response object for getting a period
 */
class GetPeriodResponse implements \JsonSerializable
{
    /**
     * @var \DateTime
     */
    private $startAt;

    /**
     * @var \DateTime
     */
    private $endAt;

    /**
     * @var string
     */
    private $id;

    /**
     * @var \DateTime
     */
    private $billingAt;

    /**
     * @var GetSubscriptionResponse
     */
    private $subscription;

    /**
     * @var string
     */
    private $status;

    /**
     * @var int
     */
    private $duration;

    /**
     * @var string
     */
    private $createdAt;

    /**
     * @var string
     */
    private $updatedAt;

    /**
     * @var int
     */
    private $cycle;

    /**
     * @param \DateTime $startAt
     * @param \DateTime $endAt
     * @param string $id
     * @param \DateTime $billingAt
     * @param GetSubscriptionResponse $subscription
     * @param string $status
     * @param int $duration
     * @param string $createdAt
     * @param string $updatedAt
     * @param int $cycle
     */
    public function __construct(
        \DateTime $startAt,
        \DateTime $endAt,
        string $id,
        \DateTime $billingAt,
        GetSubscriptionResponse $subscription,
        string $status,
        int $duration,
        string $createdAt,
        string $updatedAt,
        int $cycle
    ) {
        $this->startAt = $startAt;
        $this->endAt = $endAt;
        $this->id = $id;
        $this->billingAt = $billingAt;
        $this->subscription = $subscription;
        $this->status = $status;
        $this->duration = $duration;
        $this->createdAt = $createdAt;
        $this->updatedAt = $updatedAt;
        $this->cycle = $cycle;
    }

    /**
     * Returns Start At.
     */
    public function getStartAt(): \DateTime
    {
        return $this->startAt;
    }

    /**
     * Sets Start At.
     *
     * @required
     * @maps start_at
     * @factory \PagarmeCoreApiLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setStartAt(\DateTime $startAt): void
    {
        $this->startAt = $startAt;
    }

    /**
     * Returns End At.
     */
    public function getEndAt(): \DateTime
    {
        return $this->endAt;
    }

    /**
     * Sets End At.
     *
     * @required
     * @maps end_at
     * @factory \PagarmeCoreApiLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setEndAt(\DateTime $endAt): void
    {
        $this->endAt = $endAt;
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
     * Returns Billing At.
     */
    public function getBillingAt(): \DateTime
    {
        return $this->billingAt;
    }

    /**
     * Sets Billing At.
     *
     * @required
     * @maps billing_at
     * @factory \PagarmeCoreApiLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setBillingAt(\DateTime $billingAt): void
    {
        $this->billingAt = $billingAt;
    }

    /**
     * Returns Subscription.
     */
    public function getSubscription(): GetSubscriptionResponse
    {
        return $this->subscription;
    }

    /**
     * Sets Subscription.
     *
     * @required
     * @maps subscription
     */
    public function setSubscription(GetSubscriptionResponse $subscription): void
    {
        $this->subscription = $subscription;
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
     * Returns Duration.
     */
    public function getDuration(): int
    {
        return $this->duration;
    }

    /**
     * Sets Duration.
     *
     * @required
     * @maps duration
     */
    public function setDuration(int $duration): void
    {
        $this->duration = $duration;
    }

    /**
     * Returns Created At.
     */
    public function getCreatedAt(): string
    {
        return $this->createdAt;
    }

    /**
     * Sets Created At.
     *
     * @required
     * @maps created_at
     */
    public function setCreatedAt(string $createdAt): void
    {
        $this->createdAt = $createdAt;
    }

    /**
     * Returns Updated At.
     */
    public function getUpdatedAt(): string
    {
        return $this->updatedAt;
    }

    /**
     * Sets Updated At.
     *
     * @required
     * @maps updated_at
     */
    public function setUpdatedAt(string $updatedAt): void
    {
        $this->updatedAt = $updatedAt;
    }

    /**
     * Returns Cycle.
     */
    public function getCycle(): int
    {
        return $this->cycle;
    }

    /**
     * Sets Cycle.
     *
     * @required
     * @maps cycle
     */
    public function setCycle(int $cycle): void
    {
        $this->cycle = $cycle;
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
        $json['start_at']     = DateTimeHelper::toRfc3339DateTime($this->startAt);
        $json['end_at']       = DateTimeHelper::toRfc3339DateTime($this->endAt);
        $json['id']           = $this->id;
        $json['billing_at']   = DateTimeHelper::toRfc3339DateTime($this->billingAt);
        $json['subscription'] = $this->subscription;
        $json['status']       = $this->status;
        $json['duration']     = $this->duration;
        $json['created_at']   = $this->createdAt;
        $json['updated_at']   = $this->updatedAt;
        $json['cycle']        = $this->cycle;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
