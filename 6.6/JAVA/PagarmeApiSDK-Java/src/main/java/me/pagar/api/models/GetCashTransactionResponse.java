/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetCashTransactionResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "transaction_type",
        defaultImpl = GetCashTransactionResponse.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class GetCashTransactionResponse
        extends GetTransactionResponse {
    private String description;

    /**
     * Default constructor.
     */
    public GetCashTransactionResponse() {
        super();
        setTransactionType("cash");
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
     * @param  description  String value for description.
     * @param  nextAttempt  LocalDateTime value for nextAttempt.
     * @param  transactionType  String value for transactionType.
     * @param  metadata  Map of String, value for metadata.
     * @param  interest  GetInterestResponse value for interest.
     * @param  fine  GetFineResponse value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     */
    public GetCashTransactionResponse(
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
            String description,
            LocalDateTime nextAttempt,
            String transactionType,
            Map<String, String> metadata,
            GetInterestResponse interest,
            GetFineResponse fine,
            Integer maxDaysToPayPastDue) {
        super(gatewayId, amount, status, success, createdAt, updatedAt, attemptCount, maxAttempts,
                splits, id, gatewayResponse, antifraudResponse, split, nextAttempt, transactionType,
                metadata, interest, fine, maxDaysToPayPastDue);
        this.description = description;
    }

    /**
     * Getter for Description.
     * Description
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Converts this GetCashTransactionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCashTransactionResponse [" + "description=" + description + ", gatewayId="
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
     * Builds a new {@link GetCashTransactionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCashTransactionResponse.Builder} object
     */
    public Builder toGetCashTransactionResponseBuilder() {
        Builder builder = new Builder(getGatewayId(), getAmount(), getStatus(), getSuccess(),
                getCreatedAt(), getUpdatedAt(), getAttemptCount(), getMaxAttempts(), getSplits(),
                getId(), getGatewayResponse(), getAntifraudResponse(), getSplit(), description)
                .nextAttempt(getNextAttempt())
                .transactionType(getTransactionType())
                .metadata(getMetadata())
                .interest(getInterest())
                .fine(getFine())
                .maxDaysToPayPastDue(getMaxDaysToPayPastDue());
        return builder;
    }

    /**
     * Class to build instances of {@link GetCashTransactionResponse}.
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
        private String description;
        private LocalDateTime nextAttempt;
        private String transactionType = "cash";
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
         * @param  description  String value for description.
         */
        public Builder(String gatewayId, int amount, String status, boolean success,
                LocalDateTime createdAt, LocalDateTime updatedAt, int attemptCount, int maxAttempts,
                List<GetSplitResponse> splits, String id,
                GetGatewayResponseResponse gatewayResponse, GetAntifraudResponse antifraudResponse,
                List<GetSplitResponse> split, String description) {
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
            this.description = description;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
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
         * Builds a new {@link GetCashTransactionResponse} object using the set fields.
         * @return {@link GetCashTransactionResponse}
         */
        public GetCashTransactionResponse build() {
            return new GetCashTransactionResponse(gatewayId, amount, status, success, createdAt,
                    updatedAt, attemptCount, maxAttempts, splits, id, gatewayResponse,
                    antifraudResponse, split, description, nextAttempt, transactionType, metadata,
                    interest, fine, maxDaysToPayPastDue);
        }
    }
}
