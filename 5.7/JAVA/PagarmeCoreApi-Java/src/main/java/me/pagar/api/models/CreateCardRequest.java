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
import java.util.Map;

/**
 * This is a model class for CreateCardRequest type.
 */
public class CreateCardRequest {
    private String number;
    private String holderName;
    private int expMonth;
    private int expYear;
    private String cvv;
    private CreateAddressRequest billingAddress;
    private String brand;
    private String billingAddressId;
    private Map<String, String> metadata;
    private String type;
    private CreateCardOptionsRequest options;
    private String holderDocument;
    private boolean privateLabel;
    private String label;
    private String id;
    private String token;

    /**
     * Default constructor.
     */
    public CreateCardRequest() {
        type = "credit";
    }

    /**
     * Initialization constructor.
     * @param  number  String value for number.
     * @param  holderName  String value for holderName.
     * @param  expMonth  int value for expMonth.
     * @param  expYear  int value for expYear.
     * @param  cvv  String value for cvv.
     * @param  billingAddress  CreateAddressRequest value for billingAddress.
     * @param  brand  String value for brand.
     * @param  billingAddressId  String value for billingAddressId.
     * @param  metadata  Map of String, value for metadata.
     * @param  type  String value for type.
     * @param  options  CreateCardOptionsRequest value for options.
     * @param  privateLabel  boolean value for privateLabel.
     * @param  label  String value for label.
     * @param  holderDocument  String value for holderDocument.
     * @param  id  String value for id.
     * @param  token  String value for token.
     */
    public CreateCardRequest(
            String number,
            String holderName,
            int expMonth,
            int expYear,
            String cvv,
            CreateAddressRequest billingAddress,
            String brand,
            String billingAddressId,
            Map<String, String> metadata,
            String type,
            CreateCardOptionsRequest options,
            boolean privateLabel,
            String label,
            String holderDocument,
            String id,
            String token) {
        this.number = number;
        this.holderName = holderName;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cvv = cvv;
        this.billingAddress = billingAddress;
        this.brand = brand;
        this.billingAddressId = billingAddressId;
        this.metadata = metadata;
        this.type = type;
        this.options = options;
        this.holderDocument = holderDocument;
        this.privateLabel = privateLabel;
        this.label = label;
        this.id = id;
        this.token = token;
    }

    /**
     * Getter for Number.
     * Credit card number
     * @return Returns the String
     */
    @JsonGetter("number")
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * Credit card number
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter for HolderName.
     * Holder name, as written on the card
     * @return Returns the String
     */
    @JsonGetter("holder_name")
    public String getHolderName() {
        return holderName;
    }

    /**
     * Setter for HolderName.
     * Holder name, as written on the card
     * @param holderName Value for String
     */
    @JsonSetter("holder_name")
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    /**
     * Getter for ExpMonth.
     * The expiration month
     * @return Returns the int
     */
    @JsonGetter("exp_month")
    public int getExpMonth() {
        return expMonth;
    }

    /**
     * Setter for ExpMonth.
     * The expiration month
     * @param expMonth Value for int
     */
    @JsonSetter("exp_month")
    public void setExpMonth(int expMonth) {
        this.expMonth = expMonth;
    }

    /**
     * Getter for ExpYear.
     * The expiration year, that can be informed with 2 or 4 digits
     * @return Returns the int
     */
    @JsonGetter("exp_year")
    public int getExpYear() {
        return expYear;
    }

    /**
     * Setter for ExpYear.
     * The expiration year, that can be informed with 2 or 4 digits
     * @param expYear Value for int
     */
    @JsonSetter("exp_year")
    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    /**
     * Getter for Cvv.
     * The card's security code
     * @return Returns the String
     */
    @JsonGetter("cvv")
    public String getCvv() {
        return cvv;
    }

    /**
     * Setter for Cvv.
     * The card's security code
     * @param cvv Value for String
     */
    @JsonSetter("cvv")
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    /**
     * Getter for BillingAddress.
     * Card's billing address
     * @return Returns the CreateAddressRequest
     */
    @JsonGetter("billing_address")
    public CreateAddressRequest getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * Card's billing address
     * @param billingAddress Value for CreateAddressRequest
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(CreateAddressRequest billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for Brand.
     * Card brand
     * @return Returns the String
     */
    @JsonGetter("brand")
    public String getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * Card brand
     * @param brand Value for String
     */
    @JsonSetter("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter for BillingAddressId.
     * The address id for the billing address
     * @return Returns the String
     */
    @JsonGetter("billing_address_id")
    public String getBillingAddressId() {
        return billingAddressId;
    }

    /**
     * Setter for BillingAddressId.
     * The address id for the billing address
     * @param billingAddressId Value for String
     */
    @JsonSetter("billing_address_id")
    public void setBillingAddressId(String billingAddressId) {
        this.billingAddressId = billingAddressId;
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
     * Getter for Options.
     * Options for creating the card
     * @return Returns the CreateCardOptionsRequest
     */
    @JsonGetter("options")
    public CreateCardOptionsRequest getOptions() {
        return options;
    }

    /**
     * Setter for Options.
     * Options for creating the card
     * @param options Value for CreateCardOptionsRequest
     */
    @JsonSetter("options")
    public void setOptions(CreateCardOptionsRequest options) {
        this.options = options;
    }

    /**
     * Getter for HolderDocument.
     * Document number for the card's holder
     * @return Returns the String
     */
    @JsonGetter("holder_document")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for PrivateLabel.
     * Indicates whether it is a private label card
     * @return Returns the boolean
     */
    @JsonGetter("private_label")
    public boolean getPrivateLabel() {
        return privateLabel;
    }

    /**
     * Setter for PrivateLabel.
     * Indicates whether it is a private label card
     * @param privateLabel Value for boolean
     */
    @JsonSetter("private_label")
    public void setPrivateLabel(boolean privateLabel) {
        this.privateLabel = privateLabel;
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
     * Getter for Id.
     * Identifier
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Identifier
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Token.
     * token identifier
     * @return Returns the String
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * token identifier
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Converts this CreateCardRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCardRequest [" + "number=" + number + ", holderName=" + holderName
                + ", expMonth=" + expMonth + ", expYear=" + expYear + ", cvv=" + cvv
                + ", billingAddress=" + billingAddress + ", brand=" + brand + ", billingAddressId="
                + billingAddressId + ", metadata=" + metadata + ", type=" + type + ", options="
                + options + ", privateLabel=" + privateLabel + ", label=" + label
                + ", holderDocument=" + holderDocument + ", id=" + id + ", token=" + token + "]";
    }

    /**
     * Builds a new {@link CreateCardRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCardRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(number, holderName, expMonth, expYear, cvv, billingAddress,
                brand, billingAddressId, metadata, type, options, privateLabel, label)
                .holderDocument(getHolderDocument())
                .id(getId())
                .token(getToken());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCardRequest}.
     */
    public static class Builder {
        private String number;
        private String holderName;
        private int expMonth;
        private int expYear;
        private String cvv;
        private CreateAddressRequest billingAddress;
        private String brand;
        private String billingAddressId;
        private Map<String, String> metadata;
        private String type = "credit";
        private CreateCardOptionsRequest options;
        private boolean privateLabel;
        private String label;
        private String holderDocument;
        private String id;
        private String token;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  number  String value for number.
         * @param  holderName  String value for holderName.
         * @param  expMonth  int value for expMonth.
         * @param  expYear  int value for expYear.
         * @param  cvv  String value for cvv.
         * @param  billingAddress  CreateAddressRequest value for billingAddress.
         * @param  brand  String value for brand.
         * @param  billingAddressId  String value for billingAddressId.
         * @param  metadata  Map of String, value for metadata.
         * @param  type  String value for type.
         * @param  options  CreateCardOptionsRequest value for options.
         * @param  privateLabel  boolean value for privateLabel.
         * @param  label  String value for label.
         */
        public Builder(String number, String holderName, int expMonth, int expYear, String cvv,
                CreateAddressRequest billingAddress, String brand, String billingAddressId,
                Map<String, String> metadata, String type, CreateCardOptionsRequest options,
                boolean privateLabel, String label) {
            this.number = number;
            this.holderName = holderName;
            this.expMonth = expMonth;
            this.expYear = expYear;
            this.cvv = cvv;
            this.billingAddress = billingAddress;
            this.brand = brand;
            this.billingAddressId = billingAddressId;
            this.metadata = metadata;
            this.type = type;
            this.options = options;
            this.privateLabel = privateLabel;
            this.label = label;
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
         * Setter for cvv.
         * @param  cvv  String value for cvv.
         * @return Builder
         */
        public Builder cvv(String cvv) {
            this.cvv = cvv;
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
         * Setter for brand.
         * @param  brand  String value for brand.
         * @return Builder
         */
        public Builder brand(String brand) {
            this.brand = brand;
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
         * Setter for options.
         * @param  options  CreateCardOptionsRequest value for options.
         * @return Builder
         */
        public Builder options(CreateCardOptionsRequest options) {
            this.options = options;
            return this;
        }

        /**
         * Setter for privateLabel.
         * @param  privateLabel  boolean value for privateLabel.
         * @return Builder
         */
        public Builder privateLabel(boolean privateLabel) {
            this.privateLabel = privateLabel;
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
         * Setter for holderDocument.
         * @param  holderDocument  String value for holderDocument.
         * @return Builder
         */
        public Builder holderDocument(String holderDocument) {
            this.holderDocument = holderDocument;
            return this;
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
         * Setter for token.
         * @param  token  String value for token.
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Builds a new {@link CreateCardRequest} object using the set fields.
         * @return {@link CreateCardRequest}
         */
        public CreateCardRequest build() {
            return new CreateCardRequest(number, holderName, expMonth, expYear, cvv, billingAddress,
                    brand, billingAddressId, metadata, type, options, privateLabel, label,
                    holderDocument, id, token);
        }
    }
}
