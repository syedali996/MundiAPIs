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
 * Request to update the end date of the current subscription cycle
 */
class UpdateCurrentCycleEndDateRequest implements \JsonSerializable
{
    /**
     * @var \DateTime|null
     */
    private $endAt;

    /**
     * Returns End At.
     * Current cycle end date
     */
    public function getEndAt(): ?\DateTime
    {
        return $this->endAt;
    }

    /**
     * Sets End At.
     * Current cycle end date
     *
     * @maps end_at
     * @factory \MundiAPILib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setEndAt(?\DateTime $endAt): void
    {
        $this->endAt = $endAt;
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
        if (isset($this->endAt)) {
            $json['end_at'] = DateTimeHelper::toRfc3339DateTime($this->endAt);
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
