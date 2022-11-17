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
import java.util.Map;

/**
 * This is a model class for CreateTransfer type.
 */
public class CreateTransfer {
    private int amount;
    private String sourceId;
    private String targetId;
    private Map<String, String> metadata;

    /**
     * Default constructor.
     */
    public CreateTransfer() {
    }

    /**
     * Initialization constructor.
     * @param  amount  int value for amount.
     * @param  sourceId  String value for sourceId.
     * @param  targetId  String value for targetId.
     * @param  metadata  Map of String, value for metadata.
     */
    public CreateTransfer(
            int amount,
            String sourceId,
            String targetId,
            Map<String, String> metadata) {
        this.amount = amount;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.metadata = metadata;
    }

    /**
     * Getter for Amount.
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for SourceId.
     * @return Returns the String
     */
    @JsonGetter("source_id")
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Setter for SourceId.
     * @param sourceId Value for String
     */
    @JsonSetter("source_id")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * Getter for TargetId.
     * @return Returns the String
     */
    @JsonGetter("target_id")
    public String getTargetId() {
        return targetId;
    }

    /**
     * Setter for TargetId.
     * @param targetId Value for String
     */
    @JsonSetter("target_id")
    public void setTargetId(String targetId) {
        this.targetId = targetId;
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
     * Converts this CreateTransfer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateTransfer [" + "amount=" + amount + ", sourceId=" + sourceId + ", targetId="
                + targetId + ", metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link CreateTransfer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateTransfer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, sourceId, targetId)
                .metadata(getMetadata());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateTransfer}.
     */
    public static class Builder {
        private int amount;
        private String sourceId;
        private String targetId;
        private Map<String, String> metadata;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  int value for amount.
         * @param  sourceId  String value for sourceId.
         * @param  targetId  String value for targetId.
         */
        public Builder(int amount, String sourceId, String targetId) {
            this.amount = amount;
            this.sourceId = sourceId;
            this.targetId = targetId;
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
         * Setter for sourceId.
         * @param  sourceId  String value for sourceId.
         * @return Builder
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * Setter for targetId.
         * @param  targetId  String value for targetId.
         * @return Builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
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
         * Builds a new {@link CreateTransfer} object using the set fields.
         * @return {@link CreateTransfer}
         */
        public CreateTransfer build() {
            return new CreateTransfer(amount, sourceId, targetId, metadata);
        }
    }
}
