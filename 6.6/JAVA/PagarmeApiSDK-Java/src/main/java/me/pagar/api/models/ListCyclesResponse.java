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
 * This is a model class for ListCyclesResponse type.
 */
public class ListCyclesResponse {
    private List<GetPeriodResponse> data;
    private PagingResponse paging;

    /**
     * Default constructor.
     */
    public ListCyclesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetPeriodResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListCyclesResponse(
            List<GetPeriodResponse> data,
            PagingResponse paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Getter for Data.
     * The subscription cycles objects
     * @return Returns the List of GetPeriodResponse
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GetPeriodResponse> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * The subscription cycles objects
     * @param data Value for List of GetPeriodResponse
     */
    @JsonSetter("data")
    public void setData(List<GetPeriodResponse> data) {
        this.data = data;
    }

    /**
     * Getter for Paging.
     * Paging object
     * @return Returns the PagingResponse
     */
    @JsonGetter("paging")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PagingResponse getPaging() {
        return paging;
    }

    /**
     * Setter for Paging.
     * Paging object
     * @param paging Value for PagingResponse
     */
    @JsonSetter("paging")
    public void setPaging(PagingResponse paging) {
        this.paging = paging;
    }

    /**
     * Converts this ListCyclesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCyclesResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListCyclesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCyclesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .data(getData())
                .paging(getPaging());
        return builder;
    }

    /**
     * Class to build instances of {@link ListCyclesResponse}.
     */
    public static class Builder {
        private List<GetPeriodResponse> data;
        private PagingResponse paging;



        /**
         * Setter for data.
         * @param  data  List of GetPeriodResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetPeriodResponse> data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for paging.
         * @param  paging  PagingResponse value for paging.
         * @return Builder
         */
        public Builder paging(PagingResponse paging) {
            this.paging = paging;
            return this;
        }

        /**
         * Builds a new {@link ListCyclesResponse} object using the set fields.
         * @return {@link ListCyclesResponse}
         */
        public ListCyclesResponse build() {
            return new ListCyclesResponse(data, paging);
        }
    }
}
