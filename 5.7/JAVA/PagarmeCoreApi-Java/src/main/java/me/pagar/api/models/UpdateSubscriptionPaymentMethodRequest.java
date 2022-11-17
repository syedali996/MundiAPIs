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
 * This is a model class for UpdateSubscriptionPaymentMethodRequest type.
 */
public class UpdateSubscriptionPaymentMethodRequest {
    private String paymentMethod;
    private String cardId;
    private CreateCardRequest card;
    private String cardToken;

    /**
     * Default constructor.
     */
    public UpdateSubscriptionPaymentMethodRequest() {
    }

    /**
     * Initialization constructor.
     * @param  paymentMethod  String value for paymentMethod.
     * @param  cardId  String value for cardId.
     * @param  card  CreateCardRequest value for card.
     * @param  cardToken  String value for cardToken.
     */
    public UpdateSubscriptionPaymentMethodRequest(
            String paymentMethod,
            String cardId,
            CreateCardRequest card,
            String cardToken) {
        this.paymentMethod = paymentMethod;
        this.cardId = cardId;
        this.card = card;
        this.cardToken = cardToken;
    }

    /**
     * Getter for PaymentMethod.
     * The new payment method
     * @return Returns the String
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * The new payment method
     * @param paymentMethod Value for String
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for CardId.
     * Card id
     * @return Returns the String
     */
    @JsonGetter("card_id")
    public String getCardId() {
        return cardId;
    }

    /**
     * Setter for CardId.
     * Card id
     * @param cardId Value for String
     */
    @JsonSetter("card_id")
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * Getter for Card.
     * Card data
     * @return Returns the CreateCardRequest
     */
    @JsonGetter("card")
    public CreateCardRequest getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Card data
     * @param card Value for CreateCardRequest
     */
    @JsonSetter("card")
    public void setCard(CreateCardRequest card) {
        this.card = card;
    }

    /**
     * Getter for CardToken.
     * The Card Token
     * @return Returns the String
     */
    @JsonGetter("card_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardToken() {
        return cardToken;
    }

    /**
     * Setter for CardToken.
     * The Card Token
     * @param cardToken Value for String
     */
    @JsonSetter("card_token")
    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    /**
     * Converts this UpdateSubscriptionPaymentMethodRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscriptionPaymentMethodRequest [" + "paymentMethod=" + paymentMethod
                + ", cardId=" + cardId + ", card=" + card + ", cardToken=" + cardToken + "]";
    }

    /**
     * Builds a new {@link UpdateSubscriptionPaymentMethodRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscriptionPaymentMethodRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentMethod, cardId, card)
                .cardToken(getCardToken());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscriptionPaymentMethodRequest}.
     */
    public static class Builder {
        private String paymentMethod;
        private String cardId;
        private CreateCardRequest card;
        private String cardToken;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentMethod  String value for paymentMethod.
         * @param  cardId  String value for cardId.
         * @param  card  CreateCardRequest value for card.
         */
        public Builder(String paymentMethod, String cardId, CreateCardRequest card) {
            this.paymentMethod = paymentMethod;
            this.cardId = cardId;
            this.card = card;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  String value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Setter for cardId.
         * @param  cardId  String value for cardId.
         * @return Builder
         */
        public Builder cardId(String cardId) {
            this.cardId = cardId;
            return this;
        }

        /**
         * Setter for card.
         * @param  card  CreateCardRequest value for card.
         * @return Builder
         */
        public Builder card(CreateCardRequest card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for cardToken.
         * @param  cardToken  String value for cardToken.
         * @return Builder
         */
        public Builder cardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscriptionPaymentMethodRequest} object using the set fields.
         * @return {@link UpdateSubscriptionPaymentMethodRequest}
         */
        public UpdateSubscriptionPaymentMethodRequest build() {
            return new UpdateSubscriptionPaymentMethodRequest(paymentMethod, cardId, card,
                    cardToken);
        }
    }
}
