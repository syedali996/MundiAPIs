# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmecoreapi.api_helper import APIHelper
from pagarmecoreapi.models.create_card_payment_contactless_request import CreateCardPaymentContactlessRequest
from pagarmecoreapi.models.create_card_request import CreateCardRequest
from pagarmecoreapi.models.create_payment_authentication_request import CreatePaymentAuthenticationRequest


class CreateDebitCardPaymentRequest(object):

    """Implementation of the 'CreateDebitCardPaymentRequest' model.

    The settings for creating a debit card payment

    Attributes:
        statement_descriptor (string): The text that will be shown on the
            debit card's statement
        card (CreateCardRequest): Debit card data
        card_id (string): The debit card id
        card_token (string): The debit card token
        recurrence (bool): Indicates a recurrence
        authentication (CreatePaymentAuthenticationRequest): The payment
            authentication request
        token (CreateCardPaymentContactlessRequest): The Debit card payment
            token request
        recurrency_cycle (string): Defines whether the card has been used one
            or more times.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "statement_descriptor": 'statement_descriptor',
        "card": 'card',
        "card_id": 'card_id',
        "card_token": 'card_token',
        "recurrence": 'recurrence',
        "authentication": 'authentication',
        "token": 'token',
        "recurrency_cycle": 'recurrency_cycle'
    }

    _optionals = [
        'statement_descriptor',
        'card',
        'card_id',
        'card_token',
        'recurrence',
        'authentication',
        'token',
        'recurrency_cycle',
    ]

    def __init__(self,
                 statement_descriptor=APIHelper.SKIP,
                 card=APIHelper.SKIP,
                 card_id=APIHelper.SKIP,
                 card_token=APIHelper.SKIP,
                 recurrence=APIHelper.SKIP,
                 authentication=APIHelper.SKIP,
                 token=APIHelper.SKIP,
                 recurrency_cycle=APIHelper.SKIP):
        """Constructor for the CreateDebitCardPaymentRequest class"""

        # Initialize members of the class
        if statement_descriptor is not APIHelper.SKIP:
            self.statement_descriptor = statement_descriptor 
        if card is not APIHelper.SKIP:
            self.card = card 
        if card_id is not APIHelper.SKIP:
            self.card_id = card_id 
        if card_token is not APIHelper.SKIP:
            self.card_token = card_token 
        if recurrence is not APIHelper.SKIP:
            self.recurrence = recurrence 
        if authentication is not APIHelper.SKIP:
            self.authentication = authentication 
        if token is not APIHelper.SKIP:
            self.token = token 
        if recurrency_cycle is not APIHelper.SKIP:
            self.recurrency_cycle = recurrency_cycle 

    @classmethod
    def from_dictionary(cls,
                        dictionary):
        """Creates an instance of this model from a dictionary

        Args:
            dictionary (dictionary): A dictionary representation of the object
            as obtained from the deserialization of the server's response. The
            keys MUST match property names in the API description.

        Returns:
            object: An instance of this structure class.

        """
        if dictionary is None:
            return None

        # Extract variables from the dictionary

        statement_descriptor = dictionary.get("statement_descriptor") if dictionary.get("statement_descriptor") else APIHelper.SKIP
        card = CreateCardRequest.from_dictionary(dictionary.get('card')) if 'card' in dictionary.keys() else APIHelper.SKIP 
        card_id = dictionary.get("card_id") if dictionary.get("card_id") else APIHelper.SKIP
        card_token = dictionary.get("card_token") if dictionary.get("card_token") else APIHelper.SKIP
        recurrence = dictionary.get("recurrence") if "recurrence" in dictionary.keys() else APIHelper.SKIP
        authentication = CreatePaymentAuthenticationRequest.from_dictionary(dictionary.get('authentication')) if 'authentication' in dictionary.keys() else APIHelper.SKIP 
        token = CreateCardPaymentContactlessRequest.from_dictionary(dictionary.get('token')) if 'token' in dictionary.keys() else APIHelper.SKIP 
        recurrency_cycle = dictionary.get("recurrency_cycle") if dictionary.get("recurrency_cycle") else APIHelper.SKIP
        # Return an object of this model
        return cls(statement_descriptor,
                   card,
                   card_id,
                   card_token,
                   recurrence,
                   authentication,
                   token,
                   recurrency_cycle)
