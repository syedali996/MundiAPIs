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
import java.util.List;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetCheckoutPixPaymentResponse type.
 */
public class GetCheckoutPixPaymentResponse {
    private LocalDateTime expiresAt;
    private List<PixAdditionalInformation> additionalInformation;

    /**
     * Default constructor.
     */
    public GetCheckoutPixPaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  expiresAt  LocalDateTime value for expiresAt.
     * @param  additionalInformation  List of PixAdditionalInformation value for
     *         additionalInformation.
     */
    public GetCheckoutPixPaymentResponse(
            LocalDateTime expiresAt,
            List<PixAdditionalInformation> additionalInformation) {
        this.expiresAt = expiresAt;
        this.additionalInformation = additionalInformation;
    }

    /**
     * Getter for ExpiresAt.
     * Expires at
     * @return Returns the LocalDateTime
     */
    @JsonGetter("expires_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * Expires at
     * @param expiresAt Value for LocalDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for AdditionalInformation.
     * Additional information
     * @return Returns the List of PixAdditionalInformation
     */
    @JsonGetter("additional_information")
    public List<PixAdditionalInformation> getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Setter for AdditionalInformation.
     * Additional information
     * @param additionalInformation Value for List of PixAdditionalInformation
     */
    @JsonSetter("additional_information")
    public void setAdditionalInformation(List<PixAdditionalInformation> additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * Converts this GetCheckoutPixPaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCheckoutPixPaymentResponse [" + "expiresAt=" + expiresAt
                + ", additionalInformation=" + additionalInformation + "]";
    }

    /**
     * Builds a new {@link GetCheckoutPixPaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCheckoutPixPaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(expiresAt, additionalInformation);
        return builder;
    }

    /**
     * Class to build instances of {@link GetCheckoutPixPaymentResponse}.
     */
    public static class Builder {
        private LocalDateTime expiresAt;
        private List<PixAdditionalInformation> additionalInformation;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  expiresAt  LocalDateTime value for expiresAt.
         * @param  additionalInformation  List of PixAdditionalInformation value for
         *         additionalInformation.
         */
        public Builder(LocalDateTime expiresAt,
                List<PixAdditionalInformation> additionalInformation) {
            this.expiresAt = expiresAt;
            this.additionalInformation = additionalInformation;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  LocalDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(LocalDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Setter for additionalInformation.
         * @param  additionalInformation  List of PixAdditionalInformation value for
         *         additionalInformation.
         * @return Builder
         */
        public Builder additionalInformation(
                List<PixAdditionalInformation> additionalInformation) {
            this.additionalInformation = additionalInformation;
            return this;
        }

        /**
         * Builds a new {@link GetCheckoutPixPaymentResponse} object using the set fields.
         * @return {@link GetCheckoutPixPaymentResponse}
         */
        public GetCheckoutPixPaymentResponse build() {
            return new GetCheckoutPixPaymentResponse(expiresAt, additionalInformation);
        }
    }
}
