/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mundipagg.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for GetPixTransactionResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "transaction_type",
        defaultImpl = GetPixTransactionResponse.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class GetPixTransactionResponse
        extends GetTransactionResponse {
    private String qrCode;
    private String qrCodeUrl;
    private LocalDateTime expiresAt;
    private List<PixAdditionalInformation> additionalInformation;
    private GetPixPayerResponse payer;

    /**
     * Default constructor.
     */
    public GetPixTransactionResponse() {
        super();
        setTransactionType("pix");
    }

    /**
     * Initialization constructor.
     * @param  gatewayId  String value for gatewayId.
     * @param  amount  int value for amount.
     * @param  status  String value for status.
     * @param  success  boolean value for success.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  attemptCount  int value for attemptCount.
     * @param  maxAttempts  int value for maxAttempts.
     * @param  splits  List of GetSplitResponse value for splits.
     * @param  id  String value for id.
     * @param  gatewayResponse  GetGatewayResponseResponse value for gatewayResponse.
     * @param  antifraudResponse  GetAntifraudResponse value for antifraudResponse.
     * @param  split  List of GetSplitResponse value for split.
     * @param  qrCode  String value for qrCode.
     * @param  qrCodeUrl  String value for qrCodeUrl.
     * @param  expiresAt  LocalDateTime value for expiresAt.
     * @param  additionalInformation  List of PixAdditionalInformation value for
     *         additionalInformation.
     * @param  payer  GetPixPayerResponse value for payer.
     * @param  nextAttempt  LocalDateTime value for nextAttempt.
     * @param  transactionType  String value for transactionType.
     * @param  metadata  Map of String, value for metadata.
     * @param  interest  GetInterestResponse value for interest.
     * @param  fine  GetFineResponse value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     */
    public GetPixTransactionResponse(
            String gatewayId,
            int amount,
            String status,
            boolean success,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            int attemptCount,
            int maxAttempts,
            List<GetSplitResponse> splits,
            String id,
            GetGatewayResponseResponse gatewayResponse,
            GetAntifraudResponse antifraudResponse,
            List<GetSplitResponse> split,
            String qrCode,
            String qrCodeUrl,
            LocalDateTime expiresAt,
            List<PixAdditionalInformation> additionalInformation,
            GetPixPayerResponse payer,
            LocalDateTime nextAttempt,
            String transactionType,
            Map<String, String> metadata,
            GetInterestResponse interest,
            GetFineResponse fine,
            Integer maxDaysToPayPastDue) {
        super(gatewayId, amount, status, success, createdAt, updatedAt, attemptCount, maxAttempts,
                splits, id, gatewayResponse, antifraudResponse, split, nextAttempt, transactionType,
                metadata, interest, fine, maxDaysToPayPastDue);
        this.qrCode = qrCode;
        this.qrCodeUrl = qrCodeUrl;
        this.expiresAt = expiresAt;
        this.additionalInformation = additionalInformation;
        this.payer = payer;
    }

    /**
     * Getter for QrCode.
     * @return Returns the String
     */
    @JsonGetter("qr_code")
    public String getQrCode() {
        return qrCode;
    }

    /**
     * Setter for QrCode.
     * @param qrCode Value for String
     */
    @JsonSetter("qr_code")
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    /**
     * Getter for QrCodeUrl.
     * @return Returns the String
     */
    @JsonGetter("qr_code_url")
    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    /**
     * Setter for QrCodeUrl.
     * @param qrCodeUrl Value for String
     */
    @JsonSetter("qr_code_url")
    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }

    /**
     * Getter for ExpiresAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("expires_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * @param expiresAt Value for LocalDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for AdditionalInformation.
     * @return Returns the List of PixAdditionalInformation
     */
    @JsonGetter("additional_information")
    public List<PixAdditionalInformation> getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Setter for AdditionalInformation.
     * @param additionalInformation Value for List of PixAdditionalInformation
     */
    @JsonSetter("additional_information")
    public void setAdditionalInformation(List<PixAdditionalInformation> additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * Getter for Payer.
     * @return Returns the GetPixPayerResponse
     */
    @JsonGetter("payer")
    public GetPixPayerResponse getPayer() {
        return payer;
    }

    /**
     * Setter for Payer.
     * @param payer Value for GetPixPayerResponse
     */
    @JsonSetter("payer")
    public void setPayer(GetPixPayerResponse payer) {
        this.payer = payer;
    }

    /**
     * Converts this GetPixTransactionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPixTransactionResponse [" + "qrCode=" + qrCode + ", qrCodeUrl=" + qrCodeUrl
                + ", expiresAt=" + expiresAt + ", additionalInformation=" + additionalInformation
                + ", payer=" + payer + ", gatewayId=" + getGatewayId() + ", amount=" + getAmount()
                + ", status=" + getStatus() + ", success=" + getSuccess() + ", createdAt="
                + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ", attemptCount="
                + getAttemptCount() + ", maxAttempts=" + getMaxAttempts() + ", splits="
                + getSplits() + ", id=" + getId() + ", gatewayResponse=" + getGatewayResponse()
                + ", antifraudResponse=" + getAntifraudResponse() + ", split=" + getSplit()
                + ", nextAttempt=" + getNextAttempt() + ", transactionType=" + getTransactionType()
                + ", metadata=" + getMetadata() + ", interest=" + getInterest() + ", fine="
                + getFine() + ", maxDaysToPayPastDue=" + getMaxDaysToPayPastDue() + "]";
    }

    /**
     * Builds a new {@link GetPixTransactionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPixTransactionResponse.Builder} object
     */
    public Builder toGetPixTransactionResponseBuilder() {
        Builder builder = new Builder(getGatewayId(), getAmount(), getStatus(), getSuccess(),
                getCreatedAt(), getUpdatedAt(), getAttemptCount(), getMaxAttempts(), getSplits(),
                getId(), getGatewayResponse(), getAntifraudResponse(), getSplit(), qrCode,
                qrCodeUrl, expiresAt, additionalInformation, payer)
                .nextAttempt(getNextAttempt())
                .transactionType(getTransactionType())
                .metadata(getMetadata())
                .interest(getInterest())
                .fine(getFine())
                .maxDaysToPayPastDue(getMaxDaysToPayPastDue());
        return builder;
    }

    /**
     * Class to build instances of {@link GetPixTransactionResponse}.
     */
    public static class Builder {
        private String gatewayId;
        private int amount;
        private String status;
        private boolean success;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private int attemptCount;
        private int maxAttempts;
        private List<GetSplitResponse> splits;
        private String id;
        private GetGatewayResponseResponse gatewayResponse;
        private GetAntifraudResponse antifraudResponse;
        private List<GetSplitResponse> split;
        private String qrCode;
        private String qrCodeUrl;
        private LocalDateTime expiresAt;
        private List<PixAdditionalInformation> additionalInformation;
        private GetPixPayerResponse payer;
        private LocalDateTime nextAttempt;
        private String transactionType = "pix";
        private Map<String, String> metadata;
        private GetInterestResponse interest;
        private GetFineResponse fine;
        private Integer maxDaysToPayPastDue;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  gatewayId  String value for gatewayId.
         * @param  amount  int value for amount.
         * @param  status  String value for status.
         * @param  success  boolean value for success.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  attemptCount  int value for attemptCount.
         * @param  maxAttempts  int value for maxAttempts.
         * @param  splits  List of GetSplitResponse value for splits.
         * @param  id  String value for id.
         * @param  gatewayResponse  GetGatewayResponseResponse value for gatewayResponse.
         * @param  antifraudResponse  GetAntifraudResponse value for antifraudResponse.
         * @param  split  List of GetSplitResponse value for split.
         * @param  qrCode  String value for qrCode.
         * @param  qrCodeUrl  String value for qrCodeUrl.
         * @param  expiresAt  LocalDateTime value for expiresAt.
         * @param  additionalInformation  List of PixAdditionalInformation value for
         *         additionalInformation.
         * @param  payer  GetPixPayerResponse value for payer.
         */
        public Builder(String gatewayId, int amount, String status, boolean success,
                LocalDateTime createdAt, LocalDateTime updatedAt, int attemptCount, int maxAttempts,
                List<GetSplitResponse> splits, String id,
                GetGatewayResponseResponse gatewayResponse, GetAntifraudResponse antifraudResponse,
                List<GetSplitResponse> split, String qrCode, String qrCodeUrl,
                LocalDateTime expiresAt, List<PixAdditionalInformation> additionalInformation,
                GetPixPayerResponse payer) {
            this.gatewayId = gatewayId;
            this.amount = amount;
            this.status = status;
            this.success = success;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.attemptCount = attemptCount;
            this.maxAttempts = maxAttempts;
            this.splits = splits;
            this.id = id;
            this.gatewayResponse = gatewayResponse;
            this.antifraudResponse = antifraudResponse;
            this.split = split;
            this.qrCode = qrCode;
            this.qrCodeUrl = qrCodeUrl;
            this.expiresAt = expiresAt;
            this.additionalInformation = additionalInformation;
            this.payer = payer;
        }

        /**
         * Setter for gatewayId.
         * @param  gatewayId  String value for gatewayId.
         * @return Builder
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for success.
         * @param  success  boolean value for success.
         * @return Builder
         */
        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for attemptCount.
         * @param  attemptCount  int value for attemptCount.
         * @return Builder
         */
        public Builder attemptCount(int attemptCount) {
            this.attemptCount = attemptCount;
            return this;
        }

        /**
         * Setter for maxAttempts.
         * @param  maxAttempts  int value for maxAttempts.
         * @return Builder
         */
        public Builder maxAttempts(int maxAttempts) {
            this.maxAttempts = maxAttempts;
            return this;
        }

        /**
         * Setter for splits.
         * @param  splits  List of GetSplitResponse value for splits.
         * @return Builder
         */
        public Builder splits(List<GetSplitResponse> splits) {
            this.splits = splits;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for gatewayResponse.
         * @param  gatewayResponse  GetGatewayResponseResponse value for gatewayResponse.
         * @return Builder
         */
        public Builder gatewayResponse(GetGatewayResponseResponse gatewayResponse) {
            this.gatewayResponse = gatewayResponse;
            return this;
        }

        /**
         * Setter for antifraudResponse.
         * @param  antifraudResponse  GetAntifraudResponse value for antifraudResponse.
         * @return Builder
         */
        public Builder antifraudResponse(GetAntifraudResponse antifraudResponse) {
            this.antifraudResponse = antifraudResponse;
            return this;
        }

        /**
         * Setter for split.
         * @param  split  List of GetSplitResponse value for split.
         * @return Builder
         */
        public Builder split(List<GetSplitResponse> split) {
            this.split = split;
            return this;
        }

        /**
         * Setter for qrCode.
         * @param  qrCode  String value for qrCode.
         * @return Builder
         */
        public Builder qrCode(String qrCode) {
            this.qrCode = qrCode;
            return this;
        }

        /**
         * Setter for qrCodeUrl.
         * @param  qrCodeUrl  String value for qrCodeUrl.
         * @return Builder
         */
        public Builder qrCodeUrl(String qrCodeUrl) {
            this.qrCodeUrl = qrCodeUrl;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  LocalDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(LocalDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Setter for additionalInformation.
         * @param  additionalInformation  List of PixAdditionalInformation value for
         *         additionalInformation.
         * @return Builder
         */
        public Builder additionalInformation(
                List<PixAdditionalInformation> additionalInformation) {
            this.additionalInformation = additionalInformation;
            return this;
        }

        /**
         * Setter for payer.
         * @param  payer  GetPixPayerResponse value for payer.
         * @return Builder
         */
        public Builder payer(GetPixPayerResponse payer) {
            this.payer = payer;
            return this;
        }

        /**
         * Setter for nextAttempt.
         * @param  nextAttempt  LocalDateTime value for nextAttempt.
         * @return Builder
         */
        public Builder nextAttempt(LocalDateTime nextAttempt) {
            this.nextAttempt = nextAttempt;
            return this;
        }

        /**
         * Setter for transactionType.
         * @param  transactionType  String value for transactionType.
         * @return Builder
         */
        public Builder transactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for interest.
         * @param  interest  GetInterestResponse value for interest.
         * @return Builder
         */
        public Builder interest(GetInterestResponse interest) {
            this.interest = interest;
            return this;
        }

        /**
         * Setter for fine.
         * @param  fine  GetFineResponse value for fine.
         * @return Builder
         */
        public Builder fine(GetFineResponse fine) {
            this.fine = fine;
            return this;
        }

        /**
         * Setter for maxDaysToPayPastDue.
         * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
         * @return Builder
         */
        public Builder maxDaysToPayPastDue(Integer maxDaysToPayPastDue) {
            this.maxDaysToPayPastDue = maxDaysToPayPastDue;
            return this;
        }

        /**
         * Builds a new {@link GetPixTransactionResponse} object using the set fields.
         * @return {@link GetPixTransactionResponse}
         */
        public GetPixTransactionResponse build() {
            return new GetPixTransactionResponse(gatewayId, amount, status, success, createdAt,
                    updatedAt, attemptCount, maxAttempts, splits, id, gatewayResponse,
                    antifraudResponse, split, qrCode, qrCodeUrl, expiresAt, additionalInformation,
                    payer, nextAttempt, transactionType, metadata, interest, fine,
                    maxDaysToPayPastDue);
        }
    }
}
