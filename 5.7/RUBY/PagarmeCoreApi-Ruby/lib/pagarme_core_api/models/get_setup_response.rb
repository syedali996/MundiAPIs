# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # Response object for getting the setup from a subscription
  class GetSetupResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :id

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :description

    # TODO: Write general description for this method
    # @return [Integer]
    attr_accessor :amount

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :status

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['id'] = 'id'
      @_hash['description'] = 'description'
      @_hash['amount'] = 'amount'
      @_hash['status'] = 'status'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      []
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(id = nil,
                   description = nil,
                   amount = nil,
                   status = nil)
      @id = id
      @description = description
      @amount = amount
      @status = status
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      id = hash.key?('id') ? hash['id'] : nil
      description = hash.key?('description') ? hash['description'] : nil
      amount = hash.key?('amount') ? hash['amount'] : nil
      status = hash.key?('status') ? hash['status'] : nil

      # Create object from extracted values.
      GetSetupResponse.new(id,
                           description,
                           amount,
                           status)
    end
  end
end
