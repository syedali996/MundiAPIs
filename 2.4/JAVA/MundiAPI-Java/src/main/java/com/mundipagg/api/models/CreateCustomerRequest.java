/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mundipagg.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.Map;

/**
 * This is a model class for CreateCustomerRequest type.
 */
public class CreateCustomerRequest {
    private String name;
    private String email;
    private String document;
    private String type;
    private CreateAddressRequest address;
    private Map<String, String> metadata;
    private CreatePhonesRequest phones;
    private String code;
    private String gender;
    private String documentType;

    /**
     * Default constructor.
     */
    public CreateCustomerRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  email  String value for email.
     * @param  document  String value for document.
     * @param  type  String value for type.
     * @param  address  CreateAddressRequest value for address.
     * @param  metadata  Map of String, value for metadata.
     * @param  phones  CreatePhonesRequest value for phones.
     * @param  code  String value for code.
     * @param  gender  String value for gender.
     * @param  documentType  String value for documentType.
     */
    public CreateCustomerRequest(
            String name,
            String email,
            String document,
            String type,
            CreateAddressRequest address,
            Map<String, String> metadata,
            CreatePhonesRequest phones,
            String code,
            String gender,
            String documentType) {
        this.name = name;
        this.email = email;
        this.document = document;
        this.type = type;
        this.address = address;
        this.metadata = metadata;
        this.phones = phones;
        this.code = code;
        this.gender = gender;
        this.documentType = documentType;
    }

    /**
     * Getter for Name.
     * Name
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Email.
     * Email
     * @return Returns the String
     */
    @JsonGetter("email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Email
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Document.
     * Document number. Only numbers, no special characters.
     * @return Returns the String
     */
    @JsonGetter("document")
    public String getDocument() {
        return document;
    }

    /**
     * Setter for Document.
     * Document number. Only numbers, no special characters.
     * @param document Value for String
     */
    @JsonSetter("document")
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * Getter for Type.
     * Person type. Can be either 'individual' or 'company'
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Person type. Can be either 'individual' or 'company'
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Address.
     * The customer's address
     * @return Returns the CreateAddressRequest
     */
    @JsonGetter("address")
    public CreateAddressRequest getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * The customer's address
     * @param address Value for CreateAddressRequest
     */
    @JsonSetter("address")
    public void setAddress(CreateAddressRequest address) {
        this.address = address;
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
     * Getter for Phones.
     * @return Returns the CreatePhonesRequest
     */
    @JsonGetter("phones")
    public CreatePhonesRequest getPhones() {
        return phones;
    }

    /**
     * Setter for Phones.
     * @param phones Value for CreatePhonesRequest
     */
    @JsonSetter("phones")
    public void setPhones(CreatePhonesRequest phones) {
        this.phones = phones;
    }

    /**
     * Getter for Code.
     * Customer code
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Customer code
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Gender.
     * Customer Gender
     * @return Returns the String
     */
    @JsonGetter("gender")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGender() {
        return gender;
    }

    /**
     * Setter for Gender.
     * Customer Gender
     * @param gender Value for String
     */
    @JsonSetter("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter for DocumentType.
     * @return Returns the String
     */
    @JsonGetter("document_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Setter for DocumentType.
     * @param documentType Value for String
     */
    @JsonSetter("document_type")
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * Converts this CreateCustomerRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCustomerRequest [" + "name=" + name + ", email=" + email + ", document="
                + document + ", type=" + type + ", address=" + address + ", metadata=" + metadata
                + ", phones=" + phones + ", code=" + code + ", gender=" + gender + ", documentType="
                + documentType + "]";
    }

    /**
     * Builds a new {@link CreateCustomerRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCustomerRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, email, document, type, address, metadata, phones, code)
                .gender(getGender())
                .documentType(getDocumentType());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCustomerRequest}.
     */
    public static class Builder {
        private String name;
        private String email;
        private String document;
        private String type;
        private CreateAddressRequest address;
        private Map<String, String> metadata;
        private CreatePhonesRequest phones;
        private String code;
        private String gender;
        private String documentType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  email  String value for email.
         * @param  document  String value for document.
         * @param  type  String value for type.
         * @param  address  CreateAddressRequest value for address.
         * @param  metadata  Map of String, value for metadata.
         * @param  phones  CreatePhonesRequest value for phones.
         * @param  code  String value for code.
         */
        public Builder(String name, String email, String document, String type,
                CreateAddressRequest address, Map<String, String> metadata,
                CreatePhonesRequest phones, String code) {
            this.name = name;
            this.email = email;
            this.document = document;
            this.type = type;
            this.address = address;
            this.metadata = metadata;
            this.phones = phones;
            this.code = code;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for document.
         * @param  document  String value for document.
         * @return Builder
         */
        public Builder document(String document) {
            this.document = document;
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
         * Setter for address.
         * @param  address  CreateAddressRequest value for address.
         * @return Builder
         */
        public Builder address(CreateAddressRequest address) {
            this.address = address;
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
         * Setter for phones.
         * @param  phones  CreatePhonesRequest value for phones.
         * @return Builder
         */
        public Builder phones(CreatePhonesRequest phones) {
            this.phones = phones;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for gender.
         * @param  gender  String value for gender.
         * @return Builder
         */
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Setter for documentType.
         * @param  documentType  String value for documentType.
         * @return Builder
         */
        public Builder documentType(String documentType) {
            this.documentType = documentType;
            return this;
        }

        /**
         * Builds a new {@link CreateCustomerRequest} object using the set fields.
         * @return {@link CreateCustomerRequest}
         */
        public CreateCustomerRequest build() {
            return new CreateCustomerRequest(name, email, document, type, address, metadata, phones,
                    code, gender, documentType);
        }
    }
}
