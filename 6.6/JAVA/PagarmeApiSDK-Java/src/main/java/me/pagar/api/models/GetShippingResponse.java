/*
 * PagarmeApiSDKLib
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
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetShippingResponse type.
 */
public class GetShippingResponse {
    private int amount;
    private String description;
    private String recipientName;
    private String recipientPhone;
    private GetAddressResponse address;
    private LocalDateTime maxDeliveryDate;
    private LocalDateTime estimatedDeliveryDate;
    private String type;

    /**
     * Default constructor.
     */
    public GetShippingResponse() {
    }

    /**
     * Initialization constructor.
     * @param  amount  int value for amount.
     * @param  description  String value for description.
     * @param  recipientName  String value for recipientName.
     * @param  recipientPhone  String value for recipientPhone.
     * @param  address  GetAddressResponse value for address.
     * @param  type  String value for type.
     * @param  maxDeliveryDate  LocalDateTime value for maxDeliveryDate.
     * @param  estimatedDeliveryDate  LocalDateTime value for estimatedDeliveryDate.
     */
    public GetShippingResponse(
            int amount,
            String description,
            String recipientName,
            String recipientPhone,
            GetAddressResponse address,
            String type,
            LocalDateTime maxDeliveryDate,
            LocalDateTime estimatedDeliveryDate) {
        this.amount = amount;
        this.description = description;
        this.recipientName = recipientName;
        this.recipientPhone = recipientPhone;
        this.address = address;
        this.maxDeliveryDate = maxDeliveryDate;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        this.type = type;
    }

    /**
     * Getter for Amount.
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
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
     * Getter for RecipientName.
     * @return Returns the String
     */
    @JsonGetter("recipient_name")
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Setter for RecipientName.
     * @param recipientName Value for String
     */
    @JsonSetter("recipient_name")
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    /**
     * Getter for RecipientPhone.
     * @return Returns the String
     */
    @JsonGetter("recipient_phone")
    public String getRecipientPhone() {
        return recipientPhone;
    }

    /**
     * Setter for RecipientPhone.
     * @param recipientPhone Value for String
     */
    @JsonSetter("recipient_phone")
    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    /**
     * Getter for Address.
     * @return Returns the GetAddressResponse
     */
    @JsonGetter("address")
    public GetAddressResponse getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for GetAddressResponse
     */
    @JsonSetter("address")
    public void setAddress(GetAddressResponse address) {
        this.address = address;
    }

    /**
     * Getter for MaxDeliveryDate.
     * Data máxima de entrega
     * @return Returns the LocalDateTime
     */
    @JsonGetter("max_delivery_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getMaxDeliveryDate() {
        return maxDeliveryDate;
    }

    /**
     * Setter for MaxDeliveryDate.
     * Data máxima de entrega
     * @param maxDeliveryDate Value for LocalDateTime
     */
    @JsonSetter("max_delivery_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setMaxDeliveryDate(LocalDateTime maxDeliveryDate) {
        this.maxDeliveryDate = maxDeliveryDate;
    }

    /**
     * Getter for EstimatedDeliveryDate.
     * Prazo estimado de entrega
     * @return Returns the LocalDateTime
     */
    @JsonGetter("estimated_delivery_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * Setter for EstimatedDeliveryDate.
     * Prazo estimado de entrega
     * @param estimatedDeliveryDate Value for LocalDateTime
     */
    @JsonSetter("estimated_delivery_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    /**
     * Getter for Type.
     * Shipping Type
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Shipping Type
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this GetShippingResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetShippingResponse [" + "amount=" + amount + ", description=" + description
                + ", recipientName=" + recipientName + ", recipientPhone=" + recipientPhone
                + ", address=" + address + ", type=" + type + ", maxDeliveryDate=" + maxDeliveryDate
                + ", estimatedDeliveryDate=" + estimatedDeliveryDate + "]";
    }

    /**
     * Builds a new {@link GetShippingResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetShippingResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, description, recipientName, recipientPhone, address,
                type)
                .maxDeliveryDate(getMaxDeliveryDate())
                .estimatedDeliveryDate(getEstimatedDeliveryDate());
        return builder;
    }

    /**
     * Class to build instances of {@link GetShippingResponse}.
     */
    public static class Builder {
        private int amount;
        private String description;
        private String recipientName;
        private String recipientPhone;
        private GetAddressResponse address;
        private String type;
        private LocalDateTime maxDeliveryDate;
        private LocalDateTime estimatedDeliveryDate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  int value for amount.
         * @param  description  String value for description.
         * @param  recipientName  String value for recipientName.
         * @param  recipientPhone  String value for recipientPhone.
         * @param  address  GetAddressResponse value for address.
         * @param  type  String value for type.
         */
        public Builder(int amount, String description, String recipientName, String recipientPhone,
                GetAddressResponse address, String type) {
            this.amount = amount;
            this.description = description;
            this.recipientName = recipientName;
            this.recipientPhone = recipientPhone;
            this.address = address;
            this.type = type;
        }

        /**
         * Setter for amount.
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
            this.amount = amount;
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
         * Setter for recipientName.
         * @param  recipientName  String value for recipientName.
         * @return Builder
         */
        public Builder recipientName(String recipientName) {
            this.recipientName = recipientName;
            return this;
        }

        /**
         * Setter for recipientPhone.
         * @param  recipientPhone  String value for recipientPhone.
         * @return Builder
         */
        public Builder recipientPhone(String recipientPhone) {
            this.recipientPhone = recipientPhone;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  GetAddressResponse value for address.
         * @return Builder
         */
        public Builder address(GetAddressResponse address) {
            this.address = address;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for maxDeliveryDate.
         * @param  maxDeliveryDate  LocalDateTime value for maxDeliveryDate.
         * @return Builder
         */
        public Builder maxDeliveryDate(LocalDateTime maxDeliveryDate) {
            this.maxDeliveryDate = maxDeliveryDate;
            return this;
        }

        /**
         * Setter for estimatedDeliveryDate.
         * @param  estimatedDeliveryDate  LocalDateTime value for estimatedDeliveryDate.
         * @return Builder
         */
        public Builder estimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
            this.estimatedDeliveryDate = estimatedDeliveryDate;
            return this;
        }

        /**
         * Builds a new {@link GetShippingResponse} object using the set fields.
         * @return {@link GetShippingResponse}
         */
        public GetShippingResponse build() {
            return new GetShippingResponse(amount, description, recipientName, recipientPhone,
                    address, type, maxDeliveryDate, estimatedDeliveryDate);
        }
    }
}
