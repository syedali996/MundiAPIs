/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.Map;

/**
 * This is a model class for UpdateCardRequest type.
 */
public class UpdateCardRequest {
    private String holderName;
    private int expMonth;
    private int expYear;
    private String billingAddressId;
    private CreateAddressRequest billingAddress;
    private Map<String, String> metadata;
    private String label;

    /**
     * Default constructor.
     */
    public UpdateCardRequest() {
    }

    /**
     * Initialization constructor.
     * @param  holderName  String value for holderName.
     * @param  expMonth  int value for expMonth.
     * @param  expYear  int value for expYear.
     * @param  billingAddressId  String value for billingAddressId.
     * @param  billingAddress  CreateAddressRequest value for billingAddress.
     * @param  metadata  Map of String, value for metadata.
     * @param  label  String value for label.
     */
    public UpdateCardRequest(
            String holderName,
            int expMonth,
            int expYear,
            String billingAddressId,
            CreateAddressRequest billingAddress,
            Map<String, String> metadata,
            String label) {
        this.holderName = holderName;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.billingAddressId = billingAddressId;
        this.billingAddress = billingAddress;
        this.metadata = metadata;
        this.label = label;
    }

    /**
     * Getter for HolderName.
     * Holder name
     * @return Returns the String
     */
    @JsonGetter("holder_name")
    public String getHolderName() {
        return holderName;
    }

    /**
     * Setter for HolderName.
     * Holder name
     * @param holderName Value for String
     */
    @JsonSetter("holder_name")
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    /**
     * Getter for ExpMonth.
     * Expiration month
     * @return Returns the int
     */
    @JsonGetter("exp_month")
    public int getExpMonth() {
        return expMonth;
    }

    /**
     * Setter for ExpMonth.
     * Expiration month
     * @param expMonth Value for int
     */
    @JsonSetter("exp_month")
    public void setExpMonth(int expMonth) {
        this.expMonth = expMonth;
    }

    /**
     * Getter for ExpYear.
     * Expiration year
     * @return Returns the int
     */
    @JsonGetter("exp_year")
    public int getExpYear() {
        return expYear;
    }

    /**
     * Setter for ExpYear.
     * Expiration year
     * @param expYear Value for int
     */
    @JsonSetter("exp_year")
    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    /**
     * Getter for BillingAddressId.
     * Id of the address to be used as billing address
     * @return Returns the String
     */
    @JsonGetter("billing_address_id")
    public String getBillingAddressId() {
        return billingAddressId;
    }

    /**
     * Setter for BillingAddressId.
     * Id of the address to be used as billing address
     * @param billingAddressId Value for String
     */
    @JsonSetter("billing_address_id")
    public void setBillingAddressId(String billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    /**
     * Getter for BillingAddress.
     * Billing address
     * @return Returns the CreateAddressRequest
     */
    @JsonGetter("billing_address")
    public CreateAddressRequest getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * Billing address
     * @param billingAddress Value for CreateAddressRequest
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(CreateAddressRequest billingAddress) {
        this.billingAddress = billingAddress;
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
     * Converts this UpdateCardRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateCardRequest [" + "holderName=" + holderName + ", expMonth=" + expMonth
                + ", expYear=" + expYear + ", billingAddressId=" + billingAddressId
                + ", billingAddress=" + billingAddress + ", metadata=" + metadata + ", label="
                + label + "]";
    }

    /**
     * Builds a new {@link UpdateCardRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateCardRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(holderName, expMonth, expYear, billingAddressId,
                billingAddress, metadata, label);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateCardRequest}.
     */
    public static class Builder {
        private String holderName;
        private int expMonth;
        private int expYear;
        private String billingAddressId;
        private CreateAddressRequest billingAddress;
        private Map<String, String> metadata;
        private String label;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  holderName  String value for holderName.
         * @param  expMonth  int value for expMonth.
         * @param  expYear  int value for expYear.
         * @param  billingAddressId  String value for billingAddressId.
         * @param  billingAddress  CreateAddressRequest value for billingAddress.
         * @param  metadata  Map of String, value for metadata.
         * @param  label  String value for label.
         */
        public Builder(String holderName, int expMonth, int expYear, String billingAddressId,
                CreateAddressRequest billingAddress, Map<String, String> metadata, String label) {
            this.holderName = holderName;
            this.expMonth = expMonth;
            this.expYear = expYear;
            this.billingAddressId = billingAddressId;
            this.billingAddress = billingAddress;
            this.metadata = metadata;
            this.label = label;
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
         * Setter for billingAddressId.
         * @param  billingAddressId  String value for billingAddressId.
         * @return Builder
         */
        public Builder billingAddressId(String billingAddressId) {
            this.billingAddressId = billingAddressId;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  CreateAddressRequest value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(CreateAddressRequest billingAddress) {
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
         * Setter for label.
         * @param  label  String value for label.
         * @return Builder
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Builds a new {@link UpdateCardRequest} object using the set fields.
         * @return {@link UpdateCardRequest}
         */
        public UpdateCardRequest build() {
            return new UpdateCardRequest(holderName, expMonth, expYear, billingAddressId,
                    billingAddress, metadata, label);
        }
    }
}
