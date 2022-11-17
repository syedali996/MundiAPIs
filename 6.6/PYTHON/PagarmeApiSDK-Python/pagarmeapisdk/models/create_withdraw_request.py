# -*- coding: utf-8 -*-

"""
pagarmeapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmeapisdk.api_helper import APIHelper


class CreateWithdrawRequest(object):

    """Implementation of the 'CreateWithdrawRequest' model.

    TODO: type model description here.

    Attributes:
        amount (int): TODO: type description here.
        metadata (dict): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "amount": 'amount',
        "metadata": 'metadata'
    }

    _optionals = [
        'metadata',
    ]

    def __init__(self,
                 amount=None,
                 metadata=APIHelper.SKIP):
        """Constructor for the CreateWithdrawRequest class"""

        # Initialize members of the class
        self.amount = amount 
        if metadata is not APIHelper.SKIP:
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
        metadata = dictionary.get("metadata") if dictionary.get("metadata") else APIHelper.SKIP
        # Return an object of this model
        return cls(amount,
                   metadata)
