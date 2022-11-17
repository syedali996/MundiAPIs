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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mundipagg.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for GetTransactionResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "transaction_type",
        defaultImpl = GetTransactionResponse.class,
        visible = true)
@JsonSubTypes({
    @Type(value = GetBankTransferTransactionResponse.class, name = "bank_transfer"),
    @Type(value = GetDebitCardTransactionResponse.class, name = "debit_card"),
    @Type(value = GetVoucherTransactionResponse.class, name = "voucher"),
    @Type(value = GetBoletoTransactionResponse.class, name = "boleto"),
    @Type(value = GetCashTransactionResponse.class, name = "cash"),
    @Type(value = GetSafetyPayTransactionResponse.class, name = "safetypay"),
    @Type(value = GetCreditCardTransactionResponse.class, name = "credit_card"),
    @Type(value = GetPrivateLabelTransactionResponse.class, name = "private_label"),
    @Type(value = GetPixTransactionResponse.class, name = "pix")
})
@JsonInclude(Include.ALWAYS)
public class GetTransactionResponse {
    private String gatewayId;
    private int amount;
    private String status;
    private boolean success;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int attemptCount;
    private int maxAttempts;
    private List<GetSplitResponse> splits;
    private LocalDateTime nextAttempt;
    private String transactionType;
    private String id;
    private GetGatewayResponseResponse gatewayResponse;
    private GetAntifraudResponse antifraudResponse;
    private Map<String, String> metadata;
    private List<GetSplitResponse> split;
    private GetInterestResponse interest;
    private GetFineResponse fine;
    private Integer maxDaysToPayPastDue;

    /**
     * Default constructor.
     */
    public GetTransactionResponse() {
        setTransactionType("transaction");
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
     * @param  nextAttempt  LocalDateTime value for nextAttempt.
     * @param  transactionType  String value for transactionType.
     * @param  metadata  Map of String, value for metadata.
     * @param  interest  GetInterestResponse value for interest.
     * @param  fine  GetFineResponse value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     */
    public GetTransactionResponse(
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
            LocalDateTime nextAttempt,
            String transactionType,
            Map<String, String> metadata,
            GetInterestResponse interest,
            GetFineResponse fine,
            Integer maxDaysToPayPastDue) {
        this.gatewayId = gatewayId;
        this.amount = amount;
        this.status = status;
        this.success = success;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.attemptCount = attemptCount;
        this.maxAttempts = maxAttempts;
        this.splits = splits;
        this.nextAttempt = nextAttempt;
        this.transactionType = transactionType;
        this.id = id;
        this.gatewayResponse = gatewayResponse;
        this.antifraudResponse = antifraudResponse;
        this.metadata = metadata;
        this.split = split;
        this.interest = interest;
        this.fine = fine;
        this.maxDaysToPayPastDue = maxDaysToPayPastDue;
    }

    /**
     * Getter for GatewayId.
     * Gateway transaction id
     * @return Returns the String
     */
    @JsonGetter("gateway_id")
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * Setter for GatewayId.
     * Gateway transaction id
     * @param gatewayId Value for String
     */
    @JsonSetter("gateway_id")
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * Getter for Amount.
     * Amount in cents
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount in cents
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for Status.
     * Transaction status
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Transaction status
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Success.
     * Indicates if the transaction ocurred successfuly
     * @return Returns the boolean
     */
    @JsonGetter("success")
    public boolean getSuccess() {
        return success;
    }

    /**
     * Setter for Success.
     * Indicates if the transaction ocurred successfuly
     * @param success Value for boolean
     */
    @JsonSetter("success")
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Getter for CreatedAt.
     * Creation date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Creation date
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * Last update date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * Last update date
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for AttemptCount.
     * Number of attempts tried
     * @return Returns the int
     */
    @JsonGetter("attempt_count")
    public int getAttemptCount() {
        return attemptCount;
    }

    /**
     * Setter for AttemptCount.
     * Number of attempts tried
     * @param attemptCount Value for int
     */
    @JsonSetter("attempt_count")
    public void setAttemptCount(int attemptCount) {
        this.attemptCount = attemptCount;
    }

    /**
     * Getter for MaxAttempts.
     * Max attempts
     * @return Returns the int
     */
    @JsonGetter("max_attempts")
    public int getMaxAttempts() {
        return maxAttempts;
    }

    /**
     * Setter for MaxAttempts.
     * Max attempts
     * @param maxAttempts Value for int
     */
    @JsonSetter("max_attempts")
    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    /**
     * Getter for Splits.
     * Splits
     * @return Returns the List of GetSplitResponse
     */
    @JsonGetter("splits")
    public List<GetSplitResponse> getSplits() {
        return splits;
    }

    /**
     * Setter for Splits.
     * Splits
     * @param splits Value for List of GetSplitResponse
     */
    @JsonSetter("splits")
    public void setSplits(List<GetSplitResponse> splits) {
        this.splits = splits;
    }

    /**
     * Getter for NextAttempt.
     * Date and time of the next attempt
     * @return Returns the LocalDateTime
     */
    @JsonGetter("next_attempt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getNextAttempt() {
        return nextAttempt;
    }

    /**
     * Setter for NextAttempt.
     * Date and time of the next attempt
     * @param nextAttempt Value for LocalDateTime
     */
    @JsonSetter("next_attempt")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNextAttempt(LocalDateTime nextAttempt) {
        this.nextAttempt = nextAttempt;
    }

    /**
     * Getter for TransactionType.
     * @return Returns the String
     */
    @JsonGetter("transaction_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Setter for TransactionType.
     * @param transactionType Value for String
     */
    @JsonSetter("transaction_type")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Getter for Id.
     * Código da transação
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Código da transação
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for GatewayResponse.
     * The Gateway Response
     * @return Returns the GetGatewayResponseResponse
     */
    @JsonGetter("gateway_response")
    public GetGatewayResponseResponse getGatewayResponse() {
        return gatewayResponse;
    }

    /**
     * Setter for GatewayResponse.
     * The Gateway Response
     * @param gatewayResponse Value for GetGatewayResponseResponse
     */
    @JsonSetter("gateway_response")
    public void setGatewayResponse(GetGatewayResponseResponse gatewayResponse) {
        this.gatewayResponse = gatewayResponse;
    }

    /**
     * Getter for AntifraudResponse.
     * @return Returns the GetAntifraudResponse
     */
    @JsonGetter("antifraud_response")
    public GetAntifraudResponse getAntifraudResponse() {
        return antifraudResponse;
    }

    /**
     * Setter for AntifraudResponse.
     * @param antifraudResponse Value for GetAntifraudResponse
     */
    @JsonSetter("antifraud_response")
    public void setAntifraudResponse(GetAntifraudResponse antifraudResponse) {
        this.antifraudResponse = antifraudResponse;
    }

    /**
     * Getter for Metadata.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Split.
     * @return Returns the List of GetSplitResponse
     */
    @JsonGetter("split")
    public List<GetSplitResponse> getSplit() {
        return split;
    }

    /**
     * Setter for Split.
     * @param split Value for List of GetSplitResponse
     */
    @JsonSetter("split")
    public void setSplit(List<GetSplitResponse> split) {
        this.split = split;
    }

    /**
     * Getter for Interest.
     * @return Returns the GetInterestResponse
     */
    @JsonGetter("interest")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetInterestResponse getInterest() {
        return interest;
    }

    /**
     * Setter for Interest.
     * @param interest Value for GetInterestResponse
     */
    @JsonSetter("interest")
    public void setInterest(GetInterestResponse interest) {
        this.interest = interest;
    }

    /**
     * Getter for Fine.
     * @return Returns the GetFineResponse
     */
    @JsonGetter("fine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetFineResponse getFine() {
        return fine;
    }

    /**
     * Setter for Fine.
     * @param fine Value for GetFineResponse
     */
    @JsonSetter("fine")
    public void setFine(GetFineResponse fine) {
        this.fine = fine;
    }

    /**
     * Getter for MaxDaysToPayPastDue.
     * @return Returns the Integer
     */
    @JsonGetter("max_days_to_pay_past_due")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMaxDaysToPayPastDue() {
        return maxDaysToPayPastDue;
    }

    /**
     * Setter for MaxDaysToPayPastDue.
     * @param maxDaysToPayPastDue Value for Integer
     */
    @JsonSetter("max_days_to_pay_past_due")
    public void setMaxDaysToPayPastDue(Integer maxDaysToPayPastDue) {
        this.maxDaysToPayPastDue = maxDaysToPayPastDue;
    }

    /**
     * Converts this GetTransactionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetTransactionResponse [" + "gatewayId=" + gatewayId + ", amount=" + amount
                + ", status=" + status + ", success=" + success + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", attemptCount=" + attemptCount + ", maxAttempts="
                + maxAttempts + ", splits=" + splits + ", id=" + id + ", gatewayResponse="
                + gatewayResponse + ", antifraudResponse=" + antifraudResponse + ", split=" + split
                + ", nextAttempt=" + nextAttempt + ", transactionType=" + transactionType
                + ", metadata=" + metadata + ", interest=" + interest + ", fine=" + fine
                + ", maxDaysToPayPastDue=" + maxDaysToPayPastDue + "]";
    }

    /**
     * Builds a new {@link GetTransactionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetTransactionResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(gatewayId, amount, status, success, createdAt, updatedAt,
                attemptCount, maxAttempts, splits, id, gatewayResponse, antifraudResponse, split)
                .nextAttempt(getNextAttempt())
                .transactionType(getTransactionType())
                .metadata(getMetadata())
                .interest(getInterest())
                .fine(getFine())
                .maxDaysToPayPastDue(getMaxDaysToPayPastDue());
        return builder;
    }

    /**
     * Class to build instances of {@link GetTransactionResponse}.
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
        private LocalDateTime nextAttempt;
        private String transactionType = "transaction";
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
         */
        public Builder(String gatewayId, int amount, String status, boolean success,
                LocalDateTime createdAt, LocalDateTime updatedAt, int attemptCount, int maxAttempts,
                List<GetSplitResponse> splits, String id,
                GetGatewayResponseResponse gatewayResponse, GetAntifraudResponse antifraudResponse,
                List<GetSplitResponse> split) {
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
         * Builds a new {@link GetTransactionResponse} object using the set fields.
         * @return {@link GetTransactionResponse}
         */
        public GetTransactionResponse build() {
            return new GetTransactionResponse(gatewayId, amount, status, success, createdAt,
                    updatedAt, attemptCount, maxAttempts, splits, id, gatewayResponse,
                    antifraudResponse, split, nextAttempt, transactionType, metadata, interest,
                    fine, maxDaysToPayPastDue);
        }
    }
}
