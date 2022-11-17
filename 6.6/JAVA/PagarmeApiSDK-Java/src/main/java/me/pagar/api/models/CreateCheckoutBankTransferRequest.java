/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for CreateCheckoutBankTransferRequest type.
 */
public class CreateCheckoutBankTransferRequest {
    private List<String> bank;
    private int retries;

    /**
     * Default constructor.
     */
    public CreateCheckoutBankTransferRequest() {
    }

    /**
     * Initialization constructor.
     * @param  bank  List of String value for bank.
     * @param  retries  int value for retries.
     */
    public CreateCheckoutBankTransferRequest(
            List<String> bank,
            int retries) {
        this.bank = bank;
        this.retries = retries;
    }

    /**
     * Getter for Bank.
     * Bank
     * @return Returns the List of String
     */
    @JsonGetter("bank")
    public List<String> getBank() {
        return bank;
    }

    /**
     * Setter for Bank.
     * Bank
     * @param bank Value for List of String
     */
    @JsonSetter("bank")
    public void setBank(List<String> bank) {
        this.bank = bank;
    }

    /**
     * Getter for Retries.
     * Number of retries for processing
     * @return Returns the int
     */
    @JsonGetter("retries")
    public int getRetries() {
        return retries;
    }

    /**
     * Setter for Retries.
     * Number of retries for processing
     * @param retries Value for int
     */
    @JsonSetter("retries")
    public void setRetries(int retries) {
        this.retries = retries;
    }

    /**
     * Converts this CreateCheckoutBankTransferRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCheckoutBankTransferRequest [" + "bank=" + bank + ", retries=" + retries
                + "]";
    }

    /**
     * Builds a new {@link CreateCheckoutBankTransferRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCheckoutBankTransferRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(bank, retries);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCheckoutBankTransferRequest}.
     */
    public static class Builder {
        private List<String> bank;
        private int retries;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  bank  List of String value for bank.
         * @param  retries  int value for retries.
         */
        public Builder(List<String> bank, int retries) {
            this.bank = bank;
            this.retries = retries;
        }

        /**
         * Setter for bank.
         * @param  bank  List of String value for bank.
         * @return Builder
         */
        public Builder bank(List<String> bank) {
            this.bank = bank;
            return this;
        }

        /**
         * Setter for retries.
         * @param  retries  int value for retries.
         * @return Builder
         */
        public Builder retries(int retries) {
            this.retries = retries;
            return this;
        }

        /**
         * Builds a new {@link CreateCheckoutBankTransferRequest} object using the set fields.
         * @return {@link CreateCheckoutBankTransferRequest}
         */
        public CreateCheckoutBankTransferRequest build() {
            return new CreateCheckoutBankTransferRequest(bank, retries);
        }
    }
}