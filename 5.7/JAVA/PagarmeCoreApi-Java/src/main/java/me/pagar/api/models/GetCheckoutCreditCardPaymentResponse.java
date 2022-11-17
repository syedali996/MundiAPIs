/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for GetCheckoutCreditCardPaymentResponse type.
 */
public class GetCheckoutCreditCardPaymentResponse {
    private String statementDescriptor;
    private List<GetCheckoutCardInstallmentOptionsResponse> installments;
    private GetPaymentAuthenticationResponse authentication;

    /**
     * Default constructor.
     */
    public GetCheckoutCreditCardPaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  installments  List of GetCheckoutCardInstallmentOptionsResponse value for
     *         installments.
     * @param  authentication  GetPaymentAuthenticationResponse value for authentication.
     */
    public GetCheckoutCreditCardPaymentResponse(
            String statementDescriptor,
            List<GetCheckoutCardInstallmentOptionsResponse> installments,
            GetPaymentAuthenticationResponse authentication) {
        this.statementDescriptor = statementDescriptor;
        this.installments = installments;
        this.authentication = authentication;
    }

    /**
     * Getter for StatementDescriptor.
     * Descrição na fatura
     * @return Returns the String
     */
    @JsonGetter("statementDescriptor")
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * Descrição na fatura
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statementDescriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for Installments.
     * Parcelas
     * @return Returns the List of GetCheckoutCardInstallmentOptionsResponse
     */
    @JsonGetter("installments")
    public List<GetCheckoutCardInstallmentOptionsResponse> getInstallments() {
        return installments;
    }

    /**
     * Setter for Installments.
     * Parcelas
     * @param installments Value for List of GetCheckoutCardInstallmentOptionsResponse
     */
    @JsonSetter("installments")
    public void setInstallments(List<GetCheckoutCardInstallmentOptionsResponse> installments) {
        this.installments = installments;
    }

    /**
     * Getter for Authentication.
     * Payment Authentication response
     * @return Returns the GetPaymentAuthenticationResponse
     */
    @JsonGetter("authentication")
    public GetPaymentAuthenticationResponse getAuthentication() {
        return authentication;
    }

    /**
     * Setter for Authentication.
     * Payment Authentication response
     * @param authentication Value for GetPaymentAuthenticationResponse
     */
    @JsonSetter("authentication")
    public void setAuthentication(GetPaymentAuthenticationResponse authentication) {
        this.authentication = authentication;
    }

    /**
     * Converts this GetCheckoutCreditCardPaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCheckoutCreditCardPaymentResponse [" + "statementDescriptor="
                + statementDescriptor + ", installments=" + installments + ", authentication="
                + authentication + "]";
    }

    /**
     * Builds a new {@link GetCheckoutCreditCardPaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCheckoutCreditCardPaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(statementDescriptor, installments, authentication);
        return builder;
    }

    /**
     * Class to build instances of {@link GetCheckoutCreditCardPaymentResponse}.
     */
    public static class Builder {
        private String statementDescriptor;
        private List<GetCheckoutCardInstallmentOptionsResponse> installments;
        private GetPaymentAuthenticationResponse authentication;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @param  installments  List of GetCheckoutCardInstallmentOptionsResponse value for
         *         installments.
         * @param  authentication  GetPaymentAuthenticationResponse value for authentication.
         */
        public Builder(String statementDescriptor,
                List<GetCheckoutCardInstallmentOptionsResponse> installments,
                GetPaymentAuthenticationResponse authentication) {
            this.statementDescriptor = statementDescriptor;
            this.installments = installments;
            this.authentication = authentication;
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
         * Setter for installments.
         * @param  installments  List of GetCheckoutCardInstallmentOptionsResponse value for
         *         installments.
         * @return Builder
         */
        public Builder installments(
                List<GetCheckoutCardInstallmentOptionsResponse> installments) {
            this.installments = installments;
            return this;
        }

        /**
         * Setter for authentication.
         * @param  authentication  GetPaymentAuthenticationResponse value for authentication.
         * @return Builder
         */
        public Builder authentication(GetPaymentAuthenticationResponse authentication) {
            this.authentication = authentication;
            return this;
        }

        /**
         * Builds a new {@link GetCheckoutCreditCardPaymentResponse} object using the set fields.
         * @return {@link GetCheckoutCreditCardPaymentResponse}
         */
        public GetCheckoutCreditCardPaymentResponse build() {
            return new GetCheckoutCreditCardPaymentResponse(statementDescriptor, installments,
                    authentication);
        }
    }
}
