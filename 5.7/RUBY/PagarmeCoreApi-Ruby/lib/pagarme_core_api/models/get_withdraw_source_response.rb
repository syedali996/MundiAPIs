# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # GetWithdrawSourceResponse Model.
  class GetWithdrawSourceResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :source_id

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :type

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['source_id'] = 'source_id'
      @_hash['type'] = 'type'
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

    def initialize(source_id = nil,
                   type = nil)
      @source_id = source_id
      @type = type
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      source_id = hash.key?('source_id') ? hash['source_id'] : nil
      type = hash.key?('type') ? hash['type'] : nil

      # Create object from extracted values.
      GetWithdrawSourceResponse.new(source_id,
                                    type)
    end
  end
end
