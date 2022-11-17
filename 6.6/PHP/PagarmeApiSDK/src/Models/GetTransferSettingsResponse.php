<?php

declare(strict_types=1);

/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeApiSDKLib\Models;

use stdClass;

class GetTransferSettingsResponse implements \JsonSerializable
{
    /**
     * @var bool
     */
    private $transferEnabled;

    /**
     * @var string
     */
    private $transferInterval;

    /**
     * @var int
     */
    private $transferDay;

    /**
     * @param bool $transferEnabled
     * @param string $transferInterval
     * @param int $transferDay
     */
    public function __construct(bool $transferEnabled, string $transferInterval, int $transferDay)
    {
        $this->transferEnabled = $transferEnabled;
        $this->transferInterval = $transferInterval;
        $this->transferDay = $transferDay;
    }

    /**
     * Returns Transfer Enabled.
     */
    public function getTransferEnabled(): bool
    {
        return $this->transferEnabled;
    }

    /**
     * Sets Transfer Enabled.
     *
     * @required
     * @maps transfer_enabled
     */
    public function setTransferEnabled(bool $transferEnabled): void
    {
        $this->transferEnabled = $transferEnabled;
    }

    /**
     * Returns Transfer Interval.
     */
    public function getTransferInterval(): string
    {
        return $this->transferInterval;
    }

    /**
     * Sets Transfer Interval.
     *
     * @required
     * @maps transfer_interval
     */
    public function setTransferInterval(string $transferInterval): void
    {
        $this->transferInterval = $transferInterval;
    }

    /**
     * Returns Transfer Day.
     */
    public function getTransferDay(): int
    {
        return $this->transferDay;
    }

    /**
     * Sets Transfer Day.
     *
     * @required
     * @maps transfer_day
     */
    public function setTransferDay(int $transferDay): void
    {
        $this->transferDay = $transferDay;
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
        $json['transfer_enabled']  = $this->transferEnabled;
        $json['transfer_interval'] = $this->transferInterval;
        $json['transfer_day']      = $this->transferDay;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
