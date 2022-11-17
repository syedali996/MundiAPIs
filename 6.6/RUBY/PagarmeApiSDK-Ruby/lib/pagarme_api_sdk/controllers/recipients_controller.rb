# pagarme_api_sdk
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeApiSdk
  # RecipientsController
  class RecipientsController < BaseController
    def initialize(config, http_call_back: nil)
      super(config, http_call_back: http_call_back)
    end

    # Updates a recipient
    # @param [String] recipient_id Required parameter: Recipient id
    # @param [UpdateRecipientRequest] request Required parameter: Recipient
    # data
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetRecipientResponse] response from the API call
    def update_recipient(recipient_id,
                         request,
                         idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
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
      GetRecipientResponse.from_hash(decoded)
    end

    # Creates an anticipation
    # @param [String] recipient_id Required parameter: Recipient id
    # @param [CreateAnticipationRequest] request Required parameter:
    # Anticipation data
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetAnticipationResponse] response from the API call
    def create_anticipation(recipient_id,
                            request,
                            idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/anticipations'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
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
      GetAnticipationResponse.from_hash(decoded)
    end

    # Gets the anticipation limits for a recipient
    # @param [String] recipient_id Required parameter: Recipient id
    # @param [String] timeframe Required parameter: Timeframe
    # @param [DateTime] payment_date Required parameter: Anticipation payment
    # date
    # @return [GetAnticipationLimitResponse] response from the API call
    def get_anticipation_limits(recipient_id,
                                timeframe,
                                payment_date)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/anticipation_limits'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
      )
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        'timeframe' => timeframe,
        'payment_date' => payment_date
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
      GetAnticipationLimitResponse.from_hash(decoded)
    end

    # Retrieves paginated recipients information
    # @param [Integer] page Optional parameter: Page number
    # @param [Integer] size Optional parameter: Page size
    # @return [ListRecipientResponse] response from the API call
    def get_recipients(page: nil,
                       size: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients'
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
      ListRecipientResponse.from_hash(decoded)
    end

    # TODO: type endpoint description here
    # @param [String] recipient_id Required parameter: Example:
    # @param [String] withdrawal_id Required parameter: Example:
    # @return [GetWithdrawResponse] response from the API call
    def get_withdraw_by_id(recipient_id,
                           withdrawal_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/withdrawals/{withdrawal_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true },
        'withdrawal_id' => { 'value' => withdrawal_id, 'encode' => true }
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
      GetWithdrawResponse.from_hash(decoded)
    end

    # Updates the default bank account from a recipient
    # @param [String] recipient_id Required parameter: Recipient id
    # @param [UpdateRecipientBankAccountRequest] request Required parameter:
    # Bank account data
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetRecipientResponse] response from the API call
    def update_recipient_default_bank_account(recipient_id,
                                              request,
                                              idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/default-bank-account'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
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
      GetRecipientResponse.from_hash(decoded)
    end

    # Updates recipient metadata
    # @param [String] recipient_id Required parameter: Recipient id
    # @param [UpdateMetadataRequest] request Required parameter: Metadata
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetRecipientResponse] response from the API call
    def update_recipient_metadata(recipient_id,
                                  request,
                                  idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/metadata'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
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
      GetRecipientResponse.from_hash(decoded)
    end

    # Gets a paginated list of transfers for the recipient
    # @param [String] recipient_id Required parameter: Recipient id
    # @param [Integer] page Optional parameter: Page number
    # @param [Integer] size Optional parameter: Page size
    # @param [String] status Optional parameter: Filter for transfer status
    # @param [DateTime] created_since Optional parameter: Filter for start range
    # of transfer creation date
    # @param [DateTime] created_until Optional parameter: Filter for end range
    # of transfer creation date
    # @return [ListTransferResponse] response from the API call
    def get_transfers(recipient_id,
                      page: nil,
                      size: nil,
                      status: nil,
                      created_since: nil,
                      created_until: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/transfers'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
      )
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        'page' => page,
        'size' => size,
        'status' => status,
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
      ListTransferResponse.from_hash(decoded)
    end

    # Gets a transfer
    # @param [String] recipient_id Required parameter: Recipient id
    # @param [String] transfer_id Required parameter: Transfer id
    # @return [GetTransferResponse] response from the API call
    def get_transfer(recipient_id,
                     transfer_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/transfers/{transfer_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true },
        'transfer_id' => { 'value' => transfer_id, 'encode' => true }
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
      GetTransferResponse.from_hash(decoded)
    end

    # TODO: type endpoint description here
    # @param [String] recipient_id Required parameter: Example:
    # @param [CreateWithdrawRequest] request Required parameter: Example:
    # @return [GetWithdrawResponse] response from the API call
    def create_withdraw(recipient_id,
                        request)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/withdrawals'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'content-type' => 'application/json; charset=utf-8'
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
      GetWithdrawResponse.from_hash(decoded)
    end

    # Updates recipient metadata
    # @param [String] recipient_id Required parameter: Recipient id
    # @param [UpdateAutomaticAnticipationSettingsRequest] request Required
    # parameter: Metadata
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetRecipientResponse] response from the API call
    def update_automatic_anticipation_settings(recipient_id,
                                               request,
                                               idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/automatic-anticipation-settings'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
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
      GetRecipientResponse.from_hash(decoded)
    end

    # Gets an anticipation
    # @param [String] recipient_id Required parameter: Recipient id
    # @param [String] anticipation_id Required parameter: Anticipation id
    # @return [GetAnticipationResponse] response from the API call
    def get_anticipation(recipient_id,
                         anticipation_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/anticipations/{anticipation_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true },
        'anticipation_id' => { 'value' => anticipation_id, 'encode' => true }
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
      GetAnticipationResponse.from_hash(decoded)
    end

    # TODO: type endpoint description here
    # @param [String] recipient_id Required parameter: Recipient Identificator
    # @param [UpdateTransferSettingsRequest] request Required parameter:
    # Example:
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetRecipientResponse] response from the API call
    def update_recipient_transfer_settings(recipient_id,
                                           request,
                                           idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/transfer-settings'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
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
      GetRecipientResponse.from_hash(decoded)
    end

    # Retrieves a paginated list of anticipations from a recipient
    # @param [String] recipient_id Required parameter: Recipient id
    # @param [Integer] page Optional parameter: Page number
    # @param [Integer] size Optional parameter: Page size
    # @param [String] status Optional parameter: Filter for anticipation
    # status
    # @param [String] timeframe Optional parameter: Filter for anticipation
    # timeframe
    # @param [DateTime] payment_date_since Optional parameter: Filter for start
    # range for anticipation payment date
    # @param [DateTime] payment_date_until Optional parameter: Filter for end
    # range for anticipation payment date
    # @param [DateTime] created_since Optional parameter: Filter for start range
    # for anticipation creation date
    # @param [DateTime] created_until Optional parameter: Filter for end range
    # for anticipation creation date
    # @return [ListAnticipationResponse] response from the API call
    def get_anticipations(recipient_id,
                          page: nil,
                          size: nil,
                          status: nil,
                          timeframe: nil,
                          payment_date_since: nil,
                          payment_date_until: nil,
                          created_since: nil,
                          created_until: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/anticipations'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
      )
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        'page' => page,
        'size' => size,
        'status' => status,
        'timeframe' => timeframe,
        'payment_date_since' => payment_date_since,
        'payment_date_until' => payment_date_until,
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
      ListAnticipationResponse.from_hash(decoded)
    end

    # Retrieves recipient information
    # @param [String] recipient_id Required parameter: Recipiend id
    # @return [GetRecipientResponse] response from the API call
    def get_recipient(recipient_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
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
      GetRecipientResponse.from_hash(decoded)
    end

    # Get balance information for a recipient
    # @param [String] recipient_id Required parameter: Recipient id
    # @return [GetBalanceResponse] response from the API call
    def get_balance(recipient_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/balance'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
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
      GetBalanceResponse.from_hash(decoded)
    end

    # Gets a paginated list of transfers for the recipient
    # @param [String] recipient_id Required parameter: Example:
    # @param [Integer] page Optional parameter: Example:
    # @param [Integer] size Optional parameter: Example:
    # @param [String] status Optional parameter: Example:
    # @param [DateTime] created_since Optional parameter: Example:
    # @param [DateTime] created_until Optional parameter: Example:
    # @return [ListWithdrawals] response from the API call
    def get_withdrawals(recipient_id,
                        page: nil,
                        size: nil,
                        status: nil,
                        created_since: nil,
                        created_until: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/withdrawals'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
      )
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        'page' => page,
        'size' => size,
        'status' => status,
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
      ListWithdrawals.from_hash(decoded)
    end

    # Creates a transfer for a recipient
    # @param [String] recipient_id Required parameter: Recipient Id
    # @param [CreateTransferRequest] request Required parameter: Transfer data
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetTransferResponse] response from the API call
    def create_transfer(recipient_id,
                        request,
                        idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{recipient_id}/transfers'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'recipient_id' => { 'value' => recipient_id, 'encode' => true }
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
      GetTransferResponse.from_hash(decoded)
    end

    # Creates a new recipient
    # @param [CreateRecipientRequest] request Required parameter: Recipient
    # data
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetRecipientResponse] response from the API call
    def create_recipient(request,
                         idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients'
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
      GetRecipientResponse.from_hash(decoded)
    end

    # Retrieves recipient information
    # @param [String] code Required parameter: Recipient code
    # @return [GetRecipientResponse] response from the API call
    def get_recipient_by_code(code)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/{code}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'code' => { 'value' => code, 'encode' => true }
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
      GetRecipientResponse.from_hash(decoded)
    end

    # TODO: type endpoint description here
    # @return [GetRecipientResponse] response from the API call
    def get_default_recipient
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/recipients/default'
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
      GetRecipientResponse.from_hash(decoded)
    end
  end
end
