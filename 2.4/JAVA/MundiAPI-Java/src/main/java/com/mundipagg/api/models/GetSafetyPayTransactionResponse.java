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
 * This is a model class for GetSafetyPayTransactionResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "transaction_type",
        defaultImpl = GetSafetyPayTransactionResponse.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class GetSafetyPayTransactionResponse
        extends GetTransactionResponse {
    private String url;
    private String bankTid;
    private LocalDateTime paidAt;
    private Integer paidAmount;

    /**
     * Default constructor.
     */
    public GetSafetyPayTransactionResponse() {
        super();
        setTransactionType("safetypay");
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
     * @param  url  String value for url.
     * @param  bankTid  String value for bankTid.
     * @param  nextAttempt  LocalDateTime value for nextAttempt.
     * @param  transactionType  String value for transactionType.
     * @param  metadata  Map of String, value for metadata.
     * @param  interest  GetInterestResponse value for interest.
     * @param  fine  GetFineResponse value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     * @param  paidAt  LocalDateTime value for paidAt.
     * @param  paidAmount  Integer value for paidAmount.
     */
    public GetSafetyPayTransactionResponse(
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
            String url,
            String bankTid,
            LocalDateTime nextAttempt,
            String transactionType,
            Map<String, String> metadata,
            GetInterestResponse interest,
            GetFineResponse fine,
            Integer maxDaysToPayPastDue,
            LocalDateTime paidAt,
            Integer paidAmount) {
        super(gatewayId, amount, status, success, createdAt, updatedAt, attemptCount, maxAttempts,
                splits, id, gatewayResponse, antifraudResponse, split, nextAttempt, transactionType,
                metadata, interest, fine, maxDaysToPayPastDue);
        this.url = url;
        this.bankTid = bankTid;
        this.paidAt = paidAt;
        this.paidAmount = paidAmount;
    }

    /**
     * Getter for Url.
     * Payment url
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * Payment url
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for BankTid.
     * Transaction identifier on bank
     * @return Returns the String
     */
    @JsonGetter("bank_tid")
    public String getBankTid() {
        return bankTid;
    }

    /**
     * Setter for BankTid.
     * Transaction identifier on bank
     * @param bankTid Value for String
     */
    @JsonSetter("bank_tid")
    public void setBankTid(String bankTid) {
        this.bankTid = bankTid;
    }

    /**
     * Getter for PaidAt.
     * Payment date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("paid_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getPaidAt() {
        return paidAt;
    }

    /**
     * Setter for PaidAt.
     * Payment date
     * @param paidAt Value for LocalDateTime
     */
    @JsonSetter("paid_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setPaidAt(LocalDateTime paidAt) {
        this.paidAt = paidAt;
    }

    /**
     * Getter for PaidAmount.
     * Paid amount
     * @return Returns the Integer
     */
    @JsonGetter("paid_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaidAmount() {
        return paidAmount;
    }

    /**
     * Setter for PaidAmount.
     * Paid amount
     * @param paidAmount Value for Integer
     */
    @JsonSetter("paid_amount")
    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * Converts this GetSafetyPayTransactionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetSafetyPayTransactionResponse [" + "url=" + url + ", bankTid=" + bankTid
                + ", paidAt=" + paidAt + ", paidAmount=" + paidAmount + ", gatewayId="
                + getGatewayId() + ", amount=" + getAmount() + ", status=" + getStatus()
                + ", success=" + getSuccess() + ", createdAt=" + getCreatedAt() + ", updatedAt="
                + getUpdatedAt() + ", attemptCount=" + getAttemptCount() + ", maxAttempts="
                + getMaxAttempts() + ", splits=" + getSplits() + ", id=" + getId()
                + ", gatewayResponse=" + getGatewayResponse() + ", antifraudResponse="
                + getAntifraudResponse() + ", split=" + getSplit() + ", nextAttempt="
                + getNextAttempt() + ", transactionType=" + getTransactionType() + ", metadata="
                + getMetadata() + ", interest=" + getInterest() + ", fine=" + getFine()
                + ", maxDaysToPayPastDue=" + getMaxDaysToPayPastDue() + "]";
    }

    /**
     * Builds a new {@link GetSafetyPayTransactionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetSafetyPayTransactionResponse.Builder} object
     */
    public Builder toGetSafetyPayTransactionResponseBuilder() {
        Builder builder = new Builder(getGatewayId(), getAmount(), getStatus(), getSuccess(),
                getCreatedAt(), getUpdatedAt(), getAttemptCount(), getMaxAttempts(), getSplits(),
                getId(), getGatewayResponse(), getAntifraudResponse(), getSplit(), url, bankTid)
                .paidAt(getPaidAt())
                .paidAmount(getPaidAmount())
                .nextAttempt(getNextAttempt())
                .transactionType(getTransactionType())
                .metadata(getMetadata())
                .interest(getInterest())
                .fine(getFine())
                .maxDaysToPayPastDue(getMaxDaysToPayPastDue());
        return builder;
    }

    /**
     * Class to build instances of {@link GetSafetyPayTransactionResponse}.
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
        private String url;
        private String bankTid;
        private LocalDateTime nextAttempt;
        private String transactionType = "safetypay";
        private Map<String, String> metadata;
        private GetInterestResponse interest;
        private GetFineResponse fine;
        private Integer maxDaysToPayPastDue;
        private LocalDateTime paidAt;
        private Integer paidAmount;

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
         * @param  url  String value for url.
         * @param  bankTid  String value for bankTid.
         */
        public Builder(String gatewayId, int amount, String status, boolean success,
                LocalDateTime createdAt, LocalDateTime updatedAt, int attemptCount, int maxAttempts,
                List<GetSplitResponse> splits, String id,
                GetGatewayResponseResponse gatewayResponse, GetAntifraudResponse antifraudResponse,
                List<GetSplitResponse> split, String url, String bankTid) {
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
            this.url = url;
            this.bankTid = bankTid;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for bankTid.
         * @param  bankTid  String value for bankTid.
         * @return Builder
         */
        public Builder bankTid(String bankTid) {
            this.bankTid = bankTid;
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
         * Setter for paidAt.
         * @param  paidAt  LocalDateTime value for paidAt.
         * @return Builder
         */
        public Builder paidAt(LocalDateTime paidAt) {
            this.paidAt = paidAt;
            return this;
        }

        /**
         * Setter for paidAmount.
         * @param  paidAmount  Integer value for paidAmount.
         * @return Builder
         */
        public Builder paidAmount(Integer paidAmount) {
            this.paidAmount = paidAmount;
            return this;
        }

        /**
         * Builds a new {@link GetSafetyPayTransactionResponse} object using the set fields.
         * @return {@link GetSafetyPayTransactionResponse}
         */
        public GetSafetyPayTransactionResponse build() {
            return new GetSafetyPayTransactionResponse(gatewayId, amount, status, success,
                    createdAt, updatedAt, attemptCount, maxAttempts, splits, id, gatewayResponse,
                    antifraudResponse, split, url, bankTid, nextAttempt, transactionType, metadata,
                    interest, fine, maxDaysToPayPastDue, paidAt, paidAmount);
        }
    }
}
