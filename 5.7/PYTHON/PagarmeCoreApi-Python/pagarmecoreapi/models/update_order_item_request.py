# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class UpdateOrderItemRequest(object):

    """Implementation of the 'UpdateOrderItemRequest' model.

    Update Order item Request

    Attributes:
        amount (int): TODO: type description here.
        description (string): TODO: type description here.
        quantity (int): TODO: type description here.
        category (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "amount": 'amount',
        "description": 'description',
        "quantity": 'quantity',
        "category": 'category'
    }

    def __init__(self,
                 amount=None,
                 description=None,
                 quantity=None,
                 category=None):
        """Constructor for the UpdateOrderItemRequest class"""

        # Initialize members of the class
        self.amount = amount 
        self.description = description 
        self.quantity = quantity 
        self.category = category 

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

        amount = dictionary.get("amount") if dictionary.get("amount") else None
        description = dictionary.get("description") if dictionary.get("description") else None
        quantity = dictionary.get("quantity") if dictionary.get("quantity") else None
        category = dictionary.get("category") if dictionary.get("category") else None
        # Return an object of this model
        return cls(amount,
                   description,
                   quantity,
                   category)