/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for GetAutomaticAnticipationResponse type.
 */
public class GetAutomaticAnticipationResponse {
    private boolean enabled;
    private String type;
    private int volumePercentage;
    private int delay;
    private List<Integer> days;

    /**
     * Default constructor.
     */
    public GetAutomaticAnticipationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  boolean value for enabled.
     * @param  type  String value for type.
     * @param  volumePercentage  int value for volumePercentage.
     * @param  delay  int value for delay.
     * @param  days  List of Integer value for days.
     */
    public GetAutomaticAnticipationResponse(
            boolean enabled,
            String type,
            int volumePercentage,
            int delay,
            List<Integer> days) {
        this.enabled = enabled;
        this.type = type;
        this.volumePercentage = volumePercentage;
        this.delay = delay;
        this.days = days;
    }

    /**
     * Getter for Enabled.
     * @return Returns the boolean
     */
    @JsonGetter("enabled")
    public boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * @param enabled Value for boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
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
     * Getter for VolumePercentage.
     * @return Returns the int
     */
    @JsonGetter("volume_percentage")
    public int getVolumePercentage() {
        return volumePercentage;
    }

    /**
     * Setter for VolumePercentage.
     * @param volumePercentage Value for int
     */
    @JsonSetter("volume_percentage")
    public void setVolumePercentage(int volumePercentage) {
        this.volumePercentage = volumePercentage;
    }

    /**
     * Getter for Delay.
     * @return Returns the int
     */
    @JsonGetter("delay")
    public int getDelay() {
        return delay;
    }

    /**
     * Setter for Delay.
     * @param delay Value for int
     */
    @JsonSetter("delay")
    public void setDelay(int delay) {
        this.delay = delay;
    }

    /**
     * Getter for Days.
     * @return Returns the List of Integer
     */
    @JsonGetter("days")
    public List<Integer> getDays() {
        return days;
    }

    /**
     * Setter for Days.
     * @param days Value for List of Integer
     */
    @JsonSetter("days")
    public void setDays(List<Integer> days) {
        this.days = days;
    }

    /**
     * Converts this GetAutomaticAnticipationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetAutomaticAnticipationResponse [" + "enabled=" + enabled + ", type=" + type
                + ", volumePercentage=" + volumePercentage + ", delay=" + delay + ", days=" + days
                + "]";
    }

    /**
     * Builds a new {@link GetAutomaticAnticipationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetAutomaticAnticipationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(enabled, type, volumePercentage, delay, days);
        return builder;
    }

    /**
     * Class to build instances of {@link GetAutomaticAnticipationResponse}.
     */
    public static class Builder {
        private boolean enabled;
        private String type;
        private int volumePercentage;
        private int delay;
        private List<Integer> days;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  enabled  boolean value for enabled.
         * @param  type  String value for type.
         * @param  volumePercentage  int value for volumePercentage.
         * @param  delay  int value for delay.
         * @param  days  List of Integer value for days.
         */
        public Builder(boolean enabled, String type, int volumePercentage, int delay,
                List<Integer> days) {
            this.enabled = enabled;
            this.type = type;
            this.volumePercentage = volumePercentage;
            this.delay = delay;
            this.days = days;
        }

        /**
         * Setter for enabled.
         * @param  enabled  boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(boolean enabled) {
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
         * @param  volumePercentage  int value for volumePercentage.
         * @return Builder
         */
        public Builder volumePercentage(int volumePercentage) {
            this.volumePercentage = volumePercentage;
            return this;
        }

        /**
         * Setter for delay.
         * @param  delay  int value for delay.
         * @return Builder
         */
        public Builder delay(int delay) {
            this.delay = delay;
            return this;
        }

        /**
         * Setter for days.
         * @param  days  List of Integer value for days.
         * @return Builder
         */
        public Builder days(List<Integer> days) {
            this.days = days;
            return this;
        }

        /**
         * Builds a new {@link GetAutomaticAnticipationResponse} object using the set fields.
         * @return {@link GetAutomaticAnticipationResponse}
         */
        public GetAutomaticAnticipationResponse build() {
            return new GetAutomaticAnticipationResponse(enabled, type, volumePercentage, delay,
                    days);
        }
    }
}
