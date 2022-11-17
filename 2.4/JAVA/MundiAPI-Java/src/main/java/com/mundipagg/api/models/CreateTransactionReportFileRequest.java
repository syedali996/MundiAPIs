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
 * This is a model class for CreateTransactionReportFileRequest type.
 */
public class CreateTransactionReportFileRequest {
    private String name;
    private LocalDateTime startAt;
    private String endAt;

    /**
     * Default constructor.
     */
    public CreateTransactionReportFileRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  startAt  LocalDateTime value for startAt.
     * @param  endAt  String value for endAt.
     */
    public CreateTransactionReportFileRequest(
            String name,
            LocalDateTime startAt,
            String endAt) {
        this.name = name;
        this.startAt = startAt;
        this.endAt = endAt;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for StartAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("start_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getStartAt() {
        return startAt;
    }

    /**
     * Setter for StartAt.
     * @param startAt Value for LocalDateTime
     */
    @JsonSetter("start_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    /**
     * Getter for EndAt.
     * @return Returns the String
     */
    @JsonGetter("end_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndAt() {
        return endAt;
    }

    /**
     * Setter for EndAt.
     * @param endAt Value for String
     */
    @JsonSetter("end_at")
    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    /**
     * Converts this CreateTransactionReportFileRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateTransactionReportFileRequest [" + "name=" + name + ", startAt=" + startAt
                + ", endAt=" + endAt + "]";
    }

    /**
     * Builds a new {@link CreateTransactionReportFileRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateTransactionReportFileRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .startAt(getStartAt())
                .endAt(getEndAt());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateTransactionReportFileRequest}.
     */
    public static class Builder {
        private String name;
        private LocalDateTime startAt;
        private String endAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for startAt.
         * @param  startAt  LocalDateTime value for startAt.
         * @return Builder
         */
        public Builder startAt(LocalDateTime startAt) {
            this.startAt = startAt;
            return this;
        }

        /**
         * Setter for endAt.
         * @param  endAt  String value for endAt.
         * @return Builder
         */
        public Builder endAt(String endAt) {
            this.endAt = endAt;
            return this;
        }

        /**
         * Builds a new {@link CreateTransactionReportFileRequest} object using the set fields.
         * @return {@link CreateTransactionReportFileRequest}
         */
        public CreateTransactionReportFileRequest build() {
            return new CreateTransactionReportFileRequest(name, startAt, endAt);
        }
    }
}
