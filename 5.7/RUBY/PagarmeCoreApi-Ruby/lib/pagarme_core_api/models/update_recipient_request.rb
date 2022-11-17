# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # Request for updating a Recipient
  class UpdateRecipientRequest < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # Name
    # @return [String]
    attr_accessor :name

    # Email
    # @return [String]
    attr_accessor :email

    # Description
    # @return [String]
    attr_accessor :description

    # Type
    # @return [String]
    attr_accessor :type

    # Status
    # @return [String]
    attr_accessor :status

    # Metadata
    # @return [Hash of String]
    attr_accessor :metadata

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['name'] = 'name'
      @_hash['email'] = 'email'
      @_hash['description'] = 'description'
      @_hash['type'] = 'type'
      @_hash['status'] = 'status'
      @_hash['metadata'] = 'metadata'
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

    def initialize(name = nil,
                   email = nil,
                   description = nil,
                   type = nil,
                   status = nil,
                   metadata = nil)
      @name = name
      @email = email
      @description = description
      @type = type
      @status = status
      @metadata = metadata
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      name = hash.key?('name') ? hash['name'] : nil
      email = hash.key?('email') ? hash['email'] : nil
      description = hash.key?('description') ? hash['description'] : nil
      type = hash.key?('type') ? hash['type'] : nil
      status = hash.key?('status') ? hash['status'] : nil
      metadata = hash.key?('metadata') ? hash['metadata'] : nil

      # Create object from extracted values.
      UpdateRecipientRequest.new(name,
                                 email,
                                 description,
                                 type,
                                 status,
                                 metadata)
    end
  end
end