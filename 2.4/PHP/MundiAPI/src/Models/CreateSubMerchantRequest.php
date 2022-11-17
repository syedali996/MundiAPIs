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
 * SubMerchant
 */
class CreateSubMerchantRequest implements \JsonSerializable
{
    /**
     * @var string
     */
    private $paymentFacilitatorCode;

    /**
     * @var string
     */
    private $code;

    /**
     * @var string
     */
    private $name;

    /**
     * @var string
     */
    private $merchantCategoryCode;

    /**
     * @var string
     */
    private $document;

    /**
     * @var string
     */
    private $type;

    /**
     * @var CreatePhoneRequest
     */
    private $phone;

    /**
     * @var CreateAddressRequest
     */
    private $address;

    /**
     * @param string $paymentFacilitatorCode
     * @param string $code
     * @param string $name
     * @param string $merchantCategoryCode
     * @param string $document
     * @param string $type
     * @param CreatePhoneRequest $phone
     * @param CreateAddressRequest $address
     */
    public function __construct(
        string $paymentFacilitatorCode,
        string $code,
        string $name,
        string $merchantCategoryCode,
        string $document,
        string $type,
        CreatePhoneRequest $phone,
        CreateAddressRequest $address
    ) {
        $this->paymentFacilitatorCode = $paymentFacilitatorCode;
        $this->code = $code;
        $this->name = $name;
        $this->merchantCategoryCode = $merchantCategoryCode;
        $this->document = $document;
        $this->type = $type;
        $this->phone = $phone;
        $this->address = $address;
    }

    /**
     * Returns Payment Facilitator Code.
     * Payment Facilitator Code
     */
    public function getPaymentFacilitatorCode(): string
    {
        return $this->paymentFacilitatorCode;
    }

    /**
     * Sets Payment Facilitator Code.
     * Payment Facilitator Code
     *
     * @required
     * @maps payment_facilitator_code
     */
    public function setPaymentFacilitatorCode(string $paymentFacilitatorCode): void
    {
        $this->paymentFacilitatorCode = $paymentFacilitatorCode;
    }

    /**
     * Returns Code.
     * Code
     */
    public function getCode(): string
    {
        return $this->code;
    }

    /**
     * Sets Code.
     * Code
     *
     * @required
     * @maps code
     */
    public function setCode(string $code): void
    {
        $this->code = $code;
    }

    /**
     * Returns Name.
     * Name
     */
    public function getName(): string
    {
        return $this->name;
    }

    /**
     * Sets Name.
     * Name
     *
     * @required
     * @maps name
     */
    public function setName(string $name): void
    {
        $this->name = $name;
    }

    /**
     * Returns Merchant Category Code.
     * Merchant Category Code
     */
    public function getMerchantCategoryCode(): string
    {
        return $this->merchantCategoryCode;
    }

    /**
     * Sets Merchant Category Code.
     * Merchant Category Code
     *
     * @required
     * @maps merchant_category_code
     */
    public function setMerchantCategoryCode(string $merchantCategoryCode): void
    {
        $this->merchantCategoryCode = $merchantCategoryCode;
    }

    /**
     * Returns Document.
     * Document number. Only numbers, no special characters.
     */
    public function getDocument(): string
    {
        return $this->document;
    }

    /**
     * Sets Document.
     * Document number. Only numbers, no special characters.
     *
     * @required
     * @maps document
     */
    public function setDocument(string $document): void
    {
        $this->document = $document;
    }

    /**
     * Returns Type.
     * Document type. Can be either 'individual' or 'company'
     */
    public function getType(): string
    {
        return $this->type;
    }

    /**
     * Sets Type.
     * Document type. Can be either 'individual' or 'company'
     *
     * @required
     * @maps type
     */
    public function setType(string $type): void
    {
        $this->type = $type;
    }

    /**
     * Returns Phone.
     * Phone
     */
    public function getPhone(): CreatePhoneRequest
    {
        return $this->phone;
    }

    /**
     * Sets Phone.
     * Phone
     *
     * @required
     * @maps phone
     */
    public function setPhone(CreatePhoneRequest $phone): void
    {
        $this->phone = $phone;
    }

    /**
     * Returns Address.
     * Address
     */
    public function getAddress(): CreateAddressRequest
    {
        return $this->address;
    }

    /**
     * Sets Address.
     * Address
     *
     * @required
     * @maps address
     */
    public function setAddress(CreateAddressRequest $address): void
    {
        $this->address = $address;
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
        $json['payment_facilitator_code'] = $this->paymentFacilitatorCode;
        $json['code']                     = $this->code;
        $json['name']                     = $this->name;
        $json['merchant_category_code']   = $this->merchantCategoryCode;
        $json['document']                 = $this->document;
        $json['type']                     = $this->type;
        $json['phone']                    = $this->phone;
        $json['address']                  = $this->address;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
