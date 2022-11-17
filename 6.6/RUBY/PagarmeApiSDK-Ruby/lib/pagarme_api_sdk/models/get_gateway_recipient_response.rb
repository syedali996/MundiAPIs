# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # Information about the recipient on the gateway
  class GetGatewayRecipientResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Gateway name
    # @return [String]
    attr_accessor :gateway

    # Status of the recipient on the gateway
    # @return [String]
    attr_accessor :status

    # Recipient id on the gateway
    # @return [String]
    attr_accessor :pgid

    # Creation date
    # @return [String]
    attr_accessor :created_at

    # Last update date
    # @return [String]
    attr_accessor :updated_at

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['gateway'] = 'gateway'
      @_hash['status'] = 'status'
      @_hash['pgid'] = 'pgid'
      @_hash['created_at'] = 'created_at'
      @_hash['updated_at'] = 'updated_at'
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

    def initialize(gateway = nil,
                   status = nil,
                   pgid = nil,
                   created_at = nil,
                   updated_at = nil)
      @gateway = gateway
      @status = status
      @pgid = pgid
      @created_at = created_at
      @updated_at = updated_at
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      gateway = hash.key?('gateway') ? hash['gateway'] : nil
      status = hash.key?('status') ? hash['status'] : nil
      pgid = hash.key?('pgid') ? hash['pgid'] : nil
      created_at = hash.key?('created_at') ? hash['created_at'] : nil
      updated_at = hash.key?('updated_at') ? hash['updated_at'] : nil

      # Create object from extracted values.
      GetGatewayRecipientResponse.new(gateway,
                                      status,
                                      pgid,
                                      created_at,
                                      updated_at)
    end
  end
end
