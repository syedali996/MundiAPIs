# -*- coding: utf-8 -*-

"""
mundiapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from mundiapi.api_helper import APIHelper


class GetTransactionReportFileResponse(object):

    """Implementation of the 'GetTransactionReportFileResponse' model.

    TODO: type model description here.

    Attributes:
        name (string): TODO: type description here.
        date (datetime): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "date": 'date'
    }

    def __init__(self,
                 name=None,
                 date=None):
        """Constructor for the GetTransactionReportFileResponse class"""

        # Initialize members of the class
        self.name = name 
        self.date = APIHelper.RFC3339DateTime(date) if date else None 

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

        name = dictionary.get("name") if dictionary.get("name") else None
        date = APIHelper.RFC3339DateTime.from_value(dictionary.get("date")).datetime if dictionary.get("date") else None
        # Return an object of this model
        return cls(name,
                   date)
