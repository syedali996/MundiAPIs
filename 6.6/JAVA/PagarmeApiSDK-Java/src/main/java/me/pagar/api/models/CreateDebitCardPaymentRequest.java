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
 * This is a model class for CreateDebitCardPaymentRequest type.
 */
public class CreateDebitCardPaymentRequest {
    private String statementDescriptor;
    private CreateCardRequest card;
    private String cardId;
    private String cardToken;
    private Boolean recurrence;
    private CreatePaymentAuthenticationRequest authentication;
    private CreateCardPaymentContactlessRequest token;

    /**
     * Default constructor.
     */
    public CreateDebitCardPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  card  CreateCardRequest value for card.
     * @param  cardId  String value for cardId.
     * @param  cardToken  String value for cardToken.
     * @param  recurrence  Boolean value for recurrence.
     * @param  authentication  CreatePaymentAuthenticationRequest value for authentication.
     * @param  token  CreateCardPaymentContactlessRequest value for token.
     */
    public CreateDebitCardPaymentRequest(
            String statementDescriptor,
            CreateCardRequest card,
            String cardId,
            String cardToken,
            Boolean recurrence,
            CreatePaymentAuthenticationRequest authentication,
            CreateCardPaymentContactlessRequest token) {
        this.statementDescriptor = statementDescriptor;
        this.card = card;
        this.cardId = cardId;
        this.cardToken = cardToken;
        this.recurrence = recurrence;
        this.authentication = authentication;
        this.token = token;
    }

    /**
     * Getter for StatementDescriptor.
     * The text that will be shown on the debit card's statement
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * The text that will be shown on the debit card's statement
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for Card.
     * Debit card data
     * @return Returns the CreateCardRequest
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateCardRequest getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Debit card data
     * @param card Value for CreateCardRequest
     */
    @JsonSetter("card")
    public void setCard(CreateCardRequest card) {
        this.card = card;
    }

    /**
     * Getter for CardId.
     * The debit card id
     * @return Returns the String
     */
    @JsonGetter("card_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardId() {
        return cardId;
    }

    /**
     * Setter for CardId.
     * The debit card id
     * @param cardId Value for String
     */
    @JsonSetter("card_id")
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * Getter for CardToken.
     * The debit card token
     * @return Returns the String
     */
    @JsonGetter("card_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardToken() {
        return cardToken;
    }

    /**
     * Setter for CardToken.
     * The debit card token
     * @param cardToken Value for String
     */
    @JsonSetter("card_token")
    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    /**
     * Getter for Recurrence.
     * Indicates a recurrence
     * @return Returns the Boolean
     */
    @JsonGetter("recurrence")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRecurrence() {
        return recurrence;
    }

    /**
     * Setter for Recurrence.
     * Indicates a recurrence
     * @param recurrence Value for Boolean
     */
    @JsonSetter("recurrence")
    public void setRecurrence(Boolean recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * Getter for Authentication.
     * The payment authentication request
     * @return Returns the CreatePaymentAuthenticationRequest
     */
    @JsonGetter("authentication")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreatePaymentAuthenticationRequest getAuthentication() {
        return authentication;
    }

    /**
     * Setter for Authentication.
     * The payment authentication request
     * @param authentication Value for CreatePaymentAuthenticationRequest
     */
    @JsonSetter("authentication")
    public void setAuthentication(CreatePaymentAuthenticationRequest authentication) {
        this.authentication = authentication;
    }

    /**
     * Getter for Token.
     * The Debit card payment token request
     * @return Returns the CreateCardPaymentContactlessRequest
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateCardPaymentContactlessRequest getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * The Debit card payment token request
     * @param token Value for CreateCardPaymentContactlessRequest
     */
    @JsonSetter("token")
    public void setToken(CreateCardPaymentContactlessRequest token) {
        this.token = token;
    }

    /**
     * Converts this CreateDebitCardPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateDebitCardPaymentRequest [" + "statementDescriptor=" + statementDescriptor
                + ", card=" + card + ", cardId=" + cardId + ", cardToken=" + cardToken
                + ", recurrence=" + recurrence + ", authentication=" + authentication + ", token="
                + token + "]";
    }

    /**
     * Builds a new {@link CreateDebitCardPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateDebitCardPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .statementDescriptor(getStatementDescriptor())
                .card(getCard())
                .cardId(getCardId())
                .cardToken(getCardToken())
                .recurrence(getRecurrence())
                .authentication(getAuthentication())
                .token(getToken());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateDebitCardPaymentRequest}.
     */
    public static class Builder {
        private String statementDescriptor;
        private CreateCardRequest card;
        private String cardId;
        private String cardToken;
        private Boolean recurrence;
        private CreatePaymentAuthenticationRequest authentication;
        private CreateCardPaymentContactlessRequest token;



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
         * Setter for card.
         * @param  card  CreateCardRequest value for card.
         * @return Builder
         */
        public Builder card(CreateCardRequest card) {
            this.card = card;
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
         * Setter for cardToken.
         * @param  cardToken  String value for cardToken.
         * @return Builder
         */
        public Builder cardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        /**
         * Setter for recurrence.
         * @param  recurrence  Boolean value for recurrence.
         * @return Builder
         */
        public Builder recurrence(Boolean recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        /**
         * Setter for authentication.
         * @param  authentication  CreatePaymentAuthenticationRequest value for authentication.
         * @return Builder
         */
        public Builder authentication(CreatePaymentAuthenticationRequest authentication) {
            this.authentication = authentication;
            return this;
        }

        /**
         * Setter for token.
         * @param  token  CreateCardPaymentContactlessRequest value for token.
         * @return Builder
         */
        public Builder token(CreateCardPaymentContactlessRequest token) {
            this.token = token;
            return this;
        }

        /**
         * Builds a new {@link CreateDebitCardPaymentRequest} object using the set fields.
         * @return {@link CreateDebitCardPaymentRequest}
         */
        public CreateDebitCardPaymentRequest build() {
            return new CreateDebitCardPaymentRequest(statementDescriptor, card, cardId, cardToken,
                    recurrence, authentication, token);
        }
    }
}
