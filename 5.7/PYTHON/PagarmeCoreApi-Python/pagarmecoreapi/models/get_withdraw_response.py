# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmecoreapi.api_helper import APIHelper
from pagarmecoreapi.models.get_withdraw_source_response import GetWithdrawSourceResponse
from pagarmecoreapi.models.get_withdraw_target_response import GetWithdrawTargetResponse


class GetWithdrawResponse(object):

    """Implementation of the 'GetWithdrawResponse' model.

    TODO: type model description here.

    Attributes:
        id (string): TODO: type description here.
        gateway_id (string): TODO: type description here.
        amount (int): TODO: type description here.
        status (string): TODO: type description here.
        created_at (datetime): TODO: type description here.
        updated_at (datetime): TODO: type description here.
        metadata (list of string): TODO: type description here.
        fee (int): TODO: type description here.
        funding_date (datetime): TODO: type description here.
        funding_estimated_date (datetime): TODO: type description here.
        mtype (string): TODO: type description here.
        source (GetWithdrawSourceResponse): TODO: type description here.
        target (GetWithdrawTargetResponse): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "gateway_id": 'gateway_id',
        "amount": 'amount',
        "status": 'status',
        "created_at": 'created_at',
        "updated_at": 'updated_at',
        "mtype": 'type',
        "source": 'source',
        "target": 'target',
        "metadata": 'metadata',
        "fee": 'fee',
        "funding_date": 'funding_date',
        "funding_estimated_date": 'funding_estimated_date'
    }

    _optionals = [
        'metadata',
        'fee',
        'funding_date',
        'funding_estimated_date',
    ]

    def __init__(self,
                 id=None,
                 gateway_id=None,
                 amount=None,
                 status=None,
                 created_at=None,
                 updated_at=None,
                 mtype=None,
                 source=None,
                 target=None,
                 metadata=APIHelper.SKIP,
                 fee=APIHelper.SKIP,
                 funding_date=APIHelper.SKIP,
                 funding_estimated_date=APIHelper.SKIP):
        """Constructor for the GetWithdrawResponse class"""

        # Initialize members of the class
        self.id = id 
        self.gateway_id = gateway_id 
        self.amount = amount 
        self.status = status 
        self.created_at = APIHelper.RFC3339DateTime(created_at) if created_at else None 
        self.updated_at = APIHelper.RFC3339DateTime(updated_at) if updated_at else None 
        if metadata is not APIHelper.SKIP:
            self.metadata = metadata 
        if fee is not APIHelper.SKIP:
            self.fee = fee 
        if funding_date is not APIHelper.SKIP:
            self.funding_date = APIHelper.RFC3339DateTime(funding_date) if funding_date else None 
        if funding_estimated_date is not APIHelper.SKIP:
            self.funding_estimated_date = APIHelper.RFC3339DateTime(funding_estimated_date) if funding_estimated_date else None 
        self.mtype = mtype 
        self.source = source 
        self.target = target 

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

        id = dictionary.get("id") if dictionary.get("id") else None
        gateway_id = dictionary.get("gateway_id") if dictionary.get("gateway_id") else None
        amount = dictionary.get("amount") if dictionary.get("amount") else None
        status = dictionary.get("status") if dictionary.get("status") else None
        created_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("created_at")).datetime if dictionary.get("created_at") else None
        updated_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("updated_at")).datetime if dictionary.get("updated_at") else None
        mtype = dictionary.get("type") if dictionary.get("type") else None
        source = GetWithdrawSourceResponse.from_dictionary(dictionary.get('source')) if dictionary.get('source') else None
        target = GetWithdrawTargetResponse.from_dictionary(dictionary.get('target')) if dictionary.get('target') else None
        metadata = dictionary.get("metadata") if dictionary.get("metadata") else APIHelper.SKIP
        fee = dictionary.get("fee") if dictionary.get("fee") else APIHelper.SKIP
        funding_date = APIHelper.RFC3339DateTime.from_value(dictionary.get("funding_date")).datetime if dictionary.get("funding_date") else APIHelper.SKIP
        funding_estimated_date = APIHelper.RFC3339DateTime.from_value(dictionary.get("funding_estimated_date")).datetime if dictionary.get("funding_estimated_date") else APIHelper.SKIP
        # Return an object of this model
        return cls(id,
                   gateway_id,
                   amount,
                   status,
                   created_at,
                   updated_at,
                   mtype,
                   source,
                   target,
                   metadata,
                   fee,
                   funding_date,
                   funding_estimated_date)
