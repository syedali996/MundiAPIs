# -*- coding: utf-8 -*-

"""
mundiapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from mundiapi.models.get_anticipation_limit_response import GetAnticipationLimitResponse


class GetAnticipationLimitsResponse(object):

    """Implementation of the 'GetAnticipationLimitsResponse' model.

    Anticipation limits

    Attributes:
        max (GetAnticipationLimitResponse): Max limit
        min (GetAnticipationLimitResponse): Min limit

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "max": 'max',
        "min": 'min'
    }

    def __init__(self,
                 max=None,
                 min=None):
        """Constructor for the GetAnticipationLimitsResponse class"""

        # Initialize members of the class
        self.max = max 
        self.min = min 

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

        max = GetAnticipationLimitResponse.from_dictionary(dictionary.get('max')) if dictionary.get('max') else None
        min = GetAnticipationLimitResponse.from_dictionary(dictionary.get('min')) if dictionary.get('min') else None
        # Return an object of this model
        return cls(max,
                   min)
