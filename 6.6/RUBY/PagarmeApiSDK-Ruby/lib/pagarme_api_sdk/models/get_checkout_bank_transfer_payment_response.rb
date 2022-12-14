# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # Bank transfer checkout response
  class GetCheckoutBankTransferPaymentResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # bank list response
    # @return [List of String]
    attr_accessor :bank

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['bank'] = 'bank'
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

    def initialize(bank = nil)
      @bank = bank
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      bank = hash.key?('bank') ? hash['bank'] : nil

      # Create object from extracted values.
      GetCheckoutBankTransferPaymentResponse.new(bank)
    end
  end
end
