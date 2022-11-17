/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateSetupRequest type.
 */
public class CreateSetupRequest {
    private int amount;
    private String description;
    private CreatePaymentRequest payment;

    /**
     * Default constructor.
     */
    public CreateSetupRequest() {
    }

    /**
     * Initialization constructor.
     * @param  amount  int value for amount.
     * @param  description  String value for description.
     * @param  payment  CreatePaymentRequest value for payment.
     */
    public CreateSetupRequest(
            int amount,
            String description,
            CreatePaymentRequest payment) {
        this.amount = amount;
        this.description = description;
        this.payment = payment;
    }

    /**
     * Getter for Amount.
     * Setup amount
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Setup amount
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
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
     * Getter for Payment.
     * Payment data
     * @return Returns the CreatePaymentRequest
     */
    @JsonGetter("payment")
    public CreatePaymentRequest getPayment() {
        return payment;
    }

    /**
     * Setter for Payment.
     * Payment data
     * @param payment Value for CreatePaymentRequest
     */
    @JsonSetter("payment")
    public void setPayment(CreatePaymentRequest payment) {
        this.payment = payment;
    }

    /**
     * Converts this CreateSetupRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSetupRequest [" + "amount=" + amount + ", description=" + description
                + ", payment=" + payment + "]";
    }

    /**
     * Builds a new {@link CreateSetupRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSetupRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, description, payment);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSetupRequest}.
     */
    public static class Builder {
        private int amount;
        private String description;
        private CreatePaymentRequest payment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  int value for amount.
         * @param  description  String value for description.
         * @param  payment  CreatePaymentRequest value for payment.
         */
        public Builder(int amount, String description, CreatePaymentRequest payment) {
            this.amount = amount;
            this.description = description;
            this.payment = payment;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for payment.
         * @param  payment  CreatePaymentRequest value for payment.
         * @return Builder
         */
        public Builder payment(CreatePaymentRequest payment) {
            this.payment = payment;
            return this;
        }

        /**
         * Builds a new {@link CreateSetupRequest} object using the set fields.
         * @return {@link CreateSetupRequest}
         */
        public CreateSetupRequest build() {
            return new CreateSetupRequest(amount, description, payment);
        }
    }
}