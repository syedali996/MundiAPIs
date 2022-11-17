/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mundipagg.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * This is a model class for GetAddressResponse type.
 */
public class GetAddressResponse {
    private String id;
    private String street;
    private String number;
    private String complement;
    private String zipCode;
    private String neighborhood;
    private String city;
    private String state;
    private String country;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private GetCustomerResponse customer;
    private Map<String, String> metadata;
    private String line1;
    private String line2;
    private LocalDateTime deletedAt;

    /**
     * Default constructor.
     */
    public GetAddressResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  street  String value for street.
     * @param  number  String value for number.
     * @param  complement  String value for complement.
     * @param  zipCode  String value for zipCode.
     * @param  neighborhood  String value for neighborhood.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  country  String value for country.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  metadata  Map of String, value for metadata.
     * @param  line1  String value for line1.
     * @param  line2  String value for line2.
     * @param  customer  GetCustomerResponse value for customer.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     */
    public GetAddressResponse(
            String id,
            String street,
            String number,
            String complement,
            String zipCode,
            String neighborhood,
            String city,
            String state,
            String country,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            Map<String, String> metadata,
            String line1,
            String line2,
            GetCustomerResponse customer,
            LocalDateTime deletedAt) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.zipCode = zipCode;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.customer = customer;
        this.metadata = metadata;
        this.line1 = line1;
        this.line2 = line2;
        this.deletedAt = deletedAt;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
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
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Customer.
     * @return Returns the GetCustomerResponse
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetCustomerResponse getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for GetCustomerResponse
     */
    @JsonSetter("customer")
    public void setCustomer(GetCustomerResponse customer) {
        this.customer = customer;
    }

    /**
     * Getter for Metadata.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
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
     * Getter for DeletedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("deleted_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    /**
     * Setter for DeletedAt.
     * @param deletedAt Value for LocalDateTime
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * Converts this GetAddressResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetAddressResponse [" + "id=" + id + ", street=" + street + ", number=" + number
                + ", complement=" + complement + ", zipCode=" + zipCode + ", neighborhood="
                + neighborhood + ", city=" + city + ", state=" + state + ", country=" + country
                + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", metadata=" + metadata + ", line1=" + line1 + ", line2=" + line2 + ", customer="
                + customer + ", deletedAt=" + deletedAt + "]";
    }

    /**
     * Builds a new {@link GetAddressResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetAddressResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, street, number, complement, zipCode, neighborhood, city,
                state, country, status, createdAt, updatedAt, metadata, line1, line2)
                .customer(getCustomer())
                .deletedAt(getDeletedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link GetAddressResponse}.
     */
    public static class Builder {
        private String id;
        private String street;
        private String number;
        private String complement;
        private String zipCode;
        private String neighborhood;
        private String city;
        private String state;
        private String country;
        private String status;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private Map<String, String> metadata;
        private String line1;
        private String line2;
        private GetCustomerResponse customer;
        private LocalDateTime deletedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  street  String value for street.
         * @param  number  String value for number.
         * @param  complement  String value for complement.
         * @param  zipCode  String value for zipCode.
         * @param  neighborhood  String value for neighborhood.
         * @param  city  String value for city.
         * @param  state  String value for state.
         * @param  country  String value for country.
         * @param  status  String value for status.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  metadata  Map of String, value for metadata.
         * @param  line1  String value for line1.
         * @param  line2  String value for line2.
         */
        public Builder(String id, String street, String number, String complement, String zipCode,
                String neighborhood, String city, String state, String country, String status,
                LocalDateTime createdAt, LocalDateTime updatedAt, Map<String, String> metadata,
                String line1, String line2) {
            this.id = id;
            this.street = street;
            this.number = number;
            this.complement = complement;
            this.zipCode = zipCode;
            this.neighborhood = neighborhood;
            this.city = city;
            this.state = state;
            this.country = country;
            this.status = status;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.metadata = metadata;
            this.line1 = line1;
            this.line2 = line2;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
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
         * Setter for complement.
         * @param  complement  String value for complement.
         * @return Builder
         */
        public Builder complement(String complement) {
            this.complement = complement;
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
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
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
         * Setter for customer.
         * @param  customer  GetCustomerResponse value for customer.
         * @return Builder
         */
        public Builder customer(GetCustomerResponse customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for deletedAt.
         * @param  deletedAt  LocalDateTime value for deletedAt.
         * @return Builder
         */
        public Builder deletedAt(LocalDateTime deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        /**
         * Builds a new {@link GetAddressResponse} object using the set fields.
         * @return {@link GetAddressResponse}
         */
        public GetAddressResponse build() {
            return new GetAddressResponse(id, street, number, complement, zipCode, neighborhood,
                    city, state, country, status, createdAt, updatedAt, metadata, line1, line2,
                    customer, deletedAt);
        }
    }
}
