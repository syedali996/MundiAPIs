<?php

declare(strict_types=1);

/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeApiSDKLib\Models;

use PagarmeApiSDKLib\Utils\DateTimeHelper;
use stdClass;

/**
 * Request for creating a subcription
 */
class CreateSubscriptionRequest implements \JsonSerializable
{
    /**
     * @var CreateCustomerRequest
     */
    private $customer;

    /**
     * @var CreateCardRequest
     */
    private $card;

    /**
     * @var string
     */
    private $code;

    /**
     * @var string
     */
    private $paymentMethod;

    /**
     * @var string
     */
    private $billingType;

    /**
     * @var string
     */
    private $statementDescriptor;

    /**
     * @var string
     */
    private $description;

    /**
     * @var string
     */
    private $currency;

    /**
     * @var string
     */
    private $interval;

    /**
     * @var int
     */
    private $intervalCount;

    /**
     * @var CreatePricingSchemeRequest
     */
    private $pricingScheme;

    /**
     * @var CreateSubscriptionItemRequest[]
     */
    private $items;

    /**
     * @var CreateShippingRequest
     */
    private $shipping;

    /**
     * @var CreateDiscountRequest[]
     */
    private $discounts;

    /**
     * @var array<string,string>
     */
    private $metadata;

    /**
     * @var CreateSetupRequest
     */
    private $setup;

    /**
     * @var string|null
     */
    private $planId;

    /**
     * @var string|null
     */
    private $customerId;

    /**
     * @var string|null
     */
    private $cardId;

    /**
     * @var int|null
     */
    private $billingDay;

    /**
     * @var int|null
     */
    private $installments;

    /**
     * @var \DateTime|null
     */
    private $startAt;

    /**
     * @var int|null
     */
    private $minimumPrice;

    /**
     * @var int|null
     */
    private $cycles;

    /**
     * @var string|null
     */
    private $cardToken;

    /**
     * @var string|null
     */
    private $gatewayAffiliationId;

    /**
     * @var int|null
     */
    private $quantity;

    /**
     * @var int|null
     */
    private $boletoDueDays;

    /**
     * @var CreateIncrementRequest[]
     */
    private $increments;

    /**
     * @var CreatePeriodRequest|null
     */
    private $period;

    /**
     * @var CreateSubMerchantRequest|null
     */
    private $submerchant;

    /**
     * @var CreateSubscriptionSplitRequest|null
     */
    private $split;

    /**
     * @param CreateCustomerRequest $customer
     * @param CreateCardRequest $card
     * @param string $code
     * @param string $paymentMethod
     * @param string $billingType
     * @param string $statementDescriptor
     * @param string $description
     * @param string $currency
     * @param string $interval
     * @param int $intervalCount
     * @param CreatePricingSchemeRequest $pricingScheme
     * @param CreateSubscriptionItemRequest[] $items
     * @param CreateShippingRequest $shipping
     * @param CreateDiscountRequest[] $discounts
     * @param array<string,string> $metadata
     * @param CreateSetupRequest $setup
     * @param CreateIncrementRequest[] $increments
     */
    public function __construct(
        CreateCustomerRequest $customer,
        CreateCardRequest $card,
        string $code,
        string $paymentMethod,
        string $billingType,
        string $statementDescriptor,
        string $description,
        string $currency,
        string $interval,
        int $intervalCount,
        CreatePricingSchemeRequest $pricingScheme,
        array $items,
        CreateShippingRequest $shipping,
        array $discounts,
        array $metadata,
        CreateSetupRequest $setup,
        array $increments
    ) {
        $this->customer = $customer;
        $this->card = $card;
        $this->code = $code;
        $this->paymentMethod = $paymentMethod;
        $this->billingType = $billingType;
        $this->statementDescriptor = $statementDescriptor;
        $this->description = $description;
        $this->currency = $currency;
        $this->interval = $interval;
        $this->intervalCount = $intervalCount;
        $this->pricingScheme = $pricingScheme;
        $this->items = $items;
        $this->shipping = $shipping;
        $this->discounts = $discounts;
        $this->metadata = $metadata;
        $this->setup = $setup;
        $this->increments = $increments;
    }

    /**
     * Returns Customer.
     * Customer
     */
    public function getCustomer(): CreateCustomerRequest
    {
        return $this->customer;
    }

    /**
     * Sets Customer.
     * Customer
     *
     * @required
     * @maps customer
     */
    public function setCustomer(CreateCustomerRequest $customer): void
    {
        $this->customer = $customer;
    }

    /**
     * Returns Card.
     * Card
     */
    public function getCard(): CreateCardRequest
    {
        return $this->card;
    }

    /**
     * Sets Card.
     * Card
     *
     * @required
     * @maps card
     */
    public function setCard(CreateCardRequest $card): void
    {
        $this->card = $card;
    }

    /**
     * Returns Code.
     * Subscription code
     */
    public function getCode(): string
    {
        return $this->code;
    }

    /**
     * Sets Code.
     * Subscription code
     *
     * @required
     * @maps code
     */
    public function setCode(string $code): void
    {
        $this->code = $code;
    }

    /**
     * Returns Payment Method.
     * Payment method
     */
    public function getPaymentMethod(): string
    {
        return $this->paymentMethod;
    }

    /**
     * Sets Payment Method.
     * Payment method
     *
     * @required
     * @maps payment_method
     */
    public function setPaymentMethod(string $paymentMethod): void
    {
        $this->paymentMethod = $paymentMethod;
    }

    /**
     * Returns Billing Type.
     * Billing type
     */
    public function getBillingType(): string
    {
        return $this->billingType;
    }

    /**
     * Sets Billing Type.
     * Billing type
     *
     * @required
     * @maps billing_type
     */
    public function setBillingType(string $billingType): void
    {
        $this->billingType = $billingType;
    }

    /**
     * Returns Statement Descriptor.
     * Statement descriptor for credit card subscriptions
     */
    public function getStatementDescriptor(): string
    {
        return $this->statementDescriptor;
    }

    /**
     * Sets Statement Descriptor.
     * Statement descriptor for credit card subscriptions
     *
     * @required
     * @maps statement_descriptor
     */
    public function setStatementDescriptor(string $statementDescriptor): void
    {
        $this->statementDescriptor = $statementDescriptor;
    }

    /**
     * Returns Description.
     * Subscription description
     */
    public function getDescription(): string
    {
        return $this->description;
    }

    /**
     * Sets Description.
     * Subscription description
     *
     * @required
     * @maps description
     */
    public function setDescription(string $description): void
    {
        $this->description = $description;
    }

    /**
     * Returns Currency.
     * Currency
     */
    public function getCurrency(): string
    {
        return $this->currency;
    }

    /**
     * Sets Currency.
     * Currency
     *
     * @required
     * @maps currency
     */
    public function setCurrency(string $currency): void
    {
        $this->currency = $currency;
    }

    /**
     * Returns Interval.
     * Interval
     */
    public function getInterval(): string
    {
        return $this->interval;
    }

    /**
     * Sets Interval.
     * Interval
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
     * Interval count
     */
    public function getIntervalCount(): int
    {
        return $this->intervalCount;
    }

    /**
     * Sets Interval Count.
     * Interval count
     *
     * @required
     * @maps interval_count
     */
    public function setIntervalCount(int $intervalCount): void
    {
        $this->intervalCount = $intervalCount;
    }

    /**
     * Returns Pricing Scheme.
     * Subscription pricing scheme
     */
    public function getPricingScheme(): CreatePricingSchemeRequest
    {
        return $this->pricingScheme;
    }

    /**
     * Sets Pricing Scheme.
     * Subscription pricing scheme
     *
     * @required
     * @maps pricing_scheme
     */
    public function setPricingScheme(CreatePricingSchemeRequest $pricingScheme): void
    {
        $this->pricingScheme = $pricingScheme;
    }

    /**
     * Returns Items.
     * Subscription items
     *
     * @return CreateSubscriptionItemRequest[]
     */
    public function getItems(): array
    {
        return $this->items;
    }

    /**
     * Sets Items.
     * Subscription items
     *
     * @required
     * @maps items
     *
     * @param CreateSubscriptionItemRequest[] $items
     */
    public function setItems(array $items): void
    {
        $this->items = $items;
    }

    /**
     * Returns Shipping.
     * Shipping
     */
    public function getShipping(): CreateShippingRequest
    {
        return $this->shipping;
    }

    /**
     * Sets Shipping.
     * Shipping
     *
     * @required
     * @maps shipping
     */
    public function setShipping(CreateShippingRequest $shipping): void
    {
        $this->shipping = $shipping;
    }

    /**
     * Returns Discounts.
     * Discounts
     *
     * @return CreateDiscountRequest[]
     */
    public function getDiscounts(): array
    {
        return $this->discounts;
    }

    /**
     * Sets Discounts.
     * Discounts
     *
     * @required
     * @maps discounts
     *
     * @param CreateDiscountRequest[] $discounts
     */
    public function setDiscounts(array $discounts): void
    {
        $this->discounts = $discounts;
    }

    /**
     * Returns Metadata.
     * Metadata
     *
     * @return array<string,string>
     */
    public function getMetadata(): array
    {
        return $this->metadata;
    }

    /**
     * Sets Metadata.
     * Metadata
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
     * Returns Setup.
     * Setup data
     */
    public function getSetup(): CreateSetupRequest
    {
        return $this->setup;
    }

    /**
     * Sets Setup.
     * Setup data
     *
     * @required
     * @maps setup
     */
    public function setSetup(CreateSetupRequest $setup): void
    {
        $this->setup = $setup;
    }

    /**
     * Returns Plan Id.
     * Plan id
     */
    public function getPlanId(): ?string
    {
        return $this->planId;
    }

    /**
     * Sets Plan Id.
     * Plan id
     *
     * @maps plan_id
     */
    public function setPlanId(?string $planId): void
    {
        $this->planId = $planId;
    }

    /**
     * Returns Customer Id.
     * Customer id
     */
    public function getCustomerId(): ?string
    {
        return $this->customerId;
    }

    /**
     * Sets Customer Id.
     * Customer id
     *
     * @maps customer_id
     */
    public function setCustomerId(?string $customerId): void
    {
        $this->customerId = $customerId;
    }

    /**
     * Returns Card Id.
     * Card id
     */
    public function getCardId(): ?string
    {
        return $this->cardId;
    }

    /**
     * Sets Card Id.
     * Card id
     *
     * @maps card_id
     */
    public function setCardId(?string $cardId): void
    {
        $this->cardId = $cardId;
    }

    /**
     * Returns Billing Day.
     * Billing day
     */
    public function getBillingDay(): ?int
    {
        return $this->billingDay;
    }

    /**
     * Sets Billing Day.
     * Billing day
     *
     * @maps billing_day
     */
    public function setBillingDay(?int $billingDay): void
    {
        $this->billingDay = $billingDay;
    }

    /**
     * Returns Installments.
     * Number of installments
     */
    public function getInstallments(): ?int
    {
        return $this->installments;
    }

    /**
     * Sets Installments.
     * Number of installments
     *
     * @maps installments
     */
    public function setInstallments(?int $installments): void
    {
        $this->installments = $installments;
    }

    /**
     * Returns Start At.
     * Subscription start date
     */
    public function getStartAt(): ?\DateTime
    {
        return $this->startAt;
    }

    /**
     * Sets Start At.
     * Subscription start date
     *
     * @maps start_at
     * @factory \PagarmeApiSDKLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setStartAt(?\DateTime $startAt): void
    {
        $this->startAt = $startAt;
    }

    /**
     * Returns Minimum Price.
     * Subscription minimum price
     */
    public function getMinimumPrice(): ?int
    {
        return $this->minimumPrice;
    }

    /**
     * Sets Minimum Price.
     * Subscription minimum price
     *
     * @maps minimum_price
     */
    public function setMinimumPrice(?int $minimumPrice): void
    {
        $this->minimumPrice = $minimumPrice;
    }

    /**
     * Returns Cycles.
     * Number of cycles
     */
    public function getCycles(): ?int
    {
        return $this->cycles;
    }

    /**
     * Sets Cycles.
     * Number of cycles
     *
     * @maps cycles
     */
    public function setCycles(?int $cycles): void
    {
        $this->cycles = $cycles;
    }

    /**
     * Returns Card Token.
     * Card token
     */
    public function getCardToken(): ?string
    {
        return $this->cardToken;
    }

    /**
     * Sets Card Token.
     * Card token
     *
     * @maps card_token
     */
    public function setCardToken(?string $cardToken): void
    {
        $this->cardToken = $cardToken;
    }

    /**
     * Returns Gateway Affiliation Id.
     * Gateway Affiliation code
     */
    public function getGatewayAffiliationId(): ?string
    {
        return $this->gatewayAffiliationId;
    }

    /**
     * Sets Gateway Affiliation Id.
     * Gateway Affiliation code
     *
     * @maps gateway_affiliation_id
     */
    public function setGatewayAffiliationId(?string $gatewayAffiliationId): void
    {
        $this->gatewayAffiliationId = $gatewayAffiliationId;
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
     * Returns Boleto Due Days.
     * Days until boleto expires
     */
    public function getBoletoDueDays(): ?int
    {
        return $this->boletoDueDays;
    }

    /**
     * Sets Boleto Due Days.
     * Days until boleto expires
     *
     * @maps boleto_due_days
     */
    public function setBoletoDueDays(?int $boletoDueDays): void
    {
        $this->boletoDueDays = $boletoDueDays;
    }

    /**
     * Returns Increments.
     * Increments
     *
     * @return CreateIncrementRequest[]
     */
    public function getIncrements(): array
    {
        return $this->increments;
    }

    /**
     * Sets Increments.
     * Increments
     *
     * @required
     * @maps increments
     *
     * @param CreateIncrementRequest[] $increments
     */
    public function setIncrements(array $increments): void
    {
        $this->increments = $increments;
    }

    /**
     * Returns Period.
     */
    public function getPeriod(): ?CreatePeriodRequest
    {
        return $this->period;
    }

    /**
     * Sets Period.
     *
     * @maps period
     */
    public function setPeriod(?CreatePeriodRequest $period): void
    {
        $this->period = $period;
    }

    /**
     * Returns Submerchant.
     * SubMerchant
     */
    public function getSubmerchant(): ?CreateSubMerchantRequest
    {
        return $this->submerchant;
    }

    /**
     * Sets Submerchant.
     * SubMerchant
     *
     * @maps submerchant
     */
    public function setSubmerchant(?CreateSubMerchantRequest $submerchant): void
    {
        $this->submerchant = $submerchant;
    }

    /**
     * Returns Split.
     * Subscription's split
     */
    public function getSplit(): ?CreateSubscriptionSplitRequest
    {
        return $this->split;
    }

    /**
     * Sets Split.
     * Subscription's split
     *
     * @maps split
     */
    public function setSplit(?CreateSubscriptionSplitRequest $split): void
    {
        $this->split = $split;
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
        $json['customer']                   = $this->customer;
        $json['card']                       = $this->card;
        $json['code']                       = $this->code;
        $json['payment_method']             = $this->paymentMethod;
        $json['billing_type']               = $this->billingType;
        $json['statement_descriptor']       = $this->statementDescriptor;
        $json['description']                = $this->description;
        $json['currency']                   = $this->currency;
        $json['interval']                   = $this->interval;
        $json['interval_count']             = $this->intervalCount;
        $json['pricing_scheme']             = $this->pricingScheme;
        $json['items']                      = $this->items;
        $json['shipping']                   = $this->shipping;
        $json['discounts']                  = $this->discounts;
        $json['metadata']                   = $this->metadata;
        $json['setup']                      = $this->setup;
        if (isset($this->planId)) {
            $json['plan_id']                = $this->planId;
        }
        if (isset($this->customerId)) {
            $json['customer_id']            = $this->customerId;
        }
        if (isset($this->cardId)) {
            $json['card_id']                = $this->cardId;
        }
        if (isset($this->billingDay)) {
            $json['billing_day']            = $this->billingDay;
        }
        if (isset($this->installments)) {
            $json['installments']           = $this->installments;
        }
        if (isset($this->startAt)) {
            $json['start_at']               = DateTimeHelper::toRfc3339DateTime($this->startAt);
        }
        if (isset($this->minimumPrice)) {
            $json['minimum_price']          = $this->minimumPrice;
        }
        if (isset($this->cycles)) {
            $json['cycles']                 = $this->cycles;
        }
        if (isset($this->cardToken)) {
            $json['card_token']             = $this->cardToken;
        }
        if (isset($this->gatewayAffiliationId)) {
            $json['gateway_affiliation_id'] = $this->gatewayAffiliationId;
        }
        if (isset($this->quantity)) {
            $json['quantity']               = $this->quantity;
        }
        if (isset($this->boletoDueDays)) {
            $json['boleto_due_days']        = $this->boletoDueDays;
        }
        $json['increments']                 = $this->increments;
        if (isset($this->period)) {
            $json['period']                 = $this->period;
        }
        if (isset($this->submerchant)) {
            $json['submerchant']            = $this->submerchant;
        }
        if (isset($this->split)) {
            $json['split']                  = $this->split;
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}