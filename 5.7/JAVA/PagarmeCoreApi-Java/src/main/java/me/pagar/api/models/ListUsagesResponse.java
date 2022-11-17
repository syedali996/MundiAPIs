/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for ListUsagesResponse type.
 */
public class ListUsagesResponse {
    private List<GetUsageResponse> data;
    private PagingResponse paging;

    /**
     * Default constructor.
     */
    public ListUsagesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetUsageResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListUsagesResponse(
            List<GetUsageResponse> data,
            PagingResponse paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Getter for Data.
     * The usage objects
     * @return Returns the List of GetUsageResponse
     */
    @JsonGetter("data")
    public List<GetUsageResponse> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * The usage objects
     * @param data Value for List of GetUsageResponse
     */
    @JsonSetter("data")
    public void setData(List<GetUsageResponse> data) {
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
     * Converts this ListUsagesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListUsagesResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListUsagesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListUsagesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data, paging);
        return builder;
    }

    /**
     * Class to build instances of {@link ListUsagesResponse}.
     */
    public static class Builder {
        private List<GetUsageResponse> data;
        private PagingResponse paging;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of GetUsageResponse value for data.
         * @param  paging  PagingResponse value for paging.
         */
        public Builder(List<GetUsageResponse> data, PagingResponse paging) {
            this.data = data;
            this.paging = paging;
        }

        /**
         * Setter for data.
         * @param  data  List of GetUsageResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetUsageResponse> data) {
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
         * Builds a new {@link ListUsagesResponse} object using the set fields.
         * @return {@link ListUsagesResponse}
         */
        public ListUsagesResponse build() {
            return new ListUsagesResponse(data, paging);
        }
    }
}
