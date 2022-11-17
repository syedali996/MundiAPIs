# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmecoreapi.api_helper import APIHelper
from pagarmecoreapi.models.get_period_response import GetPeriodResponse
from pagarmecoreapi.models.paging_response import PagingResponse


class ListCyclesResponse(object):

    """Implementation of the 'ListCyclesResponse' model.

    Response object for listing subscription cycles

    Attributes:
        data (list of GetPeriodResponse): The subscription cycles objects
        paging (PagingResponse): Paging object

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "data": 'data',
        "paging": 'paging'
    }

    _optionals = [
        'data',
        'paging',
    ]

    def __init__(self,
                 data=APIHelper.SKIP,
                 paging=APIHelper.SKIP):
        """Constructor for the ListCyclesResponse class"""

        # Initialize members of the class
        if data is not APIHelper.SKIP:
            self.data = data 
        if paging is not APIHelper.SKIP:
            self.paging = paging 

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

        data = None
        if dictionary.get('data') is not None:
            data = [GetPeriodResponse.from_dictionary(x) for x in dictionary.get('data')]
        else:
            data = APIHelper.SKIP
        paging = PagingResponse.from_dictionary(dictionary.get('paging')) if 'paging' in dictionary.keys() else APIHelper.SKIP 
        # Return an object of this model
        return cls(data,
                   paging)
