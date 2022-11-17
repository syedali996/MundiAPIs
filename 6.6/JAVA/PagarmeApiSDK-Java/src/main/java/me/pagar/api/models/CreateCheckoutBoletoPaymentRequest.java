/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for CreateCheckoutBoletoPaymentRequest type.
 */
public class CreateCheckoutBoletoPaymentRequest {
    private String bank;
    private String instructions;
    private LocalDateTime dueAt;

    /**
     * Default constructor.
     */
    public CreateCheckoutBoletoPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  bank  String value for bank.
     * @param  instructions  String value for instructions.
     * @param  dueAt  LocalDateTime value for dueAt.
     */
    public CreateCheckoutBoletoPaymentRequest(
            String bank,
            String instructions,
            LocalDateTime dueAt) {
        this.bank = bank;
        this.instructions = instructions;
        this.dueAt = dueAt;
    }

    /**
     * Getter for Bank.
     * Bank identifier
     * @return Returns the String
     */
    @JsonGetter("bank")
    public String getBank() {
        return bank;
    }

    /**
     * Setter for Bank.
     * Bank identifier
     * @param bank Value for String
     */
    @JsonSetter("bank")
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * Getter for Instructions.
     * Instructions
     * @return Returns the String
     */
    @JsonGetter("instructions")
    public String getInstructions() {
        return instructions;
    }

    /**
     * Setter for Instructions.
     * Instructions
     * @param instructions Value for String
     */
    @JsonSetter("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * Getter for DueAt.
     * Due date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("due_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDueAt() {
        return dueAt;
    }

    /**
     * Setter for DueAt.
     * Due date
     * @param dueAt Value for LocalDateTime
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = dueAt;
    }

    /**
     * Converts this CreateCheckoutBoletoPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCheckoutBoletoPaymentRequest [" + "bank=" + bank + ", instructions="
                + instructions + ", dueAt=" + dueAt + "]";
    }

    /**
     * Builds a new {@link CreateCheckoutBoletoPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCheckoutBoletoPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(bank, instructions, dueAt);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCheckoutBoletoPaymentRequest}.
     */
    public static class Builder {
        private String bank;
        private String instructions;
        private LocalDateTime dueAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  bank  String value for bank.
         * @param  instructions  String value for instructions.
         * @param  dueAt  LocalDateTime value for dueAt.
         */
        public Builder(String bank, String instructions, LocalDateTime dueAt) {
            this.bank = bank;
            this.instructions = instructions;
            this.dueAt = dueAt;
        }

        /**
         * Setter for bank.
         * @param  bank  String value for bank.
         * @return Builder
         */
        public Builder bank(String bank) {
            this.bank = bank;
            return this;
        }

        /**
         * Setter for instructions.
         * @param  instructions  String value for instructions.
         * @return Builder
         */
        public Builder instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }

        /**
         * Setter for dueAt.
         * @param  dueAt  LocalDateTime value for dueAt.
         * @return Builder
         */
        public Builder dueAt(LocalDateTime dueAt) {
            this.dueAt = dueAt;
            return this;
        }

        /**
         * Builds a new {@link CreateCheckoutBoletoPaymentRequest} object using the set fields.
         * @return {@link CreateCheckoutBoletoPaymentRequest}
         */
        public CreateCheckoutBoletoPaymentRequest build() {
            return new CreateCheckoutBoletoPaymentRequest(bank, instructions, dueAt);
        }
    }
}