# mundi_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module MundiApi
  # Informações de transferência do recebedor
  class CreateTransferSettingsRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # TODO: Write general description for this method
    # @return [TrueClass|FalseClass]
    attr_accessor :transfer_enabled

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :transfer_interval

    # TODO: Write general description for this method
    # @return [Integer]
    attr_accessor :transfer_day

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['transfer_enabled'] = 'transfer_enabled'
      @_hash['transfer_interval'] = 'transfer_interval'
      @_hash['transfer_day'] = 'transfer_day'
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

    def initialize(transfer_enabled = nil,
                   transfer_interval = nil,
                   transfer_day = nil)
      @transfer_enabled = transfer_enabled
      @transfer_interval = transfer_interval
      @transfer_day = transfer_day
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      transfer_enabled =
        hash.key?('transfer_enabled') ? hash['transfer_enabled'] : nil
      transfer_interval =
        hash.key?('transfer_interval') ? hash['transfer_interval'] : nil
      transfer_day = hash.key?('transfer_day') ? hash['transfer_day'] : nil

      # Create object from extracted values.
      CreateTransferSettingsRequest.new(transfer_enabled,
                                        transfer_interval,
                                        transfer_day)
    end
  end
end
