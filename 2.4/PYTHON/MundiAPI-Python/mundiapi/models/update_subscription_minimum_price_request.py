# -*- coding: utf-8 -*-

"""
mundiapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from mundiapi.api_helper import APIHelper


class UpdateSubscriptionMinimumPriceRequest(object):

    """Implementation of the 'UpdateSubscriptionMinimumPriceRequest' model.

    Atualização do valor mínimo da assinatura

    Attributes:
        minimum_price (int): Valor mínimo da assinatura

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "minimum_price": 'minimum_price'
    }

    _optionals = [
        'minimum_price',
    ]

    def __init__(self,
                 minimum_price=APIHelper.SKIP):
        """Constructor for the UpdateSubscriptionMinimumPriceRequest class"""

        # Initialize members of the class
        if minimum_price is not APIHelper.SKIP:
            self.minimum_price = minimum_price 

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

        minimum_price = dictionary.get("minimum_price") if dictionary.get("minimum_price") else APIHelper.SKIP
        # Return an object of this model
        return cls(minimum_price)
