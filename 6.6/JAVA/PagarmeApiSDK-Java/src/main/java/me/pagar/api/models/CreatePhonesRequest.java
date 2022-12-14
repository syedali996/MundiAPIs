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

/**
 * This is a model class for CreatePhonesRequest type.
 */
public class CreatePhonesRequest {
    private CreatePhoneRequest homePhone;
    private CreatePhoneRequest mobilePhone;

    /**
     * Default constructor.
     */
    public CreatePhonesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  homePhone  CreatePhoneRequest value for homePhone.
     * @param  mobilePhone  CreatePhoneRequest value for mobilePhone.
     */
    public CreatePhonesRequest(
            CreatePhoneRequest homePhone,
            CreatePhoneRequest mobilePhone) {
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
    }

    /**
     * Getter for HomePhone.
     * @return Returns the CreatePhoneRequest
     */
    @JsonGetter("home_phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreatePhoneRequest getHomePhone() {
        return homePhone;
    }

    /**
     * Setter for HomePhone.
     * @param homePhone Value for CreatePhoneRequest
     */
    @JsonSetter("home_phone")
    public void setHomePhone(CreatePhoneRequest homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * Getter for MobilePhone.
     * @return Returns the CreatePhoneRequest
     */
    @JsonGetter("mobile_phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreatePhoneRequest getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Setter for MobilePhone.
     * @param mobilePhone Value for CreatePhoneRequest
     */
    @JsonSetter("mobile_phone")
    public void setMobilePhone(CreatePhoneRequest mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * Converts this CreatePhonesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePhonesRequest [" + "homePhone=" + homePhone + ", mobilePhone=" + mobilePhone
                + "]";
    }

    /**
     * Builds a new {@link CreatePhonesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePhonesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .homePhone(getHomePhone())
                .mobilePhone(getMobilePhone());
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePhonesRequest}.
     */
    public static class Builder {
        private CreatePhoneRequest homePhone;
        private CreatePhoneRequest mobilePhone;



        /**
         * Setter for homePhone.
         * @param  homePhone  CreatePhoneRequest value for homePhone.
         * @return Builder
         */
        public Builder homePhone(CreatePhoneRequest homePhone) {
            this.homePhone = homePhone;
            return this;
        }

        /**
         * Setter for mobilePhone.
         * @param  mobilePhone  CreatePhoneRequest value for mobilePhone.
         * @return Builder
         */
        public Builder mobilePhone(CreatePhoneRequest mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        /**
         * Builds a new {@link CreatePhonesRequest} object using the set fields.
         * @return {@link CreatePhonesRequest}
         */
        public CreatePhonesRequest build() {
            return new CreatePhonesRequest(homePhone, mobilePhone);
        }
    }
}
