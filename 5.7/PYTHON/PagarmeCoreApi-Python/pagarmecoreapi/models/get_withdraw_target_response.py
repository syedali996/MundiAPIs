# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class GetWithdrawTargetResponse(object):

    """Implementation of the 'GetWithdrawTargetResponse' model.

    TODO: type model description here.

    Attributes:
        target_id (string): TODO: type description here.
        mtype (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "target_id": 'target_id',
        "mtype": 'type'
    }

    def __init__(self,
                 target_id=None,
                 mtype=None):
        """Constructor for the GetWithdrawTargetResponse class"""

        # Initialize members of the class
        self.target_id = target_id 
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

        target_id = dictionary.get("target_id") if dictionary.get("target_id") else None
        mtype = dictionary.get("type") if dictionary.get("type") else None
        # Return an object of this model
        return cls(target_id,
                   mtype)
