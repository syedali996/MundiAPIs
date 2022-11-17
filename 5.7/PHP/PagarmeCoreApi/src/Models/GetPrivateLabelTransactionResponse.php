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
 * Response object for getting a private label transaction
 *
 * @discriminator transaction_type
 * @discriminatorType private_label
 */
class GetPrivateLabelTransactionResponse extends GetTransactionResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $statementDescriptor;

    /**
     * @var string
     */
    private $acquirerName;

    /**
     * @var string
     */
    private $acquirerAffiliationCode;

    /**
     * @var string
     */
    private $acquirerTid;

    /**
     * @var string
     */
    private $acquirerNsu;

    /**
     * @var string
     */
    private $acquirerAuthCode;

    /**
     * @var string
     */
    private $operationType;

    /**
     * @var GetCardResponse
     */
    private $card;

    /**
     * @var string
     */
    private $acquirerMessage;

    /**
     * @var string
     */
    private $acquirerReturnCode;

    /**
     * @var int|null
     */
    private $installments;

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
     * @param string $statementDescriptor
     * @param string $acquirerName
     * @param string $acquirerAffiliationCode
     * @param string $acquirerTid
     * @param string $acquirerNsu
     * @param string $acquirerAuthCode
     * @param string $operationType
     * @param GetCardResponse $card
     * @param string $acquirerMessage
     * @param string $acquirerReturnCode
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
        string $statementDescriptor,
        string $acquirerName,
        string $acquirerAffiliationCode,
        string $acquirerTid,
        string $acquirerNsu,
        string $acquirerAuthCode,
        string $operationType,
        GetCardResponse $card,
        string $acquirerMessage,
        string $acquirerReturnCode
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
        $this->statementDescriptor = $statementDescriptor;
        $this->acquirerName = $acquirerName;
        $this->acquirerAffiliationCode = $acquirerAffiliationCode;
        $this->acquirerTid = $acquirerTid;
        $this->acquirerNsu = $acquirerNsu;
        $this->acquirerAuthCode = $acquirerAuthCode;
        $this->operationType = $operationType;
        $this->card = $card;
        $this->acquirerMessage = $acquirerMessage;
        $this->acquirerReturnCode = $acquirerReturnCode;
    }

    /**
     * Returns Statement Descriptor.
     * Text that will appear on the credit card's statement
     */
    public function getStatementDescriptor(): string
    {
        return $this->statementDescriptor;
    }

    /**
     * Sets Statement Descriptor.
     * Text that will appear on the credit card's statement
     *
     * @required
     * @maps statement_descriptor
     */
    public function setStatementDescriptor(string $statementDescriptor): void
    {
        $this->statementDescriptor = $statementDescriptor;
    }

    /**
     * Returns Acquirer Name.
     * Acquirer name
     */
    public function getAcquirerName(): string
    {
        return $this->acquirerName;
    }

    /**
     * Sets Acquirer Name.
     * Acquirer name
     *
     * @required
     * @maps acquirer_name
     */
    public function setAcquirerName(string $acquirerName): void
    {
        $this->acquirerName = $acquirerName;
    }

    /**
     * Returns Acquirer Affiliation Code.
     * Aquirer affiliation code
     */
    public function getAcquirerAffiliationCode(): string
    {
        return $this->acquirerAffiliationCode;
    }

    /**
     * Sets Acquirer Affiliation Code.
     * Aquirer affiliation code
     *
     * @required
     * @maps acquirer_affiliation_code
     */
    public function setAcquirerAffiliationCode(string $acquirerAffiliationCode): void
    {
        $this->acquirerAffiliationCode = $acquirerAffiliationCode;
    }

    /**
     * Returns Acquirer Tid.
     * Acquirer TID
     */
    public function getAcquirerTid(): string
    {
        return $this->acquirerTid;
    }

    /**
     * Sets Acquirer Tid.
     * Acquirer TID
     *
     * @required
     * @maps acquirer_tid
     */
    public function setAcquirerTid(string $acquirerTid): void
    {
        $this->acquirerTid = $acquirerTid;
    }

    /**
     * Returns Acquirer Nsu.
     * Acquirer NSU
     */
    public function getAcquirerNsu(): string
    {
        return $this->acquirerNsu;
    }

    /**
     * Sets Acquirer Nsu.
     * Acquirer NSU
     *
     * @required
     * @maps acquirer_nsu
     */
    public function setAcquirerNsu(string $acquirerNsu): void
    {
        $this->acquirerNsu = $acquirerNsu;
    }

    /**
     * Returns Acquirer Auth Code.
     * Acquirer authorization code
     */
    public function getAcquirerAuthCode(): string
    {
        return $this->acquirerAuthCode;
    }

    /**
     * Sets Acquirer Auth Code.
     * Acquirer authorization code
     *
     * @required
     * @maps acquirer_auth_code
     */
    public function setAcquirerAuthCode(string $acquirerAuthCode): void
    {
        $this->acquirerAuthCode = $acquirerAuthCode;
    }

    /**
     * Returns Operation Type.
     * Operation type
     */
    public function getOperationType(): string
    {
        return $this->operationType;
    }

    /**
     * Sets Operation Type.
     * Operation type
     *
     * @required
     * @maps operation_type
     */
    public function setOperationType(string $operationType): void
    {
        $this->operationType = $operationType;
    }

    /**
     * Returns Card.
     * Card data
     */
    public function getCard(): GetCardResponse
    {
        return $this->card;
    }

    /**
     * Sets Card.
     * Card data
     *
     * @required
     * @maps card
     */
    public function setCard(GetCardResponse $card): void
    {
        $this->card = $card;
    }

    /**
     * Returns Acquirer Message.
     * Acquirer message
     */
    public function getAcquirerMessage(): string
    {
        return $this->acquirerMessage;
    }

    /**
     * Sets Acquirer Message.
     * Acquirer message
     *
     * @required
     * @maps acquirer_message
     */
    public function setAcquirerMessage(string $acquirerMessage): void
    {
        $this->acquirerMessage = $acquirerMessage;
    }

    /**
     * Returns Acquirer Return Code.
     * Acquirer Return Code
     */
    public function getAcquirerReturnCode(): string
    {
        return $this->acquirerReturnCode;
    }

    /**
     * Sets Acquirer Return Code.
     * Acquirer Return Code
     *
     * @required
     * @maps acquirer_return_code
     */
    public function setAcquirerReturnCode(string $acquirerReturnCode): void
    {
        $this->acquirerReturnCode = $acquirerReturnCode;
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
        $json['statement_descriptor']      = $this->statementDescriptor;
        $json['acquirer_name']             = $this->acquirerName;
        $json['acquirer_affiliation_code'] = $this->acquirerAffiliationCode;
        $json['acquirer_tid']              = $this->acquirerTid;
        $json['acquirer_nsu']              = $this->acquirerNsu;
        $json['acquirer_auth_code']        = $this->acquirerAuthCode;
        $json['operation_type']            = $this->operationType;
        $json['card']                      = $this->card;
        $json['acquirer_message']          = $this->acquirerMessage;
        $json['acquirer_return_code']      = $this->acquirerReturnCode;
        if (isset($this->installments)) {
            $json['installments']          = $this->installments;
        }
        $json = array_merge($json, parent::jsonSerialize(true));
        $json['transaction_type'] = $this->getTransactionType() ?? 'private_label';

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}