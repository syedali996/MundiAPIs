# -*- coding: utf-8 -*-

"""
mundiapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class CreateTransferRequest(object):

    """Implementation of the 'CreateTransferRequest' model.

    Request for creating a transfer

    Attributes:
        amount (int): Transfer amount
        metadata (dict): Metadata

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "amount": 'amount',
        "metadata": 'metadata'
    }

    def __init__(self,
                 amount=None,
                 metadata=None):
        """Constructor for the CreateTransferRequest class"""

        # Initialize members of the class
        self.amount = amount 
        self.metadata = metadata 

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
        metadata = dictionary.get("metadata") if dictionary.get("metadata") else None
        # Return an object of this model
        return cls(amount,
                   metadata)
