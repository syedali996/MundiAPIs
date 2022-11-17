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

/**
 * This is a model class for CreateAccessTokenRequest type.
 */
public class CreateAccessTokenRequest {
    private Integer expiresIn;

    /**
     * Default constructor.
     */
    public CreateAccessTokenRequest() {
    }

    /**
     * Initialization constructor.
     * @param  expiresIn  Integer value for expiresIn.
     */
    public CreateAccessTokenRequest(
            Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * Getter for ExpiresIn.
     * Minutes to expire the token
     * @return Returns the Integer
     */
    @JsonGetter("expires_in")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * Setter for ExpiresIn.
     * Minutes to expire the token
     * @param expiresIn Value for Integer
     */
    @JsonSetter("expires_in")
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * Converts this CreateAccessTokenRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateAccessTokenRequest [" + "expiresIn=" + expiresIn + "]";
    }

    /**
     * Builds a new {@link CreateAccessTokenRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateAccessTokenRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .expiresIn(getExpiresIn());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateAccessTokenRequest}.
     */
    public static class Builder {
        private Integer expiresIn;



        /**
         * Setter for expiresIn.
         * @param  expiresIn  Integer value for expiresIn.
         * @return Builder
         */
        public Builder expiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * Builds a new {@link CreateAccessTokenRequest} object using the set fields.
         * @return {@link CreateAccessTokenRequest}
         */
        public CreateAccessTokenRequest build() {
            return new CreateAccessTokenRequest(expiresIn);
        }
    }
}
