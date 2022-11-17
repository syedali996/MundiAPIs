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
import java.util.List;

/**
 * This is a model class for CreateEmvDataDecryptRequest type.
 */
public class CreateEmvDataDecryptRequest {
    private String cipher;
    private CreateEmvDataDukptDecryptRequest dukpt;
    private List<CreateEmvDataTlvDecryptRequest> tags;

    /**
     * Default constructor.
     */
    public CreateEmvDataDecryptRequest() {
    }

    /**
     * Initialization constructor.
     * @param  cipher  String value for cipher.
     * @param  tags  List of CreateEmvDataTlvDecryptRequest value for tags.
     * @param  dukpt  CreateEmvDataDukptDecryptRequest value for dukpt.
     */
    public CreateEmvDataDecryptRequest(
            String cipher,
            List<CreateEmvDataTlvDecryptRequest> tags,
            CreateEmvDataDukptDecryptRequest dukpt) {
        this.cipher = cipher;
        this.dukpt = dukpt;
        this.tags = tags;
    }

    /**
     * Getter for Cipher.
     * Emv Decrypt cipher type
     * @return Returns the String
     */
    @JsonGetter("cipher")
    public String getCipher() {
        return cipher;
    }

    /**
     * Setter for Cipher.
     * Emv Decrypt cipher type
     * @param cipher Value for String
     */
    @JsonSetter("cipher")
    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    /**
     * Getter for Dukpt.
     * Dukpt data request
     * @return Returns the CreateEmvDataDukptDecryptRequest
     */
    @JsonGetter("dukpt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateEmvDataDukptDecryptRequest getDukpt() {
        return dukpt;
    }

    /**
     * Setter for Dukpt.
     * Dukpt data request
     * @param dukpt Value for CreateEmvDataDukptDecryptRequest
     */
    @JsonSetter("dukpt")
    public void setDukpt(CreateEmvDataDukptDecryptRequest dukpt) {
        this.dukpt = dukpt;
    }

    /**
     * Getter for Tags.
     * Encrypted tags list
     * @return Returns the List of CreateEmvDataTlvDecryptRequest
     */
    @JsonGetter("tags")
    public List<CreateEmvDataTlvDecryptRequest> getTags() {
        return tags;
    }

    /**
     * Setter for Tags.
     * Encrypted tags list
     * @param tags Value for List of CreateEmvDataTlvDecryptRequest
     */
    @JsonSetter("tags")
    public void setTags(List<CreateEmvDataTlvDecryptRequest> tags) {
        this.tags = tags;
    }

    /**
     * Converts this CreateEmvDataDecryptRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateEmvDataDecryptRequest [" + "cipher=" + cipher + ", tags=" + tags + ", dukpt="
                + dukpt + "]";
    }

    /**
     * Builds a new {@link CreateEmvDataDecryptRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateEmvDataDecryptRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(cipher, tags)
                .dukpt(getDukpt());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateEmvDataDecryptRequest}.
     */
    public static class Builder {
        private String cipher;
        private List<CreateEmvDataTlvDecryptRequest> tags;
        private CreateEmvDataDukptDecryptRequest dukpt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  cipher  String value for cipher.
         * @param  tags  List of CreateEmvDataTlvDecryptRequest value for tags.
         */
        public Builder(String cipher, List<CreateEmvDataTlvDecryptRequest> tags) {
            this.cipher = cipher;
            this.tags = tags;
        }

        /**
         * Setter for cipher.
         * @param  cipher  String value for cipher.
         * @return Builder
         */
        public Builder cipher(String cipher) {
            this.cipher = cipher;
            return this;
        }

        /**
         * Setter for tags.
         * @param  tags  List of CreateEmvDataTlvDecryptRequest value for tags.
         * @return Builder
         */
        public Builder tags(List<CreateEmvDataTlvDecryptRequest> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Setter for dukpt.
         * @param  dukpt  CreateEmvDataDukptDecryptRequest value for dukpt.
         * @return Builder
         */
        public Builder dukpt(CreateEmvDataDukptDecryptRequest dukpt) {
            this.dukpt = dukpt;
            return this;
        }

        /**
         * Builds a new {@link CreateEmvDataDecryptRequest} object using the set fields.
         * @return {@link CreateEmvDataDecryptRequest}
         */
        public CreateEmvDataDecryptRequest build() {
            return new CreateEmvDataDecryptRequest(cipher, tags, dukpt);
        }
    }
}
