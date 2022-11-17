# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # Checkout Payment Settings Response
  class GetCheckoutPaymentSettingsResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Success Url
    # @return [String]
    attr_accessor :success_url

    # Payment Url
    # @return [String]
    attr_accessor :payment_url

    # Accepted Payment Methods
    # @return [List of String]
    attr_accessor :accepted_payment_methods

    # Status
    # @return [String]
    attr_accessor :status

    # Customer
    # @return [GetCustomerResponse]
    attr_accessor :customer

    # Payment amount
    # @return [Integer]
    attr_accessor :amount

    # Default Payment Method
    # @return [String]
    attr_accessor :default_payment_method

    # Gateway Affiliation Id
    # @return [String]
    attr_accessor :gateway_affiliation_id

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['success_url'] = 'success_url'
      @_hash['payment_url'] = 'payment_url'
      @_hash['accepted_payment_methods'] = 'accepted_payment_methods'
      @_hash['status'] = 'status'
      @_hash['customer'] = 'customer'
      @_hash['amount'] = 'amount'
      @_hash['default_payment_method'] = 'default_payment_method'
      @_hash['gateway_affiliation_id'] = 'gateway_affiliation_id'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        customer
        amount
        default_payment_method
        gateway_affiliation_id
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(success_url = nil,
                   payment_url = nil,
                   accepted_payment_methods = nil,
                   status = nil,
                   customer = SKIP,
                   amount = SKIP,
                   default_payment_method = SKIP,
                   gateway_affiliation_id = SKIP)
      @success_url = success_url
      @payment_url = payment_url
      @accepted_payment_methods = accepted_payment_methods
      @status = status
      @customer = customer unless customer == SKIP
      @amount = amount unless amount == SKIP
      @default_payment_method = default_payment_method unless default_payment_method == SKIP
      @gateway_affiliation_id = gateway_affiliation_id unless gateway_affiliation_id == SKIP
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      success_url = hash.key?('success_url') ? hash['success_url'] : nil
      payment_url = hash.key?('payment_url') ? hash['payment_url'] : nil
      accepted_payment_methods =
        hash.key?('accepted_payment_methods') ? hash['accepted_payment_methods'] : nil
      status = hash.key?('status') ? hash['status'] : nil
      customer = GetCustomerResponse.from_hash(hash['customer']) if hash['customer']
      amount = hash.key?('amount') ? hash['amount'] : SKIP
      default_payment_method =
        hash.key?('default_payment_method') ? hash['default_payment_method'] : SKIP
      gateway_affiliation_id =
        hash.key?('gateway_affiliation_id') ? hash['gateway_affiliation_id'] : SKIP

      # Create object from extracted values.
      GetCheckoutPaymentSettingsResponse.new(success_url,
                                             payment_url,
                                             accepted_payment_methods,
                                             status,
                                             customer,
                                             amount,
                                             default_payment_method,
                                             gateway_affiliation_id)
    end
  end
end
