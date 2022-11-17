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
 * Split response
 */
class GetSplitResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $type;

    /**
     * @var int
     */
    private $amount;

    /**
     * @var GetRecipientResponse|null
     */
    private $recipient;

    /**
     * @var string
     */
    private $gatewayId;

    /**
     * @var GetSplitOptionsResponse|null
     */
    private $options;

    /**
     * @var string
     */
    private $id;

    /**
     * @param string $type
     * @param int $amount
     * @param string $gatewayId
     * @param string $id
     */
    public function __construct(string $type, int $amount, string $gatewayId, string $id)
    {
        $this->type = $type;
        $this->amount = $amount;
        $this->gatewayId = $gatewayId;
        $this->id = $id;
    }

    /**
     * Returns Type.
     * Type
     */
    public function getType(): string
    {
        return $this->type;
    }

    /**
     * Sets Type.
     * Type
     *
     * @required
     * @maps type
     */
    public function setType(string $type): void
    {
        $this->type = $type;
    }

    /**
     * Returns Amount.
     * Amount
     */
    public function getAmount(): int
    {
        return $this->amount;
    }

    /**
     * Sets Amount.
     * Amount
     *
     * @required
     * @maps amount
     */
    public function setAmount(int $amount): void
    {
        $this->amount = $amount;
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
     * Returns Gateway Id.
     * The split rule gateway id
     */
    public function getGatewayId(): string
    {
        return $this->gatewayId;
    }

    /**
     * Sets Gateway Id.
     * The split rule gateway id
     *
     * @required
     * @maps gateway_id
     */
    public function setGatewayId(string $gatewayId): void
    {
        $this->gatewayId = $gatewayId;
    }

    /**
     * Returns Options.
     */
    public function getOptions(): ?GetSplitOptionsResponse
    {
        return $this->options;
    }

    /**
     * Sets Options.
     *
     * @maps options
     */
    public function setOptions(?GetSplitOptionsResponse $options): void
    {
        $this->options = $options;
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
        $json['type']          = $this->type;
        $json['amount']        = $this->amount;
        if (isset($this->recipient)) {
            $json['recipient'] = $this->recipient;
        }
        $json['gateway_id']    = $this->gatewayId;
        if (isset($this->options)) {
            $json['options']   = $this->options;
        }
        $json['id']            = $this->id;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
