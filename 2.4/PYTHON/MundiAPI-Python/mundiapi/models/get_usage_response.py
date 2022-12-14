# -*- coding: utf-8 -*-

"""
mundiapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from mundiapi.api_helper import APIHelper
from mundiapi.models.get_subscription_item_response import GetSubscriptionItemResponse


class GetUsageResponse(object):

    """Implementation of the 'GetUsageResponse' model.

    Response object for getting a usage

    Attributes:
        id (string): Id
        quantity (int): Quantity
        description (string): Description
        used_at (datetime): Used at
        created_at (datetime): Creation date
        status (string): Status
        deleted_at (datetime): TODO: type description here.
        subscription_item (GetSubscriptionItemResponse): Subscription item
        code (string): Identification code in the client system
        group (string): Identification group in the client system
        amount (int): Field used in item scheme type 'Percent'

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "quantity": 'quantity',
        "description": 'description',
        "used_at": 'used_at',
        "created_at": 'created_at',
        "status": 'status',
        "subscription_item": 'subscription_item',
        "deleted_at": 'deleted_at',
        "code": 'code',
        "group": 'group',
        "amount": 'amount'
    }

    _optionals = [
        'deleted_at',
        'code',
        'group',
        'amount',
    ]

    def __init__(self,
                 id=None,
                 quantity=None,
                 description=None,
                 used_at=None,
                 created_at=None,
                 status=None,
                 subscription_item=None,
                 deleted_at=APIHelper.SKIP,
                 code=APIHelper.SKIP,
                 group=APIHelper.SKIP,
                 amount=APIHelper.SKIP):
        """Constructor for the GetUsageResponse class"""

        # Initialize members of the class
        self.id = id 
        self.quantity = quantity 
        self.description = description 
        self.used_at = APIHelper.RFC3339DateTime(used_at) if used_at else None 
        self.created_at = APIHelper.RFC3339DateTime(created_at) if created_at else None 
        self.status = status 
        if deleted_at is not APIHelper.SKIP:
            self.deleted_at = APIHelper.RFC3339DateTime(deleted_at) if deleted_at else None 
        self.subscription_item = subscription_item 
        if code is not APIHelper.SKIP:
            self.code = code 
        if group is not APIHelper.SKIP:
            self.group = group 
        if amount is not APIHelper.SKIP:
            self.amount = amount 

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
        quantity = dictionary.get("quantity") if dictionary.get("quantity") else None
        description = dictionary.get("description") if dictionary.get("description") else None
        used_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("used_at")).datetime if dictionary.get("used_at") else None
        created_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("created_at")).datetime if dictionary.get("created_at") else None
        status = dictionary.get("status") if dictionary.get("status") else None
        subscription_item = GetSubscriptionItemResponse.from_dictionary(dictionary.get('subscription_item')) if dictionary.get('subscription_item') else None
        deleted_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("deleted_at")).datetime if dictionary.get("deleted_at") else APIHelper.SKIP
        code = dictionary.get("code") if dictionary.get("code") else APIHelper.SKIP
        group = dictionary.get("group") if dictionary.get("group") else APIHelper.SKIP
        amount = dictionary.get("amount") if dictionary.get("amount") else APIHelper.SKIP
        # Return an object of this model
        return cls(id,
                   quantity,
                   description,
                   used_at,
                   created_at,
                   status,
                   subscription_item,
                   deleted_at,
                   code,
                   group,
                   amount)
