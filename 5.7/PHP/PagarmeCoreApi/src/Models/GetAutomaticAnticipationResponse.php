<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib\Models;

use stdClass;

class GetAutomaticAnticipationResponse implements \JsonSerializable
{
    /**
     * @var bool
     */
    private $enabled;

    /**
     * @var string
     */
    private $type;

    /**
     * @var int
     */
    private $volumePercentage;

    /**
     * @var int
     */
    private $delay;

    /**
     * @var int[]
     */
    private $days;

    /**
     * @param bool $enabled
     * @param string $type
     * @param int $volumePercentage
     * @param int $delay
     * @param int[] $days
     */
    public function __construct(bool $enabled, string $type, int $volumePercentage, int $delay, array $days)
    {
        $this->enabled = $enabled;
        $this->type = $type;
        $this->volumePercentage = $volumePercentage;
        $this->delay = $delay;
        $this->days = $days;
    }

    /**
     * Returns Enabled.
     */
    public function getEnabled(): bool
    {
        return $this->enabled;
    }

    /**
     * Sets Enabled.
     *
     * @required
     * @maps enabled
     */
    public function setEnabled(bool $enabled): void
    {
        $this->enabled = $enabled;
    }

    /**
     * Returns Type.
     */
    public function getType(): string
    {
        return $this->type;
    }

    /**
     * Sets Type.
     *
     * @required
     * @maps type
     */
    public function setType(string $type): void
    {
        $this->type = $type;
    }

    /**
     * Returns Volume Percentage.
     */
    public function getVolumePercentage(): int
    {
        return $this->volumePercentage;
    }

    /**
     * Sets Volume Percentage.
     *
     * @required
     * @maps volume_percentage
     */
    public function setVolumePercentage(int $volumePercentage): void
    {
        $this->volumePercentage = $volumePercentage;
    }

    /**
     * Returns Delay.
     */
    public function getDelay(): int
    {
        return $this->delay;
    }

    /**
     * Sets Delay.
     *
     * @required
     * @maps delay
     */
    public function setDelay(int $delay): void
    {
        $this->delay = $delay;
    }

    /**
     * Returns Days.
     *
     * @return int[]
     */
    public function getDays(): array
    {
        return $this->days;
    }

    /**
     * Sets Days.
     *
     * @required
     * @maps days
     *
     * @param int[] $days
     */
    public function setDays(array $days): void
    {
        $this->days = $days;
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
        $json['enabled']           = $this->enabled;
        $json['type']              = $this->type;
        $json['volume_percentage'] = $this->volumePercentage;
        $json['delay']             = $this->delay;
        $json['days']              = $this->days;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
