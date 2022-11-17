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
 * This is a model class for GetVoucherTransactionResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "transaction_type",
        defaultImpl = GetVoucherTransactionResponse.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class GetVoucherTransactionResponse
        extends GetTransactionResponse {
    private String statementDescriptor;
    private String acquirerName;
    private String acquirerAffiliationCode;
    private String acquirerTid;
    private String acquirerNsu;
    private String acquirerAuthCode;
    private String acquirerMessage;
    private String acquirerReturnCode;
    private String operationType;
    private GetCardResponse card;

    /**
     * Default constructor.
     */
    public GetVoucherTransactionResponse() {
        super();
        setTransactionType("voucher");
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
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  acquirerName  String value for acquirerName.
     * @param  acquirerAffiliationCode  String value for acquirerAffiliationCode.
     * @param  acquirerTid  String value for acquirerTid.
     * @param  acquirerNsu  String value for acquirerNsu.
     * @param  acquirerAuthCode  String value for acquirerAuthCode.
     * @param  acquirerMessage  String value for acquirerMessage.
     * @param  acquirerReturnCode  String value for acquirerReturnCode.
     * @param  operationType  String value for operationType.
     * @param  card  GetCardResponse value for card.
     * @param  nextAttempt  LocalDateTime value for nextAttempt.
     * @param  transactionType  String value for transactionType.
     * @param  metadata  Map of String, value for metadata.
     * @param  interest  GetInterestResponse value for interest.
     * @param  fine  GetFineResponse value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     */
    public GetVoucherTransactionResponse(
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
            String statementDescriptor,
            String acquirerName,
            String acquirerAffiliationCode,
            String acquirerTid,
            String acquirerNsu,
            String acquirerAuthCode,
            String acquirerMessage,
            String acquirerReturnCode,
            String operationType,
            GetCardResponse card,
            LocalDateTime nextAttempt,
            String transactionType,
            Map<String, String> metadata,
            GetInterestResponse interest,
            GetFineResponse fine,
            Integer maxDaysToPayPastDue) {
        super(gatewayId, amount, status, success, createdAt, updatedAt, attemptCount, maxAttempts,
                splits, id, gatewayResponse, antifraudResponse, split, nextAttempt, transactionType,
                metadata, interest, fine, maxDaysToPayPastDue);
        this.statementDescriptor = statementDescriptor;
        this.acquirerName = acquirerName;
        this.acquirerAffiliationCode = acquirerAffiliationCode;
        this.acquirerTid = acquirerTid;
        this.acquirerNsu = acquirerNsu;
        this.acquirerAuthCode = acquirerAuthCode;
        this.acquirerMessage = acquirerMessage;
        this.acquirerReturnCode = acquirerReturnCode;
        this.operationType = operationType;
        this.card = card;
    }

    /**
     * Getter for StatementDescriptor.
     * Text that will appear on the voucher's statement
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * Text that will appear on the voucher's statement
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for AcquirerName.
     * Acquirer name
     * @return Returns the String
     */
    @JsonGetter("acquirer_name")
    public String getAcquirerName() {
        return acquirerName;
    }

    /**
     * Setter for AcquirerName.
     * Acquirer name
     * @param acquirerName Value for String
     */
    @JsonSetter("acquirer_name")
    public void setAcquirerName(String acquirerName) {
        this.acquirerName = acquirerName;
    }

    /**
     * Getter for AcquirerAffiliationCode.
     * Acquirer affiliation code
     * @return Returns the String
     */
    @JsonGetter("acquirer_affiliation_code")
    public String getAcquirerAffiliationCode() {
        return acquirerAffiliationCode;
    }

    /**
     * Setter for AcquirerAffiliationCode.
     * Acquirer affiliation code
     * @param acquirerAffiliationCode Value for String
     */
    @JsonSetter("acquirer_affiliation_code")
    public void setAcquirerAffiliationCode(String acquirerAffiliationCode) {
        this.acquirerAffiliationCode = acquirerAffiliationCode;
    }

    /**
     * Getter for AcquirerTid.
     * Acquirer TID
     * @return Returns the String
     */
    @JsonGetter("acquirer_tid")
    public String getAcquirerTid() {
        return acquirerTid;
    }

    /**
     * Setter for AcquirerTid.
     * Acquirer TID
     * @param acquirerTid Value for String
     */
    @JsonSetter("acquirer_tid")
    public void setAcquirerTid(String acquirerTid) {
        this.acquirerTid = acquirerTid;
    }

    /**
     * Getter for AcquirerNsu.
     * Acquirer NSU
     * @return Returns the String
     */
    @JsonGetter("acquirer_nsu")
    public String getAcquirerNsu() {
        return acquirerNsu;
    }

    /**
     * Setter for AcquirerNsu.
     * Acquirer NSU
     * @param acquirerNsu Value for String
     */
    @JsonSetter("acquirer_nsu")
    public void setAcquirerNsu(String acquirerNsu) {
        this.acquirerNsu = acquirerNsu;
    }

    /**
     * Getter for AcquirerAuthCode.
     * Acquirer authorization code
     * @return Returns the String
     */
    @JsonGetter("acquirer_auth_code")
    public String getAcquirerAuthCode() {
        return acquirerAuthCode;
    }

    /**
     * Setter for AcquirerAuthCode.
     * Acquirer authorization code
     * @param acquirerAuthCode Value for String
     */
    @JsonSetter("acquirer_auth_code")
    public void setAcquirerAuthCode(String acquirerAuthCode) {
        this.acquirerAuthCode = acquirerAuthCode;
    }

    /**
     * Getter for AcquirerMessage.
     * acquirer_message
     * @return Returns the String
     */
    @JsonGetter("acquirer_message")
    public String getAcquirerMessage() {
        return acquirerMessage;
    }

    /**
     * Setter for AcquirerMessage.
     * acquirer_message
     * @param acquirerMessage Value for String
     */
    @JsonSetter("acquirer_message")
    public void setAcquirerMessage(String acquirerMessage) {
        this.acquirerMessage = acquirerMessage;
    }

    /**
     * Getter for AcquirerReturnCode.
     * Acquirer return code
     * @return Returns the String
     */
    @JsonGetter("acquirer_return_code")
    public String getAcquirerReturnCode() {
        return acquirerReturnCode;
    }

    /**
     * Setter for AcquirerReturnCode.
     * Acquirer return code
     * @param acquirerReturnCode Value for String
     */
    @JsonSetter("acquirer_return_code")
    public void setAcquirerReturnCode(String acquirerReturnCode) {
        this.acquirerReturnCode = acquirerReturnCode;
    }

    /**
     * Getter for OperationType.
     * Operation type
     * @return Returns the String
     */
    @JsonGetter("operation_type")
    public String getOperationType() {
        return operationType;
    }

    /**
     * Setter for OperationType.
     * Operation type
     * @param operationType Value for String
     */
    @JsonSetter("operation_type")
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * Getter for Card.
     * Card data
     * @return Returns the GetCardResponse
     */
    @JsonGetter("card")
    public GetCardResponse getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Card data
     * @param card Value for GetCardResponse
     */
    @JsonSetter("card")
    public void setCard(GetCardResponse card) {
        this.card = card;
    }

    /**
     * Converts this GetVoucherTransactionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetVoucherTransactionResponse [" + "statementDescriptor=" + statementDescriptor
                + ", acquirerName=" + acquirerName + ", acquirerAffiliationCode="
                + acquirerAffiliationCode + ", acquirerTid=" + acquirerTid + ", acquirerNsu="
                + acquirerNsu + ", acquirerAuthCode=" + acquirerAuthCode + ", acquirerMessage="
                + acquirerMessage + ", acquirerReturnCode=" + acquirerReturnCode
                + ", operationType=" + operationType + ", card=" + card + ", gatewayId="
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
     * Builds a new {@link GetVoucherTransactionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetVoucherTransactionResponse.Builder} object
     */
    public Builder toGetVoucherTransactionResponseBuilder() {
        Builder builder = new Builder(getGatewayId(), getAmount(), getStatus(), getSuccess(),
                getCreatedAt(), getUpdatedAt(), getAttemptCount(), getMaxAttempts(), getSplits(),
                getId(), getGatewayResponse(), getAntifraudResponse(), getSplit(),
                statementDescriptor, acquirerName, acquirerAffiliationCode, acquirerTid,
                acquirerNsu, acquirerAuthCode, acquirerMessage, acquirerReturnCode, operationType,
                card)
                .nextAttempt(getNextAttempt())
                .transactionType(getTransactionType())
                .metadata(getMetadata())
                .interest(getInterest())
                .fine(getFine())
                .maxDaysToPayPastDue(getMaxDaysToPayPastDue());
        return builder;
    }

    /**
     * Class to build instances of {@link GetVoucherTransactionResponse}.
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
        private String statementDescriptor;
        private String acquirerName;
        private String acquirerAffiliationCode;
        private String acquirerTid;
        private String acquirerNsu;
        private String acquirerAuthCode;
        private String acquirerMessage;
        private String acquirerReturnCode;
        private String operationType;
        private GetCardResponse card;
        private LocalDateTime nextAttempt;
        private String transactionType = "voucher";
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
         * @param  statementDescriptor  String value for statementDescriptor.
         * @param  acquirerName  String value for acquirerName.
         * @param  acquirerAffiliationCode  String value for acquirerAffiliationCode.
         * @param  acquirerTid  String value for acquirerTid.
         * @param  acquirerNsu  String value for acquirerNsu.
         * @param  acquirerAuthCode  String value for acquirerAuthCode.
         * @param  acquirerMessage  String value for acquirerMessage.
         * @param  acquirerReturnCode  String value for acquirerReturnCode.
         * @param  operationType  String value for operationType.
         * @param  card  GetCardResponse value for card.
         */
        public Builder(String gatewayId, int amount, String status, boolean success,
                LocalDateTime createdAt, LocalDateTime updatedAt, int attemptCount, int maxAttempts,
                List<GetSplitResponse> splits, String id,
                GetGatewayResponseResponse gatewayResponse, GetAntifraudResponse antifraudResponse,
                List<GetSplitResponse> split, String statementDescriptor, String acquirerName,
                String acquirerAffiliationCode, String acquirerTid, String acquirerNsu,
                String acquirerAuthCode, String acquirerMessage, String acquirerReturnCode,
                String operationType, GetCardResponse card) {
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
            this.statementDescriptor = statementDescriptor;
            this.acquirerName = acquirerName;
            this.acquirerAffiliationCode = acquirerAffiliationCode;
            this.acquirerTid = acquirerTid;
            this.acquirerNsu = acquirerNsu;
            this.acquirerAuthCode = acquirerAuthCode;
            this.acquirerMessage = acquirerMessage;
            this.acquirerReturnCode = acquirerReturnCode;
            this.operationType = operationType;
            this.card = card;
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
         * Setter for statementDescriptor.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @return Builder
         */
        public Builder statementDescriptor(String statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
            return this;
        }

        /**
         * Setter for acquirerName.
         * @param  acquirerName  String value for acquirerName.
         * @return Builder
         */
        public Builder acquirerName(String acquirerName) {
            this.acquirerName = acquirerName;
            return this;
        }

        /**
         * Setter for acquirerAffiliationCode.
         * @param  acquirerAffiliationCode  String value for acquirerAffiliationCode.
         * @return Builder
         */
        public Builder acquirerAffiliationCode(String acquirerAffiliationCode) {
            this.acquirerAffiliationCode = acquirerAffiliationCode;
            return this;
        }

        /**
         * Setter for acquirerTid.
         * @param  acquirerTid  String value for acquirerTid.
         * @return Builder
         */
        public Builder acquirerTid(String acquirerTid) {
            this.acquirerTid = acquirerTid;
            return this;
        }

        /**
         * Setter for acquirerNsu.
         * @param  acquirerNsu  String value for acquirerNsu.
         * @return Builder
         */
        public Builder acquirerNsu(String acquirerNsu) {
            this.acquirerNsu = acquirerNsu;
            return this;
        }

        /**
         * Setter for acquirerAuthCode.
         * @param  acquirerAuthCode  String value for acquirerAuthCode.
         * @return Builder
         */
        public Builder acquirerAuthCode(String acquirerAuthCode) {
            this.acquirerAuthCode = acquirerAuthCode;
            return this;
        }

        /**
         * Setter for acquirerMessage.
         * @param  acquirerMessage  String value for acquirerMessage.
         * @return Builder
         */
        public Builder acquirerMessage(String acquirerMessage) {
            this.acquirerMessage = acquirerMessage;
            return this;
        }

        /**
         * Setter for acquirerReturnCode.
         * @param  acquirerReturnCode  String value for acquirerReturnCode.
         * @return Builder
         */
        public Builder acquirerReturnCode(String acquirerReturnCode) {
            this.acquirerReturnCode = acquirerReturnCode;
            return this;
        }

        /**
         * Setter for operationType.
         * @param  operationType  String value for operationType.
         * @return Builder
         */
        public Builder operationType(String operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * Setter for card.
         * @param  card  GetCardResponse value for card.
         * @return Builder
         */
        public Builder card(GetCardResponse card) {
            this.card = card;
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
         * Builds a new {@link GetVoucherTransactionResponse} object using the set fields.
         * @return {@link GetVoucherTransactionResponse}
         */
        public GetVoucherTransactionResponse build() {
            return new GetVoucherTransactionResponse(gatewayId, amount, status, success, createdAt,
                    updatedAt, attemptCount, maxAttempts, splits, id, gatewayResponse,
                    antifraudResponse, split, statementDescriptor, acquirerName,
                    acquirerAffiliationCode, acquirerTid, acquirerNsu, acquirerAuthCode,
                    acquirerMessage, acquirerReturnCode, operationType, card, nextAttempt,
                    transactionType, metadata, interest, fine, maxDaysToPayPastDue);
        }
    }
}
