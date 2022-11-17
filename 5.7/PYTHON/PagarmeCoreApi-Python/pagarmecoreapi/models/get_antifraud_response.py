# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class GetAntifraudResponse(object):

    """Implementation of the 'GetAntifraudResponse' model.

    TODO: type model description here.

    Attributes:
        status (string): TODO: type description here.
        return_code (string): TODO: type description here.
        return_message (string): TODO: type description here.
        provider_name (string): TODO: type description here.
        score (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "status": 'status',
        "return_code": 'return_code',
        "return_message": 'return_message',
        "provider_name": 'provider_name',
        "score": 'score'
    }

    def __init__(self,
                 status=None,
                 return_code=None,
                 return_message=None,
                 provider_name=None,
                 score=None):
        """Constructor for the GetAntifraudResponse class"""

        # Initialize members of the class
        self.status = status 
        self.return_code = return_code 
        self.return_message = return_message 
        self.provider_name = provider_name 
        self.score = score 

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

        status = dictionary.get("status") if dictionary.get("status") else None
        return_code = dictionary.get("return_code") if dictionary.get("return_code") else None
        return_message = dictionary.get("return_message") if dictionary.get("return_message") else None
        provider_name = dictionary.get("provider_name") if dictionary.get("provider_name") else None
        score = dictionary.get("score") if dictionary.get("score") else None
        # Return an object of this model
        return cls(status,
                   return_code,
                   return_message,
                   provider_name,
                   score)
