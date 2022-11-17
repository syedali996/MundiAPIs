# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # PlansController
  class PlansController < BaseController
    def initialize(config, http_call_back: nil)
      super(config, http_call_back: http_call_back)
    end

    # Gets a plan
    # @param [String] plan_id Required parameter: Plan id
    # @return [GetPlanResponse] response from the API call
    def get_plan(plan_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/plans/{plan_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'plan_id' => { 'value' => plan_id, 'encode' => true }
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
      GetPlanResponse.from_hash(decoded)
    end

    # Deletes a plan
    # @param [String] plan_id Required parameter: Plan id
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetPlanResponse] response from the API call
    def delete_plan(plan_id,
                    idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/plans/{plan_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'plan_id' => { 'value' => plan_id, 'encode' => true }
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'idempotency-key' => idempotency_key
      }

      # Prepare and execute HttpRequest.
      _request = config.http_client.delete(
        _query_url,
        headers: _headers
      )
      BasicAuth.apply(config, _request)
      _response = execute_request(_request)
      validate_response(_response)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_response.raw_body)
      GetPlanResponse.from_hash(decoded)
    end

    # Updates the metadata from a plan
    # @param [String] plan_id Required parameter: The plan id
    # @param [UpdateMetadataRequest] request Required parameter: Request for
    # updating the plan metadata
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetPlanResponse] response from the API call
    def update_plan_metadata(plan_id,
                             request,
                             idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/Plans/{plan_id}/metadata'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'plan_id' => { 'value' => plan_id, 'encode' => true }
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'content-type' => 'application/json; charset=utf-8',
        'idempotency-key' => idempotency_key
      }

      # Prepare and execute HttpRequest.
      _request = config.http_client.patch(
        _query_url,
        headers: _headers,
        parameters: request.to_json
      )
      BasicAuth.apply(config, _request)
      _response = execute_request(_request)
      validate_response(_response)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_response.raw_body)
      GetPlanResponse.from_hash(decoded)
    end

    # Updates a plan item
    # @param [String] plan_id Required parameter: Plan id
    # @param [String] plan_item_id Required parameter: Plan item id
    # @param [UpdatePlanItemRequest] body Required parameter: Request for
    # updating the plan item
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetPlanItemResponse] response from the API call
    def update_plan_item(plan_id,
                         plan_item_id,
                         body,
                         idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/plans/{plan_id}/items/{plan_item_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'plan_id' => { 'value' => plan_id, 'encode' => true },
        'plan_item_id' => { 'value' => plan_item_id, 'encode' => true }
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'content-type' => 'application/json; charset=utf-8',
        'idempotency-key' => idempotency_key
      }

      # Prepare and execute HttpRequest.
      _request = config.http_client.put(
        _query_url,
        headers: _headers,
        parameters: body.to_json
      )
      BasicAuth.apply(config, _request)
      _response = execute_request(_request)
      validate_response(_response)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_response.raw_body)
      GetPlanItemResponse.from_hash(decoded)
    end

    # Adds a new item to a plan
    # @param [String] plan_id Required parameter: Plan id
    # @param [CreatePlanItemRequest] request Required parameter: Request for
    # creating a plan item
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetPlanItemResponse] response from the API call
    def create_plan_item(plan_id,
                         request,
                         idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/plans/{plan_id}/items'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'plan_id' => { 'value' => plan_id, 'encode' => true }
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'content-type' => 'application/json; charset=utf-8',
        'idempotency-key' => idempotency_key
      }

      # Prepare and execute HttpRequest.
      _request = config.http_client.post(
        _query_url,
        headers: _headers,
        parameters: request.to_json
      )
      BasicAuth.apply(config, _request)
      _response = execute_request(_request)
      validate_response(_response)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_response.raw_body)
      GetPlanItemResponse.from_hash(decoded)
    end

    # Gets a plan item
    # @param [String] plan_id Required parameter: Plan id
    # @param [String] plan_item_id Required parameter: Plan item id
    # @return [GetPlanItemResponse] response from the API call
    def get_plan_item(plan_id,
                      plan_item_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/plans/{plan_id}/items/{plan_item_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'plan_id' => { 'value' => plan_id, 'encode' => true },
        'plan_item_id' => { 'value' => plan_item_id, 'encode' => true }
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
      GetPlanItemResponse.from_hash(decoded)
    end

    # Creates a new plan
    # @param [CreatePlanRequest] body Required parameter: Request for creating a
    # plan
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetPlanResponse] response from the API call
    def create_plan(body,
                    idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/plans'
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'content-type' => 'application/json; charset=utf-8',
        'idempotency-key' => idempotency_key
      }

      # Prepare and execute HttpRequest.
      _request = config.http_client.post(
        _query_url,
        headers: _headers,
        parameters: body.to_json
      )
      BasicAuth.apply(config, _request)
      _response = execute_request(_request)
      validate_response(_response)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_response.raw_body)
      GetPlanResponse.from_hash(decoded)
    end

    # Removes an item from a plan
    # @param [String] plan_id Required parameter: Plan id
    # @param [String] plan_item_id Required parameter: Plan item id
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetPlanItemResponse] response from the API call
    def delete_plan_item(plan_id,
                         plan_item_id,
                         idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/plans/{plan_id}/items/{plan_item_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'plan_id' => { 'value' => plan_id, 'encode' => true },
        'plan_item_id' => { 'value' => plan_item_id, 'encode' => true }
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'idempotency-key' => idempotency_key
      }

      # Prepare and execute HttpRequest.
      _request = config.http_client.delete(
        _query_url,
        headers: _headers
      )
      BasicAuth.apply(config, _request)
      _response = execute_request(_request)
      validate_response(_response)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_response.raw_body)
      GetPlanItemResponse.from_hash(decoded)
    end

    # Gets all plans
    # @param [Integer] page Optional parameter: Page number
    # @param [Integer] size Optional parameter: Page size
    # @param [String] name Optional parameter: Filter for Plan's name
    # @param [String] status Optional parameter: Filter for Plan's status
    # @param [String] billing_type Optional parameter: Filter for plan's billing
    # type
    # @param [DateTime] created_since Optional parameter: Filter for plan's
    # creation date start range
    # @param [DateTime] created_until Optional parameter: Filter for plan's
    # creation date end range
    # @return [ListPlansResponse] response from the API call
    def get_plans(page: nil,
                  size: nil,
                  name: nil,
                  status: nil,
                  billing_type: nil,
                  created_since: nil,
                  created_until: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/plans'
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        'page' => page,
        'size' => size,
        'name' => name,
        'status' => status,
        'billing_type' => billing_type,
        'created_since' => created_since,
        'created_until' => created_until
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
      ListPlansResponse.from_hash(decoded)
    end

    # Updates a plan
    # @param [String] plan_id Required parameter: Plan id
    # @param [UpdatePlanRequest] request Required parameter: Request for
    # updating a plan
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetPlanResponse] response from the API call
    def update_plan(plan_id,
                    request,
                    idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/plans/{plan_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'plan_id' => { 'value' => plan_id, 'encode' => true }
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'content-type' => 'application/json; charset=utf-8',
        'idempotency-key' => idempotency_key
      }

      # Prepare and execute HttpRequest.
      _request = config.http_client.put(
        _query_url,
        headers: _headers,
        parameters: request.to_json
      )
      BasicAuth.apply(config, _request)
      _response = execute_request(_request)
      validate_response(_response)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_response.raw_body)
      GetPlanResponse.from_hash(decoded)
    end
  end
end
