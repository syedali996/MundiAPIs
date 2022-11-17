# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # CreateConfirmPaymentRequest Model.
  class CreateConfirmPaymentRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Description
    # @return [String]
    attr_accessor :description

    # Amount
    # @return [Integer]
    attr_accessor :amount

    # Code reference
    # @return [String]
    attr_accessor :code

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['description'] = 'description'
      @_hash['amount'] = 'Amount'
      @_hash['code'] = 'Code'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        amount
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(description = nil,
                   code = nil,
                   amount = SKIP)
      @description = description
      @amount = amount unless amount == SKIP
      @code = code
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      description = hash.key?('description') ? hash['description'] : nil
      code = hash.key?('Code') ? hash['Code'] : nil
      amount = hash.key?('Amount') ? hash['Amount'] : SKIP

      # Create object from extracted values.
      CreateConfirmPaymentRequest.new(description,
                                      code,
                                      amount)
    end
  end
end