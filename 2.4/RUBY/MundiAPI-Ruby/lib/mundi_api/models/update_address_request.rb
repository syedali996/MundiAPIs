# mundi_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module MundiApi
  # Request for updating an address
  class UpdateAddressRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Number
    # @return [String]
    attr_accessor :number

    # Complement
    # @return [String]
    attr_accessor :complement

    # Metadata
    # @return [Hash of String]
    attr_accessor :metadata

    # Line 2 for address
    # @return [String]
    attr_accessor :line_2

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['number'] = 'number'
      @_hash['complement'] = 'complement'
      @_hash['metadata'] = 'metadata'
      @_hash['line_2'] = 'line_2'
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

    def initialize(number = nil,
                   complement = nil,
                   metadata = nil,
                   line_2 = nil)
      @number = number
      @complement = complement
      @metadata = metadata
      @line_2 = line_2
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      number = hash.key?('number') ? hash['number'] : nil
      complement = hash.key?('complement') ? hash['complement'] : nil
      metadata = hash.key?('metadata') ? hash['metadata'] : nil
      line_2 = hash.key?('line_2') ? hash['line_2'] : nil

      # Create object from extracted values.
      UpdateAddressRequest.new(number,
                               complement,
                               metadata,
                               line_2)
    end
  end
end
