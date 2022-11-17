/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for ListInvoicesResponse type.
 */
public class ListInvoicesResponse {
    private List<GetInvoiceResponse> data;
    private PagingResponse paging;

    /**
     * Default constructor.
     */
    public ListInvoicesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetInvoiceResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListInvoicesResponse(
            List<GetInvoiceResponse> data,
            PagingResponse paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Getter for Data.
     * The Invoice objects
     * @return Returns the List of GetInvoiceResponse
     */
    @JsonGetter("data")
    public List<GetInvoiceResponse> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * The Invoice objects
     * @param data Value for List of GetInvoiceResponse
     */
    @JsonSetter("data")
    public void setData(List<GetInvoiceResponse> data) {
        this.data = data;
    }

    /**
     * Getter for Paging.
     * Paging object
     * @return Returns the PagingResponse
     */
    @JsonGetter("paging")
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
     * Converts this ListInvoicesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListInvoicesResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListInvoicesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListInvoicesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data, paging);
        return builder;
    }

    /**
     * Class to build instances of {@link ListInvoicesResponse}.
     */
    public static class Builder {
        private List<GetInvoiceResponse> data;
        private PagingResponse paging;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of GetInvoiceResponse value for data.
         * @param  paging  PagingResponse value for paging.
         */
        public Builder(List<GetInvoiceResponse> data, PagingResponse paging) {
            this.data = data;
            this.paging = paging;
        }

        /**
         * Setter for data.
         * @param  data  List of GetInvoiceResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetInvoiceResponse> data) {
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
         * Builds a new {@link ListInvoicesResponse} object using the set fields.
         * @return {@link ListInvoicesResponse}
         */
        public ListInvoicesResponse build() {
            return new ListInvoicesResponse(data, paging);
        }
    }
}
