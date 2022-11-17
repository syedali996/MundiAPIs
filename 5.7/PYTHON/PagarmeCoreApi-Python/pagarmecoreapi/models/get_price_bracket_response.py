# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmecoreapi.api_helper import APIHelper


class GetPriceBracketResponse(object):

    """Implementation of the 'GetPriceBracketResponse' model.

    Response object for getting a price bracket

    Attributes:
        start_quantity (int): TODO: type description here.
        price (int): TODO: type description here.
        end_quantity (int): TODO: type description here.
        overage_price (int): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "start_quantity": 'start_quantity',
        "price": 'price',
        "end_quantity": 'end_quantity',
        "overage_price": 'overage_price'
    }

    _optionals = [
        'end_quantity',
        'overage_price',
    ]

    def __init__(self,
                 start_quantity=None,
                 price=None,
                 end_quantity=APIHelper.SKIP,
                 overage_price=APIHelper.SKIP):
        """Constructor for the GetPriceBracketResponse class"""

        # Initialize members of the class
        self.start_quantity = start_quantity 
        self.price = price 
        if end_quantity is not APIHelper.SKIP:
            self.end_quantity = end_quantity 
        if overage_price is not APIHelper.SKIP:
            self.overage_price = overage_price 

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

        start_quantity = dictionary.get("start_quantity") if dictionary.get("start_quantity") else None
        price = dictionary.get("price") if dictionary.get("price") else None
        end_quantity = dictionary.get("end_quantity") if dictionary.get("end_quantity") else APIHelper.SKIP
        overage_price = dictionary.get("overage_price") if dictionary.get("overage_price") else APIHelper.SKIP
        # Return an object of this model
        return cls(start_quantity,
                   price,
                   end_quantity,
                   overage_price)
