# mundi_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module MundiApi
  # CustomersController
  class CustomersController < BaseController
    def initialize(config, http_call_back: nil)
      super(config, http_call_back: http_call_back)
    end

    # Creates a access token for a customer
    # @param [String] customer_id Required parameter: Customer Id
    # @param [CreateAccessTokenRequest] request Required parameter: Request for
    # creating a access token
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetAccessTokenResponse] response from the API call
    def create_access_token(customer_id,
                            request,
                            idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/access-tokens'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true }
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
      GetAccessTokenResponse.from_hash(decoded)
    end

    # Updates a customer
    # @param [String] customer_id Required parameter: Customer id
    # @param [UpdateCustomerRequest] request Required parameter: Request for
    # updating a customer
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetCustomerResponse] response from the API call
    def update_customer(customer_id,
                        request,
                        idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true }
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
      GetCustomerResponse.from_hash(decoded)
    end

    # Delete a Customer's access tokens
    # @param [String] customer_id Required parameter: Customer Id
    # @return [ListAccessTokensResponse] response from the API call
    def delete_access_tokens(customer_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/access-tokens/'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true }
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
      ListAccessTokensResponse.from_hash(decoded)
    end

    # Get a customer
    # @param [String] customer_id Required parameter: Customer Id
    # @return [GetCustomerResponse] response from the API call
    def get_customer(customer_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true }
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
      GetCustomerResponse.from_hash(decoded)
    end

    # Gets all adressess from a customer
    # @param [String] customer_id Required parameter: Customer id
    # @param [Integer] page Optional parameter: Page number
    # @param [Integer] size Optional parameter: Page size
    # @return [ListAddressesResponse] response from the API call
    def get_addresses(customer_id,
                      page: nil,
                      size: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/addresses'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true }
      )
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        'page' => page,
        'size' => size
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
      ListAddressesResponse.from_hash(decoded)
    end

    # Get a Customer's access token
    # @param [String] customer_id Required parameter: Customer Id
    # @param [String] token_id Required parameter: Token Id
    # @return [GetAccessTokenResponse] response from the API call
    def get_access_token(customer_id,
                         token_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/access-tokens/{token_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true },
        'token_id' => { 'value' => token_id, 'encode' => true }
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
      GetAccessTokenResponse.from_hash(decoded)
    end

    # Get a customer's address
    # @param [String] customer_id Required parameter: Customer id
    # @param [String] address_id Required parameter: Address Id
    # @return [GetAddressResponse] response from the API call
    def get_address(customer_id,
                    address_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/addresses/{address_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true },
        'address_id' => { 'value' => address_id, 'encode' => true }
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
      GetAddressResponse.from_hash(decoded)
    end

    # Creates a new card for a customer
    # @param [String] customer_id Required parameter: Customer id
    # @param [CreateCardRequest] request Required parameter: Request for
    # creating a card
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetCardResponse] response from the API call
    def create_card(customer_id,
                    request,
                    idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/cards'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true }
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
      GetCardResponse.from_hash(decoded)
    end

    # Renew a card
    # @param [String] customer_id Required parameter: Customer id
    # @param [String] card_id Required parameter: Card Id
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetCardResponse] response from the API call
    def renew_card(customer_id,
                   card_id,
                   idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/cards/{card_id}/renew'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true },
        'card_id' => { 'value' => card_id, 'encode' => true }
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'idempotency-key' => idempotency_key
      }

      # Prepare and execute HttpRequest.
      _request = config.http_client.post(
        _query_url,
        headers: _headers
      )
      BasicAuth.apply(config, _request)
      _response = execute_request(_request)
      validate_response(_response)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_response.raw_body)
      GetCardResponse.from_hash(decoded)
    end

    # Creates a new customer
    # @param [CreateCustomerRequest] request Required parameter: Request for
    # creating a customer
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetCustomerResponse] response from the API call
    def create_customer(request,
                        idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers'
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
      GetCustomerResponse.from_hash(decoded)
    end

    # Updates an address
    # @param [String] customer_id Required parameter: Customer Id
    # @param [String] address_id Required parameter: Address Id
    # @param [UpdateAddressRequest] request Required parameter: Request for
    # updating an address
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetAddressResponse] response from the API call
    def update_address(customer_id,
                       address_id,
                       request,
                       idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/addresses/{address_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true },
        'address_id' => { 'value' => address_id, 'encode' => true }
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
      GetAddressResponse.from_hash(decoded)
    end

    # Get all access tokens from a customer
    # @param [String] customer_id Required parameter: Customer Id
    # @param [Integer] page Optional parameter: Page number
    # @param [Integer] size Optional parameter: Page size
    # @return [ListAccessTokensResponse] response from the API call
    def get_access_tokens(customer_id,
                          page: nil,
                          size: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/access-tokens'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true }
      )
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        'page' => page,
        'size' => size
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
      ListAccessTokensResponse.from_hash(decoded)
    end

    # Updates the metadata a customer
    # @param [String] customer_id Required parameter: The customer id
    # @param [UpdateMetadataRequest] request Required parameter: Request for
    # updating the customer metadata
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetCustomerResponse] response from the API call
    def update_customer_metadata(customer_id,
                                 request,
                                 idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/Customers/{customer_id}/metadata'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true }
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
      GetCustomerResponse.from_hash(decoded)
    end

    # Delete a Customer's address
    # @param [String] customer_id Required parameter: Customer Id
    # @param [String] address_id Required parameter: Address Id
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetAddressResponse] response from the API call
    def delete_address(customer_id,
                       address_id,
                       idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/addresses/{address_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true },
        'address_id' => { 'value' => address_id, 'encode' => true }
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
      GetAddressResponse.from_hash(decoded)
    end

    # Updates a card
    # @param [String] customer_id Required parameter: Customer Id
    # @param [String] card_id Required parameter: Card id
    # @param [UpdateCardRequest] request Required parameter: Request for
    # updating a card
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetCardResponse] response from the API call
    def update_card(customer_id,
                    card_id,
                    request,
                    idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/cards/{card_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true },
        'card_id' => { 'value' => card_id, 'encode' => true }
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
      GetCardResponse.from_hash(decoded)
    end

    # Delete a customer's access token
    # @param [String] customer_id Required parameter: Customer Id
    # @param [String] token_id Required parameter: Token Id
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetAccessTokenResponse] response from the API call
    def delete_access_token(customer_id,
                            token_id,
                            idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/access-tokens/{token_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true },
        'token_id' => { 'value' => token_id, 'encode' => true }
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
      GetAccessTokenResponse.from_hash(decoded)
    end

    # Creates a new address for a customer
    # @param [String] customer_id Required parameter: Customer Id
    # @param [CreateAddressRequest] request Required parameter: Request for
    # creating an address
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetAddressResponse] response from the API call
    def create_address(customer_id,
                       request,
                       idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/addresses'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true }
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
      GetAddressResponse.from_hash(decoded)
    end

    # Get a customer's card
    # @param [String] customer_id Required parameter: Customer id
    # @param [String] card_id Required parameter: Card id
    # @return [GetCardResponse] response from the API call
    def get_card(customer_id,
                 card_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/cards/{card_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true },
        'card_id' => { 'value' => card_id, 'encode' => true }
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
      GetCardResponse.from_hash(decoded)
    end

    # Get all cards from a customer
    # @param [String] customer_id Required parameter: Customer Id
    # @param [Integer] page Optional parameter: Page number
    # @param [Integer] size Optional parameter: Page size
    # @return [ListCardsResponse] response from the API call
    def get_cards(customer_id,
                  page: nil,
                  size: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/cards'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true }
      )
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        'page' => page,
        'size' => size
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
      ListCardsResponse.from_hash(decoded)
    end

    # Delete a customer's card
    # @param [String] customer_id Required parameter: Customer Id
    # @param [String] card_id Required parameter: Card Id
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetCardResponse] response from the API call
    def delete_card(customer_id,
                    card_id,
                    idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers/{customer_id}/cards/{card_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'customer_id' => { 'value' => customer_id, 'encode' => true },
        'card_id' => { 'value' => card_id, 'encode' => true }
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
      GetCardResponse.from_hash(decoded)
    end

    # Get all Customers
    # @param [String] name Optional parameter: Name of the Customer
    # @param [String] document Optional parameter: Document of the Customer
    # @param [Integer] page Optional parameter: Current page the the search
    # @param [Integer] size Optional parameter: Quantity pages of the search
    # @param [String] email Optional parameter: Customer's email
    # @param [String] code Optional parameter: Customer's code
    # @return [ListCustomersResponse] response from the API call
    def get_customers(name: nil,
                      document: nil,
                      page: 1,
                      size: 10,
                      email: nil,
                      code: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/customers'
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        'name' => name,
        'document' => document,
        'page' => page,
        'size' => size,
        'email' => email,
        'Code' => code
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
      ListCustomersResponse.from_hash(decoded)
    end
  end
end