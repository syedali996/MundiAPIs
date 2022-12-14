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
 * Request for updating the due date from a subscription
 */
class UpdateSubscriptionBillingDateRequest implements \JsonSerializable
{
    /**
     * @var \DateTime
     */
    private $nextBillingAt;

    /**
     * @param \DateTime $nextBillingAt
     */
    public function __construct(\DateTime $nextBillingAt)
    {
        $this->nextBillingAt = $nextBillingAt;
    }

    /**
     * Returns Next Billing At.
     * The date when the next subscription billing must occur
     */
    public function getNextBillingAt(): \DateTime
    {
        return $this->nextBillingAt;
    }

    /**
     * Sets Next Billing At.
     * The date when the next subscription billing must occur
     *
     * @required
     * @maps next_billing_at
     * @factory \PagarmeCoreApiLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setNextBillingAt(\DateTime $nextBillingAt): void
    {
        $this->nextBillingAt = $nextBillingAt;
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
        $json['next_billing_at'] = DateTimeHelper::toRfc3339DateTime($this->nextBillingAt);

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
