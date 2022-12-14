<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib\Models;

use stdClass;

/**
 * Request for creating a recipient
 */
class CreateRecipientRequest implements \JsonSerializable
{
    /**
     * @var string
     */
    private $name;

    /**
     * @var string
     */
    private $email;

    /**
     * @var string
     */
    private $description;

    /**
     * @var string
     */
    private $document;

    /**
     * @var string
     */
    private $type;

    /**
     * @var CreateBankAccountRequest
     */
    private $defaultBankAccount;

    /**
     * @var array<string,string>
     */
    private $metadata;

    /**
     * @var CreateTransferSettingsRequest|null
     */
    private $transferSettings;

    /**
     * @var string
     */
    private $code;

    /**
     * @var string
     */
    private $paymentMode;

    /**
     * @param string $name
     * @param string $email
     * @param string $description
     * @param string $document
     * @param string $type
     * @param CreateBankAccountRequest $defaultBankAccount
     * @param array<string,string> $metadata
     * @param string $code
     * @param string $paymentMode
     */
    public function __construct(
        string $name,
        string $email,
        string $description,
        string $document,
        string $type,
        CreateBankAccountRequest $defaultBankAccount,
        array $metadata,
        string $code,
        string $paymentMode
    ) {
        $this->name = $name;
        $this->email = $email;
        $this->description = $description;
        $this->document = $document;
        $this->type = $type;
        $this->defaultBankAccount = $defaultBankAccount;
        $this->metadata = $metadata;
        $this->code = $code;
        $this->paymentMode = $paymentMode;
    }

    /**
     * Returns Name.
     * Recipient name
     */
    public function getName(): string
    {
        return $this->name;
    }

    /**
     * Sets Name.
     * Recipient name
     *
     * @required
     * @maps name
     */
    public function setName(string $name): void
    {
        $this->name = $name;
    }

    /**
     * Returns Email.
     * Recipient email
     */
    public function getEmail(): string
    {
        return $this->email;
    }

    /**
     * Sets Email.
     * Recipient email
     *
     * @required
     * @maps email
     */
    public function setEmail(string $email): void
    {
        $this->email = $email;
    }

    /**
     * Returns Description.
     * Recipient description
     */
    public function getDescription(): string
    {
        return $this->description;
    }

    /**
     * Sets Description.
     * Recipient description
     *
     * @required
     * @maps description
     */
    public function setDescription(string $description): void
    {
        $this->description = $description;
    }

    /**
     * Returns Document.
     * Recipient document number
     */
    public function getDocument(): string
    {
        return $this->document;
    }

    /**
     * Sets Document.
     * Recipient document number
     *
     * @required
     * @maps document
     */
    public function setDocument(string $document): void
    {
        $this->document = $document;
    }

    /**
     * Returns Type.
     * Recipient type
     */
    public function getType(): string
    {
        return $this->type;
    }

    /**
     * Sets Type.
     * Recipient type
     *
     * @required
     * @maps type
     */
    public function setType(string $type): void
    {
        $this->type = $type;
    }

    /**
     * Returns Default Bank Account.
     * Bank account
     */
    public function getDefaultBankAccount(): CreateBankAccountRequest
    {
        return $this->defaultBankAccount;
    }

    /**
     * Sets Default Bank Account.
     * Bank account
     *
     * @required
     * @maps default_bank_account
     */
    public function setDefaultBankAccount(CreateBankAccountRequest $defaultBankAccount): void
    {
        $this->defaultBankAccount = $defaultBankAccount;
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
     * Returns Transfer Settings.
     * Receiver Transfer Information
     */
    public function getTransferSettings(): ?CreateTransferSettingsRequest
    {
        return $this->transferSettings;
    }

    /**
     * Sets Transfer Settings.
     * Receiver Transfer Information
     *
     * @maps transfer_settings
     */
    public function setTransferSettings(?CreateTransferSettingsRequest $transferSettings): void
    {
        $this->transferSettings = $transferSettings;
    }

    /**
     * Returns Code.
     * Recipient code
     */
    public function getCode(): string
    {
        return $this->code;
    }

    /**
     * Sets Code.
     * Recipient code
     *
     * @required
     * @maps code
     */
    public function setCode(string $code): void
    {
        $this->code = $code;
    }

    /**
     * Returns Payment Mode.
     * Payment mode
     */
    public function getPaymentMode(): string
    {
        return $this->paymentMode;
    }

    /**
     * Sets Payment Mode.
     * Payment mode
     *
     * @required
     * @maps payment_mode
     */
    public function setPaymentMode(string $paymentMode): void
    {
        $this->paymentMode = $paymentMode;
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
        $json['name']                  = $this->name;
        $json['email']                 = $this->email;
        $json['description']           = $this->description;
        $json['document']              = $this->document;
        $json['type']                  = $this->type;
        $json['default_bank_account']  = $this->defaultBankAccount;
        $json['metadata']              = $this->metadata;
        if (isset($this->transferSettings)) {
            $json['transfer_settings'] = $this->transferSettings;
        }
        $json['code']                  = $this->code;
        $json['payment_mode']          = $this->paymentMode;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
