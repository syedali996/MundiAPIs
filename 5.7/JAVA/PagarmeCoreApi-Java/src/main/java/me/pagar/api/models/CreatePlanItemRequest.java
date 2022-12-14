/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreatePlanItemRequest type.
 */
public class CreatePlanItemRequest {
    private String name;
    private CreatePricingSchemeRequest pricingScheme;
    private String id;
    private String description;
    private Integer cycles;
    private Integer quantity;

    /**
     * Default constructor.
     */
    public CreatePlanItemRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  pricingScheme  CreatePricingSchemeRequest value for pricingScheme.
     * @param  id  String value for id.
     * @param  description  String value for description.
     * @param  cycles  Integer value for cycles.
     * @param  quantity  Integer value for quantity.
     */
    public CreatePlanItemRequest(
            String name,
            CreatePricingSchemeRequest pricingScheme,
            String id,
            String description,
            Integer cycles,
            Integer quantity) {
        this.name = name;
        this.pricingScheme = pricingScheme;
        this.id = id;
        this.description = description;
        this.cycles = cycles;
        this.quantity = quantity;
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
     * Getter for PricingScheme.
     * Item's pricing scheme
     * @return Returns the CreatePricingSchemeRequest
     */
    @JsonGetter("pricing_scheme")
    public CreatePricingSchemeRequest getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * Item's pricing scheme
     * @param pricingScheme Value for CreatePricingSchemeRequest
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(CreatePricingSchemeRequest pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Id.
     * Item's id
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Item's id
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Description.
     * Item's description
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Item's description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Cycles.
     * Number of cycles where the item will be charged
     * @return Returns the Integer
     */
    @JsonGetter("cycles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCycles() {
        return cycles;
    }

    /**
     * Setter for Cycles.
     * Number of cycles where the item will be charged
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
     * Converts this CreatePlanItemRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePlanItemRequest [" + "name=" + name + ", pricingScheme=" + pricingScheme
                + ", id=" + id + ", description=" + description + ", cycles=" + cycles
                + ", quantity=" + quantity + "]";
    }

    /**
     * Builds a new {@link CreatePlanItemRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePlanItemRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, pricingScheme, id, description)
                .cycles(getCycles())
                .quantity(getQuantity());
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePlanItemRequest}.
     */
    public static class Builder {
        private String name;
        private CreatePricingSchemeRequest pricingScheme;
        private String id;
        private String description;
        private Integer cycles;
        private Integer quantity;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  pricingScheme  CreatePricingSchemeRequest value for pricingScheme.
         * @param  id  String value for id.
         * @param  description  String value for description.
         */
        public Builder(String name, CreatePricingSchemeRequest pricingScheme, String id,
                String description) {
            this.name = name;
            this.pricingScheme = pricingScheme;
            this.id = id;
            this.description = description;
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
         * Setter for pricingScheme.
         * @param  pricingScheme  CreatePricingSchemeRequest value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(CreatePricingSchemeRequest pricingScheme) {
            this.pricingScheme = pricingScheme;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
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
         * Builds a new {@link CreatePlanItemRequest} object using the set fields.
         * @return {@link CreatePlanItemRequest}
         */
        public CreatePlanItemRequest build() {
            return new CreatePlanItemRequest(name, pricingScheme, id, description, cycles,
                    quantity);
        }
    }
}
