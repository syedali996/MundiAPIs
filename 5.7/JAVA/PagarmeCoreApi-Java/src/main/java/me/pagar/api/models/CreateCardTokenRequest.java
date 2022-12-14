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
 * This is a model class for CreateCardTokenRequest type.
 */
public class CreateCardTokenRequest {
    private String number;
    private String holderName;
    private int expMonth;
    private int expYear;
    private String cvv;
    private String brand;
    private String label;

    /**
     * Default constructor.
     */
    public CreateCardTokenRequest() {
    }

    /**
     * Initialization constructor.
     * @param  number  String value for number.
     * @param  holderName  String value for holderName.
     * @param  expMonth  int value for expMonth.
     * @param  expYear  int value for expYear.
     * @param  cvv  String value for cvv.
     * @param  brand  String value for brand.
     * @param  label  String value for label.
     */
    public CreateCardTokenRequest(
            String number,
            String holderName,
            int expMonth,
            int expYear,
            String cvv,
            String brand,
            String label) {
        this.number = number;
        this.holderName = holderName;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cvv = cvv;
        this.brand = brand;
        this.label = label;
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
     * Converts this CreateCardTokenRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCardTokenRequest [" + "number=" + number + ", holderName=" + holderName
                + ", expMonth=" + expMonth + ", expYear=" + expYear + ", cvv=" + cvv + ", brand="
                + brand + ", label=" + label + "]";
    }

    /**
     * Builds a new {@link CreateCardTokenRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCardTokenRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(number, holderName, expMonth, expYear, cvv, brand, label);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCardTokenRequest}.
     */
    public static class Builder {
        private String number;
        private String holderName;
        private int expMonth;
        private int expYear;
        private String cvv;
        private String brand;
        private String label;

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
         * @param  brand  String value for brand.
         * @param  label  String value for label.
         */
        public Builder(String number, String holderName, int expMonth, int expYear, String cvv,
                String brand, String label) {
            this.number = number;
            this.holderName = holderName;
            this.expMonth = expMonth;
            this.expYear = expYear;
            this.cvv = cvv;
            this.brand = brand;
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
         * Setter for brand.
         * @param  brand  String value for brand.
         * @return Builder
         */
        public Builder brand(String brand) {
            this.brand = brand;
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
         * Builds a new {@link CreateCardTokenRequest} object using the set fields.
         * @return {@link CreateCardTokenRequest}
         */
        public CreateCardTokenRequest build() {
            return new CreateCardTokenRequest(number, holderName, expMonth, expYear, cvv, brand,
                    label);
        }
    }
}
