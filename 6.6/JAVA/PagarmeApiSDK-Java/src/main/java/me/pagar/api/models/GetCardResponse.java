/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetCardResponse type.
 */
public class GetCardResponse {
    private String id;
    private String lastFourDigits;
    private String brand;
    private String holderName;
    private int expMonth;
    private int expYear;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private GetBillingAddressResponse billingAddress;
    private GetCustomerResponse customer;
    private Map<String, String> metadata;
    private String type;
    private String holderDocument;
    private LocalDateTime deletedAt;
    private String firstSixDigits;
    private String label;

    /**
     * Default constructor.
     */
    public GetCardResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  lastFourDigits  String value for lastFourDigits.
     * @param  brand  String value for brand.
     * @param  holderName  String value for holderName.
     * @param  expMonth  int value for expMonth.
     * @param  expYear  int value for expYear.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
     * @param  metadata  Map of String, value for metadata.
     * @param  type  String value for type.
     * @param  holderDocument  String value for holderDocument.
     * @param  firstSixDigits  String value for firstSixDigits.
     * @param  label  String value for label.
     * @param  customer  GetCustomerResponse value for customer.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     */
    public GetCardResponse(
            String id,
            String lastFourDigits,
            String brand,
            String holderName,
            int expMonth,
            int expYear,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            GetBillingAddressResponse billingAddress,
            Map<String, String> metadata,
            String type,
            String holderDocument,
            String firstSixDigits,
            String label,
            GetCustomerResponse customer,
            LocalDateTime deletedAt) {
        this.id = id;
        this.lastFourDigits = lastFourDigits;
        this.brand = brand;
        this.holderName = holderName;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.billingAddress = billingAddress;
        this.customer = customer;
        this.metadata = metadata;
        this.type = type;
        this.holderDocument = holderDocument;
        this.deletedAt = deletedAt;
        this.firstSixDigits = firstSixDigits;
        this.label = label;
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
     * Getter for LastFourDigits.
     * @return Returns the String
     */
    @JsonGetter("last_four_digits")
    public String getLastFourDigits() {
        return lastFourDigits;
    }

    /**
     * Setter for LastFourDigits.
     * @param lastFourDigits Value for String
     */
    @JsonSetter("last_four_digits")
    public void setLastFourDigits(String lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }

    /**
     * Getter for Brand.
     * @return Returns the String
     */
    @JsonGetter("brand")
    public String getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * @param brand Value for String
     */
    @JsonSetter("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter for HolderName.
     * @return Returns the String
     */
    @JsonGetter("holder_name")
    public String getHolderName() {
        return holderName;
    }

    /**
     * Setter for HolderName.
     * @param holderName Value for String
     */
    @JsonSetter("holder_name")
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    /**
     * Getter for ExpMonth.
     * @return Returns the int
     */
    @JsonGetter("exp_month")
    public int getExpMonth() {
        return expMonth;
    }

    /**
     * Setter for ExpMonth.
     * @param expMonth Value for int
     */
    @JsonSetter("exp_month")
    public void setExpMonth(int expMonth) {
        this.expMonth = expMonth;
    }

    /**
     * Getter for ExpYear.
     * @return Returns the int
     */
    @JsonGetter("exp_year")
    public int getExpYear() {
        return expYear;
    }

    /**
     * Setter for ExpYear.
     * @param expYear Value for int
     */
    @JsonSetter("exp_year")
    public void setExpYear(int expYear) {
        this.expYear = expYear;
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
     * Getter for BillingAddress.
     * @return Returns the GetBillingAddressResponse
     */
    @JsonGetter("billing_address")
    public GetBillingAddressResponse getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * @param billingAddress Value for GetBillingAddressResponse
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(GetBillingAddressResponse billingAddress) {
        this.billingAddress = billingAddress;
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
     * Getter for Type.
     * Card type
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Card type
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for HolderDocument.
     * Document number for the card's holder
     * @return Returns the String
     */
    @JsonGetter("holder_document")
    public String getHolderDocument() {
        return holderDocument;
    }

    /**
     * Setter for HolderDocument.
     * Document number for the card's holder
     * @param holderDocument Value for String
     */
    @JsonSetter("holder_document")
    public void setHolderDocument(String holderDocument) {
        this.holderDocument = holderDocument;
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
     * Getter for FirstSixDigits.
     * First six digits
     * @return Returns the String
     */
    @JsonGetter("first_six_digits")
    public String getFirstSixDigits() {
        return firstSixDigits;
    }

    /**
     * Setter for FirstSixDigits.
     * First six digits
     * @param firstSixDigits Value for String
     */
    @JsonSetter("first_six_digits")
    public void setFirstSixDigits(String firstSixDigits) {
        this.firstSixDigits = firstSixDigits;
    }

    /**
     * Getter for Label.
     * @return Returns the String
     */
    @JsonGetter("label")
    public String getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * @param label Value for String
     */
    @JsonSetter("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Converts this GetCardResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCardResponse [" + "id=" + id + ", lastFourDigits=" + lastFourDigits + ", brand="
                + brand + ", holderName=" + holderName + ", expMonth=" + expMonth + ", expYear="
                + expYear + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt="
                + updatedAt + ", billingAddress=" + billingAddress + ", metadata=" + metadata
                + ", type=" + type + ", holderDocument=" + holderDocument + ", firstSixDigits="
                + firstSixDigits + ", label=" + label + ", customer=" + customer + ", deletedAt="
                + deletedAt + "]";
    }

    /**
     * Builds a new {@link GetCardResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCardResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, lastFourDigits, brand, holderName, expMonth, expYear,
                status, createdAt, updatedAt, billingAddress, metadata, type, holderDocument,
                firstSixDigits, label)
                .customer(getCustomer())
                .deletedAt(getDeletedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link GetCardResponse}.
     */
    public static class Builder {
        private String id;
        private String lastFourDigits;
        private String brand;
        private String holderName;
        private int expMonth;
        private int expYear;
        private String status;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private GetBillingAddressResponse billingAddress;
        private Map<String, String> metadata;
        private String type;
        private String holderDocument;
        private String firstSixDigits;
        private String label;
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
         * @param  lastFourDigits  String value for lastFourDigits.
         * @param  brand  String value for brand.
         * @param  holderName  String value for holderName.
         * @param  expMonth  int value for expMonth.
         * @param  expYear  int value for expYear.
         * @param  status  String value for status.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
         * @param  metadata  Map of String, value for metadata.
         * @param  type  String value for type.
         * @param  holderDocument  String value for holderDocument.
         * @param  firstSixDigits  String value for firstSixDigits.
         * @param  label  String value for label.
         */
        public Builder(String id, String lastFourDigits, String brand, String holderName,
                int expMonth, int expYear, String status, LocalDateTime createdAt,
                LocalDateTime updatedAt, GetBillingAddressResponse billingAddress,
                Map<String, String> metadata, String type, String holderDocument,
                String firstSixDigits, String label) {
            this.id = id;
            this.lastFourDigits = lastFourDigits;
            this.brand = brand;
            this.holderName = holderName;
            this.expMonth = expMonth;
            this.expYear = expYear;
            this.status = status;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.billingAddress = billingAddress;
            this.metadata = metadata;
            this.type = type;
            this.holderDocument = holderDocument;
            this.firstSixDigits = firstSixDigits;
            this.label = label;
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
         * Setter for lastFourDigits.
         * @param  lastFourDigits  String value for lastFourDigits.
         * @return Builder
         */
        public Builder lastFourDigits(String lastFourDigits) {
            this.lastFourDigits = lastFourDigits;
            return this;
        }

        /**
         * Setter for brand.
         * @param  brand  String value for brand.
         * @return Builder
         */
        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Setter for holderName.
         * @param  holderName  String value for holderName.
         * @return Builder
         */
        public Builder holderName(String holderName) {
            this.holderName = holderName;
            return this;
        }

        /**
         * Setter for expMonth.
         * @param  expMonth  int value for expMonth.
         * @return Builder
         */
        public Builder expMonth(int expMonth) {
            this.expMonth = expMonth;
            return this;
        }

        /**
         * Setter for expYear.
         * @param  expYear  int value for expYear.
         * @return Builder
         */
        public Builder expYear(int expYear) {
            this.expYear = expYear;
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
         * Setter for billingAddress.
         * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(GetBillingAddressResponse billingAddress) {
            this.billingAddress = billingAddress;
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
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for holderDocument.
         * @param  holderDocument  String value for holderDocument.
         * @return Builder
         */
        public Builder holderDocument(String holderDocument) {
            this.holderDocument = holderDocument;
            return this;
        }

        /**
         * Setter for firstSixDigits.
         * @param  firstSixDigits  String value for firstSixDigits.
         * @return Builder
         */
        public Builder firstSixDigits(String firstSixDigits) {
            this.firstSixDigits = firstSixDigits;
            return this;
        }

        /**
         * Setter for label.
         * @param  label  String value for label.
         * @return Builder
         */
        public Builder label(String label) {
            this.label = label;
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
         * Builds a new {@link GetCardResponse} object using the set fields.
         * @return {@link GetCardResponse}
         */
        public GetCardResponse build() {
            return new GetCardResponse(id, lastFourDigits, brand, holderName, expMonth, expYear,
                    status, createdAt, updatedAt, billingAddress, metadata, type, holderDocument,
                    firstSixDigits, label, customer, deletedAt);
        }
    }
}
