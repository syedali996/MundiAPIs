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
 * This is a model class for GetBillingAddressResponse type.
 */
public class GetBillingAddressResponse {
    private String street;
    private String number;
    private String zipCode;
    private String neighborhood;
    private String city;
    private String state;
    private String country;
    private String complement;
    private String line1;
    private String line2;

    /**
     * Default constructor.
     */
    public GetBillingAddressResponse() {
    }

    /**
     * Initialization constructor.
     * @param  street  String value for street.
     * @param  number  String value for number.
     * @param  zipCode  String value for zipCode.
     * @param  neighborhood  String value for neighborhood.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  country  String value for country.
     * @param  complement  String value for complement.
     * @param  line1  String value for line1.
     * @param  line2  String value for line2.
     */
    public GetBillingAddressResponse(
            String street,
            String number,
            String zipCode,
            String neighborhood,
            String city,
            String state,
            String country,
            String complement,
            String line1,
            String line2) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.complement = complement;
        this.line1 = line1;
        this.line2 = line2;
    }

    /**
     * Getter for Street.
     * @return Returns the String
     */
    @JsonGetter("street")
    public String getStreet() {
        return street;
    }

    /**
     * Setter for Street.
     * @param street Value for String
     */
    @JsonSetter("street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Getter for Number.
     * @return Returns the String
     */
    @JsonGetter("number")
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter for ZipCode.
     * @return Returns the String
     */
    @JsonGetter("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter for ZipCode.
     * @param zipCode Value for String
     */
    @JsonSetter("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Getter for Neighborhood.
     * @return Returns the String
     */
    @JsonGetter("neighborhood")
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * Setter for Neighborhood.
     * @param neighborhood Value for String
     */
    @JsonSetter("neighborhood")
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * Getter for City.
     * @return Returns the String
     */
    @JsonGetter("city")
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for State.
     * @return Returns the String
     */
    @JsonGetter("state")
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for Country.
     * @return Returns the String
     */
    @JsonGetter("country")
    public String getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for Complement.
     * @return Returns the String
     */
    @JsonGetter("complement")
    public String getComplement() {
        return complement;
    }

    /**
     * Setter for Complement.
     * @param complement Value for String
     */
    @JsonSetter("complement")
    public void setComplement(String complement) {
        this.complement = complement;
    }

    /**
     * Getter for Line1.
     * Line 1 for address
     * @return Returns the String
     */
    @JsonGetter("line_1")
    public String getLine1() {
        return line1;
    }

    /**
     * Setter for Line1.
     * Line 1 for address
     * @param line1 Value for String
     */
    @JsonSetter("line_1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * Getter for Line2.
     * Line 2 for address
     * @return Returns the String
     */
    @JsonGetter("line_2")
    public String getLine2() {
        return line2;
    }

    /**
     * Setter for Line2.
     * Line 2 for address
     * @param line2 Value for String
     */
    @JsonSetter("line_2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * Converts this GetBillingAddressResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetBillingAddressResponse [" + "street=" + street + ", number=" + number
                + ", zipCode=" + zipCode + ", neighborhood=" + neighborhood + ", city=" + city
                + ", state=" + state + ", country=" + country + ", complement=" + complement
                + ", line1=" + line1 + ", line2=" + line2 + "]";
    }

    /**
     * Builds a new {@link GetBillingAddressResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetBillingAddressResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(street, number, zipCode, neighborhood, city, state, country,
                complement, line1, line2);
        return builder;
    }

    /**
     * Class to build instances of {@link GetBillingAddressResponse}.
     */
    public static class Builder {
        private String street;
        private String number;
        private String zipCode;
        private String neighborhood;
        private String city;
        private String state;
        private String country;
        private String complement;
        private String line1;
        private String line2;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  street  String value for street.
         * @param  number  String value for number.
         * @param  zipCode  String value for zipCode.
         * @param  neighborhood  String value for neighborhood.
         * @param  city  String value for city.
         * @param  state  String value for state.
         * @param  country  String value for country.
         * @param  complement  String value for complement.
         * @param  line1  String value for line1.
         * @param  line2  String value for line2.
         */
        public Builder(String street, String number, String zipCode, String neighborhood,
                String city, String state, String country, String complement, String line1,
                String line2) {
            this.street = street;
            this.number = number;
            this.zipCode = zipCode;
            this.neighborhood = neighborhood;
            this.city = city;
            this.state = state;
            this.country = country;
            this.complement = complement;
            this.line1 = line1;
            this.line2 = line2;
        }

        /**
         * Setter for street.
         * @param  street  String value for street.
         * @return Builder
         */
        public Builder street(String street) {
            this.street = street;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for zipCode.
         * @param  zipCode  String value for zipCode.
         * @return Builder
         */
        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        /**
         * Setter for neighborhood.
         * @param  neighborhood  String value for neighborhood.
         * @return Builder
         */
        public Builder neighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for complement.
         * @param  complement  String value for complement.
         * @return Builder
         */
        public Builder complement(String complement) {
            this.complement = complement;
            return this;
        }

        /**
         * Setter for line1.
         * @param  line1  String value for line1.
         * @return Builder
         */
        public Builder line1(String line1) {
            this.line1 = line1;
            return this;
        }

        /**
         * Setter for line2.
         * @param  line2  String value for line2.
         * @return Builder
         */
        public Builder line2(String line2) {
            this.line2 = line2;
            return this;
        }

        /**
         * Builds a new {@link GetBillingAddressResponse} object using the set fields.
         * @return {@link GetBillingAddressResponse}
         */
        public GetBillingAddressResponse build() {
            return new GetBillingAddressResponse(street, number, zipCode, neighborhood, city, state,
                    country, complement, line1, line2);
        }
    }
}
