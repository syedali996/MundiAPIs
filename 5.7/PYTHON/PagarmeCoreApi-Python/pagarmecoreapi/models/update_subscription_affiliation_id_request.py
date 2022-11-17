# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class UpdateSubscriptionAffiliationIdRequest(object):

    """Implementation of the 'UpdateSubscriptionAffiliationIdRequest' model.

    Request for updating a Subscription Affiliation Id

    Attributes:
        gateway_affiliation_id (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "gateway_affiliation_id": 'gateway_affiliation_id'
    }

    def __init__(self,
                 gateway_affiliation_id=None):
        """Constructor for the UpdateSubscriptionAffiliationIdRequest class"""

        # Initialize members of the class
        self.gateway_affiliation_id = gateway_affiliation_id 

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

        gateway_affiliation_id = dictionary.get("gateway_affiliation_id") if dictionary.get("gateway_affiliation_id") else None
        # Return an object of this model
        return cls(gateway_affiliation_id)
