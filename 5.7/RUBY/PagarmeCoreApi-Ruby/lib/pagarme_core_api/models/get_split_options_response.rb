# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # GetSplitOptionsResponse Model.
  class GetSplitOptionsResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # TODO: Write general description for this method
    # @return [TrueClass|FalseClass]
    attr_accessor :liable

    # TODO: Write general description for this method
    # @return [TrueClass|FalseClass]
    attr_accessor :charge_processing_fee

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :charge_remainder_fee

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['liable'] = 'liable'
      @_hash['charge_processing_fee'] = 'charge_processing_fee'
      @_hash['charge_remainder_fee'] = 'charge_remainder_fee'
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

    def initialize(liable = nil,
                   charge_processing_fee = nil,
                   charge_remainder_fee = nil)
      @liable = liable
      @charge_processing_fee = charge_processing_fee
      @charge_remainder_fee = charge_remainder_fee
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      liable = hash.key?('liable') ? hash['liable'] : nil
      charge_processing_fee =
        hash.key?('charge_processing_fee') ? hash['charge_processing_fee'] : nil
      charge_remainder_fee =
        hash.key?('charge_remainder_fee') ? hash['charge_remainder_fee'] : nil

      # Create object from extracted values.
      GetSplitOptionsResponse.new(liable,
                                  charge_processing_fee,
                                  charge_remainder_fee)
    end
  end
end
