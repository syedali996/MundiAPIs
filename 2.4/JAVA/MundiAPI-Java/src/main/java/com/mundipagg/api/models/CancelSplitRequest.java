/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CancelSplitRequest type.
 */
public class CancelSplitRequest {
    private String type;
    private int amount;
    private String recipientId;
    private CreateSplitOptionsRequest options;
    private String splitRuleId;

    /**
     * Default constructor.
     */
    public CancelSplitRequest() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  amount  int value for amount.
     * @param  recipientId  String value for recipientId.
     * @param  options  CreateSplitOptionsRequest value for options.
     * @param  splitRuleId  String value for splitRuleId.
     */
    public CancelSplitRequest(
            String type,
            int amount,
            String recipientId,
            CreateSplitOptionsRequest options,
            String splitRuleId) {
        this.type = type;
        this.amount = amount;
        this.recipientId = recipientId;
        this.options = options;
        this.splitRuleId = splitRuleId;
    }

    /**
     * Getter for Type.
     * Split type
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Split type
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Amount.
     * Amount
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for RecipientId.
     * Recipient id
     * @return Returns the String
     */
    @JsonGetter("recipient_id")
    public String getRecipientId() {
        return recipientId;
    }

    /**
     * Setter for RecipientId.
     * Recipient id
     * @param recipientId Value for String
     */
    @JsonSetter("recipient_id")
    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    /**
     * Getter for Options.
     * The split options request
     * @return Returns the CreateSplitOptionsRequest
     */
    @JsonGetter("options")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSplitOptionsRequest getOptions() {
        return options;
    }

    /**
     * Setter for Options.
     * The split options request
     * @param options Value for CreateSplitOptionsRequest
     */
    @JsonSetter("options")
    public void setOptions(CreateSplitOptionsRequest options) {
        this.options = options;
    }

    /**
     * Getter for SplitRuleId.
     * Rule id
     * @return Returns the String
     */
    @JsonGetter("split_rule_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSplitRuleId() {
        return splitRuleId;
    }

    /**
     * Setter for SplitRuleId.
     * Rule id
     * @param splitRuleId Value for String
     */
    @JsonSetter("split_rule_id")
    public void setSplitRuleId(String splitRuleId) {
        this.splitRuleId = splitRuleId;
    }

    /**
     * Converts this CancelSplitRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CancelSplitRequest [" + "type=" + type + ", amount=" + amount + ", recipientId="
                + recipientId + ", options=" + options + ", splitRuleId=" + splitRuleId + "]";
    }

    /**
     * Builds a new {@link CancelSplitRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CancelSplitRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, amount, recipientId)
                .options(getOptions())
                .splitRuleId(getSplitRuleId());
        return builder;
    }

    /**
     * Class to build instances of {@link CancelSplitRequest}.
     */
    public static class Builder {
        private String type;
        private int amount;
        private String recipientId;
        private CreateSplitOptionsRequest options;
        private String splitRuleId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         * @param  amount  int value for amount.
         * @param  recipientId  String value for recipientId.
         */
        public Builder(String type, int amount, String recipientId) {
            this.type = type;
            this.amount = amount;
            this.recipientId = recipientId;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
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
         * Setter for recipientId.
         * @param  recipientId  String value for recipientId.
         * @return Builder
         */
        public Builder recipientId(String recipientId) {
            this.recipientId = recipientId;
            return this;
        }

        /**
         * Setter for options.
         * @param  options  CreateSplitOptionsRequest value for options.
         * @return Builder
         */
        public Builder options(CreateSplitOptionsRequest options) {
            this.options = options;
            return this;
        }

        /**
         * Setter for splitRuleId.
         * @param  splitRuleId  String value for splitRuleId.
         * @return Builder
         */
        public Builder splitRuleId(String splitRuleId) {
            this.splitRuleId = splitRuleId;
            return this;
        }

        /**
         * Builds a new {@link CancelSplitRequest} object using the set fields.
         * @return {@link CancelSplitRequest}
         */
        public CancelSplitRequest build() {
            return new CancelSplitRequest(type, amount, recipientId, options, splitRuleId);
        }
    }
}
