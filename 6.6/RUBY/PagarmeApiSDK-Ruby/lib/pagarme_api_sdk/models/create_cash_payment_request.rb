# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # CreateCashPaymentRequest Model.
  class CreateCashPaymentRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Description
    # @return [String]
    attr_accessor :description

    # Indicates whether cash collection will be confirmed in the act of creation
    # @return [TrueClass|FalseClass]
    attr_accessor :confirm

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['description'] = 'description'
      @_hash['confirm'] = 'confirm'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      []
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(description = nil,
                   confirm = nil)
      @description = description
      @confirm = confirm
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      description = hash.key?('description') ? hash['description'] : nil
      confirm = hash.key?('confirm') ? hash['confirm'] : nil

      # Create object from extracted values.
      CreateCashPaymentRequest.new(description,
                                   confirm)
    end
  end
end
