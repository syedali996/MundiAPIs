/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for GetDeviceResponse type.
 */
public class GetDeviceResponse {
    private String platform;

    /**
     * Default constructor.
     */
    public GetDeviceResponse() {
    }

    /**
     * Initialization constructor.
     * @param  platform  String value for platform.
     */
    public GetDeviceResponse(
            String platform) {
        this.platform = platform;
    }

    /**
     * Getter for Platform.
     * Device's platform name
     * @return Returns the String
     */
    @JsonGetter("platform")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPlatform() {
        return platform;
    }

    /**
     * Setter for Platform.
     * Device's platform name
     * @param platform Value for String
     */
    @JsonSetter("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * Converts this GetDeviceResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetDeviceResponse [" + "platform=" + platform + "]";
    }

    /**
     * Builds a new {@link GetDeviceResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetDeviceResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .platform(getPlatform());
        return builder;
    }

    /**
     * Class to build instances of {@link GetDeviceResponse}.
     */
    public static class Builder {
        private String platform;



        /**
         * Setter for platform.
         * @param  platform  String value for platform.
         * @return Builder
         */
        public Builder platform(String platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Builds a new {@link GetDeviceResponse} object using the set fields.
         * @return {@link GetDeviceResponse}
         */
        public GetDeviceResponse build() {
            return new GetDeviceResponse(platform);
        }
    }
}
