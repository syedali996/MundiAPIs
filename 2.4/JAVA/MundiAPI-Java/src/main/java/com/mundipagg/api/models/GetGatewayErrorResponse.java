/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for GetGatewayErrorResponse type.
 */
public class GetGatewayErrorResponse {
    private String message;

    /**
     * Default constructor.
     */
    public GetGatewayErrorResponse() {
    }

    /**
     * Initialization constructor.
     * @param  message  String value for message.
     */
    public GetGatewayErrorResponse(
            String message) {
        this.message = message;
    }

    /**
     * Getter for Message.
     * The message error
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * The message error
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this GetGatewayErrorResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetGatewayErrorResponse [" + "message=" + message + "]";
    }

    /**
     * Builds a new {@link GetGatewayErrorResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetGatewayErrorResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(message);
        return builder;
    }

    /**
     * Class to build instances of {@link GetGatewayErrorResponse}.
     */
    public static class Builder {
        private String message;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  message  String value for message.
         */
        public Builder(String message) {
            this.message = message;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link GetGatewayErrorResponse} object using the set fields.
         * @return {@link GetGatewayErrorResponse}
         */
        public GetGatewayErrorResponse build() {
            return new GetGatewayErrorResponse(message);
        }
    }
}
