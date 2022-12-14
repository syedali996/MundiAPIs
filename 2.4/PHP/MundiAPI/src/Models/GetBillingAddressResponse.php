<?php

declare(strict_types=1);

/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace MundiAPILib\Models;

use stdClass;

/**
 * Response object for getting a billing address
 */
class GetBillingAddressResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $street;

    /**
     * @var string
     */
    private $number;

    /**
     * @var string
     */
    private $zipCode;

    /**
     * @var string
     */
    private $neighborhood;

    /**
     * @var string
     */
    private $city;

    /**
     * @var string
     */
    private $state;

    /**
     * @var string
     */
    private $country;

    /**
     * @var string
     */
    private $complement;

    /**
     * @var string
     */
    private $line1;

    /**
     * @var string
     */
    private $line2;

    /**
     * @param string $street
     * @param string $number
     * @param string $zipCode
     * @param string $neighborhood
     * @param string $city
     * @param string $state
     * @param string $country
     * @param string $complement
     * @param string $line1
     * @param string $line2
     */
    public function __construct(
        string $street,
        string $number,
        string $zipCode,
        string $neighborhood,
        string $city,
        string $state,
        string $country,
        string $complement,
        string $line1,
        string $line2
    ) {
        $this->street = $street;
        $this->number = $number;
        $this->zipCode = $zipCode;
        $this->neighborhood = $neighborhood;
        $this->city = $city;
        $this->state = $state;
        $this->country = $country;
        $this->complement = $complement;
        $this->line1 = $line1;
        $this->line2 = $line2;
    }

    /**
     * Returns Street.
     */
    public function getStreet(): string
    {
        return $this->street;
    }

    /**
     * Sets Street.
     *
     * @required
     * @maps street
     */
    public function setStreet(string $street): void
    {
        $this->street = $street;
    }

    /**
     * Returns Number.
     */
    public function getNumber(): string
    {
        return $this->number;
    }

    /**
     * Sets Number.
     *
     * @required
     * @maps number
     */
    public function setNumber(string $number): void
    {
        $this->number = $number;
    }

    /**
     * Returns Zip Code.
     */
    public function getZipCode(): string
    {
        return $this->zipCode;
    }

    /**
     * Sets Zip Code.
     *
     * @required
     * @maps zip_code
     */
    public function setZipCode(string $zipCode): void
    {
        $this->zipCode = $zipCode;
    }

    /**
     * Returns Neighborhood.
     */
    public function getNeighborhood(): string
    {
        return $this->neighborhood;
    }

    /**
     * Sets Neighborhood.
     *
     * @required
     * @maps neighborhood
     */
    public function setNeighborhood(string $neighborhood): void
    {
        $this->neighborhood = $neighborhood;
    }

    /**
     * Returns City.
     */
    public function getCity(): string
    {
        return $this->city;
    }

    /**
     * Sets City.
     *
     * @required
     * @maps city
     */
    public function setCity(string $city): void
    {
        $this->city = $city;
    }

    /**
     * Returns State.
     */
    public function getState(): string
    {
        return $this->state;
    }

    /**
     * Sets State.
     *
     * @required
     * @maps state
     */
    public function setState(string $state): void
    {
        $this->state = $state;
    }

    /**
     * Returns Country.
     */
    public function getCountry(): string
    {
        return $this->country;
    }

    /**
     * Sets Country.
     *
     * @required
     * @maps country
     */
    public function setCountry(string $country): void
    {
        $this->country = $country;
    }

    /**
     * Returns Complement.
     */
    public function getComplement(): string
    {
        return $this->complement;
    }

    /**
     * Sets Complement.
     *
     * @required
     * @maps complement
     */
    public function setComplement(string $complement): void
    {
        $this->complement = $complement;
    }

    /**
     * Returns Line 1.
     * Line 1 for address
     */
    public function getLine1(): string
    {
        return $this->line1;
    }

    /**
     * Sets Line 1.
     * Line 1 for address
     *
     * @required
     * @maps line_1
     */
    public function setLine1(string $line1): void
    {
        $this->line1 = $line1;
    }

    /**
     * Returns Line 2.
     * Line 2 for address
     */
    public function getLine2(): string
    {
        return $this->line2;
    }

    /**
     * Sets Line 2.
     * Line 2 for address
     *
     * @required
     * @maps line_2
     */
    public function setLine2(string $line2): void
    {
        $this->line2 = $line2;
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
        $json['street']       = $this->street;
        $json['number']       = $this->number;
        $json['zip_code']     = $this->zipCode;
        $json['neighborhood'] = $this->neighborhood;
        $json['city']         = $this->city;
        $json['state']        = $this->state;
        $json['country']      = $this->country;
        $json['complement']   = $this->complement;
        $json['line_1']       = $this->line1;
        $json['line_2']       = $this->line2;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
