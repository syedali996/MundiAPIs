# mundi_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

require 'date'
require_relative 'get_transaction_response'

module MundiApi
  # Response object for getting a safety pay transaction
  class GetSafetyPayTransactionResponse < GetTransactionResponse
    # Payment url
    # @return [String]
    attr_accessor :url

    # Transaction identifier on bank
    # @return [String]
    attr_accessor :bank_tid

    # Payment date
    # @return [DateTime]
    attr_accessor :paid_at

    # Paid amount
    # @return [Integer]
    attr_accessor :paid_amount

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['url'] = 'url'
      @_hash['bank_tid'] = 'bank_tid'
      @_hash['paid_at'] = 'paid_at'
      @_hash['paid_amount'] = 'paid_amount'
      @_hash = super().merge(@_hash)
      @_hash
    end

    # An array for optional fields
    def self.optionals
      _arr = %w[
        paid_at
        paid_amount
      ]
      (_arr << super()).flatten!
    end

    # An array for nullable fields
    def self.nullables
      _arr = []
      (_arr << super()).flatten!
    end

    def initialize(url = nil,
                   bank_tid = nil,
                   gateway_id = nil,
                   amount = nil,
                   status = nil,
                   success = nil,
                   created_at = nil,
                   updated_at = nil,
                   attempt_count = nil,
                   max_attempts = nil,
                   splits = nil,
                   id = nil,
                   gateway_response = nil,
                   antifraud_response = nil,
                   split = nil,
                   paid_at = SKIP,
                   paid_amount = SKIP,
                   next_attempt = SKIP,
                   transaction_type = 'safetypay',
                   metadata = SKIP,
                   interest = SKIP,
                   fine = SKIP,
                   max_days_to_pay_past_due = SKIP)
      @url = url
      @bank_tid = bank_tid
      @paid_at = paid_at unless paid_at == SKIP
      @paid_amount = paid_amount unless paid_amount == SKIP

      # Call the constructor of the base class
      super(gateway_id,
            amount,
            status,
            success,
            created_at,
            updated_at,
            attempt_count,
            max_attempts,
            splits,
            id,
            gateway_response,
            antifraud_response,
            split,
            next_attempt,
            transaction_type,
            metadata,
            interest,
            fine,
            max_days_to_pay_past_due)
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      url = hash.key?('url') ? hash['url'] : nil
      bank_tid = hash.key?('bank_tid') ? hash['bank_tid'] : nil
      gateway_id = hash.key?('gateway_id') ? hash['gateway_id'] : nil
      amount = hash.key?('amount') ? hash['amount'] : nil
      status = hash.key?('status') ? hash['status'] : nil
      success = hash.key?('success') ? hash['success'] : nil
      created_at = if hash.key?('created_at')
                     (DateTimeHelper.from_rfc3339(hash['created_at']) if hash['created_at'])
                   end
      updated_at = if hash.key?('updated_at')
                     (DateTimeHelper.from_rfc3339(hash['updated_at']) if hash['updated_at'])
                   end
      attempt_count = hash.key?('attempt_count') ? hash['attempt_count'] : nil
      max_attempts = hash.key?('max_attempts') ? hash['max_attempts'] : nil
      # Parameter is an array, so we need to iterate through it
      splits = nil
      unless hash['splits'].nil?
        splits = []
        hash['splits'].each do |structure|
          splits << (GetSplitResponse.from_hash(structure) if structure)
        end
      end

      splits = nil unless hash.key?('splits')
      id = hash.key?('id') ? hash['id'] : nil
      gateway_response = GetGatewayResponseResponse.from_hash(hash['gateway_response']) if
        hash['gateway_response']
      antifraud_response = GetAntifraudResponse.from_hash(hash['antifraud_response']) if
        hash['antifraud_response']
      # Parameter is an array, so we need to iterate through it
      split = nil
      unless hash['split'].nil?
        split = []
        hash['split'].each do |structure|
          split << (GetSplitResponse.from_hash(structure) if structure)
        end
      end

      split = nil unless hash.key?('split')
      paid_at = if hash.key?('paid_at')
                  (DateTimeHelper.from_rfc3339(hash['paid_at']) if hash['paid_at'])
                else
                  SKIP
                end
      paid_amount = hash.key?('paid_amount') ? hash['paid_amount'] : SKIP
      next_attempt = if hash.key?('next_attempt')
                       (DateTimeHelper.from_rfc3339(hash['next_attempt']) if hash['next_attempt'])
                     else
                       SKIP
                     end
      transaction_type = hash['transaction_type'] ||= 'safetypay'
      metadata = hash.key?('metadata') ? hash['metadata'] : SKIP
      interest = GetInterestResponse.from_hash(hash['interest']) if hash['interest']
      fine = GetFineResponse.from_hash(hash['fine']) if hash['fine']
      max_days_to_pay_past_due =
        hash.key?('max_days_to_pay_past_due') ? hash['max_days_to_pay_past_due'] : SKIP

      # Create object from extracted values.
      GetSafetyPayTransactionResponse.new(url,
                                          bank_tid,
                                          gateway_id,
                                          amount,
                                          status,
                                          success,
                                          created_at,
                                          updated_at,
                                          attempt_count,
                                          max_attempts,
                                          splits,
                                          id,
                                          gateway_response,
                                          antifraud_response,
                                          split,
                                          paid_at,
                                          paid_amount,
                                          next_attempt,
                                          transaction_type,
                                          metadata,
                                          interest,
                                          fine,
                                          max_days_to_pay_past_due)
    end

    def to_paid_at
      DateTimeHelper.to_rfc3339(paid_at)
    end
  end
end
