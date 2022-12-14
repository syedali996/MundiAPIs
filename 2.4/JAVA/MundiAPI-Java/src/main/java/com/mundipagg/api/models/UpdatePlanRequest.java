/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for UpdatePlanRequest type.
 */
public class UpdatePlanRequest {
    private String name;
    private String description;
    private List<Integer> installments;
    private String statementDescriptor;
    private String currency;
    private String interval;
    private int intervalCount;
    private List<String> paymentMethods;
    private String billingType;
    private String status;
    private boolean shippable;
    private List<Integer> billingDays;
    private Map<String, String> metadata;
    private Integer minimumPrice;
    private Integer trialPeriodDays;

    /**
     * Default constructor.
     */
    public UpdatePlanRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  installments  List of Integer value for installments.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  currency  String value for currency.
     * @param  interval  String value for interval.
     * @param  intervalCount  int value for intervalCount.
     * @param  paymentMethods  List of String value for paymentMethods.
     * @param  billingType  String value for billingType.
     * @param  status  String value for status.
     * @param  shippable  boolean value for shippable.
     * @param  billingDays  List of Integer value for billingDays.
     * @param  metadata  Map of String, value for metadata.
     * @param  minimumPrice  Integer value for minimumPrice.
     * @param  trialPeriodDays  Integer value for trialPeriodDays.
     */
    public UpdatePlanRequest(
            String name,
            String description,
            List<Integer> installments,
            String statementDescriptor,
            String currency,
            String interval,
            int intervalCount,
            List<String> paymentMethods,
            String billingType,
            String status,
            boolean shippable,
            List<Integer> billingDays,
            Map<String, String> metadata,
            Integer minimumPrice,
            Integer trialPeriodDays) {
        this.name = name;
        this.description = description;
        this.installments = installments;
        this.statementDescriptor = statementDescriptor;
        this.currency = currency;
        this.interval = interval;
        this.intervalCount = intervalCount;
        this.paymentMethods = paymentMethods;
        this.billingType = billingType;
        this.status = status;
        this.shippable = shippable;
        this.billingDays = billingDays;
        this.metadata = metadata;
        this.minimumPrice = minimumPrice;
        this.trialPeriodDays = trialPeriodDays;
    }

    /**
     * Getter for Name.
     * Plan's name
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Plan's name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Description.
     * Description
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Installments.
     * Number os installments
     * @return Returns the List of Integer
     */
    @JsonGetter("installments")
    public List<Integer> getInstallments() {
        return installments;
    }

    /**
     * Setter for Installments.
     * Number os installments
     * @param installments Value for List of Integer
     */
    @JsonSetter("installments")
    public void setInstallments(List<Integer> installments) {
        this.installments = installments;
    }

    /**
     * Getter for StatementDescriptor.
     * Text that will be shown on the credit card's statement
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * Text that will be shown on the credit card's statement
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for Currency.
     * Currency
     * @return Returns the String
     */
    @JsonGetter("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * Currency
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Interval.
     * Interval
     * @return Returns the String
     */
    @JsonGetter("interval")
    public String getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * Interval
     * @param interval Value for String
     */
    @JsonSetter("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalCount.
     * Interval count
     * @return Returns the int
     */
    @JsonGetter("interval_count")
    public int getIntervalCount() {
        return intervalCount;
    }

    /**
     * Setter for IntervalCount.
     * Interval count
     * @param intervalCount Value for int
     */
    @JsonSetter("interval_count")
    public void setIntervalCount(int intervalCount) {
        this.intervalCount = intervalCount;
    }

    /**
     * Getter for PaymentMethods.
     * Payment methods accepted by the plan
     * @return Returns the List of String
     */
    @JsonGetter("payment_methods")
    public List<String> getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Setter for PaymentMethods.
     * Payment methods accepted by the plan
     * @param paymentMethods Value for List of String
     */
    @JsonSetter("payment_methods")
    public void setPaymentMethods(List<String> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    /**
     * Getter for BillingType.
     * Billing type
     * @return Returns the String
     */
    @JsonGetter("billing_type")
    public String getBillingType() {
        return billingType;
    }

    /**
     * Setter for BillingType.
     * Billing type
     * @param billingType Value for String
     */
    @JsonSetter("billing_type")
    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    /**
     * Getter for Status.
     * Plan status
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Plan status
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Shippable.
     * Indicates if the plan is shippable
     * @return Returns the boolean
     */
    @JsonGetter("shippable")
    public boolean getShippable() {
        return shippable;
    }

    /**
     * Setter for Shippable.
     * Indicates if the plan is shippable
     * @param shippable Value for boolean
     */
    @JsonSetter("shippable")
    public void setShippable(boolean shippable) {
        this.shippable = shippable;
    }

    /**
     * Getter for BillingDays.
     * Billing days accepted by the plan
     * @return Returns the List of Integer
     */
    @JsonGetter("billing_days")
    public List<Integer> getBillingDays() {
        return billingDays;
    }

    /**
     * Setter for BillingDays.
     * Billing days accepted by the plan
     * @param billingDays Value for List of Integer
     */
    @JsonSetter("billing_days")
    public void setBillingDays(List<Integer> billingDays) {
        this.billingDays = billingDays;
    }

    /**
     * Getter for Metadata.
     * Metadata
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Metadata
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for MinimumPrice.
     * Minimum price
     * @return Returns the Integer
     */
    @JsonGetter("minimum_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Setter for MinimumPrice.
     * Minimum price
     * @param minimumPrice Value for Integer
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice(Integer minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    /**
     * Getter for TrialPeriodDays.
     * Number of trial period in days, where the customer will not be charged
     * @return Returns the Integer
     */
    @JsonGetter("trial_period_days")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTrialPeriodDays() {
        return trialPeriodDays;
    }

    /**
     * Setter for TrialPeriodDays.
     * Number of trial period in days, where the customer will not be charged
     * @param trialPeriodDays Value for Integer
     */
    @JsonSetter("trial_period_days")
    public void setTrialPeriodDays(Integer trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
    }

    /**
     * Converts this UpdatePlanRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdatePlanRequest [" + "name=" + name + ", description=" + description
                + ", installments=" + installments + ", statementDescriptor=" + statementDescriptor
                + ", currency=" + currency + ", interval=" + interval + ", intervalCount="
                + intervalCount + ", paymentMethods=" + paymentMethods + ", billingType="
                + billingType + ", status=" + status + ", shippable=" + shippable + ", billingDays="
                + billingDays + ", metadata=" + metadata + ", minimumPrice=" + minimumPrice
                + ", trialPeriodDays=" + trialPeriodDays + "]";
    }

    /**
     * Builds a new {@link UpdatePlanRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdatePlanRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, description, installments, statementDescriptor,
                currency, interval, intervalCount, paymentMethods, billingType, status, shippable,
                billingDays, metadata)
                .minimumPrice(getMinimumPrice())
                .trialPeriodDays(getTrialPeriodDays());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdatePlanRequest}.
     */
    public static class Builder {
        private String name;
        private String description;
        private List<Integer> installments;
        private String statementDescriptor;
        private String currency;
        private String interval;
        private int intervalCount;
        private List<String> paymentMethods;
        private String billingType;
        private String status;
        private boolean shippable;
        private List<Integer> billingDays;
        private Map<String, String> metadata;
        private Integer minimumPrice;
        private Integer trialPeriodDays;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  description  String value for description.
         * @param  installments  List of Integer value for installments.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @param  currency  String value for currency.
         * @param  interval  String value for interval.
         * @param  intervalCount  int value for intervalCount.
         * @param  paymentMethods  List of String value for paymentMethods.
         * @param  billingType  String value for billingType.
         * @param  status  String value for status.
         * @param  shippable  boolean value for shippable.
         * @param  billingDays  List of Integer value for billingDays.
         * @param  metadata  Map of String, value for metadata.
         */
        public Builder(String name, String description, List<Integer> installments,
                String statementDescriptor, String currency, String interval, int intervalCount,
                List<String> paymentMethods, String billingType, String status, boolean shippable,
                List<Integer> billingDays, Map<String, String> metadata) {
            this.name = name;
            this.description = description;
            this.installments = installments;
            this.statementDescriptor = statementDescriptor;
            this.currency = currency;
            this.interval = interval;
            this.intervalCount = intervalCount;
            this.paymentMethods = paymentMethods;
            this.billingType = billingType;
            this.status = status;
            this.shippable = shippable;
            this.billingDays = billingDays;
            this.metadata = metadata;
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
         * Setter for installments.
         * @param  installments  List of Integer value for installments.
         * @return Builder
         */
        public Builder installments(List<Integer> installments) {
            this.installments = installments;
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
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
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
         * Setter for paymentMethods.
         * @param  paymentMethods  List of String value for paymentMethods.
         * @return Builder
         */
        public Builder paymentMethods(List<String> paymentMethods) {
            this.paymentMethods = paymentMethods;
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
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
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
         * Setter for billingDays.
         * @param  billingDays  List of Integer value for billingDays.
         * @return Builder
         */
        public Builder billingDays(List<Integer> billingDays) {
            this.billingDays = billingDays;
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
         * Setter for minimumPrice.
         * @param  minimumPrice  Integer value for minimumPrice.
         * @return Builder
         */
        public Builder minimumPrice(Integer minimumPrice) {
            this.minimumPrice = minimumPrice;
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
         * Builds a new {@link UpdatePlanRequest} object using the set fields.
         * @return {@link UpdatePlanRequest}
         */
        public UpdatePlanRequest build() {
            return new UpdatePlanRequest(name, description, installments, statementDescriptor,
                    currency, interval, intervalCount, paymentMethods, billingType, status,
                    shippable, billingDays, metadata, minimumPrice, trialPeriodDays);
        }
    }
}
