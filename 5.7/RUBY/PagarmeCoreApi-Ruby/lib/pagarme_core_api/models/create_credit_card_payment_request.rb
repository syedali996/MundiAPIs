# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # The settings for creating a credit card payment
  class CreateCreditCardPaymentRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Number of installments
    # @return [Integer]
    attr_accessor :installments

    # The text that will be shown on the credit card's statement
    # @return [String]
    attr_accessor :statement_descriptor

    # Credit card data
    # @return [CreateCardRequest]
    attr_accessor :card

    # The credit card id
    # @return [String]
    attr_accessor :card_id

    # The credit card id
    # @return [String]
    attr_accessor :card_token

    # Indicates a recurrence
    # @return [TrueClass|FalseClass]
    attr_accessor :recurrence

    # Indicates if the operation should be only authorization or auth and
    # capture.
    # @return [TrueClass|FalseClass]
    attr_accessor :capture

    # Indicates whether the extended label (private label) is enabled
    # @return [TrueClass|FalseClass]
    attr_accessor :extended_limit_enabled

    # Extended Limit Code
    # @return [String]
    attr_accessor :extended_limit_code

    # Customer business segment code
    # @return [Integer]
    attr_accessor :merchant_category_code

    # The payment authentication request
    # @return [CreatePaymentAuthenticationRequest]
    attr_accessor :authentication

    # The Credit card payment contactless request
    # @return [CreateCardPaymentContactlessRequest]
    attr_accessor :contactless

    # Indicates whether a particular payment will enter the offline retry flow
    # @return [TrueClass|FalseClass]
    attr_accessor :auto_recovery

    # AuthOnly, AuthAndCapture, PreAuth
    # @return [String]
    attr_accessor :operation_type

    # Defines whether the card has been used one or more times.
    # @return [String]
    attr_accessor :recurrency_cycle

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['installments'] = 'installments'
      @_hash['statement_descriptor'] = 'statement_descriptor'
      @_hash['card'] = 'card'
      @_hash['card_id'] = 'card_id'
      @_hash['card_token'] = 'card_token'
      @_hash['recurrence'] = 'recurrence'
      @_hash['capture'] = 'capture'
      @_hash['extended_limit_enabled'] = 'extended_limit_enabled'
      @_hash['extended_limit_code'] = 'extended_limit_code'
      @_hash['merchant_category_code'] = 'merchant_category_code'
      @_hash['authentication'] = 'authentication'
      @_hash['contactless'] = 'contactless'
      @_hash['auto_recovery'] = 'auto_recovery'
      @_hash['operation_type'] = 'operation_type'
      @_hash['recurrency_cycle'] = 'recurrency_cycle'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        installments
        statement_descriptor
        card
        card_id
        card_token
        recurrence
        capture
        extended_limit_enabled
        extended_limit_code
        merchant_category_code
        authentication
        contactless
        auto_recovery
        operation_type
        recurrency_cycle
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(installments = 1,
                   statement_descriptor = SKIP,
                   card = SKIP,
                   card_id = SKIP,
                   card_token = SKIP,
                   recurrence = SKIP,
                   capture = true,
                   extended_limit_enabled = SKIP,
                   extended_limit_code = SKIP,
                   merchant_category_code = SKIP,
                   authentication = SKIP,
                   contactless = SKIP,
                   auto_recovery = SKIP,
                   operation_type = SKIP,
                   recurrency_cycle = SKIP)
      @installments = installments unless installments == SKIP
      @statement_descriptor = statement_descriptor unless statement_descriptor == SKIP
      @card = card unless card == SKIP
      @card_id = card_id unless card_id == SKIP
      @card_token = card_token unless card_token == SKIP
      @recurrence = recurrence unless recurrence == SKIP
      @capture = capture unless capture == SKIP
      @extended_limit_enabled = extended_limit_enabled unless extended_limit_enabled == SKIP
      @extended_limit_code = extended_limit_code unless extended_limit_code == SKIP
      @merchant_category_code = merchant_category_code unless merchant_category_code == SKIP
      @authentication = authentication unless authentication == SKIP
      @contactless = contactless unless contactless == SKIP
      @auto_recovery = auto_recovery unless auto_recovery == SKIP
      @operation_type = operation_type unless operation_type == SKIP
      @recurrency_cycle = recurrency_cycle unless recurrency_cycle == SKIP
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      installments = hash['installments'] ||= 1
      statement_descriptor =
        hash.key?('statement_descriptor') ? hash['statement_descriptor'] : SKIP
      card = CreateCardRequest.from_hash(hash['card']) if hash['card']
      card_id = hash.key?('card_id') ? hash['card_id'] : SKIP
      card_token = hash.key?('card_token') ? hash['card_token'] : SKIP
      recurrence = hash.key?('recurrence') ? hash['recurrence'] : SKIP
      capture = hash['capture'] ||= true
      extended_limit_enabled =
        hash.key?('extended_limit_enabled') ? hash['extended_limit_enabled'] : SKIP
      extended_limit_code =
        hash.key?('extended_limit_code') ? hash['extended_limit_code'] : SKIP
      merchant_category_code =
        hash.key?('merchant_category_code') ? hash['merchant_category_code'] : SKIP
      authentication = CreatePaymentAuthenticationRequest.from_hash(hash['authentication']) if
        hash['authentication']
      contactless = CreateCardPaymentContactlessRequest.from_hash(hash['contactless']) if
        hash['contactless']
      auto_recovery = hash.key?('auto_recovery') ? hash['auto_recovery'] : SKIP
      operation_type =
        hash.key?('operation_type') ? hash['operation_type'] : SKIP
      recurrency_cycle =
        hash.key?('recurrency_cycle') ? hash['recurrency_cycle'] : SKIP

      # Create object from extracted values.
      CreateCreditCardPaymentRequest.new(installments,
                                         statement_descriptor,
                                         card,
                                         card_id,
                                         card_token,
                                         recurrence,
                                         capture,
                                         extended_limit_enabled,
                                         extended_limit_code,
                                         merchant_category_code,
                                         authentication,
                                         contactless,
                                         auto_recovery,
                                         operation_type,
                                         recurrency_cycle)
    end
  end
end
