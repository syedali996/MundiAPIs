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
 * This is a model class for CreateCancelSubscriptionRequest type.
 */
public class CreateCancelSubscriptionRequest {
    private boolean cancelPendingInvoices;

    /**
     * Default constructor.
     */
    public CreateCancelSubscriptionRequest() {
        cancelPendingInvoices = true;
    }

    /**
     * Initialization constructor.
     * @param  cancelPendingInvoices  boolean value for cancelPendingInvoices.
     */
    public CreateCancelSubscriptionRequest(
            boolean cancelPendingInvoices) {
        this.cancelPendingInvoices = cancelPendingInvoices;
    }

    /**
     * Getter for CancelPendingInvoices.
     * Indicates if the pending invoices must also be canceled.
     * @return Returns the boolean
     */
    @JsonGetter("cancel_pending_invoices")
    public boolean getCancelPendingInvoices() {
        return cancelPendingInvoices;
    }

    /**
     * Setter for CancelPendingInvoices.
     * Indicates if the pending invoices must also be canceled.
     * @param cancelPendingInvoices Value for boolean
     */
    @JsonSetter("cancel_pending_invoices")
    public void setCancelPendingInvoices(boolean cancelPendingInvoices) {
        this.cancelPendingInvoices = cancelPendingInvoices;
    }

    /**
     * Converts this CreateCancelSubscriptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCancelSubscriptionRequest [" + "cancelPendingInvoices="
                + cancelPendingInvoices + "]";
    }

    /**
     * Builds a new {@link CreateCancelSubscriptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCancelSubscriptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(cancelPendingInvoices);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCancelSubscriptionRequest}.
     */
    public static class Builder {
        private boolean cancelPendingInvoices = true;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  cancelPendingInvoices  boolean value for cancelPendingInvoices.
         */
        public Builder(boolean cancelPendingInvoices) {
            this.cancelPendingInvoices = cancelPendingInvoices;
        }

        /**
         * Setter for cancelPendingInvoices.
         * @param  cancelPendingInvoices  boolean value for cancelPendingInvoices.
         * @return Builder
         */
        public Builder cancelPendingInvoices(boolean cancelPendingInvoices) {
            this.cancelPendingInvoices = cancelPendingInvoices;
            return this;
        }

        /**
         * Builds a new {@link CreateCancelSubscriptionRequest} object using the set fields.
         * @return {@link CreateCancelSubscriptionRequest}
         */
        public CreateCancelSubscriptionRequest build() {
            return new CreateCancelSubscriptionRequest(cancelPendingInvoices);
        }
    }
}
