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
 * This is a model class for GetCardTokenResponse type.
 */
public class GetCardTokenResponse {
    private String lastFourDigits;
    private String holderName;
    private String holderDocument;
    private String expMonth;
    private String expYear;
    private String brand;
    private String type;
    private String label;

    /**
     * Default constructor.
     */
    public GetCardTokenResponse() {
    }

    /**
     * Initialization constructor.
     * @param  lastFourDigits  String value for lastFourDigits.
     * @param  holderName  String value for holderName.
     * @param  holderDocument  String value for holderDocument.
     * @param  expMonth  String value for expMonth.
     * @param  expYear  String value for expYear.
     * @param  brand  String value for brand.
     * @param  type  String value for type.
     * @param  label  String value for label.
     */
    public GetCardTokenResponse(
            String lastFourDigits,
            String holderName,
            String holderDocument,
            String expMonth,
            String expYear,
            String brand,
            String type,
            String label) {
        this.lastFourDigits = lastFourDigits;
        this.holderName = holderName;
        this.holderDocument = holderDocument;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.brand = brand;
        this.type = type;
        this.label = label;
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
     * Getter for HolderDocument.
     * @return Returns the String
     */
    @JsonGetter("holder_document")
    public String getHolderDocument() {
        return holderDocument;
    }

    /**
     * Setter for HolderDocument.
     * @param holderDocument Value for String
     */
    @JsonSetter("holder_document")
    public void setHolderDocument(String holderDocument) {
        this.holderDocument = holderDocument;
    }

    /**
     * Getter for ExpMonth.
     * @return Returns the String
     */
    @JsonGetter("exp_month")
    public String getExpMonth() {
        return expMonth;
    }

    /**
     * Setter for ExpMonth.
     * @param expMonth Value for String
     */
    @JsonSetter("exp_month")
    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    /**
     * Getter for ExpYear.
     * @return Returns the String
     */
    @JsonGetter("exp_year")
    public String getExpYear() {
        return expYear;
    }

    /**
     * Setter for ExpYear.
     * @param expYear Value for String
     */
    @JsonSetter("exp_year")
    public void setExpYear(String expYear) {
        this.expYear = expYear;
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
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
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
     * Converts this GetCardTokenResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCardTokenResponse [" + "lastFourDigits=" + lastFourDigits + ", holderName="
                + holderName + ", holderDocument=" + holderDocument + ", expMonth=" + expMonth
                + ", expYear=" + expYear + ", brand=" + brand + ", type=" + type + ", label="
                + label + "]";
    }

    /**
     * Builds a new {@link GetCardTokenResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCardTokenResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(lastFourDigits, holderName, holderDocument, expMonth, expYear,
                brand, type, label);
        return builder;
    }

    /**
     * Class to build instances of {@link GetCardTokenResponse}.
     */
    public static class Builder {
        private String lastFourDigits;
        private String holderName;
        private String holderDocument;
        private String expMonth;
        private String expYear;
        private String brand;
        private String type;
        private String label;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  lastFourDigits  String value for lastFourDigits.
         * @param  holderName  String value for holderName.
         * @param  holderDocument  String value for holderDocument.
         * @param  expMonth  String value for expMonth.
         * @param  expYear  String value for expYear.
         * @param  brand  String value for brand.
         * @param  type  String value for type.
         * @param  label  String value for label.
         */
        public Builder(String lastFourDigits, String holderName, String holderDocument,
                String expMonth, String expYear, String brand, String type, String label) {
            this.lastFourDigits = lastFourDigits;
            this.holderName = holderName;
            this.holderDocument = holderDocument;
            this.expMonth = expMonth;
            this.expYear = expYear;
            this.brand = brand;
            this.type = type;
            this.label = label;
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
         * Setter for holderName.
         * @param  holderName  String value for holderName.
         * @return Builder
         */
        public Builder holderName(String holderName) {
            this.holderName = holderName;
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
         * Setter for expMonth.
         * @param  expMonth  String value for expMonth.
         * @return Builder
         */
        public Builder expMonth(String expMonth) {
            this.expMonth = expMonth;
            return this;
        }

        /**
         * Setter for expYear.
         * @param  expYear  String value for expYear.
         * @return Builder
         */
        public Builder expYear(String expYear) {
            this.expYear = expYear;
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
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
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
         * Builds a new {@link GetCardTokenResponse} object using the set fields.
         * @return {@link GetCardTokenResponse}
         */
        public GetCardTokenResponse build() {
            return new GetCardTokenResponse(lastFourDigits, holderName, holderDocument, expMonth,
                    expYear, brand, type, label);
        }
    }
}
