# -*- coding: utf-8 -*-

"""
pagarmeapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class GetOrderItemResponse(object):

    """Implementation of the 'GetOrderItemResponse' model.

    Response object for getting an order item

    Attributes:
        id (string): Id
        amount (int): TODO: type description here.
        description (string): TODO: type description here.
        quantity (int): TODO: type description here.
        category (string): Category
        code (string): Code

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "amount": 'amount',
        "description": 'description',
        "quantity": 'quantity',
        "category": 'category',
        "code": 'code'
    }

    def __init__(self,
                 id=None,
                 amount=None,
                 description=None,
                 quantity=None,
                 category=None,
                 code=None):
        """Constructor for the GetOrderItemResponse class"""

        # Initialize members of the class
        self.id = id 
        self.amount = amount 
        self.description = description 
        self.quantity = quantity 
        self.category = category 
        self.code = code 

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

        id = dictionary.get("id") if dictionary.get("id") else None
        amount = dictionary.get("amount") if dictionary.get("amount") else None
        description = dictionary.get("description") if dictionary.get("description") else None
        quantity = dictionary.get("quantity") if dictionary.get("quantity") else None
        category = dictionary.get("category") if dictionary.get("category") else None
        code = dictionary.get("code") if dictionary.get("code") else None
        # Return an object of this model
        return cls(id,
                   amount,
                   description,
                   quantity,
                   category,
                   code)