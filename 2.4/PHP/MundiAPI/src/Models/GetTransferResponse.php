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
 * Transfer response
 */
class GetTransferResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $id;

    /**
     * @var int
     */
    private $amount;

    /**
     * @var string
     */
    private $status;

    /**
     * @var \DateTime
     */
    private $createdAt;

    /**
     * @var \DateTime
     */
    private $updatedAt;

    /**
     * @var GetBankAccountResponse
     */
    private $bankAccount;

    /**
     * @var array<string,string>
     */
    private $metadata;

    /**
     * @param string $id
     * @param int $amount
     * @param string $status
     * @param \DateTime $createdAt
     * @param \DateTime $updatedAt
     * @param GetBankAccountResponse $bankAccount
     * @param array<string,string> $metadata
     */
    public function __construct(
        string $id,
        int $amount,
        string $status,
        \DateTime $createdAt,
        \DateTime $updatedAt,
        GetBankAccountResponse $bankAccount,
        array $metadata
    ) {
        $this->id = $id;
        $this->amount = $amount;
        $this->status = $status;
        $this->createdAt = $createdAt;
        $this->updatedAt = $updatedAt;
        $this->bankAccount = $bankAccount;
        $this->metadata = $metadata;
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
     * Returns Amount.
     * Transfer amount
     */
    public function getAmount(): int
    {
        return $this->amount;
    }

    /**
     * Sets Amount.
     * Transfer amount
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
     * Transfer status
     */
    public function getStatus(): string
    {
        return $this->status;
    }

    /**
     * Sets Status.
     * Transfer status
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
     * Transfer creation date
     */
    public function getCreatedAt(): \DateTime
    {
        return $this->createdAt;
    }

    /**
     * Sets Created At.
     * Transfer creation date
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
     * Returns Updated At.
     * Transfer last update date
     */
    public function getUpdatedAt(): \DateTime
    {
        return $this->updatedAt;
    }

    /**
     * Sets Updated At.
     * Transfer last update date
     *
     * @required
     * @maps updated_at
     * @factory \MundiAPILib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setUpdatedAt(\DateTime $updatedAt): void
    {
        $this->updatedAt = $updatedAt;
    }

    /**
     * Returns Bank Account.
     * Bank account
     */
    public function getBankAccount(): GetBankAccountResponse
    {
        return $this->bankAccount;
    }

    /**
     * Sets Bank Account.
     * Bank account
     *
     * @required
     * @maps bank_account
     */
    public function setBankAccount(GetBankAccountResponse $bankAccount): void
    {
        $this->bankAccount = $bankAccount;
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
        $json['id']           = $this->id;
        $json['amount']       = $this->amount;
        $json['status']       = $this->status;
        $json['created_at']   = DateTimeHelper::toRfc3339DateTime($this->createdAt);
        $json['updated_at']   = DateTimeHelper::toRfc3339DateTime($this->updatedAt);
        $json['bank_account'] = $this->bankAccount;
        $json['metadata']     = $this->metadata;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}