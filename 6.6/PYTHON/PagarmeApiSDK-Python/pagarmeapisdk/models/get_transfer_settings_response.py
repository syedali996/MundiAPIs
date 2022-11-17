# -*- coding: utf-8 -*-

"""
pagarmeapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class GetTransferSettingsResponse(object):

    """Implementation of the 'GetTransferSettingsResponse' model.

    TODO: type model description here.

    Attributes:
        transfer_enabled (bool): TODO: type description here.
        transfer_interval (string): TODO: type description here.
        transfer_day (int): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "transfer_enabled": 'transfer_enabled',
        "transfer_interval": 'transfer_interval',
        "transfer_day": 'transfer_day'
    }

    def __init__(self,
                 transfer_enabled=None,
                 transfer_interval=None,
                 transfer_day=None):
        """Constructor for the GetTransferSettingsResponse class"""

        # Initialize members of the class
        self.transfer_enabled = transfer_enabled 
        self.transfer_interval = transfer_interval 
        self.transfer_day = transfer_day 

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

        transfer_enabled = dictionary.get("transfer_enabled") if "transfer_enabled" in dictionary.keys() else None
        transfer_interval = dictionary.get("transfer_interval") if dictionary.get("transfer_interval") else None
        transfer_day = dictionary.get("transfer_day") if dictionary.get("transfer_day") else None
        # Return an object of this model
        return cls(transfer_enabled,
                   transfer_interval,
                   transfer_day)
