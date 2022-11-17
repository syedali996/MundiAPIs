<?php

declare(strict_types=1);

/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeCoreApiLib\Exceptions;

/**
 * Api Error Exception
 */
class ErrorException extends ApiException
{
    /**
     * @var string
     */
    private $messageProperty;

    /**
     * @var array
     */
    private $errors;

    /**
     * @var array
     */
    private $request;

    /**
     * @param string $reason
     * @param \PagarmeCoreApiLib\Http\HttpRequest $request
     * @param \PagarmeCoreApiLib\Http\HttpResponse $response
     * @param string $messageProperty
     * @param array $errors
     * @param array $request
     */
    public function __construct(
        string $reason,
        \PagarmeCoreApiLib\Http\HttpRequest $request,
        \PagarmeCoreApiLib\Http\HttpResponse $response,
        string $messageProperty,
        array $errors,
        array $request
    ) {
        parent::__construct($reason, $request, $response);
        $this->messageProperty = $messageProperty;
        $this->errors = $errors;
        $this->request = $request;
    }

    /**
     * Returns Message Property.
     */
    public function getMessageProperty(): string
    {
        return $this->messageProperty;
    }

    /**
     * Sets Message Property.
     *
     * @required
     * @maps message
     */
    public function setMessageProperty(string $messageProperty): void
    {
        $this->messageProperty = $messageProperty;
    }

    /**
     * Returns Errors.
     */
    public function getErrors(): array
    {
        return $this->errors;
    }

    /**
     * Sets Errors.
     *
     * @required
     * @maps errors
     */
    public function setErrors(array $errors): void
    {
        $this->errors = $errors;
    }

    /**
     * Returns Request.
     */
    public function getRequest(): array
    {
        return $this->request;
    }

    /**
     * Sets Request.
     *
     * @required
     * @maps request
     */
    public function setRequest(array $request): void
    {
        $this->request = $request;
    }
}
