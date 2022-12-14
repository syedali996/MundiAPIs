/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetPeriodResponse type.
 */
public class GetPeriodResponse {
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String id;
    private LocalDateTime billingAt;
    private GetSubscriptionResponse subscription;
    private String status;
    private int duration;
    private String createdAt;
    private String updatedAt;
    private int cycle;

    /**
     * Default constructor.
     */
    public GetPeriodResponse() {
    }

    /**
     * Initialization constructor.
     * @param  startAt  LocalDateTime value for startAt.
     * @param  endAt  LocalDateTime value for endAt.
     * @param  id  String value for id.
     * @param  billingAt  LocalDateTime value for billingAt.
     * @param  subscription  GetSubscriptionResponse value for subscription.
     * @param  status  String value for status.
     * @param  duration  int value for duration.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  cycle  int value for cycle.
     */
    public GetPeriodResponse(
            LocalDateTime startAt,
            LocalDateTime endAt,
            String id,
            LocalDateTime billingAt,
            GetSubscriptionResponse subscription,
            String status,
            int duration,
            String createdAt,
            String updatedAt,
            int cycle) {
        this.startAt = startAt;
        this.endAt = endAt;
        this.id = id;
        this.billingAt = billingAt;
        this.subscription = subscription;
        this.status = status;
        this.duration = duration;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.cycle = cycle;
    }

    /**
     * Getter for StartAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("start_at")
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
     * @return Returns the LocalDateTime
     */
    @JsonGetter("end_at")
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
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for BillingAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("billing_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getBillingAt() {
        return billingAt;
    }

    /**
     * Setter for BillingAt.
     * @param billingAt Value for LocalDateTime
     */
    @JsonSetter("billing_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setBillingAt(LocalDateTime billingAt) {
        this.billingAt = billingAt;
    }

    /**
     * Getter for Subscription.
     * @return Returns the GetSubscriptionResponse
     */
    @JsonGetter("subscription")
    public GetSubscriptionResponse getSubscription() {
        return subscription;
    }

    /**
     * Setter for Subscription.
     * @param subscription Value for GetSubscriptionResponse
     */
    @JsonSetter("subscription")
    public void setSubscription(GetSubscriptionResponse subscription) {
        this.subscription = subscription;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Duration.
     * @return Returns the int
     */
    @JsonGetter("duration")
    public int getDuration() {
        return duration;
    }

    /**
     * Setter for Duration.
     * @param duration Value for int
     */
    @JsonSetter("duration")
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Cycle.
     * @return Returns the int
     */
    @JsonGetter("cycle")
    public int getCycle() {
        return cycle;
    }

    /**
     * Setter for Cycle.
     * @param cycle Value for int
     */
    @JsonSetter("cycle")
    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    /**
     * Converts this GetPeriodResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPeriodResponse [" + "startAt=" + startAt + ", endAt=" + endAt + ", id=" + id
                + ", billingAt=" + billingAt + ", subscription=" + subscription + ", status="
                + status + ", duration=" + duration + ", createdAt=" + createdAt + ", updatedAt="
                + updatedAt + ", cycle=" + cycle + "]";
    }

    /**
     * Builds a new {@link GetPeriodResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPeriodResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(startAt, endAt, id, billingAt, subscription, status, duration,
                createdAt, updatedAt, cycle);
        return builder;
    }

    /**
     * Class to build instances of {@link GetPeriodResponse}.
     */
    public static class Builder {
        private LocalDateTime startAt;
        private LocalDateTime endAt;
        private String id;
        private LocalDateTime billingAt;
        private GetSubscriptionResponse subscription;
        private String status;
        private int duration;
        private String createdAt;
        private String updatedAt;
        private int cycle;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  startAt  LocalDateTime value for startAt.
         * @param  endAt  LocalDateTime value for endAt.
         * @param  id  String value for id.
         * @param  billingAt  LocalDateTime value for billingAt.
         * @param  subscription  GetSubscriptionResponse value for subscription.
         * @param  status  String value for status.
         * @param  duration  int value for duration.
         * @param  createdAt  String value for createdAt.
         * @param  updatedAt  String value for updatedAt.
         * @param  cycle  int value for cycle.
         */
        public Builder(LocalDateTime startAt, LocalDateTime endAt, String id,
                LocalDateTime billingAt, GetSubscriptionResponse subscription, String status,
                int duration, String createdAt, String updatedAt, int cycle) {
            this.startAt = startAt;
            this.endAt = endAt;
            this.id = id;
            this.billingAt = billingAt;
            this.subscription = subscription;
            this.status = status;
            this.duration = duration;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.cycle = cycle;
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
         * @param  endAt  LocalDateTime value for endAt.
         * @return Builder
         */
        public Builder endAt(LocalDateTime endAt) {
            this.endAt = endAt;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for billingAt.
         * @param  billingAt  LocalDateTime value for billingAt.
         * @return Builder
         */
        public Builder billingAt(LocalDateTime billingAt) {
            this.billingAt = billingAt;
            return this;
        }

        /**
         * Setter for subscription.
         * @param  subscription  GetSubscriptionResponse value for subscription.
         * @return Builder
         */
        public Builder subscription(GetSubscriptionResponse subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for duration.
         * @param  duration  int value for duration.
         * @return Builder
         */
        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for cycle.
         * @param  cycle  int value for cycle.
         * @return Builder
         */
        public Builder cycle(int cycle) {
            this.cycle = cycle;
            return this;
        }

        /**
         * Builds a new {@link GetPeriodResponse} object using the set fields.
         * @return {@link GetPeriodResponse}
         */
        public GetPeriodResponse build() {
            return new GetPeriodResponse(startAt, endAt, id, billingAt, subscription, status,
                    duration, createdAt, updatedAt, cycle);
        }
    }
}
