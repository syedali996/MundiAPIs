/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for GetPricingSchemeResponse type.
 */
public class GetPricingSchemeResponse {
    private int price;
    private String schemeType;
    private List<GetPriceBracketResponse> priceBrackets;
    private Integer minimumPrice;
    private Double percentage;

    /**
     * Default constructor.
     */
    public GetPricingSchemeResponse() {
    }

    /**
     * Initialization constructor.
     * @param  price  int value for price.
     * @param  schemeType  String value for schemeType.
     * @param  priceBrackets  List of GetPriceBracketResponse value for priceBrackets.
     * @param  minimumPrice  Integer value for minimumPrice.
     * @param  percentage  Double value for percentage.
     */
    public GetPricingSchemeResponse(
            int price,
            String schemeType,
            List<GetPriceBracketResponse> priceBrackets,
            Integer minimumPrice,
            Double percentage) {
        this.price = price;
        this.schemeType = schemeType;
        this.priceBrackets = priceBrackets;
        this.minimumPrice = minimumPrice;
        this.percentage = percentage;
    }

    /**
     * Getter for Price.
     * @return Returns the int
     */
    @JsonGetter("price")
    public int getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * @param price Value for int
     */
    @JsonSetter("price")
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Getter for SchemeType.
     * @return Returns the String
     */
    @JsonGetter("scheme_type")
    public String getSchemeType() {
        return schemeType;
    }

    /**
     * Setter for SchemeType.
     * @param schemeType Value for String
     */
    @JsonSetter("scheme_type")
    public void setSchemeType(String schemeType) {
        this.schemeType = schemeType;
    }

    /**
     * Getter for PriceBrackets.
     * @return Returns the List of GetPriceBracketResponse
     */
    @JsonGetter("price_brackets")
    public List<GetPriceBracketResponse> getPriceBrackets() {
        return priceBrackets;
    }

    /**
     * Setter for PriceBrackets.
     * @param priceBrackets Value for List of GetPriceBracketResponse
     */
    @JsonSetter("price_brackets")
    public void setPriceBrackets(List<GetPriceBracketResponse> priceBrackets) {
        this.priceBrackets = priceBrackets;
    }

    /**
     * Getter for MinimumPrice.
     * @return Returns the Integer
     */
    @JsonGetter("minimum_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Setter for MinimumPrice.
     * @param minimumPrice Value for Integer
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice(Integer minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    /**
     * Getter for Percentage.
     * percentual value used in pricing_scheme Percent
     * @return Returns the Double
     */
    @JsonGetter("percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPercentage() {
        return percentage;
    }

    /**
     * Setter for Percentage.
     * percentual value used in pricing_scheme Percent
     * @param percentage Value for Double
     */
    @JsonSetter("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    /**
     * Converts this GetPricingSchemeResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPricingSchemeResponse [" + "price=" + price + ", schemeType=" + schemeType
                + ", priceBrackets=" + priceBrackets + ", minimumPrice=" + minimumPrice
                + ", percentage=" + percentage + "]";
    }

    /**
     * Builds a new {@link GetPricingSchemeResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPricingSchemeResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(price, schemeType, priceBrackets)
                .minimumPrice(getMinimumPrice())
                .percentage(getPercentage());
        return builder;
    }

    /**
     * Class to build instances of {@link GetPricingSchemeResponse}.
     */
    public static class Builder {
        private int price;
        private String schemeType;
        private List<GetPriceBracketResponse> priceBrackets;
        private Integer minimumPrice;
        private Double percentage;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  price  int value for price.
         * @param  schemeType  String value for schemeType.
         * @param  priceBrackets  List of GetPriceBracketResponse value for priceBrackets.
         */
        public Builder(int price, String schemeType, List<GetPriceBracketResponse> priceBrackets) {
            this.price = price;
            this.schemeType = schemeType;
            this.priceBrackets = priceBrackets;
        }

        /**
         * Setter for price.
         * @param  price  int value for price.
         * @return Builder
         */
        public Builder price(int price) {
            this.price = price;
            return this;
        }

        /**
         * Setter for schemeType.
         * @param  schemeType  String value for schemeType.
         * @return Builder
         */
        public Builder schemeType(String schemeType) {
            this.schemeType = schemeType;
            return this;
        }

        /**
         * Setter for priceBrackets.
         * @param  priceBrackets  List of GetPriceBracketResponse value for priceBrackets.
         * @return Builder
         */
        public Builder priceBrackets(List<GetPriceBracketResponse> priceBrackets) {
            this.priceBrackets = priceBrackets;
            return this;
        }

        /**
         * Setter for minimumPrice.
         * @param  minimumPrice  Integer value for minimumPrice.
         * @return Builder
         */
        public Builder minimumPrice(Integer minimumPrice) {
            this.minimumPrice = minimumPrice;
            return this;
        }

        /**
         * Setter for percentage.
         * @param  percentage  Double value for percentage.
         * @return Builder
         */
        public Builder percentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }

        /**
         * Builds a new {@link GetPricingSchemeResponse} object using the set fields.
         * @return {@link GetPricingSchemeResponse}
         */
        public GetPricingSchemeResponse build() {
            return new GetPricingSchemeResponse(price, schemeType, priceBrackets, minimumPrice,
                    percentage);
        }
    }
}