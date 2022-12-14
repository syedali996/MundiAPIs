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
 * Response object for getting a bank transfer transaction
 *
 * @discriminator transaction_type
 * @discriminatorType bank_transfer
 */
class GetBankTransferTransactionResponse extends GetTransactionResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $url;

    /**
     * @var string
     */
    private $bankTid;

    /**
     * @var string
     */
    private $bank;

    /**
     * @var \DateTime|null
     */
    private $paidAt;

    /**
     * @var int|null
     */
    private $paidAmount;

    /**
     * @param string $gatewayId
     * @param int $amount
     * @param string $status
     * @param bool $success
     * @param \DateTime $createdAt
     * @param \DateTime $updatedAt
     * @param int $attemptCount
     * @param int $maxAttempts
     * @param GetSplitResponse[] $splits
     * @param string $id
     * @param GetGatewayResponseResponse $gatewayResponse
     * @param GetAntifraudResponse $antifraudResponse
     * @param GetSplitResponse[] $split
     * @param string $url
     * @param string $bankTid
     * @param string $bank
     */
    public function __construct(
        string $gatewayId,
        int $amount,
        string $status,
        bool $success,
        \DateTime $createdAt,
        \DateTime $updatedAt,
        int $attemptCount,
        int $maxAttempts,
        array $splits,
        string $id,
        GetGatewayResponseResponse $gatewayResponse,
        GetAntifraudResponse $antifraudResponse,
        array $split,
        string $url,
        string $bankTid,
        string $bank
    ) {
        parent::__construct(
            $gatewayId,
            $amount,
            $status,
            $success,
            $createdAt,
            $updatedAt,
            $attemptCount,
            $maxAttempts,
            $splits,
            $id,
            $gatewayResponse,
            $antifraudResponse,
            $split
        );
        $this->url = $url;
        $this->bankTid = $bankTid;
        $this->bank = $bank;
    }

    /**
     * Returns Url.
     * Payment url
     */
    public function getUrl(): string
    {
        return $this->url;
    }

    /**
     * Sets Url.
     * Payment url
     *
     * @required
     * @maps url
     */
    public function setUrl(string $url): void
    {
        $this->url = $url;
    }

    /**
     * Returns Bank Tid.
     * Transaction identifier for the bank
     */
    public function getBankTid(): string
    {
        return $this->bankTid;
    }

    /**
     * Sets Bank Tid.
     * Transaction identifier for the bank
     *
     * @required
     * @maps bank_tid
     */
    public function setBankTid(string $bankTid): void
    {
        $this->bankTid = $bankTid;
    }

    /**
     * Returns Bank.
     * Bank
     */
    public function getBank(): string
    {
        return $this->bank;
    }

    /**
     * Sets Bank.
     * Bank
     *
     * @required
     * @maps bank
     */
    public function setBank(string $bank): void
    {
        $this->bank = $bank;
    }

    /**
     * Returns Paid At.
     * Payment date
     */
    public function getPaidAt(): ?\DateTime
    {
        return $this->paidAt;
    }

    /**
     * Sets Paid At.
     * Payment date
     *
     * @maps paid_at
     * @factory \PagarmeApiSDKLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setPaidAt(?\DateTime $paidAt): void
    {
        $this->paidAt = $paidAt;
    }

    /**
     * Returns Paid Amount.
     * Paid amount
     */
    public function getPaidAmount(): ?int
    {
        return $this->paidAmount;
    }

    /**
     * Sets Paid Amount.
     * Paid amount
     *
     * @maps paid_amount
     */
    public function setPaidAmount(?int $paidAmount): void
    {
        $this->paidAmount = $paidAmount;
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
        $json['url']             = $this->url;
        $json['bank_tid']        = $this->bankTid;
        $json['bank']            = $this->bank;
        if (isset($this->paidAt)) {
            $json['paid_at']     = DateTimeHelper::toRfc3339DateTime($this->paidAt);
        }
        if (isset($this->paidAmount)) {
            $json['paid_amount'] = $this->paidAmount;
        }
        $json = array_merge($json, parent::jsonSerialize(true));
        $json['transaction_type'] = $this->getTransactionType() ?? 'bank_transfer';

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
