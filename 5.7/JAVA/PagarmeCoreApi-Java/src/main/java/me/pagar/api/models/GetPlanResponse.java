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
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetPlanResponse type.
 */
public class GetPlanResponse {
    private String id;
    private String name;
    private String description;
    private String url;
    private String statementDescriptor;
    private String interval;
    private int intervalCount;
    private String billingType;
    private List<String> paymentMethods;
    private List<Integer> installments;
    private String status;
    private String currency;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<GetPlanItemResponse> items;
    private List<Integer> billingDays;
    private boolean shippable;
    private Map<String, String> metadata;
    private Integer trialPeriodDays;
    private Integer minimumPrice;
    private LocalDateTime deletedAt;

    /**
     * Default constructor.
     */
    public GetPlanResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  url  String value for url.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  interval  String value for interval.
     * @param  intervalCount  int value for intervalCount.
     * @param  billingType  String value for billingType.
     * @param  paymentMethods  List of String value for paymentMethods.
     * @param  installments  List of Integer value for installments.
     * @param  status  String value for status.
     * @param  currency  String value for currency.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  items  List of GetPlanItemResponse value for items.
     * @param  billingDays  List of Integer value for billingDays.
     * @param  shippable  boolean value for shippable.
     * @param  metadata  Map of String, value for metadata.
     * @param  trialPeriodDays  Integer value for trialPeriodDays.
     * @param  minimumPrice  Integer value for minimumPrice.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     */
    public GetPlanResponse(
            String id,
            String name,
            String description,
            String url,
            String statementDescriptor,
            String interval,
            int intervalCount,
            String billingType,
            List<String> paymentMethods,
            List<Integer> installments,
            String status,
            String currency,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            List<GetPlanItemResponse> items,
            List<Integer> billingDays,
            boolean shippable,
            Map<String, String> metadata,
            Integer trialPeriodDays,
            Integer minimumPrice,
            LocalDateTime deletedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.statementDescriptor = statementDescriptor;
        this.interval = interval;
        this.intervalCount = intervalCount;
        this.billingType = billingType;
        this.paymentMethods = paymentMethods;
        this.installments = installments;
        this.status = status;
        this.currency = currency;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.items = items;
        this.billingDays = billingDays;
        this.shippable = shippable;
        this.metadata = metadata;
        this.trialPeriodDays = trialPeriodDays;
        this.minimumPrice = minimumPrice;
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
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for StatementDescriptor.
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for Interval.
     * @return Returns the String
     */
    @JsonGetter("interval")
    public String getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * @param interval Value for String
     */
    @JsonSetter("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalCount.
     * @return Returns the int
     */
    @JsonGetter("interval_count")
    public int getIntervalCount() {
        return intervalCount;
    }

    /**
     * Setter for IntervalCount.
     * @param intervalCount Value for int
     */
    @JsonSetter("interval_count")
    public void setIntervalCount(int intervalCount) {
        this.intervalCount = intervalCount;
    }

    /**
     * Getter for BillingType.
     * @return Returns the String
     */
    @JsonGetter("billing_type")
    public String getBillingType() {
        return billingType;
    }

    /**
     * Setter for BillingType.
     * @param billingType Value for String
     */
    @JsonSetter("billing_type")
    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    /**
     * Getter for PaymentMethods.
     * @return Returns the List of String
     */
    @JsonGetter("payment_methods")
    public List<String> getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Setter for PaymentMethods.
     * @param paymentMethods Value for List of String
     */
    @JsonSetter("payment_methods")
    public void setPaymentMethods(List<String> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    /**
     * Getter for Installments.
     * @return Returns the List of Integer
     */
    @JsonGetter("installments")
    public List<Integer> getInstallments() {
        return installments;
    }

    /**
     * Setter for Installments.
     * @param installments Value for List of Integer
     */
    @JsonSetter("installments")
    public void setInstallments(List<Integer> installments) {
        this.installments = installments;
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
     * Getter for Currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
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
     * Getter for Items.
     * @return Returns the List of GetPlanItemResponse
     */
    @JsonGetter("items")
    public List<GetPlanItemResponse> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * @param items Value for List of GetPlanItemResponse
     */
    @JsonSetter("items")
    public void setItems(List<GetPlanItemResponse> items) {
        this.items = items;
    }

    /**
     * Getter for BillingDays.
     * @return Returns the List of Integer
     */
    @JsonGetter("billing_days")
    public List<Integer> getBillingDays() {
        return billingDays;
    }

    /**
     * Setter for BillingDays.
     * @param billingDays Value for List of Integer
     */
    @JsonSetter("billing_days")
    public void setBillingDays(List<Integer> billingDays) {
        this.billingDays = billingDays;
    }

    /**
     * Getter for Shippable.
     * @return Returns the boolean
     */
    @JsonGetter("shippable")
    public boolean getShippable() {
        return shippable;
    }

    /**
     * Setter for Shippable.
     * @param shippable Value for boolean
     */
    @JsonSetter("shippable")
    public void setShippable(boolean shippable) {
        this.shippable = shippable;
    }

    /**
     * Getter for Metadata.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for TrialPeriodDays.
     * @return Returns the Integer
     */
    @JsonGetter("trial_period_days")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTrialPeriodDays() {
        return trialPeriodDays;
    }

    /**
     * Setter for TrialPeriodDays.
     * @param trialPeriodDays Value for Integer
     */
    @JsonSetter("trial_period_days")
    public void setTrialPeriodDays(Integer trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
    }

    /**
     * Getter for MinimumPrice.
     * @return Returns the Integer
     */
    @JsonGetter("minimum_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Setter for MinimumPrice.
     * @param minimumPrice Value for Integer
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice(Integer minimumPrice) {
        this.minimumPrice = minimumPrice;
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
     * Converts this GetPlanResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPlanResponse [" + "id=" + id + ", name=" + name + ", description=" + description
                + ", url=" + url + ", statementDescriptor=" + statementDescriptor + ", interval="
                + interval + ", intervalCount=" + intervalCount + ", billingType=" + billingType
                + ", paymentMethods=" + paymentMethods + ", installments=" + installments
                + ", status=" + status + ", currency=" + currency + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", items=" + items + ", billingDays=" + billingDays
                + ", shippable=" + shippable + ", metadata=" + metadata + ", trialPeriodDays="
                + trialPeriodDays + ", minimumPrice=" + minimumPrice + ", deletedAt=" + deletedAt
                + "]";
    }

    /**
     * Builds a new {@link GetPlanResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPlanResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, name, description, url, statementDescriptor, interval,
                intervalCount, billingType, paymentMethods, installments, status, currency,
                createdAt, updatedAt, items, billingDays, shippable, metadata)
                .trialPeriodDays(getTrialPeriodDays())
                .minimumPrice(getMinimumPrice())
                .deletedAt(getDeletedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link GetPlanResponse}.
     */
    public static class Builder {
        private String id;
        private String name;
        private String description;
        private String url;
        private String statementDescriptor;
        private String interval;
        private int intervalCount;
        private String billingType;
        private List<String> paymentMethods;
        private List<Integer> installments;
        private String status;
        private String currency;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private List<GetPlanItemResponse> items;
        private List<Integer> billingDays;
        private boolean shippable;
        private Map<String, String> metadata;
        private Integer trialPeriodDays;
        private Integer minimumPrice;
        private LocalDateTime deletedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  name  String value for name.
         * @param  description  String value for description.
         * @param  url  String value for url.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @param  interval  String value for interval.
         * @param  intervalCount  int value for intervalCount.
         * @param  billingType  String value for billingType.
         * @param  paymentMethods  List of String value for paymentMethods.
         * @param  installments  List of Integer value for installments.
         * @param  status  String value for status.
         * @param  currency  String value for currency.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  items  List of GetPlanItemResponse value for items.
         * @param  billingDays  List of Integer value for billingDays.
         * @param  shippable  boolean value for shippable.
         * @param  metadata  Map of String, value for metadata.
         */
        public Builder(String id, String name, String description, String url,
                String statementDescriptor, String interval, int intervalCount, String billingType,
                List<String> paymentMethods, List<Integer> installments, String status,
                String currency, LocalDateTime createdAt, LocalDateTime updatedAt,
                List<GetPlanItemResponse> items, List<Integer> billingDays, boolean shippable,
                Map<String, String> metadata) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.url = url;
            this.statementDescriptor = statementDescriptor;
            this.interval = interval;
            this.intervalCount = intervalCount;
            this.billingType = billingType;
            this.paymentMethods = paymentMethods;
            this.installments = installments;
            this.status = status;
            this.currency = currency;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.items = items;
            this.billingDays = billingDays;
            this.shippable = shippable;
            this.metadata = metadata;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for statementDescriptor.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @return Builder
         */
        public Builder statementDescriptor(String statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  String value for interval.
         * @return Builder
         */
        public Builder interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Setter for intervalCount.
         * @param  intervalCount  int value for intervalCount.
         * @return Builder
         */
        public Builder intervalCount(int intervalCount) {
            this.intervalCount = intervalCount;
            return this;
        }

        /**
         * Setter for billingType.
         * @param  billingType  String value for billingType.
         * @return Builder
         */
        public Builder billingType(String billingType) {
            this.billingType = billingType;
            return this;
        }

        /**
         * Setter for paymentMethods.
         * @param  paymentMethods  List of String value for paymentMethods.
         * @return Builder
         */
        public Builder paymentMethods(List<String> paymentMethods) {
            this.paymentMethods = paymentMethods;
            return this;
        }

        /**
         * Setter for installments.
         * @param  installments  List of Integer value for installments.
         * @return Builder
         */
        public Builder installments(List<Integer> installments) {
            this.installments = installments;
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
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
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
         * Setter for items.
         * @param  items  List of GetPlanItemResponse value for items.
         * @return Builder
         */
        public Builder items(List<GetPlanItemResponse> items) {
            this.items = items;
            return this;
        }

        /**
         * Setter for billingDays.
         * @param  billingDays  List of Integer value for billingDays.
         * @return Builder
         */
        public Builder billingDays(List<Integer> billingDays) {
            this.billingDays = billingDays;
            return this;
        }

        /**
         * Setter for shippable.
         * @param  shippable  boolean value for shippable.
         * @return Builder
         */
        public Builder shippable(boolean shippable) {
            this.shippable = shippable;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for trialPeriodDays.
         * @param  trialPeriodDays  Integer value for trialPeriodDays.
         * @return Builder
         */
        public Builder trialPeriodDays(Integer trialPeriodDays) {
            this.trialPeriodDays = trialPeriodDays;
            return this;
        }

        /**
         * Setter for minimumPrice.
         * @param  minimumPrice  Integer value for minimumPrice.
         * @return Builder
         */
        public Builder minimumPrice(Integer minimumPrice) {
            this.minimumPrice = minimumPrice;
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
         * Builds a new {@link GetPlanResponse} object using the set fields.
         * @return {@link GetPlanResponse}
         */
        public GetPlanResponse build() {
            return new GetPlanResponse(id, name, description, url, statementDescriptor, interval,
                    intervalCount, billingType, paymentMethods, installments, status, currency,
                    createdAt, updatedAt, items, billingDays, shippable, metadata, trialPeriodDays,
                    minimumPrice, deletedAt);
        }
    }
}
