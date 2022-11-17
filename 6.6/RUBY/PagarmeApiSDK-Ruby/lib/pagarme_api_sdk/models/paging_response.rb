# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # Object used for returning lists of objects with pagination
  class PagingResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Total number of pages
    # @return [Integer]
    attr_accessor :total

    # Previous page
    # @return [String]
    attr_accessor :previous

    # Next page
    # @return [String]
    attr_accessor :mnext

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['total'] = 'total'
      @_hash['previous'] = 'previous'
      @_hash['mnext'] = 'next'
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

    def initialize(total = nil,
                   previous = nil,
                   mnext = nil)
      @total = total
      @previous = previous
      @mnext = mnext
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      total = hash.key?('total') ? hash['total'] : nil
      previous = hash.key?('previous') ? hash['previous'] : nil
      mnext = hash.key?('next') ? hash['next'] : nil

      # Create object from extracted values.
      PagingResponse.new(total,
                         previous,
                         mnext)
    end
  end
end
