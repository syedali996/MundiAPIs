# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # CreateSubscriptionSplitRequest Model.
  class CreateSubscriptionSplitRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Defines if the split is enabled
    # @return [TrueClass|FalseClass]
    attr_accessor :enabled

    # Split
    # @return [List of CreateSplitRequest]
    attr_accessor :rules

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['enabled'] = 'enabled'
      @_hash['rules'] = 'rules'
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

    def initialize(enabled = nil,
                   rules = nil)
      @enabled = enabled
      @rules = rules
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      enabled = hash.key?('enabled') ? hash['enabled'] : nil
      # Parameter is an array, so we need to iterate through it
      rules = nil
      unless hash['rules'].nil?
        rules = []
        hash['rules'].each do |structure|
          rules << (CreateSplitRequest.from_hash(structure) if structure)
        end
      end

      rules = nil unless hash.key?('rules')

      # Create object from extracted values.
      CreateSubscriptionSplitRequest.new(enabled,
                                         rules)
    end
  end
end
