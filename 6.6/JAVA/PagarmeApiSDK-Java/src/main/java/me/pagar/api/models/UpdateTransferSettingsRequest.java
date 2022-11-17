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
 * This is a model class for UpdateTransferSettingsRequest type.
 */
public class UpdateTransferSettingsRequest {
    private String transferEnabled;
    private String transferInterval;
    private String transferDay;

    /**
     * Default constructor.
     */
    public UpdateTransferSettingsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  transferEnabled  String value for transferEnabled.
     * @param  transferInterval  String value for transferInterval.
     * @param  transferDay  String value for transferDay.
     */
    public UpdateTransferSettingsRequest(
            String transferEnabled,
            String transferInterval,
            String transferDay) {
        this.transferEnabled = transferEnabled;
        this.transferInterval = transferInterval;
        this.transferDay = transferDay;
    }

    /**
     * Getter for TransferEnabled.
     * @return Returns the String
     */
    @JsonGetter("transfer_enabled")
    public String getTransferEnabled() {
        return transferEnabled;
    }

    /**
     * Setter for TransferEnabled.
     * @param transferEnabled Value for String
     */
    @JsonSetter("transfer_enabled")
    public void setTransferEnabled(String transferEnabled) {
        this.transferEnabled = transferEnabled;
    }

    /**
     * Getter for TransferInterval.
     * @return Returns the String
     */
    @JsonGetter("transfer_interval")
    public String getTransferInterval() {
        return transferInterval;
    }

    /**
     * Setter for TransferInterval.
     * @param transferInterval Value for String
     */
    @JsonSetter("transfer_interval")
    public void setTransferInterval(String transferInterval) {
        this.transferInterval = transferInterval;
    }

    /**
     * Getter for TransferDay.
     * @return Returns the String
     */
    @JsonGetter("transfer_day")
    public String getTransferDay() {
        return transferDay;
    }

    /**
     * Setter for TransferDay.
     * @param transferDay Value for String
     */
    @JsonSetter("transfer_day")
    public void setTransferDay(String transferDay) {
        this.transferDay = transferDay;
    }

    /**
     * Converts this UpdateTransferSettingsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateTransferSettingsRequest [" + "transferEnabled=" + transferEnabled
                + ", transferInterval=" + transferInterval + ", transferDay=" + transferDay + "]";
    }

    /**
     * Builds a new {@link UpdateTransferSettingsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateTransferSettingsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(transferEnabled, transferInterval, transferDay);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateTransferSettingsRequest}.
     */
    public static class Builder {
        private String transferEnabled;
        private String transferInterval;
        private String transferDay;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  transferEnabled  String value for transferEnabled.
         * @param  transferInterval  String value for transferInterval.
         * @param  transferDay  String value for transferDay.
         */
        public Builder(String transferEnabled, String transferInterval, String transferDay) {
            this.transferEnabled = transferEnabled;
            this.transferInterval = transferInterval;
            this.transferDay = transferDay;
        }

        /**
         * Setter for transferEnabled.
         * @param  transferEnabled  String value for transferEnabled.
         * @return Builder
         */
        public Builder transferEnabled(String transferEnabled) {
            this.transferEnabled = transferEnabled;
            return this;
        }

        /**
         * Setter for transferInterval.
         * @param  transferInterval  String value for transferInterval.
         * @return Builder
         */
        public Builder transferInterval(String transferInterval) {
            this.transferInterval = transferInterval;
            return this;
        }

        /**
         * Setter for transferDay.
         * @param  transferDay  String value for transferDay.
         * @return Builder
         */
        public Builder transferDay(String transferDay) {
            this.transferDay = transferDay;
            return this;
        }

        /**
         * Builds a new {@link UpdateTransferSettingsRequest} object using the set fields.
         * @return {@link UpdateTransferSettingsRequest}
         */
        public UpdateTransferSettingsRequest build() {
            return new UpdateTransferSettingsRequest(transferEnabled, transferInterval,
                    transferDay);
        }
    }
}
