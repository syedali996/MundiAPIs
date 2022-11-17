# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

require 'date'
module PagarmeCoreApi
  # Response object for getting a increment
  class GetIncrementResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :id

    # TODO: Write general description for this method
    # @return [Float]
    attr_accessor :value

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :increment_type

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :status

    # TODO: Write general description for this method
    # @return [DateTime]
    attr_accessor :created_at

    # TODO: Write general description for this method
    # @return [Integer]
    attr_accessor :cycles

    # TODO: Write general description for this method
    # @return [DateTime]
    attr_accessor :deleted_at

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :description

    # TODO: Write general description for this method
    # @return [GetSubscriptionResponse]
    attr_accessor :subscription

    # The Subscription Item
    # @return [GetSubscriptionItemResponse]
    attr_accessor :subscription_item

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['id'] = 'id'
      @_hash['value'] = 'value'
      @_hash['increment_type'] = 'increment_type'
      @_hash['status'] = 'status'
      @_hash['created_at'] = 'created_at'
      @_hash['cycles'] = 'cycles'
      @_hash['deleted_at'] = 'deleted_at'
      @_hash['description'] = 'description'
      @_hash['subscription'] = 'subscription'
      @_hash['subscription_item'] = 'subscription_item'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        cycles
        deleted_at
        description
        subscription
        subscription_item
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(id = nil,
                   value = nil,
                   increment_type = nil,
                   status = nil,
                   created_at = nil,
                   cycles = SKIP,
                   deleted_at = SKIP,
                   description = SKIP,
                   subscription = SKIP,
                   subscription_item = SKIP)
      @id = id
      @value = value
      @increment_type = increment_type
      @status = status
      @created_at = created_at
      @cycles = cycles unless cycles == SKIP
      @deleted_at = deleted_at unless deleted_at == SKIP
      @description = description unless description == SKIP
      @subscription = subscription unless subscription == SKIP
      @subscription_item = subscription_item unless subscription_item == SKIP
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      id = hash.key?('id') ? hash['id'] : nil
      value = hash.key?('value') ? hash['value'] : nil
      increment_type =
        hash.key?('increment_type') ? hash['increment_type'] : nil
      status = hash.key?('status') ? hash['status'] : nil
      created_at = if hash.key?('created_at')
                     (DateTimeHelper.from_rfc3339(hash['created_at']) if hash['created_at'])
                   end
      cycles = hash.key?('cycles') ? hash['cycles'] : SKIP
      deleted_at = if hash.key?('deleted_at')
                     (DateTimeHelper.from_rfc3339(hash['deleted_at']) if hash['deleted_at'])
                   else
                     SKIP
                   end
      description = hash.key?('description') ? hash['description'] : SKIP
      subscription = GetSubscriptionResponse.from_hash(hash['subscription']) if
        hash['subscription']
      subscription_item = GetSubscriptionItemResponse.from_hash(hash['subscription_item']) if
        hash['subscription_item']

      # Create object from extracted values.
      GetIncrementResponse.new(id,
                               value,
                               increment_type,
                               status,
                               created_at,
                               cycles,
                               deleted_at,
                               description,
                               subscription,
                               subscription_item)
    end

    def to_created_at
      DateTimeHelper.to_rfc3339(created_at)
    end

    def to_deleted_at
      DateTimeHelper.to_rfc3339(deleted_at)
    end
  end
end
