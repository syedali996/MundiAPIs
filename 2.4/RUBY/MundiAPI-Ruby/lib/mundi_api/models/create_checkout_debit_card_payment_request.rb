# mundi_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module MundiApi
  # Checkout credit card payment request
  class CreateCheckoutDebitCardPaymentRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Card invoice text descriptor
    # @return [String]
    attr_accessor :statement_descriptor

    # Creates payment authentication
    # @return [CreatePaymentAuthenticationRequest]
    attr_accessor :authentication

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['statement_descriptor'] = 'statement_descriptor'
      @_hash['authentication'] = 'authentication'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        statement_descriptor
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(authentication = nil,
                   statement_descriptor = SKIP)
      @statement_descriptor = statement_descriptor unless statement_descriptor == SKIP
      @authentication = authentication
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      authentication = CreatePaymentAuthenticationRequest.from_hash(hash['authentication']) if
        hash['authentication']
      statement_descriptor =
        hash.key?('statement_descriptor') ? hash['statement_descriptor'] : SKIP

      # Create object from extracted values.
      CreateCheckoutDebitCardPaymentRequest.new(authentication,
                                                statement_descriptor)
    end
  end
end