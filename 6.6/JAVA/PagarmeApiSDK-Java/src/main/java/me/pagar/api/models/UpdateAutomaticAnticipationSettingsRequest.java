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
 * This is a model class for UpdateAutomaticAnticipationSettingsRequest type.
 */
public class UpdateAutomaticAnticipationSettingsRequest {
    private Boolean enabled;
    private String type;
    private Integer volumePercentage;
    private Integer delay;
    private Integer days;

    /**
     * Default constructor.
     */
    public UpdateAutomaticAnticipationSettingsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  type  String value for type.
     * @param  volumePercentage  Integer value for volumePercentage.
     * @param  delay  Integer value for delay.
     * @param  days  Integer value for days.
     */
    public UpdateAutomaticAnticipationSettingsRequest(
            Boolean enabled,
            String type,
            Integer volumePercentage,
            Integer delay,
            Integer days) {
        this.enabled = enabled;
        this.type = type;
        this.volumePercentage = volumePercentage;
        this.delay = delay;
        this.days = days;
    }

    /**
     * Getter for Enabled.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for VolumePercentage.
     * @return Returns the Integer
     */
    @JsonGetter("volume_percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getVolumePercentage() {
        return volumePercentage;
    }

    /**
     * Setter for VolumePercentage.
     * @param volumePercentage Value for Integer
     */
    @JsonSetter("volume_percentage")
    public void setVolumePercentage(Integer volumePercentage) {
        this.volumePercentage = volumePercentage;
    }

    /**
     * Getter for Delay.
     * @return Returns the Integer
     */
    @JsonGetter("delay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDelay() {
        return delay;
    }

    /**
     * Setter for Delay.
     * @param delay Value for Integer
     */
    @JsonSetter("delay")
    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    /**
     * Getter for Days.
     * @return Returns the Integer
     */
    @JsonGetter("days")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDays() {
        return days;
    }

    /**
     * Setter for Days.
     * @param days Value for Integer
     */
    @JsonSetter("days")
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * Converts this UpdateAutomaticAnticipationSettingsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateAutomaticAnticipationSettingsRequest [" + "enabled=" + enabled + ", type="
                + type + ", volumePercentage=" + volumePercentage + ", delay=" + delay + ", days="
                + days + "]";
    }

    /**
     * Builds a new {@link UpdateAutomaticAnticipationSettingsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateAutomaticAnticipationSettingsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enabled(getEnabled())
                .type(getType())
                .volumePercentage(getVolumePercentage())
                .delay(getDelay())
                .days(getDays());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateAutomaticAnticipationSettingsRequest}.
     */
    public static class Builder {
        private Boolean enabled;
        private String type;
        private Integer volumePercentage;
        private Integer delay;
        private Integer days;



        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
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
         * Setter for volumePercentage.
         * @param  volumePercentage  Integer value for volumePercentage.
         * @return Builder
         */
        public Builder volumePercentage(Integer volumePercentage) {
            this.volumePercentage = volumePercentage;
            return this;
        }

        /**
         * Setter for delay.
         * @param  delay  Integer value for delay.
         * @return Builder
         */
        public Builder delay(Integer delay) {
            this.delay = delay;
            return this;
        }

        /**
         * Setter for days.
         * @param  days  Integer value for days.
         * @return Builder
         */
        public Builder days(Integer days) {
            this.days = days;
            return this;
        }

        /**
         * Builds a new {@link UpdateAutomaticAnticipationSettingsRequest} object using the set
         * fields.
         * @return {@link UpdateAutomaticAnticipationSettingsRequest}
         */
        public UpdateAutomaticAnticipationSettingsRequest build() {
            return new UpdateAutomaticAnticipationSettingsRequest(enabled, type, volumePercentage,
                    delay, days);
        }
    }
}