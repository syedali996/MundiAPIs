# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmecoreapi.models.get_gateway_error_response import GetGatewayErrorResponse


class GetGatewayResponseResponse(object):

    """Implementation of the 'GetGatewayResponseResponse' model.

    The Transaction Gateway Response

    Attributes:
        code (string): The error code
        errors (list of GetGatewayErrorResponse): The gateway response errors
            list

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "code": 'code',
        "errors": 'errors'
    }

    def __init__(self,
                 code=None,
                 errors=None):
        """Constructor for the GetGatewayResponseResponse class"""

        # Initialize members of the class
        self.code = code 
        self.errors = errors 

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

        code = dictionary.get("code") if dictionary.get("code") else None
        errors = None
        if dictionary.get('errors') is not None:
            errors = [GetGatewayErrorResponse.from_dictionary(x) for x in dictionary.get('errors')]
        # Return an object of this model
        return cls(code,
                   errors)