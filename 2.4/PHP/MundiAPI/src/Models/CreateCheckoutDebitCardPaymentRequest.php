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
 * Checkout credit card payment request
 */
class CreateCheckoutDebitCardPaymentRequest implements \JsonSerializable
{
    /**
     * @var string|null
     */
    private $statementDescriptor;

    /**
     * @var CreatePaymentAuthenticationRequest
     */
    private $authentication;

    /**
     * @param CreatePaymentAuthenticationRequest $authentication
     */
    public function __construct(CreatePaymentAuthenticationRequest $authentication)
    {
        $this->authentication = $authentication;
    }

    /**
     * Returns Statement Descriptor.
     * Card invoice text descriptor
     */
    public function getStatementDescriptor(): ?string
    {
        return $this->statementDescriptor;
    }

    /**
     * Sets Statement Descriptor.
     * Card invoice text descriptor
     *
     * @maps statement_descriptor
     */
    public function setStatementDescriptor(?string $statementDescriptor): void
    {
        $this->statementDescriptor = $statementDescriptor;
    }

    /**
     * Returns Authentication.
     * Creates payment authentication
     */
    public function getAuthentication(): CreatePaymentAuthenticationRequest
    {
        return $this->authentication;
    }

    /**
     * Sets Authentication.
     * Creates payment authentication
     *
     * @required
     * @maps authentication
     */
    public function setAuthentication(CreatePaymentAuthenticationRequest $authentication): void
    {
        $this->authentication = $authentication;
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
        if (isset($this->statementDescriptor)) {
            $json['statement_descriptor'] = $this->statementDescriptor;
        }
        $json['authentication']           = $this->authentication;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
