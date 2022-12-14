<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib\Models;

use stdClass;

class GetCheckoutCreditCardPaymentResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $statementDescriptor;

    /**
     * @var GetCheckoutCardInstallmentOptionsResponse[]
     */
    private $installments;

    /**
     * @var GetPaymentAuthenticationResponse
     */
    private $authentication;

    /**
     * @param string $statementDescriptor
     * @param GetCheckoutCardInstallmentOptionsResponse[] $installments
     * @param GetPaymentAuthenticationResponse $authentication
     */
    public function __construct(
        string $statementDescriptor,
        array $installments,
        GetPaymentAuthenticationResponse $authentication
    ) {
        $this->statementDescriptor = $statementDescriptor;
        $this->installments = $installments;
        $this->authentication = $authentication;
    }

    /**
     * Returns Statement Descriptor.
     * Descrição na fatura
     */
    public function getStatementDescriptor(): string
    {
        return $this->statementDescriptor;
    }

    /**
     * Sets Statement Descriptor.
     * Descrição na fatura
     *
     * @required
     * @maps statementDescriptor
     */
    public function setStatementDescriptor(string $statementDescriptor): void
    {
        $this->statementDescriptor = $statementDescriptor;
    }

    /**
     * Returns Installments.
     * Parcelas
     *
     * @return GetCheckoutCardInstallmentOptionsResponse[]
     */
    public function getInstallments(): array
    {
        return $this->installments;
    }

    /**
     * Sets Installments.
     * Parcelas
     *
     * @required
     * @maps installments
     *
     * @param GetCheckoutCardInstallmentOptionsResponse[] $installments
     */
    public function setInstallments(array $installments): void
    {
        $this->installments = $installments;
    }

    /**
     * Returns Authentication.
     * Payment Authentication response
     */
    public function getAuthentication(): GetPaymentAuthenticationResponse
    {
        return $this->authentication;
    }

    /**
     * Sets Authentication.
     * Payment Authentication response
     *
     * @required
     * @maps authentication
     */
    public function setAuthentication(GetPaymentAuthenticationResponse $authentication): void
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
        $json['statementDescriptor'] = $this->statementDescriptor;
        $json['installments']        = $this->installments;
        $json['authentication']      = $this->authentication;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
