/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for ListTransactionsResponse type.
 */
public class ListTransactionsResponse {
    private List<GetTransactionResponse> data;
    private PagingResponse paging;

    /**
     * Default constructor.
     */
    public ListTransactionsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetTransactionResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListTransactionsResponse(
            List<GetTransactionResponse> data,
            PagingResponse paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Getter for Data.
     * The transaction objects
     * @return Returns the List of GetTransactionResponse
     */
    @JsonGetter("data")
    public List<GetTransactionResponse> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * The transaction objects
     * @param data Value for List of GetTransactionResponse
     */
    @JsonSetter("data")
    public void setData(List<GetTransactionResponse> data) {
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
     * Converts this ListTransactionsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListTransactionsResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListTransactionsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListTransactionsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data, paging);
        return builder;
    }

    /**
     * Class to build instances of {@link ListTransactionsResponse}.
     */
    public static class Builder {
        private List<GetTransactionResponse> data;
        private PagingResponse paging;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of GetTransactionResponse value for data.
         * @param  paging  PagingResponse value for paging.
         */
        public Builder(List<GetTransactionResponse> data, PagingResponse paging) {
            this.data = data;
            this.paging = paging;
        }

        /**
         * Setter for data.
         * @param  data  List of GetTransactionResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetTransactionResponse> data) {
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
         * Builds a new {@link ListTransactionsResponse} object using the set fields.
         * @return {@link ListTransactionsResponse}
         */
        public ListTransactionsResponse build() {
            return new ListTransactionsResponse(data, paging);
        }
    }
}
