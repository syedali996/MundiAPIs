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
 * Response object for getting an invoice
 */
class GetInvoiceResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $id;

    /**
     * @var string
     */
    private $code;

    /**
     * @var string
     */
    private $url;

    /**
     * @var int
     */
    private $amount;

    /**
     * @var string
     */
    private $status;

    /**
     * @var string
     */
    private $paymentMethod;

    /**
     * @var \DateTime
     */
    private $createdAt;

    /**
     * @var GetInvoiceItemResponse[]
     */
    private $items;

    /**
     * @var GetCustomerResponse|null
     */
    private $customer;

    /**
     * @var GetChargeResponse
     */
    private $charge;

    /**
     * @var int
     */
    private $installments;

    /**
     * @var GetBillingAddressResponse
     */
    private $billingAddress;

    /**
     * @var GetSubscriptionResponse
     */
    private $subscription;

    /**
     * @var GetPeriodResponse|null
     */
    private $cycle;

    /**
     * @var GetShippingResponse
     */
    private $shipping;

    /**
     * @var array<string,string>
     */
    private $metadata;

    /**
     * @var \DateTime|null
     */
    private $dueAt;

    /**
     * @var \DateTime|null
     */
    private $canceledAt;

    /**
     * @var \DateTime|null
     */
    private $billingAt;

    /**
     * @var \DateTime|null
     */
    private $seenAt;

    /**
     * @var int|null
     */
    private $totalDiscount;

    /**
     * @var int|null
     */
    private $totalIncrement;

    /**
     * @var string
     */
    private $subscriptionId;

    /**
     * @param string $id
     * @param string $code
     * @param string $url
     * @param int $amount
     * @param string $status
     * @param string $paymentMethod
     * @param \DateTime $createdAt
     * @param GetInvoiceItemResponse[] $items
     * @param GetChargeResponse $charge
     * @param int $installments
     * @param GetBillingAddressResponse $billingAddress
     * @param GetSubscriptionResponse $subscription
     * @param GetShippingResponse $shipping
     * @param array<string,string> $metadata
     * @param string $subscriptionId
     */
    public function __construct(
        string $id,
        string $code,
        string $url,
        int $amount,
        string $status,
        string $paymentMethod,
        \DateTime $createdAt,
        array $items,
        GetChargeResponse $charge,
        int $installments,
        GetBillingAddressResponse $billingAddress,
        GetSubscriptionResponse $subscription,
        GetShippingResponse $shipping,
        array $metadata,
        string $subscriptionId
    ) {
        $this->id = $id;
        $this->code = $code;
        $this->url = $url;
        $this->amount = $amount;
        $this->status = $status;
        $this->paymentMethod = $paymentMethod;
        $this->createdAt = $createdAt;
        $this->items = $items;
        $this->charge = $charge;
        $this->installments = $installments;
        $this->billingAddress = $billingAddress;
        $this->subscription = $subscription;
        $this->shipping = $shipping;
        $this->metadata = $metadata;
        $this->subscriptionId = $subscriptionId;
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
     * Returns Code.
     */
    public function getCode(): string
    {
        return $this->code;
    }

    /**
     * Sets Code.
     *
     * @required
     * @maps code
     */
    public function setCode(string $code): void
    {
        $this->code = $code;
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
     * Returns Payment Method.
     */
    public function getPaymentMethod(): string
    {
        return $this->paymentMethod;
    }

    /**
     * Sets Payment Method.
     *
     * @required
     * @maps payment_method
     */
    public function setPaymentMethod(string $paymentMethod): void
    {
        $this->paymentMethod = $paymentMethod;
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
     * Returns Items.
     *
     * @return GetInvoiceItemResponse[]
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
     * @param GetInvoiceItemResponse[] $items
     */
    public function setItems(array $items): void
    {
        $this->items = $items;
    }

    /**
     * Returns Customer.
     */
    public function getCustomer(): ?GetCustomerResponse
    {
        return $this->customer;
    }

    /**
     * Sets Customer.
     *
     * @maps customer
     */
    public function setCustomer(?GetCustomerResponse $customer): void
    {
        $this->customer = $customer;
    }

    /**
     * Returns Charge.
     */
    public function getCharge(): GetChargeResponse
    {
        return $this->charge;
    }

    /**
     * Sets Charge.
     *
     * @required
     * @maps charge
     */
    public function setCharge(GetChargeResponse $charge): void
    {
        $this->charge = $charge;
    }

    /**
     * Returns Installments.
     */
    public function getInstallments(): int
    {
        return $this->installments;
    }

    /**
     * Sets Installments.
     *
     * @required
     * @maps installments
     */
    public function setInstallments(int $installments): void
    {
        $this->installments = $installments;
    }

    /**
     * Returns Billing Address.
     */
    public function getBillingAddress(): GetBillingAddressResponse
    {
        return $this->billingAddress;
    }

    /**
     * Sets Billing Address.
     *
     * @required
     * @maps billing_address
     */
    public function setBillingAddress(GetBillingAddressResponse $billingAddress): void
    {
        $this->billingAddress = $billingAddress;
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
     * Returns Cycle.
     */
    public function getCycle(): ?GetPeriodResponse
    {
        return $this->cycle;
    }

    /**
     * Sets Cycle.
     *
     * @maps cycle
     */
    public function setCycle(?GetPeriodResponse $cycle): void
    {
        $this->cycle = $cycle;
    }

    /**
     * Returns Shipping.
     */
    public function getShipping(): GetShippingResponse
    {
        return $this->shipping;
    }

    /**
     * Sets Shipping.
     *
     * @required
     * @maps shipping
     */
    public function setShipping(GetShippingResponse $shipping): void
    {
        $this->shipping = $shipping;
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
     * Returns Due At.
     */
    public function getDueAt(): ?\DateTime
    {
        return $this->dueAt;
    }

    /**
     * Sets Due At.
     *
     * @maps due_at
     * @factory \MundiAPILib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setDueAt(?\DateTime $dueAt): void
    {
        $this->dueAt = $dueAt;
    }

    /**
     * Returns Canceled At.
     */
    public function getCanceledAt(): ?\DateTime
    {
        return $this->canceledAt;
    }

    /**
     * Sets Canceled At.
     *
     * @maps canceled_at
     * @factory \MundiAPILib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setCanceledAt(?\DateTime $canceledAt): void
    {
        $this->canceledAt = $canceledAt;
    }

    /**
     * Returns Billing At.
     */
    public function getBillingAt(): ?\DateTime
    {
        return $this->billingAt;
    }

    /**
     * Sets Billing At.
     *
     * @maps billing_at
     * @factory \MundiAPILib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setBillingAt(?\DateTime $billingAt): void
    {
        $this->billingAt = $billingAt;
    }

    /**
     * Returns Seen At.
     */
    public function getSeenAt(): ?\DateTime
    {
        return $this->seenAt;
    }

    /**
     * Sets Seen At.
     *
     * @maps seen_at
     * @factory \MundiAPILib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setSeenAt(?\DateTime $seenAt): void
    {
        $this->seenAt = $seenAt;
    }

    /**
     * Returns Total Discount.
     * Total discounted value
     */
    public function getTotalDiscount(): ?int
    {
        return $this->totalDiscount;
    }

    /**
     * Sets Total Discount.
     * Total discounted value
     *
     * @maps total_discount
     */
    public function setTotalDiscount(?int $totalDiscount): void
    {
        $this->totalDiscount = $totalDiscount;
    }

    /**
     * Returns Total Increment.
     * Total discounted value
     */
    public function getTotalIncrement(): ?int
    {
        return $this->totalIncrement;
    }

    /**
     * Sets Total Increment.
     * Total discounted value
     *
     * @maps total_increment
     */
    public function setTotalIncrement(?int $totalIncrement): void
    {
        $this->totalIncrement = $totalIncrement;
    }

    /**
     * Returns Subscription Id.
     * Subscription Id
     */
    public function getSubscriptionId(): string
    {
        return $this->subscriptionId;
    }

    /**
     * Sets Subscription Id.
     * Subscription Id
     *
     * @required
     * @maps subscription_id
     */
    public function setSubscriptionId(string $subscriptionId): void
    {
        $this->subscriptionId = $subscriptionId;
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
        $json['id']                  = $this->id;
        $json['code']                = $this->code;
        $json['url']                 = $this->url;
        $json['amount']              = $this->amount;
        $json['status']              = $this->status;
        $json['payment_method']      = $this->paymentMethod;
        $json['created_at']          = DateTimeHelper::toRfc3339DateTime($this->createdAt);
        $json['items']               = $this->items;
        if (isset($this->customer)) {
            $json['customer']        = $this->customer;
        }
        $json['charge']              = $this->charge;
        $json['installments']        = $this->installments;
        $json['billing_address']     = $this->billingAddress;
        $json['subscription']        = $this->subscription;
        if (isset($this->cycle)) {
            $json['cycle']           = $this->cycle;
        }
        $json['shipping']            = $this->shipping;
        $json['metadata']            = $this->metadata;
        if (isset($this->dueAt)) {
            $json['due_at']          = DateTimeHelper::toRfc3339DateTime($this->dueAt);
        }
        if (isset($this->canceledAt)) {
            $json['canceled_at']     = DateTimeHelper::toRfc3339DateTime($this->canceledAt);
        }
        if (isset($this->billingAt)) {
            $json['billing_at']      = DateTimeHelper::toRfc3339DateTime($this->billingAt);
        }
        if (isset($this->seenAt)) {
            $json['seen_at']         = DateTimeHelper::toRfc3339DateTime($this->seenAt);
        }
        if (isset($this->totalDiscount)) {
            $json['total_discount']  = $this->totalDiscount;
        }
        if (isset($this->totalIncrement)) {
            $json['total_increment'] = $this->totalIncrement;
        }
        $json['subscription_id']     = $this->subscriptionId;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
