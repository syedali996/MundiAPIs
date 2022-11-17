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
import java.util.List;

/**
 * This is a model class for GetCheckoutPaymentSettingsResponse type.
 */
public class GetCheckoutPaymentSettingsResponse {
    private String successUrl;
    private String paymentUrl;
    private List<String> acceptedPaymentMethods;
    private String status;
    private GetCustomerResponse customer;
    private Integer amount;
    private String defaultPaymentMethod;
    private String gatewayAffiliationId;

    /**
     * Default constructor.
     */
    public GetCheckoutPaymentSettingsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  successUrl  String value for successUrl.
     * @param  paymentUrl  String value for paymentUrl.
     * @param  acceptedPaymentMethods  List of String value for acceptedPaymentMethods.
     * @param  status  String value for status.
     * @param  customer  GetCustomerResponse value for customer.
     * @param  amount  Integer value for amount.
     * @param  defaultPaymentMethod  String value for defaultPaymentMethod.
     * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
     */
    public GetCheckoutPaymentSettingsResponse(
            String successUrl,
            String paymentUrl,
            List<String> acceptedPaymentMethods,
            String status,
            GetCustomerResponse customer,
            Integer amount,
            String defaultPaymentMethod,
            String gatewayAffiliationId) {
        this.successUrl = successUrl;
        this.paymentUrl = paymentUrl;
        this.acceptedPaymentMethods = acceptedPaymentMethods;
        this.status = status;
        this.customer = customer;
        this.amount = amount;
        this.defaultPaymentMethod = defaultPaymentMethod;
        this.gatewayAffiliationId = gatewayAffiliationId;
    }

    /**
     * Getter for SuccessUrl.
     * Success Url
     * @return Returns the String
     */
    @JsonGetter("success_url")
    public String getSuccessUrl() {
        return successUrl;
    }

    /**
     * Setter for SuccessUrl.
     * Success Url
     * @param successUrl Value for String
     */
    @JsonSetter("success_url")
    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    /**
     * Getter for PaymentUrl.
     * Payment Url
     * @return Returns the String
     */
    @JsonGetter("payment_url")
    public String getPaymentUrl() {
        return paymentUrl;
    }

    /**
     * Setter for PaymentUrl.
     * Payment Url
     * @param paymentUrl Value for String
     */
    @JsonSetter("payment_url")
    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    /**
     * Getter for AcceptedPaymentMethods.
     * Accepted Payment Methods
     * @return Returns the List of String
     */
    @JsonGetter("accepted_payment_methods")
    public List<String> getAcceptedPaymentMethods() {
        return acceptedPaymentMethods;
    }

    /**
     * Setter for AcceptedPaymentMethods.
     * Accepted Payment Methods
     * @param acceptedPaymentMethods Value for List of String
     */
    @JsonSetter("accepted_payment_methods")
    public void setAcceptedPaymentMethods(List<String> acceptedPaymentMethods) {
        this.acceptedPaymentMethods = acceptedPaymentMethods;
    }

    /**
     * Getter for Status.
     * Status
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Customer.
     * Customer
     * @return Returns the GetCustomerResponse
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetCustomerResponse getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * Customer
     * @param customer Value for GetCustomerResponse
     */
    @JsonSetter("customer")
    public void setCustomer(GetCustomerResponse customer) {
        this.customer = customer;
    }

    /**
     * Getter for Amount.
     * Payment amount
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Payment amount
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for DefaultPaymentMethod.
     * Default Payment Method
     * @return Returns the String
     */
    @JsonGetter("default_payment_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDefaultPaymentMethod() {
        return defaultPaymentMethod;
    }

    /**
     * Setter for DefaultPaymentMethod.
     * Default Payment Method
     * @param defaultPaymentMethod Value for String
     */
    @JsonSetter("default_payment_method")
    public void setDefaultPaymentMethod(String defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
    }

    /**
     * Getter for GatewayAffiliationId.
     * Gateway Affiliation Id
     * @return Returns the String
     */
    @JsonGetter("gateway_affiliation_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGatewayAffiliationId() {
        return gatewayAffiliationId;
    }

    /**
     * Setter for GatewayAffiliationId.
     * Gateway Affiliation Id
     * @param gatewayAffiliationId Value for String
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId(String gatewayAffiliationId) {
        this.gatewayAffiliationId = gatewayAffiliationId;
    }

    /**
     * Converts this GetCheckoutPaymentSettingsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCheckoutPaymentSettingsResponse [" + "successUrl=" + successUrl + ", paymentUrl="
                + paymentUrl + ", acceptedPaymentMethods=" + acceptedPaymentMethods + ", status="
                + status + ", customer=" + customer + ", amount=" + amount
                + ", defaultPaymentMethod=" + defaultPaymentMethod + ", gatewayAffiliationId="
                + gatewayAffiliationId + "]";
    }

    /**
     * Builds a new {@link GetCheckoutPaymentSettingsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCheckoutPaymentSettingsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(successUrl, paymentUrl, acceptedPaymentMethods, status)
                .customer(getCustomer())
                .amount(getAmount())
                .defaultPaymentMethod(getDefaultPaymentMethod())
                .gatewayAffiliationId(getGatewayAffiliationId());
        return builder;
    }

    /**
     * Class to build instances of {@link GetCheckoutPaymentSettingsResponse}.
     */
    public static class Builder {
        private String successUrl;
        private String paymentUrl;
        private List<String> acceptedPaymentMethods;
        private String status;
        private GetCustomerResponse customer;
        private Integer amount;
        private String defaultPaymentMethod;
        private String gatewayAffiliationId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  successUrl  String value for successUrl.
         * @param  paymentUrl  String value for paymentUrl.
         * @param  acceptedPaymentMethods  List of String value for acceptedPaymentMethods.
         * @param  status  String value for status.
         */
        public Builder(String successUrl, String paymentUrl, List<String> acceptedPaymentMethods,
                String status) {
            this.successUrl = successUrl;
            this.paymentUrl = paymentUrl;
            this.acceptedPaymentMethods = acceptedPaymentMethods;
            this.status = status;
        }

        /**
         * Setter for successUrl.
         * @param  successUrl  String value for successUrl.
         * @return Builder
         */
        public Builder successUrl(String successUrl) {
            this.successUrl = successUrl;
            return this;
        }

        /**
         * Setter for paymentUrl.
         * @param  paymentUrl  String value for paymentUrl.
         * @return Builder
         */
        public Builder paymentUrl(String paymentUrl) {
            this.paymentUrl = paymentUrl;
            return this;
        }

        /**
         * Setter for acceptedPaymentMethods.
         * @param  acceptedPaymentMethods  List of String value for acceptedPaymentMethods.
         * @return Builder
         */
        public Builder acceptedPaymentMethods(List<String> acceptedPaymentMethods) {
            this.acceptedPaymentMethods = acceptedPaymentMethods;
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
         * Setter for customer.
         * @param  customer  GetCustomerResponse value for customer.
         * @return Builder
         */
        public Builder customer(GetCustomerResponse customer) {
            this.customer = customer;
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
         * Setter for defaultPaymentMethod.
         * @param  defaultPaymentMethod  String value for defaultPaymentMethod.
         * @return Builder
         */
        public Builder defaultPaymentMethod(String defaultPaymentMethod) {
            this.defaultPaymentMethod = defaultPaymentMethod;
            return this;
        }

        /**
         * Setter for gatewayAffiliationId.
         * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
         * @return Builder
         */
        public Builder gatewayAffiliationId(String gatewayAffiliationId) {
            this.gatewayAffiliationId = gatewayAffiliationId;
            return this;
        }

        /**
         * Builds a new {@link GetCheckoutPaymentSettingsResponse} object using the set fields.
         * @return {@link GetCheckoutPaymentSettingsResponse}
         */
        public GetCheckoutPaymentSettingsResponse build() {
            return new GetCheckoutPaymentSettingsResponse(successUrl, paymentUrl,
                    acceptedPaymentMethods, status, customer, amount, defaultPaymentMethod,
                    gatewayAffiliationId);
        }
    }
}
