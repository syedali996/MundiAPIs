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
 * This is a model class for GetPriceBracketResponse type.
 */
public class GetPriceBracketResponse {
    private int startQuantity;
    private int price;
    private Integer endQuantity;
    private Integer overagePrice;

    /**
     * Default constructor.
     */
    public GetPriceBracketResponse() {
    }

    /**
     * Initialization constructor.
     * @param  startQuantity  int value for startQuantity.
     * @param  price  int value for price.
     * @param  endQuantity  Integer value for endQuantity.
     * @param  overagePrice  Integer value for overagePrice.
     */
    public GetPriceBracketResponse(
            int startQuantity,
            int price,
            Integer endQuantity,
            Integer overagePrice) {
        this.startQuantity = startQuantity;
        this.price = price;
        this.endQuantity = endQuantity;
        this.overagePrice = overagePrice;
    }

    /**
     * Getter for StartQuantity.
     * @return Returns the int
     */
    @JsonGetter("start_quantity")
    public int getStartQuantity() {
        return startQuantity;
    }

    /**
     * Setter for StartQuantity.
     * @param startQuantity Value for int
     */
    @JsonSetter("start_quantity")
    public void setStartQuantity(int startQuantity) {
        this.startQuantity = startQuantity;
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
     * Getter for EndQuantity.
     * @return Returns the Integer
     */
    @JsonGetter("end_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getEndQuantity() {
        return endQuantity;
    }

    /**
     * Setter for EndQuantity.
     * @param endQuantity Value for Integer
     */
    @JsonSetter("end_quantity")
    public void setEndQuantity(Integer endQuantity) {
        this.endQuantity = endQuantity;
    }

    /**
     * Getter for OveragePrice.
     * @return Returns the Integer
     */
    @JsonGetter("overage_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOveragePrice() {
        return overagePrice;
    }

    /**
     * Setter for OveragePrice.
     * @param overagePrice Value for Integer
     */
    @JsonSetter("overage_price")
    public void setOveragePrice(Integer overagePrice) {
        this.overagePrice = overagePrice;
    }

    /**
     * Converts this GetPriceBracketResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPriceBracketResponse [" + "startQuantity=" + startQuantity + ", price=" + price
                + ", endQuantity=" + endQuantity + ", overagePrice=" + overagePrice + "]";
    }

    /**
     * Builds a new {@link GetPriceBracketResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPriceBracketResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(startQuantity, price)
                .endQuantity(getEndQuantity())
                .overagePrice(getOveragePrice());
        return builder;
    }

    /**
     * Class to build instances of {@link GetPriceBracketResponse}.
     */
    public static class Builder {
        private int startQuantity;
        private int price;
        private Integer endQuantity;
        private Integer overagePrice;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  startQuantity  int value for startQuantity.
         * @param  price  int value for price.
         */
        public Builder(int startQuantity, int price) {
            this.startQuantity = startQuantity;
            this.price = price;
        }

        /**
         * Setter for startQuantity.
         * @param  startQuantity  int value for startQuantity.
         * @return Builder
         */
        public Builder startQuantity(int startQuantity) {
            this.startQuantity = startQuantity;
            return this;
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
         * Setter for endQuantity.
         * @param  endQuantity  Integer value for endQuantity.
         * @return Builder
         */
        public Builder endQuantity(Integer endQuantity) {
            this.endQuantity = endQuantity;
            return this;
        }

        /**
         * Setter for overagePrice.
         * @param  overagePrice  Integer value for overagePrice.
         * @return Builder
         */
        public Builder overagePrice(Integer overagePrice) {
            this.overagePrice = overagePrice;
            return this;
        }

        /**
         * Builds a new {@link GetPriceBracketResponse} object using the set fields.
         * @return {@link GetPriceBracketResponse}
         */
        public GetPriceBracketResponse build() {
            return new GetPriceBracketResponse(startQuantity, price, endQuantity, overagePrice);
        }
    }
}
