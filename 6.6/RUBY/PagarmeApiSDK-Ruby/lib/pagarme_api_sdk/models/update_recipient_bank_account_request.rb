# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # Updates the default bank account for a recipient
  class UpdateRecipientBankAccountRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Bank account
    # @return [CreateBankAccountRequest]
    attr_accessor :bank_account

    # Payment mode
    # @return [String]
    attr_accessor :payment_mode

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['bank_account'] = 'bank_account'
      @_hash['payment_mode'] = 'payment_mode'
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

    def initialize(bank_account = nil,
                   payment_mode = 'bank_transfer')
      @bank_account = bank_account
      @payment_mode = payment_mode
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      bank_account = CreateBankAccountRequest.from_hash(hash['bank_account']) if
        hash['bank_account']
      payment_mode = hash['payment_mode'] ||= 'bank_transfer'

      # Create object from extracted values.
      UpdateRecipientBankAccountRequest.new(bank_account,
                                            payment_mode)
    end
  end
end