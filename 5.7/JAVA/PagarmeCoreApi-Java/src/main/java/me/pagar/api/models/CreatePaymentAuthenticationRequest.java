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
 * This is a model class for CreatePaymentAuthenticationRequest type.
 */
public class CreatePaymentAuthenticationRequest {
    private String type;
    private CreateThreeDSecureRequest threedSecure;

    /**
     * Default constructor.
     */
    public CreatePaymentAuthenticationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  threedSecure  CreateThreeDSecureRequest value for threedSecure.
     */
    public CreatePaymentAuthenticationRequest(
            String type,
            CreateThreeDSecureRequest threedSecure) {
        this.type = type;
        this.threedSecure = threedSecure;
    }

    /**
     * Getter for Type.
     * The Authentication type
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The Authentication type
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for ThreedSecure.
     * The 3D-S authentication object
     * @return Returns the CreateThreeDSecureRequest
     */
    @JsonGetter("threed_secure")
    public CreateThreeDSecureRequest getThreedSecure() {
        return threedSecure;
    }

    /**
     * Setter for ThreedSecure.
     * The 3D-S authentication object
     * @param threedSecure Value for CreateThreeDSecureRequest
     */
    @JsonSetter("threed_secure")
    public void setThreedSecure(CreateThreeDSecureRequest threedSecure) {
        this.threedSecure = threedSecure;
    }

    /**
     * Converts this CreatePaymentAuthenticationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePaymentAuthenticationRequest [" + "type=" + type + ", threedSecure="
                + threedSecure + "]";
    }

    /**
     * Builds a new {@link CreatePaymentAuthenticationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePaymentAuthenticationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, threedSecure);
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePaymentAuthenticationRequest}.
     */
    public static class Builder {
        private String type;
        private CreateThreeDSecureRequest threedSecure;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         * @param  threedSecure  CreateThreeDSecureRequest value for threedSecure.
         */
        public Builder(String type, CreateThreeDSecureRequest threedSecure) {
            this.type = type;
            this.threedSecure = threedSecure;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for threedSecure.
         * @param  threedSecure  CreateThreeDSecureRequest value for threedSecure.
         * @return Builder
         */
        public Builder threedSecure(CreateThreeDSecureRequest threedSecure) {
            this.threedSecure = threedSecure;
            return this;
        }

        /**
         * Builds a new {@link CreatePaymentAuthenticationRequest} object using the set fields.
         * @return {@link CreatePaymentAuthenticationRequest}
         */
        public CreatePaymentAuthenticationRequest build() {
            return new CreatePaymentAuthenticationRequest(type, threedSecure);
        }
    }
}
