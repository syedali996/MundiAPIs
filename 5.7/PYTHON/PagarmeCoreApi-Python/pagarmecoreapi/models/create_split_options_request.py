# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmecoreapi.api_helper import APIHelper


class CreateSplitOptionsRequest(object):

    """Implementation of the 'CreateSplitOptionsRequest' model.

    The Split Options Request

    Attributes:
        liable (bool): Liable options
        charge_processing_fee (bool): Charge processing fee
        charge_remainder_fee (bool): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "liable": 'liable',
        "charge_processing_fee": 'charge_processing_fee',
        "charge_remainder_fee": 'charge_remainder_fee'
    }

    _optionals = [
        'liable',
        'charge_processing_fee',
        'charge_remainder_fee',
    ]

    def __init__(self,
                 liable=APIHelper.SKIP,
                 charge_processing_fee=APIHelper.SKIP,
                 charge_remainder_fee=APIHelper.SKIP):
        """Constructor for the CreateSplitOptionsRequest class"""

        # Initialize members of the class
        if liable is not APIHelper.SKIP:
            self.liable = liable 
        if charge_processing_fee is not APIHelper.SKIP:
            self.charge_processing_fee = charge_processing_fee 
        if charge_remainder_fee is not APIHelper.SKIP:
            self.charge_remainder_fee = charge_remainder_fee 

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

        liable = dictionary.get("liable") if "liable" in dictionary.keys() else APIHelper.SKIP
        charge_processing_fee = dictionary.get("charge_processing_fee") if "charge_processing_fee" in dictionary.keys() else APIHelper.SKIP
        charge_remainder_fee = dictionary.get("charge_remainder_fee") if "charge_remainder_fee" in dictionary.keys() else APIHelper.SKIP
        # Return an object of this model
        return cls(liable,
                   charge_processing_fee,
                   charge_remainder_fee)
