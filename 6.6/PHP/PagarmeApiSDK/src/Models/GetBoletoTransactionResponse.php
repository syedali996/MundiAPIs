<?php

declare(strict_types=1);

/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace PagarmeApiSDKLib\Models;

use PagarmeApiSDKLib\Utils\DateTimeHelper;
use stdClass;

/**
 * Response object for getting a boleto transaction
 *
 * @discriminator transaction_type
 * @discriminatorType boleto
 */
class GetBoletoTransactionResponse extends GetTransactionResponse implements \JsonSerializable
{
    /**
     * @var string
     */
    private $url;

    /**
     * @var string
     */
    private $barcode;

    /**
     * @var string
     */
    private $nossoNumero;

    /**
     * @var string
     */
    private $bank;

    /**
     * @var string
     */
    private $documentNumber;

    /**
     * @var string
     */
    private $instructions;

    /**
     * @var GetBillingAddressResponse
     */
    private $billingAddress;

    /**
     * @var \DateTime|null
     */
    private $dueAt;

    /**
     * @var string
     */
    private $qrCode;

    /**
     * @var string
     */
    private $line;

    /**
     * @var string
     */
    private $pdfPassword;

    /**
     * @var string
     */
    private $pdf;

    /**
     * @var \DateTime|null
     */
    private $paidAt;

    /**
     * @var string
     */
    private $paidAmount;

    /**
     * @var string
     */
    private $type;

    /**
     * @var \DateTime|null
     */
    private $creditAt;

    /**
     * @var string
     */
    private $statementDescriptor;

    /**
     * @param string $gatewayId
     * @param int $amount
     * @param string $status
     * @param bool $success
     * @param \DateTime $createdAt
     * @param \DateTime $updatedAt
     * @param int $attemptCount
     * @param int $maxAttempts
     * @param GetSplitResponse[] $splits
     * @param string $id
     * @param GetGatewayResponseResponse $gatewayResponse
     * @param GetAntifraudResponse $antifraudResponse
     * @param GetSplitResponse[] $split
     * @param string $url
     * @param string $barcode
     * @param string $nossoNumero
     * @param string $bank
     * @param string $documentNumber
     * @param string $instructions
     * @param GetBillingAddressResponse $billingAddress
     * @param string $qrCode
     * @param string $line
     * @param string $pdfPassword
     * @param string $pdf
     * @param string $paidAmount
     * @param string $type
     * @param string $statementDescriptor
     */
    public function __construct(
        string $gatewayId,
        int $amount,
        string $status,
        bool $success,
        \DateTime $createdAt,
        \DateTime $updatedAt,
        int $attemptCount,
        int $maxAttempts,
        array $splits,
        string $id,
        GetGatewayResponseResponse $gatewayResponse,
        GetAntifraudResponse $antifraudResponse,
        array $split,
        string $url,
        string $barcode,
        string $nossoNumero,
        string $bank,
        string $documentNumber,
        string $instructions,
        GetBillingAddressResponse $billingAddress,
        string $qrCode,
        string $line,
        string $pdfPassword,
        string $pdf,
        string $paidAmount,
        string $type,
        string $statementDescriptor
    ) {
        parent::__construct(
            $gatewayId,
            $amount,
            $status,
            $success,
            $createdAt,
            $updatedAt,
            $attemptCount,
            $maxAttempts,
            $splits,
            $id,
            $gatewayResponse,
            $antifraudResponse,
            $split
        );
        $this->url = $url;
        $this->barcode = $barcode;
        $this->nossoNumero = $nossoNumero;
        $this->bank = $bank;
        $this->documentNumber = $documentNumber;
        $this->instructions = $instructions;
        $this->billingAddress = $billingAddress;
        $this->qrCode = $qrCode;
        $this->line = $line;
        $this->pdfPassword = $pdfPassword;
        $this->pdf = $pdf;
        $this->paidAmount = $paidAmount;
        $this->type = $type;
        $this->statementDescriptor = $statementDescriptor;
    }

    /**
     * Returns Url.
     */
    public function getUrl(): string
    {
        return $this->url;
    }

    /**
     * Sets Url.
     *
     * @required
     * @maps url
     */
    public function setUrl(string $url): void
    {
        $this->url = $url;
    }

    /**
     * Returns Barcode.
     */
    public function getBarcode(): string
    {
        return $this->barcode;
    }

    /**
     * Sets Barcode.
     *
     * @required
     * @maps barcode
     */
    public function setBarcode(string $barcode): void
    {
        $this->barcode = $barcode;
    }

    /**
     * Returns Nosso Numero.
     */
    public function getNossoNumero(): string
    {
        return $this->nossoNumero;
    }

    /**
     * Sets Nosso Numero.
     *
     * @required
     * @maps nosso_numero
     */
    public function setNossoNumero(string $nossoNumero): void
    {
        $this->nossoNumero = $nossoNumero;
    }

    /**
     * Returns Bank.
     */
    public function getBank(): string
    {
        return $this->bank;
    }

    /**
     * Sets Bank.
     *
     * @required
     * @maps bank
     */
    public function setBank(string $bank): void
    {
        $this->bank = $bank;
    }

    /**
     * Returns Document Number.
     */
    public function getDocumentNumber(): string
    {
        return $this->documentNumber;
    }

    /**
     * Sets Document Number.
     *
     * @required
     * @maps document_number
     */
    public function setDocumentNumber(string $documentNumber): void
    {
        $this->documentNumber = $documentNumber;
    }

    /**
     * Returns Instructions.
     */
    public function getInstructions(): string
    {
        return $this->instructions;
    }

    /**
     * Sets Instructions.
     *
     * @required
     * @maps instructions
     */
    public function setInstructions(string $instructions): void
    {
        $this->instructions = $instructions;
    }

    /**
     * Returns Billing Address.
     */
    public function getBillingAddress(): GetBillingAddressResponse
    {
        return $this->billingAddress;
    }

    /**
     * Sets Billing Address.
     *
     * @required
     * @maps billing_address
     */
    public function setBillingAddress(GetBillingAddressResponse $billingAddress): void
    {
        $this->billingAddress = $billingAddress;
    }

    /**
     * Returns Due At.
     */
    public function getDueAt(): ?\DateTime
    {
        return $this->dueAt;
    }

    /**
     * Sets Due At.
     *
     * @maps due_at
     * @factory \PagarmeApiSDKLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setDueAt(?\DateTime $dueAt): void
    {
        $this->dueAt = $dueAt;
    }

    /**
     * Returns Qr Code.
     */
    public function getQrCode(): string
    {
        return $this->qrCode;
    }

    /**
     * Sets Qr Code.
     *
     * @required
     * @maps qr_code
     */
    public function setQrCode(string $qrCode): void
    {
        $this->qrCode = $qrCode;
    }

    /**
     * Returns Line.
     */
    public function getLine(): string
    {
        return $this->line;
    }

    /**
     * Sets Line.
     *
     * @required
     * @maps line
     */
    public function setLine(string $line): void
    {
        $this->line = $line;
    }

    /**
     * Returns Pdf Password.
     */
    public function getPdfPassword(): string
    {
        return $this->pdfPassword;
    }

    /**
     * Sets Pdf Password.
     *
     * @required
     * @maps pdf_password
     */
    public function setPdfPassword(string $pdfPassword): void
    {
        $this->pdfPassword = $pdfPassword;
    }

    /**
     * Returns Pdf.
     */
    public function getPdf(): string
    {
        return $this->pdf;
    }

    /**
     * Sets Pdf.
     *
     * @required
     * @maps pdf
     */
    public function setPdf(string $pdf): void
    {
        $this->pdf = $pdf;
    }

    /**
     * Returns Paid At.
     */
    public function getPaidAt(): ?\DateTime
    {
        return $this->paidAt;
    }

    /**
     * Sets Paid At.
     *
     * @maps paid_at
     * @factory \PagarmeApiSDKLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setPaidAt(?\DateTime $paidAt): void
    {
        $this->paidAt = $paidAt;
    }

    /**
     * Returns Paid Amount.
     */
    public function getPaidAmount(): string
    {
        return $this->paidAmount;
    }

    /**
     * Sets Paid Amount.
     *
     * @required
     * @maps paid_amount
     */
    public function setPaidAmount(string $paidAmount): void
    {
        $this->paidAmount = $paidAmount;
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
     * Returns Credit At.
     */
    public function getCreditAt(): ?\DateTime
    {
        return $this->creditAt;
    }

    /**
     * Sets Credit At.
     *
     * @maps credit_at
     * @factory \PagarmeApiSDKLib\Utils\DateTimeHelper::fromRfc3339DateTime
     */
    public function setCreditAt(?\DateTime $creditAt): void
    {
        $this->creditAt = $creditAt;
    }

    /**
     * Returns Statement Descriptor.
     * Soft Descriptor
     */
    public function getStatementDescriptor(): string
    {
        return $this->statementDescriptor;
    }

    /**
     * Sets Statement Descriptor.
     * Soft Descriptor
     *
     * @required
     * @maps statement_descriptor
     */
    public function setStatementDescriptor(string $statementDescriptor): void
    {
        $this->statementDescriptor = $statementDescriptor;
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
        $json['url']                  = $this->url;
        $json['barcode']              = $this->barcode;
        $json['nosso_numero']         = $this->nossoNumero;
        $json['bank']                 = $this->bank;
        $json['document_number']      = $this->documentNumber;
        $json['instructions']         = $this->instructions;
        $json['billing_address']      = $this->billingAddress;
        if (isset($this->dueAt)) {
            $json['due_at']           = DateTimeHelper::toRfc3339DateTime($this->dueAt);
        }
        $json['qr_code']              = $this->qrCode;
        $json['line']                 = $this->line;
        $json['pdf_password']         = $this->pdfPassword;
        $json['pdf']                  = $this->pdf;
        if (isset($this->paidAt)) {
            $json['paid_at']          = DateTimeHelper::toRfc3339DateTime($this->paidAt);
        }
        $json['paid_amount']          = $this->paidAmount;
        $json['type']                 = $this->type;
        if (isset($this->creditAt)) {
            $json['credit_at']        = DateTimeHelper::toRfc3339DateTime($this->creditAt);
        }
        $json['statement_descriptor'] = $this->statementDescriptor;
        $json = array_merge($json, parent::jsonSerialize(true));
        $json['transaction_type'] = $this->getTransactionType() ?? 'boleto';

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
