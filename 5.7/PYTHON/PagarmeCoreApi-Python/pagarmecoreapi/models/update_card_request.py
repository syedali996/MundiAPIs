# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmecoreapi.models.create_address_request import CreateAddressRequest


class UpdateCardRequest(object):

    """Implementation of the 'UpdateCardRequest' model.

    Request for updating a card

    Attributes:
        holder_name (string): Holder name
        exp_month (int): Expiration month
        exp_year (int): Expiration year
        billing_address_id (string): Id of the address to be used as billing
            address
        billing_address (CreateAddressRequest): Billing address
        metadata (dict): Metadata
        label (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "holder_name": 'holder_name',
        "exp_month": 'exp_month',
        "exp_year": 'exp_year',
        "billing_address_id": 'billing_address_id',
        "billing_address": 'billing_address',
        "metadata": 'metadata',
        "label": 'label'
    }

    def __init__(self,
                 holder_name=None,
                 exp_month=None,
                 exp_year=None,
                 billing_address_id=None,
                 billing_address=None,
                 metadata=None,
                 label=None):
        """Constructor for the UpdateCardRequest class"""

        # Initialize members of the class
        self.holder_name = holder_name 
        self.exp_month = exp_month 
        self.exp_year = exp_year 
        self.billing_address_id = billing_address_id 
        self.billing_address = billing_address 
        self.metadata = metadata 
        self.label = label 

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

        holder_name = dictionary.get("holder_name") if dictionary.get("holder_name") else None
        exp_month = dictionary.get("exp_month") if dictionary.get("exp_month") else None
        exp_year = dictionary.get("exp_year") if dictionary.get("exp_year") else None
        billing_address_id = dictionary.get("billing_address_id") if dictionary.get("billing_address_id") else None
        billing_address = CreateAddressRequest.from_dictionary(dictionary.get('billing_address')) if dictionary.get('billing_address') else None
        metadata = dictionary.get("metadata") if dictionary.get("metadata") else None
        label = dictionary.get("label") if dictionary.get("label") else None
        # Return an object of this model
        return cls(holder_name,
                   exp_month,
                   exp_year,
                   billing_address_id,
                   billing_address,
                   metadata,
                   label)
