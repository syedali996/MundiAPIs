# pagarme_core_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module PagarmeCoreApi
  # InvoicesController
  class InvoicesController < BaseController
    def initialize(config, http_call_back: nil)
      super(config, http_call_back: http_call_back)
    end

    # Updates the metadata from an invoice
    # @param [String] invoice_id Required parameter: The invoice id
    # @param [UpdateMetadataRequest] request Required parameter: Request for
    # updating the invoice metadata
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetInvoiceResponse] response from the API call
    def update_invoice_metadata(invoice_id,
                                request,
                                idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/invoices/{invoice_id}/metadata'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'invoice_id' => { 'value' => invoice_id, 'encode' => true }
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
      GetInvoiceResponse.from_hash(decoded)
    end

    # TODO: type endpoint description here
    # @param [String] subscription_id Required parameter: Subscription Id
    # @return [GetInvoiceResponse] response from the API call
    def get_partial_invoice(subscription_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/subscriptions/{subscription_id}/partial-invoice'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'subscription_id' => { 'value' => subscription_id, 'encode' => true }
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
      GetInvoiceResponse.from_hash(decoded)
    end

    # Cancels an invoice
    # @param [String] invoice_id Required parameter: Invoice id
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetInvoiceResponse] response from the API call
    def cancel_invoice(invoice_id,
                       idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/invoices/{invoice_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'invoice_id' => { 'value' => invoice_id, 'encode' => true }
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
      GetInvoiceResponse.from_hash(decoded)
    end

    # Create an Invoice
    # @param [String] subscription_id Required parameter: Subscription Id
    # @param [String] cycle_id Required parameter: Cycle Id
    # @param [CreateInvoiceRequest] request Optional parameter: Example:
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetInvoiceResponse] response from the API call
    def create_invoice(subscription_id,
                       cycle_id,
                       request: nil,
                       idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/subscriptions/{subscription_id}/cycles/{cycle_id}/pay'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'subscription_id' => { 'value' => subscription_id, 'encode' => true },
        'cycle_id' => { 'value' => cycle_id, 'encode' => true }
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
      GetInvoiceResponse.from_hash(decoded)
    end

    # Gets all invoices
    # @param [Integer] page Optional parameter: Page number
    # @param [Integer] size Optional parameter: Page size
    # @param [String] code Optional parameter: Filter for Invoice's code
    # @param [String] customer_id Optional parameter: Filter for Invoice's
    # customer id
    # @param [String] subscription_id Optional parameter: Filter for Invoice's
    # subscription id
    # @param [DateTime] created_since Optional parameter: Filter for Invoice's
    # creation date start range
    # @param [DateTime] created_until Optional parameter: Filter for Invoices
    # creation date end range
    # @param [String] status Optional parameter: Filter for Invoice's status
    # @param [DateTime] due_since Optional parameter: Filter for Invoice's due
    # date start range
    # @param [DateTime] due_until Optional parameter: Filter for Invoice's due
    # date end range
    # @param [String] customer_document Optional parameter: Example:
    # @return [ListInvoicesResponse] response from the API call
    def get_invoices(page: nil,
                     size: nil,
                     code: nil,
                     customer_id: nil,
                     subscription_id: nil,
                     created_since: nil,
                     created_until: nil,
                     status: nil,
                     due_since: nil,
                     due_until: nil,
                     customer_document: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/invoices'
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        'page' => page,
        'size' => size,
        'code' => code,
        'customer_id' => customer_id,
        'subscription_id' => subscription_id,
        'created_since' => created_since,
        'created_until' => created_until,
        'status' => status,
        'due_since' => due_since,
        'due_until' => due_until,
        'customer_document' => customer_document
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
      ListInvoicesResponse.from_hash(decoded)
    end

    # Gets an invoice
    # @param [String] invoice_id Required parameter: Invoice Id
    # @return [GetInvoiceResponse] response from the API call
    def get_invoice(invoice_id)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/invoices/{invoice_id}'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'invoice_id' => { 'value' => invoice_id, 'encode' => true }
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
      GetInvoiceResponse.from_hash(decoded)
    end

    # Updates the status from an invoice
    # @param [String] invoice_id Required parameter: Invoice Id
    # @param [UpdateInvoiceStatusRequest] request Required parameter: Request
    # for updating an invoice's status
    # @param [String] idempotency_key Optional parameter: Example:
    # @return [GetInvoiceResponse] response from the API call
    def update_invoice_status(invoice_id,
                              request,
                              idempotency_key: nil)
      # Prepare query url.
      _query_builder = config.get_base_uri
      _query_builder << '/invoices/{invoice_id}/status'
      _query_builder = APIHelper.append_url_with_template_parameters(
        _query_builder,
        'invoice_id' => { 'value' => invoice_id, 'encode' => true }
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
      GetInvoiceResponse.from_hash(decoded)
    end
  end
end
