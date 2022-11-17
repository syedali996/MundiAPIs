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
 * This is a model class for ListTransfers type.
 */
public class ListTransfers {
    private List<GetTransfer> data;
    private PagingResponse paging;

    /**
     * Default constructor.
     */
    public ListTransfers() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetTransfer value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListTransfers(
            List<GetTransfer> data,
            PagingResponse paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Getter for Data.
     * The Increments response
     * @return Returns the List of GetTransfer
     */
    @JsonGetter("data")
    public List<GetTransfer> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * The Increments response
     * @param data Value for List of GetTransfer
     */
    @JsonSetter("data")
    public void setData(List<GetTransfer> data) {
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
     * Converts this ListTransfers into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListTransfers [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListTransfers.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListTransfers.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data, paging);
        return builder;
    }

    /**
     * Class to build instances of {@link ListTransfers}.
     */
    public static class Builder {
        private List<GetTransfer> data;
        private PagingResponse paging;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of GetTransfer value for data.
         * @param  paging  PagingResponse value for paging.
         */
        public Builder(List<GetTransfer> data, PagingResponse paging) {
            this.data = data;
            this.paging = paging;
        }

        /**
         * Setter for data.
         * @param  data  List of GetTransfer value for data.
         * @return Builder
         */
        public Builder data(List<GetTransfer> data) {
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
         * Builds a new {@link ListTransfers} object using the set fields.
         * @return {@link ListTransfers}
         */
        public ListTransfers build() {
            return new ListTransfers(data, paging);
        }
    }
}
