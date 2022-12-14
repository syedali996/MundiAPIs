<?php

declare(strict_types=1);

/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace MundiAPILib\Models;

use stdClass;

/**
 * Balance
 */
class GetBalanceResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $currency;

    /**
     * @var int
     */
    private $availableAmount;

    /**
     * @var GetRecipientResponse|null
     */
    private $recipient;

    /**
     * @var int
     */
    private $waitingFundsAmount;

    /**
     * @var int
     */
    private $transferredAmount;

    /**
     * @param string $currency
     * @param int $availableAmount
     * @param int $waitingFundsAmount
     * @param int $transferredAmount
     */
    public function __construct(
        string $currency,
        int $availableAmount,
        int $waitingFundsAmount,
        int $transferredAmount
    ) {
        $this->currency = $currency;
        $this->availableAmount = $availableAmount;
        $this->waitingFundsAmount = $waitingFundsAmount;
        $this->transferredAmount = $transferredAmount;
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
     * Returns Available Amount.
     * Amount available for transferring
     */
    public function getAvailableAmount(): int
    {
        return $this->availableAmount;
    }

    /**
     * Sets Available Amount.
     * Amount available for transferring
     *
     * @required
     * @maps available_amount
     */
    public function setAvailableAmount(int $availableAmount): void
    {
        $this->availableAmount = $availableAmount;
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
     * Returns Waiting Funds Amount.
     */
    public function getWaitingFundsAmount(): int
    {
        return $this->waitingFundsAmount;
    }

    /**
     * Sets Waiting Funds Amount.
     *
     * @required
     * @maps waiting_funds_amount
     */
    public function setWaitingFundsAmount(int $waitingFundsAmount): void
    {
        $this->waitingFundsAmount = $waitingFundsAmount;
    }

    /**
     * Returns Transferred Amount.
     */
    public function getTransferredAmount(): int
    {
        return $this->transferredAmount;
    }

    /**
     * Sets Transferred Amount.
     *
     * @required
     * @maps transferred_amount
     */
    public function setTransferredAmount(int $transferredAmount): void
    {
        $this->transferredAmount = $transferredAmount;
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
        $json['currency']             = $this->currency;
        $json['available_amount']     = $this->availableAmount;
        if (isset($this->recipient)) {
            $json['recipient']        = $this->recipient;
        }
        $json['waiting_funds_amount'] = $this->waitingFundsAmount;
        $json['transferred_amount']   = $this->transferredAmount;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
