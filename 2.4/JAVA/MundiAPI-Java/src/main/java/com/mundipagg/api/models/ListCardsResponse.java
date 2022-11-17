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
 * This is a model class for ListCardsResponse type.
 */
public class ListCardsResponse {
    private List<GetCardResponse> data;
    private PagingResponse paging;

    /**
     * Default constructor.
     */
    public ListCardsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetCardResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListCardsResponse(
            List<GetCardResponse> data,
            PagingResponse paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Getter for Data.
     * The card objects
     * @return Returns the List of GetCardResponse
     */
    @JsonGetter("data")
    public List<GetCardResponse> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * The card objects
     * @param data Value for List of GetCardResponse
     */
    @JsonSetter("data")
    public void setData(List<GetCardResponse> data) {
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
     * Converts this ListCardsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCardsResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListCardsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCardsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data, paging);
        return builder;
    }

    /**
     * Class to build instances of {@link ListCardsResponse}.
     */
    public static class Builder {
        private List<GetCardResponse> data;
        private PagingResponse paging;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of GetCardResponse value for data.
         * @param  paging  PagingResponse value for paging.
         */
        public Builder(List<GetCardResponse> data, PagingResponse paging) {
            this.data = data;
            this.paging = paging;
        }

        /**
         * Setter for data.
         * @param  data  List of GetCardResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetCardResponse> data) {
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
         * Builds a new {@link ListCardsResponse} object using the set fields.
         * @return {@link ListCardsResponse}
         */
        public ListCardsResponse build() {
            return new ListCardsResponse(data, paging);
        }
    }
}
