# -*- coding: utf-8 -*-

"""
mundiapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class GetWithdrawSourceResponse(object):

    """Implementation of the 'GetWithdrawSourceResponse' model.

    TODO: type model description here.

    Attributes:
        source_id (string): TODO: type description here.
        mtype (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "source_id": 'source_id',
        "mtype": 'type'
    }

    def __init__(self,
                 source_id=None,
                 mtype=None):
        """Constructor for the GetWithdrawSourceResponse class"""

        # Initialize members of the class
        self.source_id = source_id 
        self.mtype = mtype 

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

        source_id = dictionary.get("source_id") if dictionary.get("source_id") else None
        mtype = dictionary.get("type") if dictionary.get("type") else None
        # Return an object of this model
        return cls(source_id,
                   mtype)
