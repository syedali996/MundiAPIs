/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetSubscriptionItemResponse type.
 */
public class GetSubscriptionItemResponse {
    private String id;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private GetPricingSchemeResponse pricingScheme;
    private List<GetDiscountResponse> discounts;
    private List<GetIncrementResponse> increments;
    private GetSubscriptionResponse subscription;
    private String name;
    private Integer quantity;
    private Integer cycles;
    private LocalDateTime deletedAt;

    /**
     * Default constructor.
     */
    public GetSubscriptionItemResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  description  String value for description.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  pricingScheme  GetPricingSchemeResponse value for pricingScheme.
     * @param  discounts  List of GetDiscountResponse value for discounts.
     * @param  increments  List of GetIncrementResponse value for increments.
     * @param  subscription  GetSubscriptionResponse value for subscription.
     * @param  name  String value for name.
     * @param  quantity  Integer value for quantity.
     * @param  cycles  Integer value for cycles.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     */
    public GetSubscriptionItemResponse(
            String id,
            String description,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            GetPricingSchemeResponse pricingScheme,
            List<GetDiscountResponse> discounts,
            List<GetIncrementResponse> increments,
            GetSubscriptionResponse subscription,
            String name,
            Integer quantity,
            Integer cycles,
            LocalDateTime deletedAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pricingScheme = pricingScheme;
        this.discounts = discounts;
        this.increments = increments;
        this.subscription = subscription;
        this.name = name;
        this.quantity = quantity;
        this.cycles = cycles;
        this.deletedAt = deletedAt;
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
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
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
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for PricingScheme.
     * @return Returns the GetPricingSchemeResponse
     */
    @JsonGetter("pricing_scheme")
    public GetPricingSchemeResponse getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * @param pricingScheme Value for GetPricingSchemeResponse
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(GetPricingSchemeResponse pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Discounts.
     * @return Returns the List of GetDiscountResponse
     */
    @JsonGetter("discounts")
    public List<GetDiscountResponse> getDiscounts() {
        return discounts;
    }

    /**
     * Setter for Discounts.
     * @param discounts Value for List of GetDiscountResponse
     */
    @JsonSetter("discounts")
    public void setDiscounts(List<GetDiscountResponse> discounts) {
        this.discounts = discounts;
    }

    /**
     * Getter for Increments.
     * @return Returns the List of GetIncrementResponse
     */
    @JsonGetter("increments")
    public List<GetIncrementResponse> getIncrements() {
        return increments;
    }

    /**
     * Setter for Increments.
     * @param increments Value for List of GetIncrementResponse
     */
    @JsonSetter("increments")
    public void setIncrements(List<GetIncrementResponse> increments) {
        this.increments = increments;
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
     * Getter for Name.
     * Item name
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Item name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Quantity.
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for Cycles.
     * @return Returns the Integer
     */
    @JsonGetter("cycles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCycles() {
        return cycles;
    }

    /**
     * Setter for Cycles.
     * @param cycles Value for Integer
     */
    @JsonSetter("cycles")
    public void setCycles(Integer cycles) {
        this.cycles = cycles;
    }

    /**
     * Getter for DeletedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("deleted_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    /**
     * Setter for DeletedAt.
     * @param deletedAt Value for LocalDateTime
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * Converts this GetSubscriptionItemResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetSubscriptionItemResponse [" + "id=" + id + ", description=" + description
                + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", pricingScheme=" + pricingScheme + ", discounts=" + discounts + ", increments="
                + increments + ", subscription=" + subscription + ", name=" + name + ", quantity="
                + quantity + ", cycles=" + cycles + ", deletedAt=" + deletedAt + "]";
    }

    /**
     * Builds a new {@link GetSubscriptionItemResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetSubscriptionItemResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, description, status, createdAt, updatedAt, pricingScheme,
                discounts, increments, subscription, name)
                .quantity(getQuantity())
                .cycles(getCycles())
                .deletedAt(getDeletedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link GetSubscriptionItemResponse}.
     */
    public static class Builder {
        private String id;
        private String description;
        private String status;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private GetPricingSchemeResponse pricingScheme;
        private List<GetDiscountResponse> discounts;
        private List<GetIncrementResponse> increments;
        private GetSubscriptionResponse subscription;
        private String name;
        private Integer quantity;
        private Integer cycles;
        private LocalDateTime deletedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  description  String value for description.
         * @param  status  String value for status.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  pricingScheme  GetPricingSchemeResponse value for pricingScheme.
         * @param  discounts  List of GetDiscountResponse value for discounts.
         * @param  increments  List of GetIncrementResponse value for increments.
         * @param  subscription  GetSubscriptionResponse value for subscription.
         * @param  name  String value for name.
         */
        public Builder(String id, String description, String status, LocalDateTime createdAt,
                LocalDateTime updatedAt, GetPricingSchemeResponse pricingScheme,
                List<GetDiscountResponse> discounts, List<GetIncrementResponse> increments,
                GetSubscriptionResponse subscription, String name) {
            this.id = id;
            this.description = description;
            this.status = status;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.pricingScheme = pricingScheme;
            this.discounts = discounts;
            this.increments = increments;
            this.subscription = subscription;
            this.name = name;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
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
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  GetPricingSchemeResponse value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(GetPricingSchemeResponse pricingScheme) {
            this.pricingScheme = pricingScheme;
            return this;
        }

        /**
         * Setter for discounts.
         * @param  discounts  List of GetDiscountResponse value for discounts.
         * @return Builder
         */
        public Builder discounts(List<GetDiscountResponse> discounts) {
            this.discounts = discounts;
            return this;
        }

        /**
         * Setter for increments.
         * @param  increments  List of GetIncrementResponse value for increments.
         * @return Builder
         */
        public Builder increments(List<GetIncrementResponse> increments) {
            this.increments = increments;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  Integer value for quantity.
         * @return Builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for cycles.
         * @param  cycles  Integer value for cycles.
         * @return Builder
         */
        public Builder cycles(Integer cycles) {
            this.cycles = cycles;
            return this;
        }

        /**
         * Setter for deletedAt.
         * @param  deletedAt  LocalDateTime value for deletedAt.
         * @return Builder
         */
        public Builder deletedAt(LocalDateTime deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        /**
         * Builds a new {@link GetSubscriptionItemResponse} object using the set fields.
         * @return {@link GetSubscriptionItemResponse}
         */
        public GetSubscriptionItemResponse build() {
            return new GetSubscriptionItemResponse(id, description, status, createdAt, updatedAt,
                    pricingScheme, discounts, increments, subscription, name, quantity, cycles,
                    deletedAt);
        }
    }
}
