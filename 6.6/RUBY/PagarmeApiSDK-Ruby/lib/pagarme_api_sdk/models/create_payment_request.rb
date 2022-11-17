# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # Payment data
  class CreatePaymentRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Payment method
    # @return [String]
    attr_accessor :payment_method

    # Settings for credit card payment
    # @return [CreateCreditCardPaymentRequest]
    attr_accessor :credit_card

    # Settings for debit card payment
    # @return [CreateDebitCardPaymentRequest]
    attr_accessor :debit_card

    # Settings for boleto payment
    # @return [CreateBoletoPaymentRequest]
    attr_accessor :boleto

    # Currency. Must be informed using 3 characters
    # @return [String]
    attr_accessor :currency

    # Settings for voucher payment
    # @return [CreateVoucherPaymentRequest]
    attr_accessor :voucher

    # Splits
    # @return [List of CreateSplitRequest]
    attr_accessor :split

    # Settings for bank transfer payment
    # @return [CreateBankTransferPaymentRequest]
    attr_accessor :bank_transfer

    # Gateway affiliation code
    # @return [String]
    attr_accessor :gateway_affiliation_id

    # The amount of the payment, in cents
    # @return [Integer]
    attr_accessor :amount

    # Settings for checkout payment
    # @return [CreateCheckoutPaymentRequest]
    attr_accessor :checkout

    # Customer Id
    # @return [String]
    attr_accessor :customer_id

    # Customer
    # @return [CreateCustomerRequest]
    attr_accessor :customer

    # Metadata
    # @return [Hash of String]
    attr_accessor :metadata

    # Settings for cash payment
    # @return [CreateCashPaymentRequest]
    attr_accessor :cash

    # Settings for private label payment
    # @return [CreatePrivateLabelPaymentRequest]
    attr_accessor :private_label

    # Settings for pix payment
    # @return [CreatePixPaymentRequest]
    attr_accessor :pix

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['payment_method'] = 'payment_method'
      @_hash['credit_card'] = 'credit_card'
      @_hash['debit_card'] = 'debit_card'
      @_hash['boleto'] = 'boleto'
      @_hash['currency'] = 'currency'
      @_hash['voucher'] = 'voucher'
      @_hash['split'] = 'split'
      @_hash['bank_transfer'] = 'bank_transfer'
      @_hash['gateway_affiliation_id'] = 'gateway_affiliation_id'
      @_hash['amount'] = 'amount'
      @_hash['checkout'] = 'checkout'
      @_hash['customer_id'] = 'customer_id'
      @_hash['customer'] = 'customer'
      @_hash['metadata'] = 'metadata'
      @_hash['cash'] = 'cash'
      @_hash['private_label'] = 'private_label'
      @_hash['pix'] = 'pix'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        credit_card
        debit_card
        boleto
        currency
        voucher
        split
        bank_transfer
        gateway_affiliation_id
        amount
        checkout
        customer_id
        customer
        metadata
        cash
        pix
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(payment_method = nil,
                   private_label = nil,
                   credit_card = SKIP,
                   debit_card = SKIP,
                   boleto = SKIP,
                   currency = SKIP,
                   voucher = SKIP,
                   split = SKIP,
                   bank_transfer = SKIP,
                   gateway_affiliation_id = SKIP,
                   amount = SKIP,
                   checkout = SKIP,
                   customer_id = SKIP,
                   customer = SKIP,
                   metadata = SKIP,
                   cash = SKIP,
                   pix = SKIP)
      @payment_method = payment_method
      @credit_card = credit_card unless credit_card == SKIP
      @debit_card = debit_card unless debit_card == SKIP
      @boleto = boleto unless boleto == SKIP
      @currency = currency unless currency == SKIP
      @voucher = voucher unless voucher == SKIP
      @split = split unless split == SKIP
      @bank_transfer = bank_transfer unless bank_transfer == SKIP
      @gateway_affiliation_id = gateway_affiliation_id unless gateway_affiliation_id == SKIP
      @amount = amount unless amount == SKIP
      @checkout = checkout unless checkout == SKIP
      @customer_id = customer_id unless customer_id == SKIP
      @customer = customer unless customer == SKIP
      @metadata = metadata unless metadata == SKIP
      @cash = cash unless cash == SKIP
      @private_label = private_label
      @pix = pix unless pix == SKIP
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      payment_method =
        hash.key?('payment_method') ? hash['payment_method'] : nil
      private_label = CreatePrivateLabelPaymentRequest.from_hash(hash['private_label']) if
        hash['private_label']
      credit_card = CreateCreditCardPaymentRequest.from_hash(hash['credit_card']) if
        hash['credit_card']
      debit_card = CreateDebitCardPaymentRequest.from_hash(hash['debit_card']) if
        hash['debit_card']
      boleto = CreateBoletoPaymentRequest.from_hash(hash['boleto']) if hash['boleto']
      currency = hash.key?('currency') ? hash['currency'] : SKIP
      voucher = CreateVoucherPaymentRequest.from_hash(hash['voucher']) if hash['voucher']
      # Parameter is an array, so we need to iterate through it
      split = nil
      unless hash['split'].nil?
        split = []
        hash['split'].each do |structure|
          split << (CreateSplitRequest.from_hash(structure) if structure)
        end
      end

      split = SKIP unless hash.key?('split')
      bank_transfer = CreateBankTransferPaymentRequest.from_hash(hash['bank_transfer']) if
        hash['bank_transfer']
      gateway_affiliation_id =
        hash.key?('gateway_affiliation_id') ? hash['gateway_affiliation_id'] : SKIP
      amount = hash.key?('amount') ? hash['amount'] : SKIP
      checkout = CreateCheckoutPaymentRequest.from_hash(hash['checkout']) if hash['checkout']
      customer_id = hash.key?('customer_id') ? hash['customer_id'] : SKIP
      customer = CreateCustomerRequest.from_hash(hash['customer']) if hash['customer']
      metadata = hash.key?('metadata') ? hash['metadata'] : SKIP
      cash = CreateCashPaymentRequest.from_hash(hash['cash']) if hash['cash']
      pix = CreatePixPaymentRequest.from_hash(hash['pix']) if hash['pix']

      # Create object from extracted values.
      CreatePaymentRequest.new(payment_method,
                               private_label,
                               credit_card,
                               debit_card,
                               boleto,
                               currency,
                               voucher,
                               split,
                               bank_transfer,
                               gateway_affiliation_id,
                               amount,
                               checkout,
                               customer_id,
                               customer,
                               metadata,
                               cash,
                               pix)
    end
  end
end
