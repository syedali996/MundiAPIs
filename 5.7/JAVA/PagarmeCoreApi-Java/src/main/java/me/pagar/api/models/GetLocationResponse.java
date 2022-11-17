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
 * This is a model class for GetLocationResponse type.
 */
public class GetLocationResponse {
    private String latitude;
    private String longitude;

    /**
     * Default constructor.
     */
    public GetLocationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  latitude  String value for latitude.
     * @param  longitude  String value for longitude.
     */
    public GetLocationResponse(
            String latitude,
            String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Getter for Latitude.
     * Latitude
     * @return Returns the String
     */
    @JsonGetter("latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     * Setter for Latitude.
     * Latitude
     * @param latitude Value for String
     */
    @JsonSetter("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Getter for Longitude.
     * Longitude
     * @return Returns the String
     */
    @JsonGetter("longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     * Setter for Longitude.
     * Longitude
     * @param longitude Value for String
     */
    @JsonSetter("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * Converts this GetLocationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetLocationResponse [" + "latitude=" + latitude + ", longitude=" + longitude + "]";
    }

    /**
     * Builds a new {@link GetLocationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetLocationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(latitude, longitude);
        return builder;
    }

    /**
     * Class to build instances of {@link GetLocationResponse}.
     */
    public static class Builder {
        private String latitude;
        private String longitude;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  latitude  String value for latitude.
         * @param  longitude  String value for longitude.
         */
        public Builder(String latitude, String longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        /**
         * Setter for latitude.
         * @param  latitude  String value for latitude.
         * @return Builder
         */
        public Builder latitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        /**
         * Setter for longitude.
         * @param  longitude  String value for longitude.
         * @return Builder
         */
        public Builder longitude(String longitude) {
            this.longitude = longitude;
            return this;
        }

        /**
         * Builds a new {@link GetLocationResponse} object using the set fields.
         * @return {@link GetLocationResponse}
         */
        public GetLocationResponse build() {
            return new GetLocationResponse(latitude, longitude);
        }
    }
}
