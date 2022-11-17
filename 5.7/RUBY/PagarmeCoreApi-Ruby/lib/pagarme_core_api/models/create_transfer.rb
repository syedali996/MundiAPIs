# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # CreateTransfer Model.
  class CreateTransfer < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # TODO: Write general description for this method
    # @return [Integer]
    attr_accessor :amount

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :source_id

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :target_id

    # TODO: Write general description for this method
    # @return [List of String]
    attr_accessor :metadata

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['amount'] = 'amount'
      @_hash['source_id'] = 'source_id'
      @_hash['target_id'] = 'target_id'
      @_hash['metadata'] = 'metadata'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        metadata
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(amount = nil,
                   source_id = nil,
                   target_id = nil,
                   metadata = SKIP)
      @amount = amount
      @source_id = source_id
      @target_id = target_id
      @metadata = metadata unless metadata == SKIP
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      amount = hash.key?('amount') ? hash['amount'] : nil
      source_id = hash.key?('source_id') ? hash['source_id'] : nil
      target_id = hash.key?('target_id') ? hash['target_id'] : nil
      metadata = hash.key?('metadata') ? hash['metadata'] : SKIP

      # Create object from extracted values.
      CreateTransfer.new(amount,
                         source_id,
                         target_id,
                         metadata)
    end
  end
end
