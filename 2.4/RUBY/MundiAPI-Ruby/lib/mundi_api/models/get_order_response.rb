# mundi_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

require 'date'
module MundiApi
  # Response object for getting an Order
  class GetOrderResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :id

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :code

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :currency

    # TODO: Write general description for this method
    # @return [List of GetOrderItemResponse]
    attr_accessor :items

    # TODO: Write general description for this method
    # @return [GetCustomerResponse]
    attr_accessor :customer

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :status

    # TODO: Write general description for this method
    # @return [DateTime]
    attr_accessor :created_at

    # TODO: Write general description for this method
    # @return [DateTime]
    attr_accessor :updated_at

    # TODO: Write general description for this method
    # @return [List of GetChargeResponse]
    attr_accessor :charges

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :invoice_url

    # TODO: Write general description for this method
    # @return [GetShippingResponse]
    attr_accessor :shipping

    # TODO: Write general description for this method
    # @return [Hash of String]
    attr_accessor :metadata

    # Checkout Payment Settings Response
    # @return [List of GetCheckoutPaymentResponse]
    attr_accessor :checkouts

    # Ip address
    # @return [String]
    attr_accessor :ip

    # Session id
    # @return [String]
    attr_accessor :session_id

    # Location
    # @return [GetLocationResponse]
    attr_accessor :location

    # Device's informations
    # @return [GetDeviceResponse]
    attr_accessor :device

    # Indicates whether the order is closed
    # @return [TrueClass|FalseClass]
    attr_accessor :closed

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['id'] = 'id'
      @_hash['code'] = 'code'
      @_hash['currency'] = 'currency'
      @_hash['items'] = 'items'
      @_hash['customer'] = 'customer'
      @_hash['status'] = 'status'
      @_hash['created_at'] = 'created_at'
      @_hash['updated_at'] = 'updated_at'
      @_hash['charges'] = 'charges'
      @_hash['invoice_url'] = 'invoice_url'
      @_hash['shipping'] = 'shipping'
      @_hash['metadata'] = 'metadata'
      @_hash['checkouts'] = 'checkouts'
      @_hash['ip'] = 'ip'
      @_hash['session_id'] = 'session_id'
      @_hash['location'] = 'location'
      @_hash['device'] = 'device'
      @_hash['closed'] = 'closed'
      @_hash
    end

    # An array for optional fields
    def self.optionals
      %w[
        customer
        checkouts
        ip
        session_id
        location
        device
      ]
    end

    # An array for nullable fields
    def self.nullables
      []
    end

    def initialize(id = nil,
                   code = nil,
                   currency = nil,
                   items = nil,
                   status = nil,
                   created_at = nil,
                   updated_at = nil,
                   charges = nil,
                   invoice_url = nil,
                   shipping = nil,
                   metadata = nil,
                   closed = nil,
                   customer = SKIP,
                   checkouts = SKIP,
                   ip = SKIP,
                   session_id = SKIP,
                   location = SKIP,
                   device = SKIP)
      @id = id
      @code = code
      @currency = currency
      @items = items
      @customer = customer unless customer == SKIP
      @status = status
      @created_at = created_at
      @updated_at = updated_at
      @charges = charges
      @invoice_url = invoice_url
      @shipping = shipping
      @metadata = metadata
      @checkouts = checkouts unless checkouts == SKIP
      @ip = ip unless ip == SKIP
      @session_id = session_id unless session_id == SKIP
      @location = location unless location == SKIP
      @device = device unless device == SKIP
      @closed = closed
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      id = hash.key?('id') ? hash['id'] : nil
      code = hash.key?('code') ? hash['code'] : nil
      currency = hash.key?('currency') ? hash['currency'] : nil
      # Parameter is an array, so we need to iterate through it
      items = nil
      unless hash['items'].nil?
        items = []
        hash['items'].each do |structure|
          items << (GetOrderItemResponse.from_hash(structure) if structure)
        end
      end

      items = nil unless hash.key?('items')
      status = hash.key?('status') ? hash['status'] : nil
      created_at = if hash.key?('created_at')
                     (DateTimeHelper.from_rfc3339(hash['created_at']) if hash['created_at'])
                   end
      updated_at = if hash.key?('updated_at')
                     (DateTimeHelper.from_rfc3339(hash['updated_at']) if hash['updated_at'])
                   end
      # Parameter is an array, so we need to iterate through it
      charges = nil
      unless hash['charges'].nil?
        charges = []
        hash['charges'].each do |structure|
          charges << (GetChargeResponse.from_hash(structure) if structure)
        end
      end

      charges = nil unless hash.key?('charges')
      invoice_url = hash.key?('invoice_url') ? hash['invoice_url'] : nil
      shipping = GetShippingResponse.from_hash(hash['shipping']) if hash['shipping']
      metadata = hash.key?('metadata') ? hash['metadata'] : nil
      closed = hash.key?('closed') ? hash['closed'] : nil
      customer = GetCustomerResponse.from_hash(hash['customer']) if hash['customer']
      # Parameter is an array, so we need to iterate through it
      checkouts = nil
      unless hash['checkouts'].nil?
        checkouts = []
        hash['checkouts'].each do |structure|
          checkouts << (GetCheckoutPaymentResponse.from_hash(structure) if structure)
        end
      end

      checkouts = SKIP unless hash.key?('checkouts')
      ip = hash.key?('ip') ? hash['ip'] : SKIP
      session_id = hash.key?('session_id') ? hash['session_id'] : SKIP
      location = GetLocationResponse.from_hash(hash['location']) if hash['location']
      device = GetDeviceResponse.from_hash(hash['device']) if hash['device']

      # Create object from extracted values.
      GetOrderResponse.new(id,
                           code,
                           currency,
                           items,
                           status,
                           created_at,
                           updated_at,
                           charges,
                           invoice_url,
                           shipping,
                           metadata,
                           closed,
                           customer,
                           checkouts,
                           ip,
                           session_id,
                           location,
                           device)
    end

    def to_created_at
      DateTimeHelper.to_rfc3339(created_at)
    end

    def to_updated_at
      DateTimeHelper.to_rfc3339(updated_at)
    end
  end
end
