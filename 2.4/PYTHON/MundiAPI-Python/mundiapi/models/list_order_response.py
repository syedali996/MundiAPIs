# -*- coding: utf-8 -*-

"""
mundiapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from mundiapi.models.get_order_response import GetOrderResponse
from mundiapi.models.paging_response import PagingResponse


class ListOrderResponse(object):

    """Implementation of the 'ListOrderResponse' model.

    Response object for listing order objects

    Attributes:
        data (list of GetOrderResponse): The order object
        paging (PagingResponse): Paging object

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "data": 'data',
        "paging": 'paging'
    }

    def __init__(self,
                 data=None,
                 paging=None):
        """Constructor for the ListOrderResponse class"""

        # Initialize members of the class
        self.data = data 
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
            data = [GetOrderResponse.from_dictionary(x) for x in dictionary.get('data')]
        paging = PagingResponse.from_dictionary(dictionary.get('paging')) if dictionary.get('paging') else None
        # Return an object of this model
        return cls(data,
                   paging)