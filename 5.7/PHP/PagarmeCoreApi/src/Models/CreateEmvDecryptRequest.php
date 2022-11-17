<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib\Models;

use stdClass;

class CreateEmvDecryptRequest implements \JsonSerializable
{
    /**
     * @var string
     */
    private $iccData;

    /**
     * @var string
     */
    private $cardSequenceNumber;

    /**
     * @var CreateEmvDataDecryptRequest
     */
    private $data;

    /**
     * @var CreateCardPaymentContactlessPOIRequest|null
     */
    private $poi;

    /**
     * @param string $iccData
     * @param string $cardSequenceNumber
     * @param CreateEmvDataDecryptRequest $data
     */
    public function __construct(string $iccData, string $cardSequenceNumber, CreateEmvDataDecryptRequest $data)
    {
        $this->iccData = $iccData;
        $this->cardSequenceNumber = $cardSequenceNumber;
        $this->data = $data;
    }

    /**
     * Returns Icc Data.
     */
    public function getIccData(): string
    {
        return $this->iccData;
    }

    /**
     * Sets Icc Data.
     *
     * @required
     * @maps icc_data
     */
    public function setIccData(string $iccData): void
    {
        $this->iccData = $iccData;
    }

    /**
     * Returns Card Sequence Number.
     */
    public function getCardSequenceNumber(): string
    {
        return $this->cardSequenceNumber;
    }

    /**
     * Sets Card Sequence Number.
     *
     * @required
     * @maps card_sequence_number
     */
    public function setCardSequenceNumber(string $cardSequenceNumber): void
    {
        $this->cardSequenceNumber = $cardSequenceNumber;
    }

    /**
     * Returns Data.
     */
    public function getData(): CreateEmvDataDecryptRequest
    {
        return $this->data;
    }

    /**
     * Sets Data.
     *
     * @required
     * @maps data
     */
    public function setData(CreateEmvDataDecryptRequest $data): void
    {
        $this->data = $data;
    }

    /**
     * Returns Poi.
     */
    public function getPoi(): ?CreateCardPaymentContactlessPOIRequest
    {
        return $this->poi;
    }

    /**
     * Sets Poi.
     *
     * @maps poi
     */
    public function setPoi(?CreateCardPaymentContactlessPOIRequest $poi): void
    {
        $this->poi = $poi;
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
        $json['icc_data']             = $this->iccData;
        $json['card_sequence_number'] = $this->cardSequenceNumber;
        $json['data']                 = $this->data;
        if (isset($this->poi)) {
            $json['poi']              = $this->poi;
        }

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
