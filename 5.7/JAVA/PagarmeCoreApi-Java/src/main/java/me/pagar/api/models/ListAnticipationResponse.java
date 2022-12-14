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
 * This is a model class for ListAnticipationResponse type.
 */
public class ListAnticipationResponse {
    private List<GetAnticipationResponse> data;
    private PagingResponse paging;

    /**
     * Default constructor.
     */
    public ListAnticipationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetAnticipationResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListAnticipationResponse(
            List<GetAnticipationResponse> data,
            PagingResponse paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Getter for Data.
     * Anticipations
     * @return Returns the List of GetAnticipationResponse
     */
    @JsonGetter("data")
    public List<GetAnticipationResponse> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Anticipations
     * @param data Value for List of GetAnticipationResponse
     */
    @JsonSetter("data")
    public void setData(List<GetAnticipationResponse> data) {
        this.data = data;
    }

    /**
     * Getter for Paging.
     * Paging
     * @return Returns the PagingResponse
     */
    @JsonGetter("paging")
    public PagingResponse getPaging() {
        return paging;
    }

    /**
     * Setter for Paging.
     * Paging
     * @param paging Value for PagingResponse
     */
    @JsonSetter("paging")
    public void setPaging(PagingResponse paging) {
        this.paging = paging;
    }

    /**
     * Converts this ListAnticipationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListAnticipationResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListAnticipationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListAnticipationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data, paging);
        return builder;
    }

    /**
     * Class to build instances of {@link ListAnticipationResponse}.
     */
    public static class Builder {
        private List<GetAnticipationResponse> data;
        private PagingResponse paging;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of GetAnticipationResponse value for data.
         * @param  paging  PagingResponse value for paging.
         */
        public Builder(List<GetAnticipationResponse> data, PagingResponse paging) {
            this.data = data;
            this.paging = paging;
        }

        /**
         * Setter for data.
         * @param  data  List of GetAnticipationResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetAnticipationResponse> data) {
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
         * Builds a new {@link ListAnticipationResponse} object using the set fields.
         * @return {@link ListAnticipationResponse}
         */
        public ListAnticipationResponse build() {
            return new ListAnticipationResponse(data, paging);
        }
    }
}
