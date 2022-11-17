/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.Map;

/**
 * This is a model class for CreateInvoiceRequest type.
 */
public class CreateInvoiceRequest {
    private Map<String, String> metadata;

    /**
     * Default constructor.
     */
    public CreateInvoiceRequest() {
    }

    /**
     * Initialization constructor.
     * @param  metadata  Map of String, value for metadata.
     */
    public CreateInvoiceRequest(
            Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Metadata.
     * Metadata
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Metadata
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Converts this CreateInvoiceRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateInvoiceRequest [" + "metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link CreateInvoiceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateInvoiceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(metadata);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateInvoiceRequest}.
     */
    public static class Builder {
        private Map<String, String> metadata;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  metadata  Map of String, value for metadata.
         */
        public Builder(Map<String, String> metadata) {
            this.metadata = metadata;
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
         * Builds a new {@link CreateInvoiceRequest} object using the set fields.
         * @return {@link CreateInvoiceRequest}
         */
        public CreateInvoiceRequest build() {
            return new CreateInvoiceRequest(metadata);
        }
    }
}
