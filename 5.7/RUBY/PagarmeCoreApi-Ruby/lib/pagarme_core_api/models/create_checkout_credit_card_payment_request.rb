# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # Checkout card payment request
  class CreateCheckoutCreditCardPaymentRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Card invoice text descriptor
    # @return [String]
    attr_accessor :statement_descriptor

    # Payment installment options
    # @return [List of CreateCheckoutCardInstallmentOptionRequest]
    attr_accessor :installments

    # Creates payment authentication
    # @return [CreatePaymentAuthenticationRequest]
    attr_accessor :authentication

    # Authorize and capture?
    # @return [TrueClass|FalseClass]
    attr_accessor :capture

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['statement_descriptor'] = 'statement_descriptor'
      @_hash['installments'] = 'installments'
      @_hash['authentication'] = 'authentication'
      @_hash['capture'] = 'capture'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        statement_descriptor
        installments
        authentication
        capture
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(statement_descriptor = SKIP,
                   installments = SKIP,
                   authentication = SKIP,
                   capture = SKIP)
      @statement_descriptor = statement_descriptor unless statement_descriptor == SKIP
      @installments = installments unless installments == SKIP
      @authentication = authentication unless authentication == SKIP
      @capture = capture unless capture == SKIP
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      statement_descriptor =
        hash.key?('statement_descriptor') ? hash['statement_descriptor'] : SKIP
      # Parameter is an array, so we need to iterate through it
      installments = nil
      unless hash['installments'].nil?
        installments = []
        hash['installments'].each do |structure|
          installments << (CreateCheckoutCardInstallmentOptionRequest.from_hash(structure) if structure)
        end
      end

      installments = SKIP unless hash.key?('installments')
      authentication = CreatePaymentAuthenticationRequest.from_hash(hash['authentication']) if
        hash['authentication']
      capture = hash.key?('capture') ? hash['capture'] : SKIP

      # Create object from extracted values.
      CreateCheckoutCreditCardPaymentRequest.new(statement_descriptor,
                                                 installments,
                                                 authentication,
                                                 capture)
    end
  end
end