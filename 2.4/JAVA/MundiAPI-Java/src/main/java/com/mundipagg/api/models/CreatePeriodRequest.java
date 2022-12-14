/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mundipagg.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for CreatePeriodRequest type.
 */
public class CreatePeriodRequest {
    private LocalDateTime endAt;

    /**
     * Default constructor.
     */
    public CreatePeriodRequest() {
    }

    /**
     * Initialization constructor.
     * @param  endAt  LocalDateTime value for endAt.
     */
    public CreatePeriodRequest(
            LocalDateTime endAt) {
        this.endAt = endAt;
    }

    /**
     * Getter for EndAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("end_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getEndAt() {
        return endAt;
    }

    /**
     * Setter for EndAt.
     * @param endAt Value for LocalDateTime
     */
    @JsonSetter("end_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }

    /**
     * Converts this CreatePeriodRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePeriodRequest [" + "endAt=" + endAt + "]";
    }

    /**
     * Builds a new {@link CreatePeriodRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePeriodRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .endAt(getEndAt());
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePeriodRequest}.
     */
    public static class Builder {
        private LocalDateTime endAt;



        /**
         * Setter for endAt.
         * @param  endAt  LocalDateTime value for endAt.
         * @return Builder
         */
        public Builder endAt(LocalDateTime endAt) {
            this.endAt = endAt;
            return this;
        }

        /**
         * Builds a new {@link CreatePeriodRequest} object using the set fields.
         * @return {@link CreatePeriodRequest}
         */
        public CreatePeriodRequest build() {
            return new CreatePeriodRequest(endAt);
        }
    }
}
