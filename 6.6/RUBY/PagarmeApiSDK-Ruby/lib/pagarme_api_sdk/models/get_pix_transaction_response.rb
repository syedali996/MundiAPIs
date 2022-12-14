# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

require 'date'
require_relative 'get_transaction_response'

module PagarmeApiSdk
  # Response object when getting a pix transaction
  class GetPixTransactionResponse < GetTransactionResponse
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :qr_code

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :qr_code_url

    # TODO: Write general description for this method
    # @return [DateTime]
    attr_accessor :expires_at

    # TODO: Write general description for this method
    # @return [List of PixAdditionalInformation]
    attr_accessor :additional_information

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :end_to_end_id

    # TODO: Write general description for this method
    # @return [GetPixPayerResponse]
    attr_accessor :payer

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['qr_code'] = 'qr_code'
      @_hash['qr_code_url'] = 'qr_code_url'
      @_hash['expires_at'] = 'expires_at'
      @_hash['additional_information'] = 'additional_information'
      @_hash['end_to_end_id'] = 'end_to_end_id'
      @_hash['payer'] = 'payer'
      @_hash = super().merge(@_hash)
      @_hash
    end

    # An array for optional fields
    def self.optionals
      _arr = []
      (_arr << super()).flatten!
    end

    # An array for nullable fields
    def self.nullables
      _arr = %w[
        end_to_end_id
      ]
      (_arr << super()).flatten!
    end

    def initialize(qr_code = nil,
                   qr_code_url = nil,
                   expires_at = nil,
                   additional_information = nil,
                   end_to_end_id = nil,
                   payer = nil,
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
                   next_attempt = SKIP,
                   transaction_type = 'pix',
                   metadata = SKIP,
                   interest = SKIP,
                   fine = SKIP,
                   max_days_to_pay_past_due = SKIP)
      @qr_code = qr_code
      @qr_code_url = qr_code_url
      @expires_at = expires_at
      @additional_information = additional_information
      @end_to_end_id = end_to_end_id
      @payer = payer

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
      qr_code = hash.key?('qr_code') ? hash['qr_code'] : nil
      qr_code_url = hash.key?('qr_code_url') ? hash['qr_code_url'] : nil
      expires_at = if hash.key?('expires_at')
                     (DateTimeHelper.from_rfc3339(hash['expires_at']) if hash['expires_at'])
                   end
      # Parameter is an array, so we need to iterate through it
      additional_information = nil
      unless hash['additional_information'].nil?
        additional_information = []
        hash['additional_information'].each do |structure|
          additional_information << (PixAdditionalInformation.from_hash(structure) if structure)
        end
      end

      additional_information = nil unless hash.key?('additional_information')
      end_to_end_id = hash.key?('end_to_end_id') ? hash['end_to_end_id'] : nil
      payer = GetPixPayerResponse.from_hash(hash['payer']) if hash['payer']
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
      next_attempt = if hash.key?('next_attempt')
                       (DateTimeHelper.from_rfc3339(hash['next_attempt']) if hash['next_attempt'])
                     else
                       SKIP
                     end
      transaction_type = hash['transaction_type'] ||= 'pix'
      metadata = hash.key?('metadata') ? hash['metadata'] : SKIP
      interest = GetInterestResponse.from_hash(hash['interest']) if hash['interest']
      fine = GetFineResponse.from_hash(hash['fine']) if hash['fine']
      max_days_to_pay_past_due =
        hash.key?('max_days_to_pay_past_due') ? hash['max_days_to_pay_past_due'] : SKIP

      # Create object from extracted values.
      GetPixTransactionResponse.new(qr_code,
                                    qr_code_url,
                                    expires_at,
                                    additional_information,
                                    end_to_end_id,
                                    payer,
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
                                    next_attempt,
                                    transaction_type,
                                    metadata,
                                    interest,
                                    fine,
                                    max_days_to_pay_past_due)
    end

    def to_expires_at
      DateTimeHelper.to_rfc3339(expires_at)
    end
  end
end
