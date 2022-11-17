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

class GetCheckoutBoletoPaymentResponse implements \JsonSerializable
{
    /**
     * @var \DateTime
     */
    private $dueAt;

    /**
     * @var string
     */
    private $instructions;

    /**
     * @param \DateTime $dueAt
     * @param string $instructions
     */
    public function __construct(\DateTime $dueAt, string $instructions)
    {
        $this->dueAt = $dueAt;
        $this->instructions = $instructions;
    }

    /**
     * Returns Due At.
     * Data de vencimento do boleto
     */
    public function getDueAt(): \DateTime
    {
        return $this->dueAt;
    }

    /**
     * Sets Due At.
     * Data de vencimento do boleto
     *
     * @required
     * @maps due_at
     * @factory \PagarmeCoreApiLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setDueAt(\DateTime $dueAt): void
    {
        $this->dueAt = $dueAt;
    }

    /**
     * Returns Instructions.
     * Instruções do boleto
     */
    public function getInstructions(): string
    {
        return $this->instructions;
    }

    /**
     * Sets Instructions.
     * Instruções do boleto
     *
     * @required
     * @maps instructions
     */
    public function setInstructions(string $instructions): void
    {
        $this->instructions = $instructions;
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
        $json['due_at']       = DateTimeHelper::toRfc3339DateTime($this->dueAt);
        $json['instructions'] = $this->instructions;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
