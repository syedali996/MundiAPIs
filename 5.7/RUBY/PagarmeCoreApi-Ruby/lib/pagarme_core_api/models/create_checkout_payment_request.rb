# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # Checkout payment request
  class CreateCheckoutPaymentRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Accepted Payment Methods
    # @return [List of String]
    attr_accessor :accepted_payment_methods

    # Accepted Multi Payment Methods
    # @return [List of Object]
    attr_accessor :accepted_multi_payment_methods

    # Success url
    # @return [String]
    attr_accessor :success_url

    # Default payment method
    # @return [String]
    attr_accessor :default_payment_method

    # Gateway Affiliation Id
    # @return [String]
    attr_accessor :gateway_affiliation_id

    # Credit Card payment request
    # @return [CreateCheckoutCreditCardPaymentRequest]
    attr_accessor :credit_card

    # Debit Card payment request
    # @return [CreateCheckoutDebitCardPaymentRequest]
    attr_accessor :debit_card

    # Boleto payment request
    # @return [CreateCheckoutBoletoPaymentRequest]
    attr_accessor :boleto

    # Customer is editable?
    # @return [TrueClass|FalseClass]
    attr_accessor :customer_editable

    # Time in minutes for expiration
    # @return [Integer]
    attr_accessor :expires_in

    # Skip postpay success screen?
    # @return [TrueClass|FalseClass]
    attr_accessor :skip_checkout_success_page

    # Billing Address is editable?
    # @return [TrueClass|FalseClass]
    attr_accessor :billing_address_editable

    # Billing Address
    # @return [CreateAddressRequest]
    attr_accessor :billing_address

    # Bank Transfer payment request
    # @return [CreateCheckoutBankTransferRequest]
    attr_accessor :bank_transfer

    # Accepted Brands
    # @return [List of String]
    attr_accessor :accepted_brands

    # Pix payment request
    # @return [CreateCheckoutPixPaymentRequest]
    attr_accessor :pix

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['accepted_payment_methods'] = 'accepted_payment_methods'
      @_hash['accepted_multi_payment_methods'] =
        'accepted_multi_payment_methods'
      @_hash['success_url'] = 'success_url'
      @_hash['default_payment_method'] = 'default_payment_method'
      @_hash['gateway_affiliation_id'] = 'gateway_affiliation_id'
      @_hash['credit_card'] = 'credit_card'
      @_hash['debit_card'] = 'debit_card'
      @_hash['boleto'] = 'boleto'
      @_hash['customer_editable'] = 'customer_editable'
      @_hash['expires_in'] = 'expires_in'
      @_hash['skip_checkout_success_page'] = 'skip_checkout_success_page'
      @_hash['billing_address_editable'] = 'billing_address_editable'
      @_hash['billing_address'] = 'billing_address'
      @_hash['bank_transfer'] = 'bank_transfer'
      @_hash['accepted_brands'] = 'accepted_brands'
      @_hash['pix'] = 'pix'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        default_payment_method
        gateway_affiliation_id
        credit_card
        debit_card
        boleto
        customer_editable
        expires_in
        bank_transfer
        pix
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(accepted_payment_methods = nil,
                   accepted_multi_payment_methods = nil,
                   success_url = nil,
                   skip_checkout_success_page = nil,
                   billing_address_editable = nil,
                   billing_address = nil,
                   accepted_brands = nil,
                   default_payment_method = SKIP,
                   gateway_affiliation_id = SKIP,
                   credit_card = SKIP,
                   debit_card = SKIP,
                   boleto = SKIP,
                   customer_editable = SKIP,
                   expires_in = SKIP,
                   bank_transfer = SKIP,
                   pix = SKIP)
      @accepted_payment_methods = accepted_payment_methods
      @accepted_multi_payment_methods = accepted_multi_payment_methods
      @success_url = success_url
      @default_payment_method = default_payment_method unless default_payment_method == SKIP
      @gateway_affiliation_id = gateway_affiliation_id unless gateway_affiliation_id == SKIP
      @credit_card = credit_card unless credit_card == SKIP
      @debit_card = debit_card unless debit_card == SKIP
      @boleto = boleto unless boleto == SKIP
      @customer_editable = customer_editable unless customer_editable == SKIP
      @expires_in = expires_in unless expires_in == SKIP
      @skip_checkout_success_page = skip_checkout_success_page
      @billing_address_editable = billing_address_editable
      @billing_address = billing_address
      @bank_transfer = bank_transfer unless bank_transfer == SKIP
      @accepted_brands = accepted_brands
      @pix = pix unless pix == SKIP
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      accepted_payment_methods =
        hash.key?('accepted_payment_methods') ? hash['accepted_payment_methods'] : nil
      accepted_multi_payment_methods =
        hash.key?('accepted_multi_payment_methods') ? hash['accepted_multi_payment_methods'] : nil
      success_url = hash.key?('success_url') ? hash['success_url'] : nil
      skip_checkout_success_page =
        hash.key?('skip_checkout_success_page') ? hash['skip_checkout_success_page'] : nil
      billing_address_editable =
        hash.key?('billing_address_editable') ? hash['billing_address_editable'] : nil
      billing_address = CreateAddressRequest.from_hash(hash['billing_address']) if
        hash['billing_address']
      accepted_brands =
        hash.key?('accepted_brands') ? hash['accepted_brands'] : nil
      default_payment_method =
        hash.key?('default_payment_method') ? hash['default_payment_method'] : SKIP
      gateway_affiliation_id =
        hash.key?('gateway_affiliation_id') ? hash['gateway_affiliation_id'] : SKIP
      credit_card = CreateCheckoutCreditCardPaymentRequest.from_hash(hash['credit_card']) if
        hash['credit_card']
      debit_card = CreateCheckoutDebitCardPaymentRequest.from_hash(hash['debit_card']) if
        hash['debit_card']
      boleto = CreateCheckoutBoletoPaymentRequest.from_hash(hash['boleto']) if hash['boleto']
      customer_editable =
        hash.key?('customer_editable') ? hash['customer_editable'] : SKIP
      expires_in = hash.key?('expires_in') ? hash['expires_in'] : SKIP
      bank_transfer = CreateCheckoutBankTransferRequest.from_hash(hash['bank_transfer']) if
        hash['bank_transfer']
      pix = CreateCheckoutPixPaymentRequest.from_hash(hash['pix']) if hash['pix']

      # Create object from extracted values.
      CreateCheckoutPaymentRequest.new(accepted_payment_methods,
                                       accepted_multi_payment_methods,
                                       success_url,
                                       skip_checkout_success_page,
                                       billing_address_editable,
                                       billing_address,
                                       accepted_brands,
                                       default_payment_method,
                                       gateway_affiliation_id,
                                       credit_card,
                                       debit_card,
                                       boleto,
                                       customer_editable,
                                       expires_in,
                                       bank_transfer,
                                       pix)
    end
  end
end
