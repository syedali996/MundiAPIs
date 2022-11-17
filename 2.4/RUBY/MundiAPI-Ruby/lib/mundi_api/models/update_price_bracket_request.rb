# mundi_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module MundiApi
  # Request for updating a price bracket
  class UpdatePriceBracketRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Start quantity of the bracket
    # @return [Integer]
    attr_accessor :start_quantity

    # Price
    # @return [Integer]
    attr_accessor :price

    # End quantity of the bracket
    # @return [Integer]
    attr_accessor :end_quantity

    # Overage price
    # @return [Integer]
    attr_accessor :overage_price

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['start_quantity'] = 'start_quantity'
      @_hash['price'] = 'price'
      @_hash['end_quantity'] = 'end_quantity'
      @_hash['overage_price'] = 'overage_price'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        end_quantity
        overage_price
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(start_quantity = nil,
                   price = nil,
                   end_quantity = SKIP,
                   overage_price = SKIP)
      @start_quantity = start_quantity
      @price = price
      @end_quantity = end_quantity unless end_quantity == SKIP
      @overage_price = overage_price unless overage_price == SKIP
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      start_quantity =
        hash.key?('start_quantity') ? hash['start_quantity'] : nil
      price = hash.key?('price') ? hash['price'] : nil
      end_quantity = hash.key?('end_quantity') ? hash['end_quantity'] : SKIP
      overage_price = hash.key?('overage_price') ? hash['overage_price'] : SKIP

      # Create object from extracted values.
      UpdatePriceBracketRequest.new(start_quantity,
                                    price,
                                    end_quantity,
                                    overage_price)
    end
  end
end
