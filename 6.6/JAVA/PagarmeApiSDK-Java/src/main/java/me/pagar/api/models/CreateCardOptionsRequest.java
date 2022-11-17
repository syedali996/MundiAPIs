/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateCardOptionsRequest type.
 */
public class CreateCardOptionsRequest {
    private boolean verifyCard;

    /**
     * Default constructor.
     */
    public CreateCardOptionsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  verifyCard  boolean value for verifyCard.
     */
    public CreateCardOptionsRequest(
            boolean verifyCard) {
        this.verifyCard = verifyCard;
    }

    /**
     * Getter for VerifyCard.
     * Indicates if the card should be verified before creation. If true, executes an authorization
     * before saving the card.
     * @return Returns the boolean
     */
    @JsonGetter("verify_card")
    public boolean getVerifyCard() {
        return verifyCard;
    }

    /**
     * Setter for VerifyCard.
     * Indicates if the card should be verified before creation. If true, executes an authorization
     * before saving the card.
     * @param verifyCard Value for boolean
     */
    @JsonSetter("verify_card")
    public void setVerifyCard(boolean verifyCard) {
        this.verifyCard = verifyCard;
    }

    /**
     * Converts this CreateCardOptionsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCardOptionsRequest [" + "verifyCard=" + verifyCard + "]";
    }

    /**
     * Builds a new {@link CreateCardOptionsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCardOptionsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(verifyCard);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCardOptionsRequest}.
     */
    public static class Builder {
        private boolean verifyCard;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  verifyCard  boolean value for verifyCard.
         */
        public Builder(boolean verifyCard) {
            this.verifyCard = verifyCard;
        }

        /**
         * Setter for verifyCard.
         * @param  verifyCard  boolean value for verifyCard.
         * @return Builder
         */
        public Builder verifyCard(boolean verifyCard) {
            this.verifyCard = verifyCard;
            return this;
        }

        /**
         * Builds a new {@link CreateCardOptionsRequest} object using the set fields.
         * @return {@link CreateCardOptionsRequest}
         */
        public CreateCardOptionsRequest build() {
            return new CreateCardOptionsRequest(verifyCard);
        }
    }
}
