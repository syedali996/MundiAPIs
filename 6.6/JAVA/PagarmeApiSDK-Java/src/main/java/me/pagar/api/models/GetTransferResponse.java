/*
 * PagarmeApiSDKLib
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
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetTransferResponse type.
 */
public class GetTransferResponse {
    private String id;
    private int amount;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private GetBankAccountResponse bankAccount;
    private Map<String, String> metadata;

    /**
     * Default constructor.
     */
    public GetTransferResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  amount  int value for amount.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  bankAccount  GetBankAccountResponse value for bankAccount.
     * @param  metadata  Map of String, value for metadata.
     */
    public GetTransferResponse(
            String id,
            int amount,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            GetBankAccountResponse bankAccount,
            Map<String, String> metadata) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.bankAccount = bankAccount;
        this.metadata = metadata;
    }

    /**
     * Getter for Id.
     * Id
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Id
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Amount.
     * Transfer amount
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Transfer amount
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for Status.
     * Transfer status
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Transfer status
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for CreatedAt.
     * Transfer creation date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Transfer creation date
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * Transfer last update date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * Transfer last update date
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for BankAccount.
     * Bank account
     * @return Returns the GetBankAccountResponse
     */
    @JsonGetter("bank_account")
    public GetBankAccountResponse getBankAccount() {
        return bankAccount;
    }

    /**
     * Setter for BankAccount.
     * Bank account
     * @param bankAccount Value for GetBankAccountResponse
     */
    @JsonSetter("bank_account")
    public void setBankAccount(GetBankAccountResponse bankAccount) {
        this.bankAccount = bankAccount;
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
     * Converts this GetTransferResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetTransferResponse [" + "id=" + id + ", amount=" + amount + ", status=" + status
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", bankAccount="
                + bankAccount + ", metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link GetTransferResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetTransferResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, amount, status, createdAt, updatedAt, bankAccount,
                metadata);
        return builder;
    }

    /**
     * Class to build instances of {@link GetTransferResponse}.
     */
    public static class Builder {
        private String id;
        private int amount;
        private String status;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private GetBankAccountResponse bankAccount;
        private Map<String, String> metadata;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  amount  int value for amount.
         * @param  status  String value for status.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  bankAccount  GetBankAccountResponse value for bankAccount.
         * @param  metadata  Map of String, value for metadata.
         */
        public Builder(String id, int amount, String status, LocalDateTime createdAt,
                LocalDateTime updatedAt, GetBankAccountResponse bankAccount,
                Map<String, String> metadata) {
            this.id = id;
            this.amount = amount;
            this.status = status;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.bankAccount = bankAccount;
            this.metadata = metadata;
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
         * Setter for amount.
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
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
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for bankAccount.
         * @param  bankAccount  GetBankAccountResponse value for bankAccount.
         * @return Builder
         */
        public Builder bankAccount(GetBankAccountResponse bankAccount) {
            this.bankAccount = bankAccount;
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
         * Builds a new {@link GetTransferResponse} object using the set fields.
         * @return {@link GetTransferResponse}
         */
        public GetTransferResponse build() {
            return new GetTransferResponse(id, amount, status, createdAt, updatedAt, bankAccount,
                    metadata);
        }
    }
}
