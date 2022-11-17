# -*- coding: utf-8 -*-

"""
mundiapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from mundiapi.models.create_card_request import CreateCardRequest


class UpdateChargeCardRequest(object):

    """Implementation of the 'UpdateChargeCardRequest' model.

    Request for updating card data

    Attributes:
        update_subscription (bool): Indicates if the subscriptions using this
            card must also be updated
        card_id (string): Card id
        card (CreateCardRequest): Card data
        recurrence (bool): Indicates a recurrence

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "update_subscription": 'update_subscription',
        "card_id": 'card_id',
        "card": 'card',
        "recurrence": 'recurrence'
    }

    def __init__(self,
                 update_subscription=None,
                 card_id=None,
                 card=None,
                 recurrence=None):
        """Constructor for the UpdateChargeCardRequest class"""

        # Initialize members of the class
        self.update_subscription = update_subscription 
        self.card_id = card_id 
        self.card = card 
        self.recurrence = recurrence 

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

        update_subscription = dictionary.get("update_subscription") if "update_subscription" in dictionary.keys() else None
        card_id = dictionary.get("card_id") if dictionary.get("card_id") else None
        card = CreateCardRequest.from_dictionary(dictionary.get('card')) if dictionary.get('card') else None
        recurrence = dictionary.get("recurrence") if "recurrence" in dictionary.keys() else None
        # Return an object of this model
        return cls(update_subscription,
                   card_id,
                   card,
                   recurrence)
