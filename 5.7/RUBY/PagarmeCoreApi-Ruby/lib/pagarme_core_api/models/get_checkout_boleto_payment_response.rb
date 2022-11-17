# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

require 'date'
module PagarmeCoreApi
  # GetCheckoutBoletoPaymentResponse Model.
  class GetCheckoutBoletoPaymentResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Data de vencimento do boleto
    # @return [DateTime]
    attr_accessor :due_at

    # Instruções do boleto
    # @return [String]
    attr_accessor :instructions

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['due_at'] = 'due_at'
      @_hash['instructions'] = 'instructions'
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

    def initialize(due_at = nil,
                   instructions = nil)
      @due_at = due_at
      @instructions = instructions
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      due_at = if hash.key?('due_at')
                 (DateTimeHelper.from_rfc3339(hash['due_at']) if hash['due_at'])
               end
      instructions = hash.key?('instructions') ? hash['instructions'] : nil

      # Create object from extracted values.
      GetCheckoutBoletoPaymentResponse.new(due_at,
                                           instructions)
    end

    def to_due_at
      DateTimeHelper.to_rfc3339(due_at)
    end
  end
end
