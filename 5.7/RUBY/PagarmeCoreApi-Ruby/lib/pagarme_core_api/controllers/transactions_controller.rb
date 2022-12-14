# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # TransactionsController
  class TransactionsController < BaseController
    def initialize(config, http_call_back: nil)
      super(config, http_call_back: http_call_back)
    end

    # TODO: type endpoint description here
    # @param [String] transaction_id Required parameter: Example:
    # @return [GetTransactionResponse] response from the API call
    def get_transaction(transaction_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/transactions/{transaction_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'transaction_id' => { 'value' => transaction_id, 'encode' => true }
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json'
      }

      # Prepare and execute HttpRequest.
      _request = config.http_client.get(
        _query_url,
        headers: _headers
      )
      BasicAuth.apply(config, _request)
      _response = execute_request(_request)
      validate_response(_response)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_response.raw_body)
      GetTransactionResponse.from_hash(decoded)
    end
  end
end
