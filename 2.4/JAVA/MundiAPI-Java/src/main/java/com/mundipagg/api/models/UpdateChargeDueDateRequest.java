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
 * This is a model class for UpdateChargeDueDateRequest type.
 */
public class UpdateChargeDueDateRequest {
    private LocalDateTime dueAt;

    /**
     * Default constructor.
     */
    public UpdateChargeDueDateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  dueAt  LocalDateTime value for dueAt.
     */
    public UpdateChargeDueDateRequest(
            LocalDateTime dueAt) {
        this.dueAt = dueAt;
    }

    /**
     * Getter for DueAt.
     * The charge's new due date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("due_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDueAt() {
        return dueAt;
    }

    /**
     * Setter for DueAt.
     * The charge's new due date
     * @param dueAt Value for LocalDateTime
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = dueAt;
    }

    /**
     * Converts this UpdateChargeDueDateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateChargeDueDateRequest [" + "dueAt=" + dueAt + "]";
    }

    /**
     * Builds a new {@link UpdateChargeDueDateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateChargeDueDateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dueAt(getDueAt());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateChargeDueDateRequest}.
     */
    public static class Builder {
        private LocalDateTime dueAt;



        /**
         * Setter for dueAt.
         * @param  dueAt  LocalDateTime value for dueAt.
         * @return Builder
         */
        public Builder dueAt(LocalDateTime dueAt) {
            this.dueAt = dueAt;
            return this;
        }

        /**
         * Builds a new {@link UpdateChargeDueDateRequest} object using the set fields.
         * @return {@link UpdateChargeDueDateRequest}
         */
        public UpdateChargeDueDateRequest build() {
            return new UpdateChargeDueDateRequest(dueAt);
        }
    }
}
