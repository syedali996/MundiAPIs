/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for CreatePlanRequest type.
 */
public class CreatePlanRequest {
    private String name;
    private String description;
    private String statementDescriptor;
    private List<CreatePlanItemRequest> items;
    private boolean shippable;
    private List<String> paymentMethods;
    private List<Integer> installments;
    private String currency;
    private String interval;
    private int intervalCount;
    private List<Integer> billingDays;
    private String billingType;
    private CreatePricingSchemeRequest pricingScheme;
    private Map<String, String> metadata;
    private Integer minimumPrice;
    private Integer cycles;
    private Integer quantity;
    private Integer trialPeriodDays;

    /**
     * Default constructor.
     */
    public CreatePlanRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  items  List of CreatePlanItemRequest value for items.
     * @param  shippable  boolean value for shippable.
     * @param  paymentMethods  List of String value for paymentMethods.
     * @param  installments  List of Integer value for installments.
     * @param  currency  String value for currency.
     * @param  interval  String value for interval.
     * @param  intervalCount  int value for intervalCount.
     * @param  billingDays  List of Integer value for billingDays.
     * @param  billingType  String value for billingType.
     * @param  pricingScheme  CreatePricingSchemeRequest value for pricingScheme.
     * @param  metadata  Map of String, value for metadata.
     * @param  minimumPrice  Integer value for minimumPrice.
     * @param  cycles  Integer value for cycles.
     * @param  quantity  Integer value for quantity.
     * @param  trialPeriodDays  Integer value for trialPeriodDays.
     */
    public CreatePlanRequest(
            String name,
            String description,
            String statementDescriptor,
            List<CreatePlanItemRequest> items,
            boolean shippable,
            List<String> paymentMethods,
            List<Integer> installments,
            String currency,
            String interval,
            int intervalCount,
            List<Integer> billingDays,
            String billingType,
            CreatePricingSchemeRequest pricingScheme,
            Map<String, String> metadata,
            Integer minimumPrice,
            Integer cycles,
            Integer quantity,
            Integer trialPeriodDays) {
        this.name = name;
        this.description = description;
        this.statementDescriptor = statementDescriptor;
        this.items = items;
        this.shippable = shippable;
        this.paymentMethods = paymentMethods;
        this.installments = installments;
        this.currency = currency;
        this.interval = interval;
        this.intervalCount = intervalCount;
        this.billingDays = billingDays;
        this.billingType = billingType;
        this.pricingScheme = pricingScheme;
        this.metadata = metadata;
        this.minimumPrice = minimumPrice;
        this.cycles = cycles;
        this.quantity = quantity;
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
     * Getter for StatementDescriptor.
     * Text that will be printed on the credit card's statement
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * Text that will be printed on the credit card's statement
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for Items.
     * Plan items
     * @return Returns the List of CreatePlanItemRequest
     */
    @JsonGetter("items")
    public List<CreatePlanItemRequest> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * Plan items
     * @param items Value for List of CreatePlanItemRequest
     */
    @JsonSetter("items")
    public void setItems(List<CreatePlanItemRequest> items) {
        this.items = items;
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
     * Getter for PaymentMethods.
     * Allowed payment methods for the plan
     * @return Returns the List of String
     */
    @JsonGetter("payment_methods")
    public List<String> getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Setter for PaymentMethods.
     * Allowed payment methods for the plan
     * @param paymentMethods Value for List of String
     */
    @JsonSetter("payment_methods")
    public void setPaymentMethods(List<String> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    /**
     * Getter for Installments.
     * Number of installments
     * @return Returns the List of Integer
     */
    @JsonGetter("installments")
    public List<Integer> getInstallments() {
        return installments;
    }

    /**
     * Setter for Installments.
     * Number of installments
     * @param installments Value for List of Integer
     */
    @JsonSetter("installments")
    public void setInstallments(List<Integer> installments) {
        this.installments = installments;
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
     * Interval counts between two charges. For instance, if the interval is 'month' and count is 2,
     * the customer will be charged once every two months.
     * @return Returns the int
     */
    @JsonGetter("interval_count")
    public int getIntervalCount() {
        return intervalCount;
    }

    /**
     * Setter for IntervalCount.
     * Interval counts between two charges. For instance, if the interval is 'month' and count is 2,
     * the customer will be charged once every two months.
     * @param intervalCount Value for int
     */
    @JsonSetter("interval_count")
    public void setIntervalCount(int intervalCount) {
        this.intervalCount = intervalCount;
    }

    /**
     * Getter for BillingDays.
     * Allowed billings days for the subscription, in case the plan type is 'exact_day'
     * @return Returns the List of Integer
     */
    @JsonGetter("billing_days")
    public List<Integer> getBillingDays() {
        return billingDays;
    }

    /**
     * Setter for BillingDays.
     * Allowed billings days for the subscription, in case the plan type is 'exact_day'
     * @param billingDays Value for List of Integer
     */
    @JsonSetter("billing_days")
    public void setBillingDays(List<Integer> billingDays) {
        this.billingDays = billingDays;
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
     * Getter for PricingScheme.
     * Plan's pricing scheme
     * @return Returns the CreatePricingSchemeRequest
     */
    @JsonGetter("pricing_scheme")
    public CreatePricingSchemeRequest getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * Plan's pricing scheme
     * @param pricingScheme Value for CreatePricingSchemeRequest
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(CreatePricingSchemeRequest pricingScheme) {
        this.pricingScheme = pricingScheme;
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
     * Minimum price that will be charged
     * @return Returns the Integer
     */
    @JsonGetter("minimum_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Setter for MinimumPrice.
     * Minimum price that will be charged
     * @param minimumPrice Value for Integer
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice(Integer minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    /**
     * Getter for Cycles.
     * Number of cycles
     * @return Returns the Integer
     */
    @JsonGetter("cycles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCycles() {
        return cycles;
    }

    /**
     * Setter for Cycles.
     * Number of cycles
     * @param cycles Value for Integer
     */
    @JsonSetter("cycles")
    public void setCycles(Integer cycles) {
        this.cycles = cycles;
    }

    /**
     * Getter for Quantity.
     * Quantity
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * Quantity
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for TrialPeriodDays.
     * Trial period, where the customer will not be charged.
     * @return Returns the Integer
     */
    @JsonGetter("trial_period_days")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTrialPeriodDays() {
        return trialPeriodDays;
    }

    /**
     * Setter for TrialPeriodDays.
     * Trial period, where the customer will not be charged.
     * @param trialPeriodDays Value for Integer
     */
    @JsonSetter("trial_period_days")
    public void setTrialPeriodDays(Integer trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
    }

    /**
     * Converts this CreatePlanRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePlanRequest [" + "name=" + name + ", description=" + description
                + ", statementDescriptor=" + statementDescriptor + ", items=" + items
                + ", shippable=" + shippable + ", paymentMethods=" + paymentMethods
                + ", installments=" + installments + ", currency=" + currency + ", interval="
                + interval + ", intervalCount=" + intervalCount + ", billingDays=" + billingDays
                + ", billingType=" + billingType + ", pricingScheme=" + pricingScheme
                + ", metadata=" + metadata + ", minimumPrice=" + minimumPrice + ", cycles=" + cycles
                + ", quantity=" + quantity + ", trialPeriodDays=" + trialPeriodDays + "]";
    }

    /**
     * Builds a new {@link CreatePlanRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePlanRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, description, statementDescriptor, items, shippable,
                paymentMethods, installments, currency, interval, intervalCount, billingDays,
                billingType, pricingScheme, metadata)
                .minimumPrice(getMinimumPrice())
                .cycles(getCycles())
                .quantity(getQuantity())
                .trialPeriodDays(getTrialPeriodDays());
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePlanRequest}.
     */
    public static class Builder {
        private String name;
        private String description;
        private String statementDescriptor;
        private List<CreatePlanItemRequest> items;
        private boolean shippable;
        private List<String> paymentMethods;
        private List<Integer> installments;
        private String currency;
        private String interval;
        private int intervalCount;
        private List<Integer> billingDays;
        private String billingType;
        private CreatePricingSchemeRequest pricingScheme;
        private Map<String, String> metadata;
        private Integer minimumPrice;
        private Integer cycles;
        private Integer quantity;
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
         * @param  statementDescriptor  String value for statementDescriptor.
         * @param  items  List of CreatePlanItemRequest value for items.
         * @param  shippable  boolean value for shippable.
         * @param  paymentMethods  List of String value for paymentMethods.
         * @param  installments  List of Integer value for installments.
         * @param  currency  String value for currency.
         * @param  interval  String value for interval.
         * @param  intervalCount  int value for intervalCount.
         * @param  billingDays  List of Integer value for billingDays.
         * @param  billingType  String value for billingType.
         * @param  pricingScheme  CreatePricingSchemeRequest value for pricingScheme.
         * @param  metadata  Map of String, value for metadata.
         */
        public Builder(String name, String description, String statementDescriptor,
                List<CreatePlanItemRequest> items, boolean shippable, List<String> paymentMethods,
                List<Integer> installments, String currency, String interval, int intervalCount,
                List<Integer> billingDays, String billingType,
                CreatePricingSchemeRequest pricingScheme, Map<String, String> metadata) {
            this.name = name;
            this.description = description;
            this.statementDescriptor = statementDescriptor;
            this.items = items;
            this.shippable = shippable;
            this.paymentMethods = paymentMethods;
            this.installments = installments;
            this.currency = currency;
            this.interval = interval;
            this.intervalCount = intervalCount;
            this.billingDays = billingDays;
            this.billingType = billingType;
            this.pricingScheme = pricingScheme;
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
         * Setter for statementDescriptor.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @return Builder
         */
        public Builder statementDescriptor(String statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
            return this;
        }

        /**
         * Setter for items.
         * @param  items  List of CreatePlanItemRequest value for items.
         * @return Builder
         */
        public Builder items(List<CreatePlanItemRequest> items) {
            this.items = items;
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
         * Setter for billingDays.
         * @param  billingDays  List of Integer value for billingDays.
         * @return Builder
         */
        public Builder billingDays(List<Integer> billingDays) {
            this.billingDays = billingDays;
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
         * Setter for pricingScheme.
         * @param  pricingScheme  CreatePricingSchemeRequest value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(CreatePricingSchemeRequest pricingScheme) {
            this.pricingScheme = pricingScheme;
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
         * Setter for cycles.
         * @param  cycles  Integer value for cycles.
         * @return Builder
         */
        public Builder cycles(Integer cycles) {
            this.cycles = cycles;
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
         * Setter for trialPeriodDays.
         * @param  trialPeriodDays  Integer value for trialPeriodDays.
         * @return Builder
         */
        public Builder trialPeriodDays(Integer trialPeriodDays) {
            this.trialPeriodDays = trialPeriodDays;
            return this;
        }

        /**
         * Builds a new {@link CreatePlanRequest} object using the set fields.
         * @return {@link CreatePlanRequest}
         */
        public CreatePlanRequest build() {
            return new CreatePlanRequest(name, description, statementDescriptor, items, shippable,
                    paymentMethods, installments, currency, interval, intervalCount, billingDays,
                    billingType, pricingScheme, metadata, minimumPrice, cycles, quantity,
                    trialPeriodDays);
        }
    }
}