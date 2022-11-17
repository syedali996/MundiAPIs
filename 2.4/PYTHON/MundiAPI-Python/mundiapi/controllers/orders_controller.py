# -*- coding: utf-8 -*-

"""
mundiapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from mundiapi.api_helper import APIHelper
from mundiapi.configuration import Server
from mundiapi.controllers.base_controller import BaseController
from apimatic_core.request_builder import RequestBuilder
from apimatic_core.response_handler import ResponseHandler
from apimatic_core.types.parameter import Parameter
from mundiapi.http.http_method_enum import HttpMethodEnum
from apimatic_core.authentication.multiple.single_auth import Single
from apimatic_core.authentication.multiple.and_auth_group import And
from apimatic_core.authentication.multiple.or_auth_group import Or
from mundiapi.models.get_order_response import GetOrderResponse
from mundiapi.models.list_order_response import ListOrderResponse
from mundiapi.models.get_order_item_response import GetOrderItemResponse


class OrdersController(BaseController):

    """A Controller to access Endpoints in the mundiapi API."""
    def __init__(self, config):
        super(OrdersController, self).__init__(config)

    def update_order_status(self,
                            id,
                            request,
                            idempotency_key=None):
        """Does a PATCH request to /orders/{id}/closed.

        TODO: type endpoint description here.

        Args:
            id (string): Order Id
            request (UpdateOrderStatusRequest): Update Order Model
            idempotency_key (string, optional): TODO: type description here.

        Returns:
            GetOrderResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/orders/{id}/closed')
            .http_method(HttpMethodEnum.PATCH)
            .template_param(Parameter()
                            .key('id')
                            .value(id)
                            .should_encode(True))
            .body_param(Parameter()
                        .value(request))
            .header_param(Parameter()
                          .key('idempotency-key')
                          .value(idempotency_key))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(GetOrderResponse.from_dictionary)
        ).execute()

    def delete_all_order_items(self,
                               order_id,
                               idempotency_key=None):
        """Does a DELETE request to /orders/{orderId}/items.

        TODO: type endpoint description here.

        Args:
            order_id (string): Order Id
            idempotency_key (string, optional): TODO: type description here.

        Returns:
            GetOrderResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/orders/{orderId}/items')
            .http_method(HttpMethodEnum.DELETE)
            .template_param(Parameter()
                            .key('orderId')
                            .value(order_id)
                            .should_encode(True))
            .header_param(Parameter()
                          .key('idempotency-key')
                          .value(idempotency_key))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(GetOrderResponse.from_dictionary)
        ).execute()

    def update_order_metadata(self,
                              order_id,
                              request,
                              idempotency_key=None):
        """Does a PATCH request to /Orders/{order_id}/metadata.

        Updates the metadata from an order

        Args:
            order_id (string): The order id
            request (UpdateMetadataRequest): Request for updating the order
                metadata
            idempotency_key (string, optional): TODO: type description here.

        Returns:
            GetOrderResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/Orders/{order_id}/metadata')
            .http_method(HttpMethodEnum.PATCH)
            .template_param(Parameter()
                            .key('order_id')
                            .value(order_id)
                            .should_encode(True))
            .body_param(Parameter()
                        .value(request))
            .header_param(Parameter()
                          .key('idempotency-key')
                          .value(idempotency_key))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(GetOrderResponse.from_dictionary)
        ).execute()

    def get_orders(self,
                   page=None,
                   size=None,
                   code=None,
                   status=None,
                   created_since=None,
                   created_until=None,
                   customer_id=None):
        """Does a GET request to /orders.

        Gets all orders

        Args:
            page (int, optional): Page number
            size (int, optional): Page size
            code (string, optional): Filter for order's code
            status (string, optional): Filter for order's status
            created_since (datetime, optional): Filter for order's creation
                date start range
            created_until (datetime, optional): Filter for order's creation
                date end range
            customer_id (string, optional): Filter for order's customer id

        Returns:
            ListOrderResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/orders')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('page')
                         .value(page))
            .query_param(Parameter()
                         .key('size')
                         .value(size))
            .query_param(Parameter()
                         .key('code')
                         .value(code))
            .query_param(Parameter()
                         .key('status')
                         .value(status))
            .query_param(Parameter()
                         .key('created_since')
                         .value(APIHelper.when_defined(APIHelper.RFC3339DateTime, created_since)))
            .query_param(Parameter()
                         .key('created_until')
                         .value(APIHelper.when_defined(APIHelper.RFC3339DateTime, created_until)))
            .query_param(Parameter()
                         .key('customer_id')
                         .value(customer_id))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ListOrderResponse.from_dictionary)
        ).execute()

    def create_order_item(self,
                          order_id,
                          request,
                          idempotency_key=None):
        """Does a POST request to /orders/{orderId}/items.

        TODO: type endpoint description here.

        Args:
            order_id (string): Order Id
            request (CreateOrderItemRequest): Order Item Model
            idempotency_key (string, optional): TODO: type description here.

        Returns:
            GetOrderItemResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/orders/{orderId}/items')
            .http_method(HttpMethodEnum.POST)
            .template_param(Parameter()
                            .key('orderId')
                            .value(order_id)
                            .should_encode(True))
            .body_param(Parameter()
                        .value(request))
            .header_param(Parameter()
                          .key('idempotency-key')
                          .value(idempotency_key))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(GetOrderItemResponse.from_dictionary)
        ).execute()

    def delete_order_item(self,
                          order_id,
                          item_id,
                          idempotency_key=None):
        """Does a DELETE request to /orders/{orderId}/items/{itemId}.

        TODO: type endpoint description here.

        Args:
            order_id (string): Order Id
            item_id (string): Item Id
            idempotency_key (string, optional): TODO: type description here.

        Returns:
            GetOrderItemResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/orders/{orderId}/items/{itemId}')
            .http_method(HttpMethodEnum.DELETE)
            .template_param(Parameter()
                            .key('orderId')
                            .value(order_id)
                            .should_encode(True))
            .template_param(Parameter()
                            .key('itemId')
                            .value(item_id)
                            .should_encode(True))
            .header_param(Parameter()
                          .key('idempotency-key')
                          .value(idempotency_key))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(GetOrderItemResponse.from_dictionary)
        ).execute()

    def get_order(self,
                  order_id):
        """Does a GET request to /orders/{order_id}.

        Gets an order

        Args:
            order_id (string): Order id

        Returns:
            GetOrderResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/orders/{order_id}')
            .http_method(HttpMethodEnum.GET)
            .template_param(Parameter()
                            .key('order_id')
                            .value(order_id)
                            .should_encode(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(GetOrderResponse.from_dictionary)
        ).execute()

    def create_order(self,
                     body,
                     idempotency_key=None):
        """Does a POST request to /orders.

        Creates a new Order

        Args:
            body (CreateOrderRequest): Request for creating an order
            idempotency_key (string, optional): TODO: type description here.

        Returns:
            GetOrderResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/orders')
            .http_method(HttpMethodEnum.POST)
            .body_param(Parameter()
                        .value(body))
            .header_param(Parameter()
                          .key('idempotency-key')
                          .value(idempotency_key))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(GetOrderResponse.from_dictionary)
        ).execute()

    def get_order_item(self,
                       order_id,
                       item_id):
        """Does a GET request to /orders/{orderId}/items/{itemId}.

        TODO: type endpoint description here.

        Args:
            order_id (string): Order Id
            item_id (string): Item Id

        Returns:
            GetOrderItemResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/orders/{orderId}/items/{itemId}')
            .http_method(HttpMethodEnum.GET)
            .template_param(Parameter()
                            .key('orderId')
                            .value(order_id)
                            .should_encode(True))
            .template_param(Parameter()
                            .key('itemId')
                            .value(item_id)
                            .should_encode(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(GetOrderItemResponse.from_dictionary)
        ).execute()

    def update_order_item(self,
                          order_id,
                          item_id,
                          request,
                          idempotency_key=None):
        """Does a PUT request to /orders/{orderId}/items/{itemId}.

        TODO: type endpoint description here.

        Args:
            order_id (string): Order Id
            item_id (string): Item Id
            request (UpdateOrderItemRequest): Item Model
            idempotency_key (string, optional): TODO: type description here.

        Returns:
            GetOrderItemResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/orders/{orderId}/items/{itemId}')
            .http_method(HttpMethodEnum.PUT)
            .template_param(Parameter()
                            .key('orderId')
                            .value(order_id)
                            .should_encode(True))
            .template_param(Parameter()
                            .key('itemId')
                            .value(item_id)
                            .should_encode(True))
            .body_param(Parameter()
                        .value(request))
            .header_param(Parameter()
                          .key('idempotency-key')
                          .value(idempotency_key))
            .header_param(Parameter()
                          .key('content-type')
                          .value('application/json; charset=utf-8'))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(GetOrderItemResponse.from_dictionary)
        ).execute()
