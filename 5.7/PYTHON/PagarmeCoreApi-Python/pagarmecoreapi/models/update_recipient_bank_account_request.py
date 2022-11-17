# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmecoreapi.models.create_bank_account_request import CreateBankAccountRequest


class UpdateRecipientBankAccountRequest(object):

    """Implementation of the 'UpdateRecipientBankAccountRequest' model.

    Updates the default bank account for a recipient

    Attributes:
        bank_account (CreateBankAccountRequest): Bank account
        payment_mode (string): Payment mode

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "bank_account": 'bank_account',
        "payment_mode": 'payment_mode'
    }

    def __init__(self,
                 bank_account=None,
                 payment_mode='bank_transfer'):
        """Constructor for the UpdateRecipientBankAccountRequest class"""

        # Initialize members of the class
        self.bank_account = bank_account 
        self.payment_mode = payment_mode 

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

        bank_account = CreateBankAccountRequest.from_dictionary(dictionary.get('bank_account')) if dictionary.get('bank_account') else None
        payment_mode = dictionary.get("payment_mode") if dictionary.get("payment_mode") else 'bank_transfer'
        # Return an object of this model
        return cls(bank_account,
                   payment_mode)
