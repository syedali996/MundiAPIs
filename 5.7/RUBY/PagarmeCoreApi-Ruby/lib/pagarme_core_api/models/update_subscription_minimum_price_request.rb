# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # Atualização do valor mínimo da assinatura
  class UpdateSubscriptionMinimumPriceRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Valor mínimo da assinatura
    # @return [Integer]
    attr_accessor :minimum_price

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['minimum_price'] = 'minimum_price'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        minimum_price
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(minimum_price = SKIP)
      @minimum_price = minimum_price unless minimum_price == SKIP
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      minimum_price = hash.key?('minimum_price') ? hash['minimum_price'] : SKIP

      # Create object from extracted values.
      UpdateSubscriptionMinimumPriceRequest.new(minimum_price)
    end
  end
end
