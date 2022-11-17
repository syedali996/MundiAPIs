/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for UpdateSubscriptionAffiliationIdRequest type.
 */
public class UpdateSubscriptionAffiliationIdRequest {
    private String gatewayAffiliationId;

    /**
     * Default constructor.
     */
    public UpdateSubscriptionAffiliationIdRequest() {
    }

    /**
     * Initialization constructor.
     * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
     */
    public UpdateSubscriptionAffiliationIdRequest(
            String gatewayAffiliationId) {
        this.gatewayAffiliationId = gatewayAffiliationId;
    }

    /**
     * Getter for GatewayAffiliationId.
     * @return Returns the String
     */
    @JsonGetter("gateway_affiliation_id")
    public String getGatewayAffiliationId() {
        return gatewayAffiliationId;
    }

    /**
     * Setter for GatewayAffiliationId.
     * @param gatewayAffiliationId Value for String
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId(String gatewayAffiliationId) {
        this.gatewayAffiliationId = gatewayAffiliationId;
    }

    /**
     * Converts this UpdateSubscriptionAffiliationIdRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscriptionAffiliationIdRequest [" + "gatewayAffiliationId="
                + gatewayAffiliationId + "]";
    }

    /**
     * Builds a new {@link UpdateSubscriptionAffiliationIdRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscriptionAffiliationIdRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(gatewayAffiliationId);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscriptionAffiliationIdRequest}.
     */
    public static class Builder {
        private String gatewayAffiliationId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
         */
        public Builder(String gatewayAffiliationId) {
            this.gatewayAffiliationId = gatewayAffiliationId;
        }

        /**
         * Setter for gatewayAffiliationId.
         * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
         * @return Builder
         */
        public Builder gatewayAffiliationId(String gatewayAffiliationId) {
            this.gatewayAffiliationId = gatewayAffiliationId;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscriptionAffiliationIdRequest} object using the set fields.
         * @return {@link UpdateSubscriptionAffiliationIdRequest}
         */
        public UpdateSubscriptionAffiliationIdRequest build() {
            return new UpdateSubscriptionAffiliationIdRequest(gatewayAffiliationId);
        }
    }
}
