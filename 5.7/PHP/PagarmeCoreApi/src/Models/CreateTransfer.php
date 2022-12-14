<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib\Models;

use stdClass;

class CreateTransfer implements \JsonSerializable
{
    /**
     * @var int
     */
    private $amount;

    /**
     * @var string
     */
    private $sourceId;

    /**
     * @var string
     */
    private $targetId;

    /**
     * @var string[]|null
     */
    private $metadata;

    /**
     * @param int $amount
     * @param string $sourceId
     * @param string $targetId
     */
    public function __construct(int $amount, string $sourceId, string $targetId)
    {
        $this->amount = $amount;
        $this->sourceId = $sourceId;
        $this->targetId = $targetId;
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
     * Returns Source Id.
     */
    public function getSourceId(): string
    {
        return $this->sourceId;
    }

    /**
     * Sets Source Id.
     *
     * @required
     * @maps source_id
     */
    public function setSourceId(string $sourceId): void
    {
        $this->sourceId = $sourceId;
    }

    /**
     * Returns Target Id.
     */
    public function getTargetId(): string
    {
        return $this->targetId;
    }

    /**
     * Sets Target Id.
     *
     * @required
     * @maps target_id
     */
    public function setTargetId(string $targetId): void
    {
        $this->targetId = $targetId;
    }

    /**
     * Returns Metadata.
     *
     * @return string[]|null
     */
    public function getMetadata(): ?array
    {
        return $this->metadata;
    }

    /**
     * Sets Metadata.
     *
     * @maps metadata
     *
     * @param string[]|null $metadata
     */
    public function setMetadata(?array $metadata): void
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
        $json['amount']       = $this->amount;
        $json['source_id']    = $this->sourceId;
        $json['target_id']    = $this->targetId;
        if (isset($this->metadata)) {
            $json['metadata'] = $this->metadata;
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
