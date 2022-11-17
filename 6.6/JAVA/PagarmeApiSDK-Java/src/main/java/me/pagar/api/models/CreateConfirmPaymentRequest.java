/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateConfirmPaymentRequest type.
 */
public class CreateConfirmPaymentRequest {
    private String description;
    private Integer amount;
    private String code;

    /**
     * Default constructor.
     */
    public CreateConfirmPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  code  String value for code.
     * @param  amount  Integer value for amount.
     */
    public CreateConfirmPaymentRequest(
            String description,
            String code,
            Integer amount) {
        this.description = description;
        this.amount = amount;
        this.code = code;
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
     * Getter for Amount.
     * Amount
     * @return Returns the Integer
     */
    @JsonGetter("Amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount
     * @param amount Value for Integer
     */
    @JsonSetter("Amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for Code.
     * Code reference
     * @return Returns the String
     */
    @JsonGetter("Code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Code reference
     * @param code Value for String
     */
    @JsonSetter("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Converts this CreateConfirmPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateConfirmPaymentRequest [" + "description=" + description + ", code=" + code
                + ", amount=" + amount + "]";
    }

    /**
     * Builds a new {@link CreateConfirmPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateConfirmPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(description, code)
                .amount(getAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateConfirmPaymentRequest}.
     */
    public static class Builder {
        private String description;
        private String code;
        private Integer amount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  description  String value for description.
         * @param  code  String value for code.
         */
        public Builder(String description, String code) {
            this.description = description;
            this.code = code;
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
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Builds a new {@link CreateConfirmPaymentRequest} object using the set fields.
         * @return {@link CreateConfirmPaymentRequest}
         */
        public CreateConfirmPaymentRequest build() {
            return new CreateConfirmPaymentRequest(description, code, amount);
        }
    }
}
