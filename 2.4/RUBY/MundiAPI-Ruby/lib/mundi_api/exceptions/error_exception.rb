# mundi_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module MundiApi
  # Api Error Exception
  class ErrorException < APIException
    SKIP = Object.new
    private_constant :SKIP

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :message

    # TODO: Write general description for this method
    # @return [Object]
    attr_accessor :errors

    # TODO: Write general description for this method
    # @return [Object]
    attr_accessor :request

    # The constructor.
    # @param [String] The reason for raising an exception.
    # @param [HttpResponse] The HttpReponse of the API call.
    def initialize(reason, response)
      super(reason, response)
      hash = APIHelper.json_deserialize(@response.raw_body)
      unbox(hash)
    end

    # Populates this object by extracting properties from a hash.
    # @param [Hash] The deserialized response sent by the server in the
    # response body.
    def unbox(hash)
      @message = hash.key?('message') ? hash['message'] : nil
      @errors = hash.key?('errors') ? hash['errors'] : nil
      @request = hash.key?('request') ? hash['request'] : nil
    end
  end
end
