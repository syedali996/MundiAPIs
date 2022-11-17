/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateEmvDataTlvDecryptRequest type.
 */
public class CreateEmvDataTlvDecryptRequest {
    private String tag;
    private String lenght;
    private String value;

    /**
     * Default constructor.
     */
    public CreateEmvDataTlvDecryptRequest() {
    }

    /**
     * Initialization constructor.
     * @param  tag  String value for tag.
     * @param  lenght  String value for lenght.
     * @param  value  String value for value.
     */
    public CreateEmvDataTlvDecryptRequest(
            String tag,
            String lenght,
            String value) {
        this.tag = tag;
        this.lenght = lenght;
        this.value = value;
    }

    /**
     * Getter for Tag.
     * Emv tag
     * @return Returns the String
     */
    @JsonGetter("tag")
    public String getTag() {
        return tag;
    }

    /**
     * Setter for Tag.
     * Emv tag
     * @param tag Value for String
     */
    @JsonSetter("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Getter for Lenght.
     * Emv lenght
     * @return Returns the String
     */
    @JsonGetter("lenght")
    public String getLenght() {
        return lenght;
    }

    /**
     * Setter for Lenght.
     * Emv lenght
     * @param lenght Value for String
     */
    @JsonSetter("lenght")
    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    /**
     * Getter for Value.
     * Emv value
     * @return Returns the String
     */
    @JsonGetter("value")
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * Emv value
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Converts this CreateEmvDataTlvDecryptRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateEmvDataTlvDecryptRequest [" + "tag=" + tag + ", lenght=" + lenght + ", value="
                + value + "]";
    }

    /**
     * Builds a new {@link CreateEmvDataTlvDecryptRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateEmvDataTlvDecryptRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(tag, lenght, value);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateEmvDataTlvDecryptRequest}.
     */
    public static class Builder {
        private String tag;
        private String lenght;
        private String value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  tag  String value for tag.
         * @param  lenght  String value for lenght.
         * @param  value  String value for value.
         */
        public Builder(String tag, String lenght, String value) {
            this.tag = tag;
            this.lenght = lenght;
            this.value = value;
        }

        /**
         * Setter for tag.
         * @param  tag  String value for tag.
         * @return Builder
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Setter for lenght.
         * @param  lenght  String value for lenght.
         * @return Builder
         */
        public Builder lenght(String lenght) {
            this.lenght = lenght;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link CreateEmvDataTlvDecryptRequest} object using the set fields.
         * @return {@link CreateEmvDataTlvDecryptRequest}
         */
        public CreateEmvDataTlvDecryptRequest build() {
            return new CreateEmvDataTlvDecryptRequest(tag, lenght, value);
        }
    }
}