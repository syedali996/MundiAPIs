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
 * Response object for getting a plan
 */
class GetPlanResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $id;

    /**
     * @var string
     */
    private $name;

    /**
     * @var string
     */
    private $description;

    /**
     * @var string
     */
    private $url;

    /**
     * @var string
     */
    private $statementDescriptor;

    /**
     * @var string
     */
    private $interval;

    /**
     * @var int
     */
    private $intervalCount;

    /**
     * @var string
     */
    private $billingType;

    /**
     * @var string[]
     */
    private $paymentMethods;

    /**
     * @var int[]
     */
    private $installments;

    /**
     * @var string
     */
    private $status;

    /**
     * @var string
     */
    private $currency;

    /**
     * @var \DateTime
     */
    private $createdAt;

    /**
     * @var \DateTime
     */
    private $updatedAt;

    /**
     * @var GetPlanItemResponse[]
     */
    private $items;

    /**
     * @var int[]
     */
    private $billingDays;

    /**
     * @var bool
     */
    private $shippable;

    /**
     * @var array<string,string>
     */
    private $metadata;

    /**
     * @var int|null
     */
    private $trialPeriodDays;

    /**
     * @var int|null
     */
    private $minimumPrice;

    /**
     * @var \DateTime|null
     */
    private $deletedAt;

    /**
     * @param string $id
     * @param string $name
     * @param string $description
     * @param string $url
     * @param string $statementDescriptor
     * @param string $interval
     * @param int $intervalCount
     * @param string $billingType
     * @param string[] $paymentMethods
     * @param int[] $installments
     * @param string $status
     * @param string $currency
     * @param \DateTime $createdAt
     * @param \DateTime $updatedAt
     * @param GetPlanItemResponse[] $items
     * @param int[] $billingDays
     * @param bool $shippable
     * @param array<string,string> $metadata
     */
    public function __construct(
        string $id,
        string $name,
        string $description,
        string $url,
        string $statementDescriptor,
        string $interval,
        int $intervalCount,
        string $billingType,
        array $paymentMethods,
        array $installments,
        string $status,
        string $currency,
        \DateTime $createdAt,
        \DateTime $updatedAt,
        array $items,
        array $billingDays,
        bool $shippable,
        array $metadata
    ) {
        $this->id = $id;
        $this->name = $name;
        $this->description = $description;
        $this->url = $url;
        $this->statementDescriptor = $statementDescriptor;
        $this->interval = $interval;
        $this->intervalCount = $intervalCount;
        $this->billingType = $billingType;
        $this->paymentMethods = $paymentMethods;
        $this->installments = $installments;
        $this->status = $status;
        $this->currency = $currency;
        $this->createdAt = $createdAt;
        $this->updatedAt = $updatedAt;
        $this->items = $items;
        $this->billingDays = $billingDays;
        $this->shippable = $shippable;
        $this->metadata = $metadata;
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
     * Returns Name.
     */
    public function getName(): string
    {
        return $this->name;
    }

    /**
     * Sets Name.
     *
     * @required
     * @maps name
     */
    public function setName(string $name): void
    {
        $this->name = $name;
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
     * Returns Url.
     */
    public function getUrl(): string
    {
        return $this->url;
    }

    /**
     * Sets Url.
     *
     * @required
     * @maps url
     */
    public function setUrl(string $url): void
    {
        $this->url = $url;
    }

    /**
     * Returns Statement Descriptor.
     */
    public function getStatementDescriptor(): string
    {
        return $this->statementDescriptor;
    }

    /**
     * Sets Statement Descriptor.
     *
     * @required
     * @maps statement_descriptor
     */
    public function setStatementDescriptor(string $statementDescriptor): void
    {
        $this->statementDescriptor = $statementDescriptor;
    }

    /**
     * Returns Interval.
     */
    public function getInterval(): string
    {
        return $this->interval;
    }

    /**
     * Sets Interval.
     *
     * @required
     * @maps interval
     */
    public function setInterval(string $interval): void
    {
        $this->interval = $interval;
    }

    /**
     * Returns Interval Count.
     */
    public function getIntervalCount(): int
    {
        return $this->intervalCount;
    }

    /**
     * Sets Interval Count.
     *
     * @required
     * @maps interval_count
     */
    public function setIntervalCount(int $intervalCount): void
    {
        $this->intervalCount = $intervalCount;
    }

    /**
     * Returns Billing Type.
     */
    public function getBillingType(): string
    {
        return $this->billingType;
    }

    /**
     * Sets Billing Type.
     *
     * @required
     * @maps billing_type
     */
    public function setBillingType(string $billingType): void
    {
        $this->billingType = $billingType;
    }

    /**
     * Returns Payment Methods.
     *
     * @return string[]
     */
    public function getPaymentMethods(): array
    {
        return $this->paymentMethods;
    }

    /**
     * Sets Payment Methods.
     *
     * @required
     * @maps payment_methods
     *
     * @param string[] $paymentMethods
     */
    public function setPaymentMethods(array $paymentMethods): void
    {
        $this->paymentMethods = $paymentMethods;
    }

    /**
     * Returns Installments.
     *
     * @return int[]
     */
    public function getInstallments(): array
    {
        return $this->installments;
    }

    /**
     * Sets Installments.
     *
     * @required
     * @maps installments
     *
     * @param int[] $installments
     */
    public function setInstallments(array $installments): void
    {
        $this->installments = $installments;
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
     * Returns Currency.
     */
    public function getCurrency(): string
    {
        return $this->currency;
    }

    /**
     * Sets Currency.
     *
     * @required
     * @maps currency
     */
    public function setCurrency(string $currency): void
    {
        $this->currency = $currency;
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
     * @factory \PagarmeCoreApiLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setCreatedAt(\DateTime $createdAt): void
    {
        $this->createdAt = $createdAt;
    }

    /**
     * Returns Updated At.
     */
    public function getUpdatedAt(): \DateTime
    {
        return $this->updatedAt;
    }

    /**
     * Sets Updated At.
     *
     * @required
     * @maps updated_at
     * @factory \PagarmeCoreApiLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setUpdatedAt(\DateTime $updatedAt): void
    {
        $this->updatedAt = $updatedAt;
    }

    /**
     * Returns Items.
     *
     * @return GetPlanItemResponse[]
     */
    public function getItems(): array
    {
        return $this->items;
    }

    /**
     * Sets Items.
     *
     * @required
     * @maps items
     *
     * @param GetPlanItemResponse[] $items
     */
    public function setItems(array $items): void
    {
        $this->items = $items;
    }

    /**
     * Returns Billing Days.
     *
     * @return int[]
     */
    public function getBillingDays(): array
    {
        return $this->billingDays;
    }

    /**
     * Sets Billing Days.
     *
     * @required
     * @maps billing_days
     *
     * @param int[] $billingDays
     */
    public function setBillingDays(array $billingDays): void
    {
        $this->billingDays = $billingDays;
    }

    /**
     * Returns Shippable.
     */
    public function getShippable(): bool
    {
        return $this->shippable;
    }

    /**
     * Sets Shippable.
     *
     * @required
     * @maps shippable
     */
    public function setShippable(bool $shippable): void
    {
        $this->shippable = $shippable;
    }

    /**
     * Returns Metadata.
     *
     * @return array<string,string>
     */
    public function getMetadata(): array
    {
        return $this->metadata;
    }

    /**
     * Sets Metadata.
     *
     * @required
     * @maps metadata
     *
     * @param array<string,string> $metadata
     */
    public function setMetadata(array $metadata): void
    {
        $this->metadata = $metadata;
    }

    /**
     * Returns Trial Period Days.
     */
    public function getTrialPeriodDays(): ?int
    {
        return $this->trialPeriodDays;
    }

    /**
     * Sets Trial Period Days.
     *
     * @maps trial_period_days
     */
    public function setTrialPeriodDays(?int $trialPeriodDays): void
    {
        $this->trialPeriodDays = $trialPeriodDays;
    }

    /**
     * Returns Minimum Price.
     */
    public function getMinimumPrice(): ?int
    {
        return $this->minimumPrice;
    }

    /**
     * Sets Minimum Price.
     *
     * @maps minimum_price
     */
    public function setMinimumPrice(?int $minimumPrice): void
    {
        $this->minimumPrice = $minimumPrice;
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
        $json['name']                  = $this->name;
        $json['description']           = $this->description;
        $json['url']                   = $this->url;
        $json['statement_descriptor']  = $this->statementDescriptor;
        $json['interval']              = $this->interval;
        $json['interval_count']        = $this->intervalCount;
        $json['billing_type']          = $this->billingType;
        $json['payment_methods']       = $this->paymentMethods;
        $json['installments']          = $this->installments;
        $json['status']                = $this->status;
        $json['currency']              = $this->currency;
        $json['created_at']            = DateTimeHelper::toRfc3339DateTime($this->createdAt);
        $json['updated_at']            = DateTimeHelper::toRfc3339DateTime($this->updatedAt);
        $json['items']                 = $this->items;
        $json['billing_days']          = $this->billingDays;
        $json['shippable']             = $this->shippable;
        $json['metadata']              = $this->metadata;
        if (isset($this->trialPeriodDays)) {
            $json['trial_period_days'] = $this->trialPeriodDays;
        }
        if (isset($this->minimumPrice)) {
            $json['minimum_price']     = $this->minimumPrice;
        }
        if (isset($this->deletedAt)) {
            $json['deleted_at']        = DateTimeHelper::toRfc3339DateTime($this->deletedAt);
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
