/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for UpdateRecipientBankAccountRequest type.
 */
public class UpdateRecipientBankAccountRequest {
    private CreateBankAccountRequest bankAccount;
    private String paymentMode;

    /**
     * Default constructor.
     */
    public UpdateRecipientBankAccountRequest() {
        paymentMode = "bank_transfer";
    }

    /**
     * Initialization constructor.
     * @param  bankAccount  CreateBankAccountRequest value for bankAccount.
     * @param  paymentMode  String value for paymentMode.
     */
    public UpdateRecipientBankAccountRequest(
            CreateBankAccountRequest bankAccount,
            String paymentMode) {
        this.bankAccount = bankAccount;
        this.paymentMode = paymentMode;
    }

    /**
     * Getter for BankAccount.
     * Bank account
     * @return Returns the CreateBankAccountRequest
     */
    @JsonGetter("bank_account")
    public CreateBankAccountRequest getBankAccount() {
        return bankAccount;
    }

    /**
     * Setter for BankAccount.
     * Bank account
     * @param bankAccount Value for CreateBankAccountRequest
     */
    @JsonSetter("bank_account")
    public void setBankAccount(CreateBankAccountRequest bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * Getter for PaymentMode.
     * Payment mode
     * @return Returns the String
     */
    @JsonGetter("payment_mode")
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Setter for PaymentMode.
     * Payment mode
     * @param paymentMode Value for String
     */
    @JsonSetter("payment_mode")
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    /**
     * Converts this UpdateRecipientBankAccountRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateRecipientBankAccountRequest [" + "bankAccount=" + bankAccount
                + ", paymentMode=" + paymentMode + "]";
    }

    /**
     * Builds a new {@link UpdateRecipientBankAccountRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateRecipientBankAccountRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(bankAccount, paymentMode);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateRecipientBankAccountRequest}.
     */
    public static class Builder {
        private CreateBankAccountRequest bankAccount;
        private String paymentMode = "bank_transfer";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  bankAccount  CreateBankAccountRequest value for bankAccount.
         * @param  paymentMode  String value for paymentMode.
         */
        public Builder(CreateBankAccountRequest bankAccount, String paymentMode) {
            this.bankAccount = bankAccount;
            this.paymentMode = paymentMode;
        }

        /**
         * Setter for bankAccount.
         * @param  bankAccount  CreateBankAccountRequest value for bankAccount.
         * @return Builder
         */
        public Builder bankAccount(CreateBankAccountRequest bankAccount) {
            this.bankAccount = bankAccount;
            return this;
        }

        /**
         * Setter for paymentMode.
         * @param  paymentMode  String value for paymentMode.
         * @return Builder
         */
        public Builder paymentMode(String paymentMode) {
            this.paymentMode = paymentMode;
            return this;
        }

        /**
         * Builds a new {@link UpdateRecipientBankAccountRequest} object using the set fields.
         * @return {@link UpdateRecipientBankAccountRequest}
         */
        public UpdateRecipientBankAccountRequest build() {
            return new UpdateRecipientBankAccountRequest(bankAccount, paymentMode);
        }
    }
}
