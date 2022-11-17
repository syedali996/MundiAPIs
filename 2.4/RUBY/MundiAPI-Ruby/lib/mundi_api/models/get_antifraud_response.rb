# mundi_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module MundiApi
  # GetAntifraudResponse Model.
  class GetAntifraudResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :status

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :return_code

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :return_message

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :provider_name

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :score

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['status'] = 'status'
      @_hash['return_code'] = 'return_code'
      @_hash['return_message'] = 'return_message'
      @_hash['provider_name'] = 'provider_name'
      @_hash['score'] = 'score'
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

    def initialize(status = nil,
                   return_code = nil,
                   return_message = nil,
                   provider_name = nil,
                   score = nil)
      @status = status
      @return_code = return_code
      @return_message = return_message
      @provider_name = provider_name
      @score = score
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      status = hash.key?('status') ? hash['status'] : nil
      return_code = hash.key?('return_code') ? hash['return_code'] : nil
      return_message =
        hash.key?('return_message') ? hash['return_message'] : nil
      provider_name = hash.key?('provider_name') ? hash['provider_name'] : nil
      score = hash.key?('score') ? hash['score'] : nil

      # Create object from extracted values.
      GetAntifraudResponse.new(status,
                               return_code,
                               return_message,
                               provider_name,
                               score)
    end
  end
end