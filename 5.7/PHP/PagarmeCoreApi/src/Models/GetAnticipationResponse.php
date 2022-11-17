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
 * Anticipation
 */
class GetAnticipationResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $id;

    /**
     * @var int
     */
    private $requestedAmount;

    /**
     * @var int
     */
    private $approvedAmount;

    /**
     * @var GetRecipientResponse|null
     */
    private $recipient;

    /**
     * @var string
     */
    private $pgid;

    /**
     * @var \DateTime
     */
    private $createdAt;

    /**
     * @var \DateTime
     */
    private $updatedAt;

    /**
     * @var \DateTime
     */
    private $paymentDate;

    /**
     * @var string
     */
    private $status;

    /**
     * @var string
     */
    private $timeframe;

    /**
     * @param string $id
     * @param int $requestedAmount
     * @param int $approvedAmount
     * @param string $pgid
     * @param \DateTime $createdAt
     * @param \DateTime $updatedAt
     * @param \DateTime $paymentDate
     * @param string $status
     * @param string $timeframe
     */
    public function __construct(
        string $id,
        int $requestedAmount,
        int $approvedAmount,
        string $pgid,
        \DateTime $createdAt,
        \DateTime $updatedAt,
        \DateTime $paymentDate,
        string $status,
        string $timeframe
    ) {
        $this->id = $id;
        $this->requestedAmount = $requestedAmount;
        $this->approvedAmount = $approvedAmount;
        $this->pgid = $pgid;
        $this->createdAt = $createdAt;
        $this->updatedAt = $updatedAt;
        $this->paymentDate = $paymentDate;
        $this->status = $status;
        $this->timeframe = $timeframe;
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
     * Returns Requested Amount.
     * Requested amount
     */
    public function getRequestedAmount(): int
    {
        return $this->requestedAmount;
    }

    /**
     * Sets Requested Amount.
     * Requested amount
     *
     * @required
     * @maps requested_amount
     */
    public function setRequestedAmount(int $requestedAmount): void
    {
        $this->requestedAmount = $requestedAmount;
    }

    /**
     * Returns Approved Amount.
     * Approved amount
     */
    public function getApprovedAmount(): int
    {
        return $this->approvedAmount;
    }

    /**
     * Sets Approved Amount.
     * Approved amount
     *
     * @required
     * @maps approved_amount
     */
    public function setApprovedAmount(int $approvedAmount): void
    {
        $this->approvedAmount = $approvedAmount;
    }

    /**
     * Returns Recipient.
     * Recipient
     */
    public function getRecipient(): ?GetRecipientResponse
    {
        return $this->recipient;
    }

    /**
     * Sets Recipient.
     * Recipient
     *
     * @maps recipient
     */
    public function setRecipient(?GetRecipientResponse $recipient): void
    {
        $this->recipient = $recipient;
    }

    /**
     * Returns Pgid.
     * Anticipation id on the gateway
     */
    public function getPgid(): string
    {
        return $this->pgid;
    }

    /**
     * Sets Pgid.
     * Anticipation id on the gateway
     *
     * @required
     * @maps pgid
     */
    public function setPgid(string $pgid): void
    {
        $this->pgid = $pgid;
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
     * Returns Updated At.
     * Last update date
     */
    public function getUpdatedAt(): \DateTime
    {
        return $this->updatedAt;
    }

    /**
     * Sets Updated At.
     * Last update date
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
     * Returns Payment Date.
     * Payment date
     */
    public function getPaymentDate(): \DateTime
    {
        return $this->paymentDate;
    }

    /**
     * Sets Payment Date.
     * Payment date
     *
     * @required
     * @maps payment_date
     * @factory \PagarmeCoreApiLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setPaymentDate(\DateTime $paymentDate): void
    {
        $this->paymentDate = $paymentDate;
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
     * Returns Timeframe.
     * Timeframe
     */
    public function getTimeframe(): string
    {
        return $this->timeframe;
    }

    /**
     * Sets Timeframe.
     * Timeframe
     *
     * @required
     * @maps timeframe
     */
    public function setTimeframe(string $timeframe): void
    {
        $this->timeframe = $timeframe;
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
        $json['id']               = $this->id;
        $json['requested_amount'] = $this->requestedAmount;
        $json['approved_amount']  = $this->approvedAmount;
        if (isset($this->recipient)) {
            $json['recipient']    = $this->recipient;
        }
        $json['pgid']             = $this->pgid;
        $json['created_at']       = DateTimeHelper::toRfc3339DateTime($this->createdAt);
        $json['updated_at']       = DateTimeHelper::toRfc3339DateTime($this->updatedAt);
        $json['payment_date']     = DateTimeHelper::toRfc3339DateTime($this->paymentDate);
        $json['status']           = $this->status;
        $json['timeframe']        = $this->timeframe;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
