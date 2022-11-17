# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # Update Order item Request
  class UpdateOrderItemRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # TODO: Write general description for this method
    # @return [Integer]
    attr_accessor :amount

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :description

    # TODO: Write general description for this method
    # @return [Integer]
    attr_accessor :quantity

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :category

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['amount'] = 'amount'
      @_hash['description'] = 'description'
      @_hash['quantity'] = 'quantity'
      @_hash['category'] = 'category'
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

    def initialize(amount = nil,
                   description = nil,
                   quantity = nil,
                   category = nil)
      @amount = amount
      @description = description
      @quantity = quantity
      @category = category
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      amount = hash.key?('amount') ? hash['amount'] : nil
      description = hash.key?('description') ? hash['description'] : nil
      quantity = hash.key?('quantity') ? hash['quantity'] : nil
      category = hash.key?('category') ? hash['category'] : nil

      # Create object from extracted values.
      UpdateOrderItemRequest.new(amount,
                                 description,
                                 quantity,
                                 category)
    end
  end
end
