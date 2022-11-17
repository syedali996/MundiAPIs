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
 * This is a model class for CreateEmvDataDukptDecryptRequest type.
 */
public class CreateEmvDataDukptDecryptRequest {
    private String ksn;

    /**
     * Default constructor.
     */
    public CreateEmvDataDukptDecryptRequest() {
    }

    /**
     * Initialization constructor.
     * @param  ksn  String value for ksn.
     */
    public CreateEmvDataDukptDecryptRequest(
            String ksn) {
        this.ksn = ksn;
    }

    /**
     * Getter for Ksn.
     * Key serial number
     * @return Returns the String
     */
    @JsonGetter("ksn")
    public String getKsn() {
        return ksn;
    }

    /**
     * Setter for Ksn.
     * Key serial number
     * @param ksn Value for String
     */
    @JsonSetter("ksn")
    public void setKsn(String ksn) {
        this.ksn = ksn;
    }

    /**
     * Converts this CreateEmvDataDukptDecryptRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateEmvDataDukptDecryptRequest [" + "ksn=" + ksn + "]";
    }

    /**
     * Builds a new {@link CreateEmvDataDukptDecryptRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateEmvDataDukptDecryptRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(ksn);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateEmvDataDukptDecryptRequest}.
     */
    public static class Builder {
        private String ksn;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  ksn  String value for ksn.
         */
        public Builder(String ksn) {
            this.ksn = ksn;
        }

        /**
         * Setter for ksn.
         * @param  ksn  String value for ksn.
         * @return Builder
         */
        public Builder ksn(String ksn) {
            this.ksn = ksn;
            return this;
        }

        /**
         * Builds a new {@link CreateEmvDataDukptDecryptRequest} object using the set fields.
         * @return {@link CreateEmvDataDukptDecryptRequest}
         */
        public CreateEmvDataDukptDecryptRequest build() {
            return new CreateEmvDataDukptDecryptRequest(ksn);
        }
    }
}
