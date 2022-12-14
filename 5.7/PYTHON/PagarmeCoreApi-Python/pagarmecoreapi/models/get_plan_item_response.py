# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmecoreapi.api_helper import APIHelper
from pagarmecoreapi.models.get_plan_response import *
from pagarmecoreapi.models.get_pricing_scheme_response import GetPricingSchemeResponse


class GetPlanItemResponse(object):

    """Implementation of the 'GetPlanItemResponse' model.

    Response object for getting a plan item

    Attributes:
        id (string): TODO: type description here.
        name (string): TODO: type description here.
        status (string): TODO: type description here.
        created_at (datetime): TODO: type description here.
        updated_at (datetime): TODO: type description here.
        pricing_scheme (GetPricingSchemeResponse): TODO: type description
            here.
        description (string): TODO: type description here.
        plan (GetPlanResponse): TODO: type description here.
        quantity (int): TODO: type description here.
        cycles (int): TODO: type description here.
        deleted_at (datetime): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "name": 'name',
        "status": 'status',
        "created_at": 'created_at',
        "updated_at": 'updated_at',
        "pricing_scheme": 'pricing_scheme',
        "description": 'description',
        "plan": 'plan',
        "quantity": 'quantity',
        "cycles": 'cycles',
        "deleted_at": 'deleted_at'
    }

    _optionals = [
        'quantity',
        'cycles',
        'deleted_at',
    ]

    def __init__(self,
                 id=None,
                 name=None,
                 status=None,
                 created_at=None,
                 updated_at=None,
                 pricing_scheme=None,
                 description=None,
                 plan=None,
                 quantity=APIHelper.SKIP,
                 cycles=APIHelper.SKIP,
                 deleted_at=APIHelper.SKIP):
        """Constructor for the GetPlanItemResponse class"""

        # Initialize members of the class
        self.id = id 
        self.name = name 
        self.status = status 
        self.created_at = APIHelper.RFC3339DateTime(created_at) if created_at else None 
        self.updated_at = APIHelper.RFC3339DateTime(updated_at) if updated_at else None 
        self.pricing_scheme = pricing_scheme 
        self.description = description 
        self.plan = plan 
        if quantity is not APIHelper.SKIP:
            self.quantity = quantity 
        if cycles is not APIHelper.SKIP:
            self.cycles = cycles 
        if deleted_at is not APIHelper.SKIP:
            self.deleted_at = APIHelper.RFC3339DateTime(deleted_at) if deleted_at else None 

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
        name = dictionary.get("name") if dictionary.get("name") else None
        status = dictionary.get("status") if dictionary.get("status") else None
        created_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("created_at")).datetime if dictionary.get("created_at") else None
        updated_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("updated_at")).datetime if dictionary.get("updated_at") else None
        pricing_scheme = GetPricingSchemeResponse.from_dictionary(dictionary.get('pricing_scheme')) if dictionary.get('pricing_scheme') else None
        description = dictionary.get("description") if dictionary.get("description") else None
        plan = GetPlanResponse.from_dictionary(dictionary.get('plan')) if dictionary.get('plan') else None
        quantity = dictionary.get("quantity") if dictionary.get("quantity") else APIHelper.SKIP
        cycles = dictionary.get("cycles") if dictionary.get("cycles") else APIHelper.SKIP
        deleted_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("deleted_at")).datetime if dictionary.get("deleted_at") else APIHelper.SKIP
        # Return an object of this model
        return cls(id,
                   name,
                   status,
                   created_at,
                   updated_at,
                   pricing_scheme,
                   description,
                   plan,
                   quantity,
                   cycles,
                   deleted_at)
