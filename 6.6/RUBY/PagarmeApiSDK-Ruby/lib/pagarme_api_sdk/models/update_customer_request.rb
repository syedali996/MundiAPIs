# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # Request for updating a customer
  class UpdateCustomerRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Name
    # @return [String]
    attr_accessor :name

    # Email
    # @return [String]
    attr_accessor :email

    # Document number
    # @return [String]
    attr_accessor :document

    # Person type
    # @return [String]
    attr_accessor :type

    # Address
    # @return [CreateAddressRequest]
    attr_accessor :address

    # Metadata
    # @return [Hash of String]
    attr_accessor :metadata

    # Metadata
    # @return [CreatePhonesRequest]
    attr_accessor :phones

    # Código de referência do cliente no sistema da loja. Max: 52 caracteres
    # @return [String]
    attr_accessor :code

    # Gênero do cliente
    # @return [String]
    attr_accessor :gender

    # Gênero do cliente
    # @return [String]
    attr_accessor :document_type

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['name'] = 'name'
      @_hash['email'] = 'email'
      @_hash['document'] = 'document'
      @_hash['type'] = 'type'
      @_hash['address'] = 'address'
      @_hash['metadata'] = 'metadata'
      @_hash['phones'] = 'phones'
      @_hash['code'] = 'code'
      @_hash['gender'] = 'gender'
      @_hash['document_type'] = 'document_type'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        name
        email
        document
        type
        address
        metadata
        phones
        code
        gender
        document_type
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(name = SKIP,
                   email = SKIP,
                   document = SKIP,
                   type = SKIP,
                   address = SKIP,
                   metadata = SKIP,
                   phones = SKIP,
                   code = SKIP,
                   gender = SKIP,
                   document_type = SKIP)
      @name = name unless name == SKIP
      @email = email unless email == SKIP
      @document = document unless document == SKIP
      @type = type unless type == SKIP
      @address = address unless address == SKIP
      @metadata = metadata unless metadata == SKIP
      @phones = phones unless phones == SKIP
      @code = code unless code == SKIP
      @gender = gender unless gender == SKIP
      @document_type = document_type unless document_type == SKIP
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      name = hash.key?('name') ? hash['name'] : SKIP
      email = hash.key?('email') ? hash['email'] : SKIP
      document = hash.key?('document') ? hash['document'] : SKIP
      type = hash.key?('type') ? hash['type'] : SKIP
      address = CreateAddressRequest.from_hash(hash['address']) if hash['address']
      metadata = hash.key?('metadata') ? hash['metadata'] : SKIP
      phones = CreatePhonesRequest.from_hash(hash['phones']) if hash['phones']
      code = hash.key?('code') ? hash['code'] : SKIP
      gender = hash.key?('gender') ? hash['gender'] : SKIP
      document_type = hash.key?('document_type') ? hash['document_type'] : SKIP

      # Create object from extracted values.
      UpdateCustomerRequest.new(name,
                                email,
                                document,
                                type,
                                address,
                                metadata,
                                phones,
                                code,
                                gender,
                                document_type)
    end
  end
end
