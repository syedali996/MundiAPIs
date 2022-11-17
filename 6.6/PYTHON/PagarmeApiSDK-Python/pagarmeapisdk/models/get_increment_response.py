# -*- coding: utf-8 -*-

"""
pagarmeapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmeapisdk.api_helper import APIHelper
from pagarmeapisdk.models.get_subscription_item_response import *
from pagarmeapisdk.models.get_subscription_response import *


class GetIncrementResponse(object):

    """Implementation of the 'GetIncrementResponse' model.

    Response object for getting a increment

    Attributes:
        id (string): TODO: type description here.
        value (float): TODO: type description here.
        increment_type (string): TODO: type description here.
        status (string): TODO: type description here.
        created_at (datetime): TODO: type description here.
        cycles (int): TODO: type description here.
        deleted_at (datetime): TODO: type description here.
        description (string): TODO: type description here.
        subscription (GetSubscriptionResponse): TODO: type description here.
        subscription_item (GetSubscriptionItemResponse): The Subscription
            Item

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "value": 'value',
        "increment_type": 'increment_type',
        "status": 'status',
        "created_at": 'created_at',
        "cycles": 'cycles',
        "deleted_at": 'deleted_at',
        "description": 'description',
        "subscription": 'subscription',
        "subscription_item": 'subscription_item'
    }

    _optionals = [
        'cycles',
        'deleted_at',
        'description',
        'subscription',
        'subscription_item',
    ]

    def __init__(self,
                 id=None,
                 value=None,
                 increment_type=None,
                 status=None,
                 created_at=None,
                 cycles=APIHelper.SKIP,
                 deleted_at=APIHelper.SKIP,
                 description=APIHelper.SKIP,
                 subscription=APIHelper.SKIP,
                 subscription_item=APIHelper.SKIP):
        """Constructor for the GetIncrementResponse class"""

        # Initialize members of the class
        self.id = id 
        self.value = value 
        self.increment_type = increment_type 
        self.status = status 
        self.created_at = APIHelper.RFC3339DateTime(created_at) if created_at else None 
        if cycles is not APIHelper.SKIP:
            self.cycles = cycles 
        if deleted_at is not APIHelper.SKIP:
            self.deleted_at = APIHelper.RFC3339DateTime(deleted_at) if deleted_at else None 
        if description is not APIHelper.SKIP:
            self.description = description 
        if subscription is not APIHelper.SKIP:
            self.subscription = subscription 
        if subscription_item is not APIHelper.SKIP:
            self.subscription_item = subscription_item 

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
        value = dictionary.get("value") if dictionary.get("value") else None
        increment_type = dictionary.get("increment_type") if dictionary.get("increment_type") else None
        status = dictionary.get("status") if dictionary.get("status") else None
        created_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("created_at")).datetime if dictionary.get("created_at") else None
        cycles = dictionary.get("cycles") if dictionary.get("cycles") else APIHelper.SKIP
        deleted_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("deleted_at")).datetime if dictionary.get("deleted_at") else APIHelper.SKIP
        description = dictionary.get("description") if dictionary.get("description") else APIHelper.SKIP
        subscription = GetSubscriptionResponse.from_dictionary(dictionary.get('subscription')) if 'subscription' in dictionary.keys() else APIHelper.SKIP 
        subscription_item = GetSubscriptionItemResponse.from_dictionary(dictionary.get('subscription_item')) if 'subscription_item' in dictionary.keys() else APIHelper.SKIP 
        # Return an object of this model
        return cls(id,
                   value,
                   increment_type,
                   status,
                   created_at,
                   cycles,
                   deleted_at,
                   description,
                   subscription,
                   subscription_item)
