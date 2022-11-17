<?php

declare(strict_types=1);

/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace MundiAPILib;

use Core\ClientBuilder;
use Core\Response\Types\ErrorType;
use Core\Utils\CoreHelper;
use MundiAPILib\Controllers\ChargesController;
use MundiAPILib\Controllers\CustomersController;
use MundiAPILib\Controllers\InvoicesController;
use MundiAPILib\Controllers\OrdersController;
use MundiAPILib\Controllers\PlansController;
use MundiAPILib\Controllers\RecipientsController;
use MundiAPILib\Controllers\SubscriptionsController;
use MundiAPILib\Controllers\TokensController;
use MundiAPILib\Controllers\TransactionsController;
use MundiAPILib\Controllers\TransfersController;
use MundiAPILib\Exceptions;
use MundiAPILib\Utils\CompatibilityConverter;
use Unirest\Configuration;
use Unirest\HttpClient;

class MundiAPIClient implements ConfigurationInterface
{
    private $customers;

    private $charges;

    private $recipients;

    private $subscriptions;

    private $invoices;

    private $orders;

    private $tokens;

    private $plans;

    private $transactions;

    private $transfers;

    private $basicAuthManager;

    private $config;

    private $client;

    /**
     * @see MundiAPIClientBuilder::init()
     * @see MundiAPIClientBuilder::build()
     *
     * @param array $config
     */
    public function __construct(array $config = [])
    {
        $this->config = array_merge(ConfigurationDefaults::_ALL, CoreHelper::clone($config));
        $this->basicAuthManager = new BasicAuthManager(
            $this->config['basicAuthUserName'] ?? ConfigurationDefaults::BASIC_AUTH_USER_NAME,
            $this->config['basicAuthPassword'] ?? ConfigurationDefaults::BASIC_AUTH_PASSWORD
        );
        $this->client = ClientBuilder::init(new HttpClient(Configuration::init($this)))
            ->converter(new CompatibilityConverter())
            ->jsonHelper(ApiHelper::getJsonHelper())
            ->apiCallback($this->config['httpCallback'] ?? null)
            ->userAgent('MundiSDK - PHP 2.4.0')
            ->globalErrors($this->getGlobalErrors())
            ->serverUrls(self::ENVIRONMENT_MAP[$this->getEnvironment()], Server::DEFAULT_)
            ->authManagers(['global' => $this->basicAuthManager])
            ->build();
    }

    /**
     * Create a builder with the current client's configurations.
     *
     * @return MundiAPIClientBuilder MundiAPIClientBuilder instance
     */
    public function toBuilder(): MundiAPIClientBuilder
    {
        return MundiAPIClientBuilder::init()
            ->timeout($this->getTimeout())
            ->enableRetries($this->shouldEnableRetries())
            ->numberOfRetries($this->getNumberOfRetries())
            ->retryInterval($this->getRetryInterval())
            ->backOffFactor($this->getBackOffFactor())
            ->maximumRetryWaitTime($this->getMaximumRetryWaitTime())
            ->retryOnTimeout($this->shouldRetryOnTimeout())
            ->httpStatusCodesToRetry($this->getHttpStatusCodesToRetry())
            ->httpMethodsToRetry($this->getHttpMethodsToRetry())
            ->environment($this->getEnvironment())
            ->basicAuthUserName($this->basicAuthManager->getBasicAuthUserName())
            ->basicAuthPassword($this->basicAuthManager->getBasicAuthPassword())
            ->httpCallback($this->config['httpCallback'] ?? null);
    }

    public function getTimeout(): int
    {
        return $this->config['timeout'] ?? ConfigurationDefaults::TIMEOUT;
    }

    public function shouldEnableRetries(): bool
    {
        return $this->config['enableRetries'] ?? ConfigurationDefaults::ENABLE_RETRIES;
    }

    public function getNumberOfRetries(): int
    {
        return $this->config['numberOfRetries'] ?? ConfigurationDefaults::NUMBER_OF_RETRIES;
    }

    public function getRetryInterval(): float
    {
        return $this->config['retryInterval'] ?? ConfigurationDefaults::RETRY_INTERVAL;
    }

    public function getBackOffFactor(): float
    {
        return $this->config['backOffFactor'] ?? ConfigurationDefaults::BACK_OFF_FACTOR;
    }

    public function getMaximumRetryWaitTime(): int
    {
        return $this->config['maximumRetryWaitTime'] ?? ConfigurationDefaults::MAXIMUM_RETRY_WAIT_TIME;
    }

    public function shouldRetryOnTimeout(): bool
    {
        return $this->config['retryOnTimeout'] ?? ConfigurationDefaults::RETRY_ON_TIMEOUT;
    }

    public function getHttpStatusCodesToRetry(): array
    {
        return $this->config['httpStatusCodesToRetry'] ?? ConfigurationDefaults::HTTP_STATUS_CODES_TO_RETRY;
    }

    public function getHttpMethodsToRetry(): array
    {
        return $this->config['httpMethodsToRetry'] ?? ConfigurationDefaults::HTTP_METHODS_TO_RETRY;
    }

    public function getEnvironment(): string
    {
        return $this->config['environment'] ?? ConfigurationDefaults::ENVIRONMENT;
    }

    public function getBasicAuthCredentials(): ?BasicAuthCredentials
    {
        return $this->basicAuthManager;
    }

    /**
     * Get the client configuration as an associative array
     *
     * @see MundiAPIClientBuilder::getConfiguration()
     */
    public function getConfiguration(): array
    {
        return $this->toBuilder()->getConfiguration();
    }

    /**
     * Clone this client and override given configuration options
     *
     * @see MundiAPIClientBuilder::build()
     */
    public function withConfiguration(array $config): self
    {
        return new self(array_merge($this->config, $config));
    }

    /**
     * Get the base uri for a given server in the current environment.
     *
     * @param string $server Server name
     *
     * @return string Base URI
     */
    public function getBaseUri(string $server = Server::DEFAULT_): string
    {
        return $this->client->getGlobalRequest($server)->getQueryUrl();
    }

    /**
     * Returns Customers Controller
     */
    public function getCustomersController(): CustomersController
    {
        if ($this->customers == null) {
            $this->customers = new CustomersController($this->client);
        }
        return $this->customers;
    }

    /**
     * Returns Charges Controller
     */
    public function getChargesController(): ChargesController
    {
        if ($this->charges == null) {
            $this->charges = new ChargesController($this->client);
        }
        return $this->charges;
    }

    /**
     * Returns Recipients Controller
     */
    public function getRecipientsController(): RecipientsController
    {
        if ($this->recipients == null) {
            $this->recipients = new RecipientsController($this->client);
        }
        return $this->recipients;
    }

    /**
     * Returns Subscriptions Controller
     */
    public function getSubscriptionsController(): SubscriptionsController
    {
        if ($this->subscriptions == null) {
            $this->subscriptions = new SubscriptionsController($this->client);
        }
        return $this->subscriptions;
    }

    /**
     * Returns Invoices Controller
     */
    public function getInvoicesController(): InvoicesController
    {
        if ($this->invoices == null) {
            $this->invoices = new InvoicesController($this->client);
        }
        return $this->invoices;
    }

    /**
     * Returns Orders Controller
     */
    public function getOrdersController(): OrdersController
    {
        if ($this->orders == null) {
            $this->orders = new OrdersController($this->client);
        }
        return $this->orders;
    }

    /**
     * Returns Tokens Controller
     */
    public function getTokensController(): TokensController
    {
        if ($this->tokens == null) {
            $this->tokens = new TokensController($this->client);
        }
        return $this->tokens;
    }

    /**
     * Returns Plans Controller
     */
    public function getPlansController(): PlansController
    {
        if ($this->plans == null) {
            $this->plans = new PlansController($this->client);
        }
        return $this->plans;
    }

    /**
     * Returns Transactions Controller
     */
    public function getTransactionsController(): TransactionsController
    {
        if ($this->transactions == null) {
            $this->transactions = new TransactionsController($this->client);
        }
        return $this->transactions;
    }

    /**
     * Returns Transfers Controller
     */
    public function getTransfersController(): TransfersController
    {
        if ($this->transfers == null) {
            $this->transfers = new TransfersController($this->client);
        }
        return $this->transfers;
    }

    /**
     * Get the defined global errors
     */
    private function getGlobalErrors(): array
    {
        return [
            400 => ErrorType::init('Invalid request', Exceptions\ErrorException::class),
            401 => ErrorType::init('Invalid API key', Exceptions\ErrorException::class),
            404 => ErrorType::init('An informed resource was not found', Exceptions\ErrorException::class),
            412 => ErrorType::init('Business validation error', Exceptions\ErrorException::class),
            422 => ErrorType::init('Contract validation error', Exceptions\ErrorException::class),
            500 => ErrorType::init('Internal server error', Exceptions\ErrorException::class)
        ];
    }

    /**
     * A map of all base urls used in different environments and servers
     *
     * @var array
     */
    private const ENVIRONMENT_MAP =
        [Environment::PRODUCTION => [Server::DEFAULT_ => 'https://api.mundipagg.com/core/v1']];
}
