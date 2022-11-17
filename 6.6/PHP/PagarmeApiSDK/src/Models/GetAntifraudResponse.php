<?php

declare(strict_types=1);

/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeApiSDKLib\Models;

use stdClass;

class GetAntifraudResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $status;

    /**
     * @var string
     */
    private $returnCode;

    /**
     * @var string
     */
    private $returnMessage;

    /**
     * @var string
     */
    private $providerName;

    /**
     * @var string
     */
    private $score;

    /**
     * @param string $status
     * @param string $returnCode
     * @param string $returnMessage
     * @param string $providerName
     * @param string $score
     */
    public function __construct(
        string $status,
        string $returnCode,
        string $returnMessage,
        string $providerName,
        string $score
    ) {
        $this->status = $status;
        $this->returnCode = $returnCode;
        $this->returnMessage = $returnMessage;
        $this->providerName = $providerName;
        $this->score = $score;
    }

    /**
     * Returns Status.
     */
    public function getStatus(): string
    {
        return $this->status;
    }

    /**
     * Sets Status.
     *
     * @required
     * @maps status
     */
    public function setStatus(string $status): void
    {
        $this->status = $status;
    }

    /**
     * Returns Return Code.
     */
    public function getReturnCode(): string
    {
        return $this->returnCode;
    }

    /**
     * Sets Return Code.
     *
     * @required
     * @maps return_code
     */
    public function setReturnCode(string $returnCode): void
    {
        $this->returnCode = $returnCode;
    }

    /**
     * Returns Return Message.
     */
    public function getReturnMessage(): string
    {
        return $this->returnMessage;
    }

    /**
     * Sets Return Message.
     *
     * @required
     * @maps return_message
     */
    public function setReturnMessage(string $returnMessage): void
    {
        $this->returnMessage = $returnMessage;
    }

    /**
     * Returns Provider Name.
     */
    public function getProviderName(): string
    {
        return $this->providerName;
    }

    /**
     * Sets Provider Name.
     *
     * @required
     * @maps provider_name
     */
    public function setProviderName(string $providerName): void
    {
        $this->providerName = $providerName;
    }

    /**
     * Returns Score.
     */
    public function getScore(): string
    {
        return $this->score;
    }

    /**
     * Sets Score.
     *
     * @required
     * @maps score
     */
    public function setScore(string $score): void
    {
        $this->score = $score;
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
        $json['status']         = $this->status;
        $json['return_code']    = $this->returnCode;
        $json['return_message'] = $this->returnMessage;
        $json['provider_name']  = $this->providerName;
        $json['score']          = $this->score;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}