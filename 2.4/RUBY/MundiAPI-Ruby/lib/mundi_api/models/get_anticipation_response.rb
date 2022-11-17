# mundi_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

require 'date'
module MundiApi
  # Anticipation
  class GetAnticipationResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Id
    # @return [String]
    attr_accessor :id

    # Requested amount
    # @return [Integer]
    attr_accessor :requested_amount

    # Approved amount
    # @return [Integer]
    attr_accessor :approved_amount

    # Recipient
    # @return [GetRecipientResponse]
    attr_accessor :recipient

    # Anticipation id on the gateway
    # @return [String]
    attr_accessor :pgid

    # Creation date
    # @return [DateTime]
    attr_accessor :created_at

    # Last update date
    # @return [DateTime]
    attr_accessor :updated_at

    # Payment date
    # @return [DateTime]
    attr_accessor :payment_date

    # Status
    # @return [String]
    attr_accessor :status

    # Timeframe
    # @return [String]
    attr_accessor :timeframe

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['id'] = 'id'
      @_hash['requested_amount'] = 'requested_amount'
      @_hash['approved_amount'] = 'approved_amount'
      @_hash['recipient'] = 'recipient'
      @_hash['pgid'] = 'pgid'
      @_hash['created_at'] = 'created_at'
      @_hash['updated_at'] = 'updated_at'
      @_hash['payment_date'] = 'payment_date'
      @_hash['status'] = 'status'
      @_hash['timeframe'] = 'timeframe'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        recipient
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(id = nil,
                   requested_amount = nil,
                   approved_amount = nil,
                   pgid = nil,
                   created_at = nil,
                   updated_at = nil,
                   payment_date = nil,
                   status = nil,
                   timeframe = nil,
                   recipient = SKIP)
      @id = id
      @requested_amount = requested_amount
      @approved_amount = approved_amount
      @recipient = recipient unless recipient == SKIP
      @pgid = pgid
      @created_at = created_at
      @updated_at = updated_at
      @payment_date = payment_date
      @status = status
      @timeframe = timeframe
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      id = hash.key?('id') ? hash['id'] : nil
      requested_amount =
        hash.key?('requested_amount') ? hash['requested_amount'] : nil
      approved_amount =
        hash.key?('approved_amount') ? hash['approved_amount'] : nil
      pgid = hash.key?('pgid') ? hash['pgid'] : nil
      created_at = if hash.key?('created_at')
                     (DateTimeHelper.from_rfc3339(hash['created_at']) if hash['created_at'])
                   end
      updated_at = if hash.key?('updated_at')
                     (DateTimeHelper.from_rfc3339(hash['updated_at']) if hash['updated_at'])
                   end
      payment_date = if hash.key?('payment_date')
                       (DateTimeHelper.from_rfc3339(hash['payment_date']) if hash['payment_date'])
                     end
      status = hash.key?('status') ? hash['status'] : nil
      timeframe = hash.key?('timeframe') ? hash['timeframe'] : nil
      recipient = GetRecipientResponse.from_hash(hash['recipient']) if hash['recipient']

      # Create object from extracted values.
      GetAnticipationResponse.new(id,
                                  requested_amount,
                                  approved_amount,
                                  pgid,
                                  created_at,
                                  updated_at,
                                  payment_date,
                                  status,
                                  timeframe,
                                  recipient)
    end

    def to_created_at
      DateTimeHelper.to_rfc3339(created_at)
    end

    def to_updated_at
      DateTimeHelper.to_rfc3339(updated_at)
    end

    def to_payment_date
      DateTimeHelper.to_rfc3339(payment_date)
    end
  end
end
