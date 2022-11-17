# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmecoreapi.api_helper import APIHelper


class CreatePhoneRequest(object):

    """Implementation of the 'CreatePhoneRequest' model.

    TODO: type model description here.

    Attributes:
        country_code (string): TODO: type description here.
        number (string): TODO: type description here.
        area_code (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "country_code": 'country_code',
        "number": 'number',
        "area_code": 'area_code'
    }

    _optionals = [
        'country_code',
        'number',
        'area_code',
    ]

    def __init__(self,
                 country_code=APIHelper.SKIP,
                 number=APIHelper.SKIP,
                 area_code=APIHelper.SKIP):
        """Constructor for the CreatePhoneRequest class"""

        # Initialize members of the class
        if country_code is not APIHelper.SKIP:
            self.country_code = country_code 
        if number is not APIHelper.SKIP:
            self.number = number 
        if area_code is not APIHelper.SKIP:
            self.area_code = area_code 

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

        country_code = dictionary.get("country_code") if dictionary.get("country_code") else APIHelper.SKIP
        number = dictionary.get("number") if dictionary.get("number") else APIHelper.SKIP
        area_code = dictionary.get("area_code") if dictionary.get("area_code") else APIHelper.SKIP
        # Return an object of this model
        return cls(country_code,
                   number,
                   area_code)