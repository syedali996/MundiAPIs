# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # GetUsageReportResponse Model.
  class GetUsageReportResponse < BaseModel
    SKIP = Object.new
    private_constant :SKIP

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :url

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :usage_report_url

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :grouped_report_url

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['url'] = 'url'
      @_hash['usage_report_url'] = 'usage_report_url'
      @_hash['grouped_report_url'] = 'grouped_report_url'
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

    def initialize(url = nil,
                   usage_report_url = nil,
                   grouped_report_url = nil)
      @url = url
      @usage_report_url = usage_report_url
      @grouped_report_url = grouped_report_url
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      url = hash.key?('url') ? hash['url'] : nil
      usage_report_url =
        hash.key?('usage_report_url') ? hash['usage_report_url'] : nil
      grouped_report_url =
        hash.key?('grouped_report_url') ? hash['grouped_report_url'] : nil

      # Create object from extracted values.
      GetUsageReportResponse.new(url,
                                 usage_report_url,
                                 grouped_report_url)
    end
  end
end
