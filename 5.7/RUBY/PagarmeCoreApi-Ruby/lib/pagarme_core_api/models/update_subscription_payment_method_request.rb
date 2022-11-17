# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # Request for updating a subscription's payment method
  class UpdateSubscriptionPaymentMethodRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # The new payment method
    # @return [String]
    attr_accessor :payment_method

    # Card id
    # @return [String]
    attr_accessor :card_id

    # Card data
    # @return [CreateCardRequest]
    attr_accessor :card

    # The Card Token
    # @return [String]
    attr_accessor :card_token

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['payment_method'] = 'payment_method'
      @_hash['card_id'] = 'card_id'
      @_hash['card'] = 'card'
      @_hash['card_token'] = 'card_token'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        card_token
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(payment_method = nil,
                   card_id = nil,
                   card = nil,
                   card_token = SKIP)
      @payment_method = payment_method
      @card_id = card_id
      @card = card
      @card_token = card_token unless card_token == SKIP
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      payment_method =
        hash.key?('payment_method') ? hash['payment_method'] : nil
      card_id = hash.key?('card_id') ? hash['card_id'] : nil
      card = CreateCardRequest.from_hash(hash['card']) if hash['card']
      card_token = hash.key?('card_token') ? hash['card_token'] : SKIP

      # Create object from extracted values.
      UpdateSubscriptionPaymentMethodRequest.new(payment_method,
                                                 card_id,
                                                 card,
                                                 card_token)
    end
  end
end