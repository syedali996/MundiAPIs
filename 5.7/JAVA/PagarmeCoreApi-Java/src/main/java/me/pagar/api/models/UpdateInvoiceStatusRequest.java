/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for UpdateInvoiceStatusRequest type.
 */
public class UpdateInvoiceStatusRequest {
    private String status;

    /**
     * Default constructor.
     */
    public UpdateInvoiceStatusRequest() {
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     */
    public UpdateInvoiceStatusRequest(
            String status) {
        this.status = status;
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
     * Converts this UpdateInvoiceStatusRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateInvoiceStatusRequest [" + "status=" + status + "]";
    }

    /**
     * Builds a new {@link UpdateInvoiceStatusRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateInvoiceStatusRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(status);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateInvoiceStatusRequest}.
     */
    public static class Builder {
        private String status;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  status  String value for status.
         */
        public Builder(String status) {
            this.status = status;
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
         * Builds a new {@link UpdateInvoiceStatusRequest} object using the set fields.
         * @return {@link UpdateInvoiceStatusRequest}
         */
        public UpdateInvoiceStatusRequest build() {
            return new UpdateInvoiceStatusRequest(status);
        }
    }
}