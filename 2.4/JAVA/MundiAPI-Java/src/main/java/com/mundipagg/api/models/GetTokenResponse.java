/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mundipagg.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for GetTokenResponse type.
 */
public class GetTokenResponse {
    private String id;
    private String type;
    private LocalDateTime createdAt;
    private String expiresAt;
    private GetCardTokenResponse card;

    /**
     * Default constructor.
     */
    public GetTokenResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  type  String value for type.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  expiresAt  String value for expiresAt.
     * @param  card  GetCardTokenResponse value for card.
     */
    public GetTokenResponse(
            String id,
            String type,
            LocalDateTime createdAt,
            String expiresAt,
            GetCardTokenResponse card) {
        this.id = id;
        this.type = type;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
        this.card = card;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for ExpiresAt.
     * @return Returns the String
     */
    @JsonGetter("expires_at")
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * @param expiresAt Value for String
     */
    @JsonSetter("expires_at")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for Card.
     * @return Returns the GetCardTokenResponse
     */
    @JsonGetter("card")
    public GetCardTokenResponse getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * @param card Value for GetCardTokenResponse
     */
    @JsonSetter("card")
    public void setCard(GetCardTokenResponse card) {
        this.card = card;
    }

    /**
     * Converts this GetTokenResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetTokenResponse [" + "id=" + id + ", type=" + type + ", createdAt=" + createdAt
                + ", expiresAt=" + expiresAt + ", card=" + card + "]";
    }

    /**
     * Builds a new {@link GetTokenResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetTokenResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, type, createdAt, expiresAt, card);
        return builder;
    }

    /**
     * Class to build instances of {@link GetTokenResponse}.
     */
    public static class Builder {
        private String id;
        private String type;
        private LocalDateTime createdAt;
        private String expiresAt;
        private GetCardTokenResponse card;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  type  String value for type.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  expiresAt  String value for expiresAt.
         * @param  card  GetCardTokenResponse value for card.
         */
        public Builder(String id, String type, LocalDateTime createdAt, String expiresAt,
                GetCardTokenResponse card) {
            this.id = id;
            this.type = type;
            this.createdAt = createdAt;
            this.expiresAt = expiresAt;
            this.card = card;
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
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  String value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Setter for card.
         * @param  card  GetCardTokenResponse value for card.
         * @return Builder
         */
        public Builder card(GetCardTokenResponse card) {
            this.card = card;
            return this;
        }

        /**
         * Builds a new {@link GetTokenResponse} object using the set fields.
         * @return {@link GetTokenResponse}
         */
        public GetTokenResponse build() {
            return new GetTokenResponse(id, type, createdAt, expiresAt, card);
        }
    }
}
