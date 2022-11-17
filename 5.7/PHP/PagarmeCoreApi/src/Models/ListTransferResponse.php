<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib\Models;

use stdClass;

/**
 * List of paginated transfer objects
 */
class ListTransferResponse implements \JsonSerializable
{
    /**
     * @var GetTransferResponse[]
     */
    private $data;

    /**
     * @var PagingResponse
     */
    private $paging;

    /**
     * @param GetTransferResponse[] $data
     * @param PagingResponse $paging
     */
    public function __construct(array $data, PagingResponse $paging)
    {
        $this->data = $data;
        $this->paging = $paging;
    }

    /**
     * Returns Data.
     * Transfers
     *
     * @return GetTransferResponse[]
     */
    public function getData(): array
    {
        return $this->data;
    }

    /**
     * Sets Data.
     * Transfers
     *
     * @required
     * @maps data
     *
     * @param GetTransferResponse[] $data
     */
    public function setData(array $data): void
    {
        $this->data = $data;
    }

    /**
     * Returns Paging.
     * Paging
     */
    public function getPaging(): PagingResponse
    {
        return $this->paging;
    }

    /**
     * Sets Paging.
     * Paging
     *
     * @required
     * @maps paging
     */
    public function setPaging(PagingResponse $paging): void
    {
        $this->paging = $paging;
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
        $json['data']   = $this->data;
        $json['paging'] = $this->paging;

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
