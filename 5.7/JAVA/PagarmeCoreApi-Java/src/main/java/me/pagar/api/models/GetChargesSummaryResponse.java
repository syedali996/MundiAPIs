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
 * This is a model class for GetChargesSummaryResponse type.
 */
public class GetChargesSummaryResponse {
    private int total;

    /**
     * Default constructor.
     */
    public GetChargesSummaryResponse() {
    }

    /**
     * Initialization constructor.
     * @param  total  int value for total.
     */
    public GetChargesSummaryResponse(
            int total) {
        this.total = total;
    }

    /**
     * Getter for Total.
     * @return Returns the int
     */
    @JsonGetter("total")
    public int getTotal() {
        return total;
    }

    /**
     * Setter for Total.
     * @param total Value for int
     */
    @JsonSetter("total")
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Converts this GetChargesSummaryResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetChargesSummaryResponse [" + "total=" + total + "]";
    }

    /**
     * Builds a new {@link GetChargesSummaryResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetChargesSummaryResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(total);
        return builder;
    }

    /**
     * Class to build instances of {@link GetChargesSummaryResponse}.
     */
    public static class Builder {
        private int total;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  total  int value for total.
         */
        public Builder(int total) {
            this.total = total;
        }

        /**
         * Setter for total.
         * @param  total  int value for total.
         * @return Builder
         */
        public Builder total(int total) {
            this.total = total;
            return this;
        }

        /**
         * Builds a new {@link GetChargesSummaryResponse} object using the set fields.
         * @return {@link GetChargesSummaryResponse}
         */
        public GetChargesSummaryResponse build() {
            return new GetChargesSummaryResponse(total);
        }
    }
}
