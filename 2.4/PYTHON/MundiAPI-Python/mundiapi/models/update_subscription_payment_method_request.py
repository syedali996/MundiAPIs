# -*- coding: utf-8 -*-

"""
mundiapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from mundiapi.api_helper import APIHelper
from mundiapi.models.create_card_request import CreateCardRequest


class UpdateSubscriptionPaymentMethodRequest(object):

    """Implementation of the 'UpdateSubscriptionPaymentMethodRequest' model.

    Request for updating a subscription's payment method

    Attributes:
        payment_method (string): The new payment method
        card_id (string): Card id
        card (CreateCardRequest): Card data
        card_token (string): The Card Token

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "payment_method": 'payment_method',
        "card_id": 'card_id',
        "card": 'card',
        "card_token": 'card_token'
    }

    _optionals = [
        'card_token',
    ]

    def __init__(self,
                 payment_method=None,
                 card_id=None,
                 card=None,
                 card_token=APIHelper.SKIP):
        """Constructor for the UpdateSubscriptionPaymentMethodRequest class"""

        # Initialize members of the class
        self.payment_method = payment_method 
        self.card_id = card_id 
        self.card = card 
        if card_token is not APIHelper.SKIP:
            self.card_token = card_token 

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

        payment_method = dictionary.get("payment_method") if dictionary.get("payment_method") else None
        card_id = dictionary.get("card_id") if dictionary.get("card_id") else None
        card = CreateCardRequest.from_dictionary(dictionary.get('card')) if dictionary.get('card') else None
        card_token = dictionary.get("card_token") if dictionary.get("card_token") else APIHelper.SKIP
        # Return an object of this model
        return cls(payment_method,
                   card_id,
                   card,
                   card_token)