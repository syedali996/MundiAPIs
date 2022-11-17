# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # CreateEmvDataTlvDecryptRequest Model.
  class CreateEmvDataTlvDecryptRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Emv tag
    # @return [String]
    attr_accessor :tag

    # Emv lenght
    # @return [String]
    attr_accessor :lenght

    # Emv value
    # @return [String]
    attr_accessor :value

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['tag'] = 'tag'
      @_hash['lenght'] = 'lenght'
      @_hash['value'] = 'value'
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

    def initialize(tag = nil,
                   lenght = nil,
                   value = nil)
      @tag = tag
      @lenght = lenght
      @value = value
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      tag = hash.key?('tag') ? hash['tag'] : nil
      lenght = hash.key?('lenght') ? hash['lenght'] : nil
      value = hash.key?('value') ? hash['value'] : nil

      # Create object from extracted values.
      CreateEmvDataTlvDecryptRequest.new(tag,
                                         lenght,
                                         value)
    end
  end
end