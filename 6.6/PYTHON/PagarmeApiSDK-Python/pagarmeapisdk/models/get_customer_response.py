# -*- coding: utf-8 -*-

"""
pagarmeapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmeapisdk.api_helper import APIHelper
from pagarmeapisdk.models.get_address_response import *
from pagarmeapisdk.models.get_phones_response import GetPhonesResponse


class GetCustomerResponse(object):

    """Implementation of the 'GetCustomerResponse' model.

    Response object for getting a customer

    Attributes:
        id (string): TODO: type description here.
        name (string): TODO: type description here.
        email (string): TODO: type description here.
        delinquent (bool): TODO: type description here.
        created_at (datetime): TODO: type description here.
        updated_at (datetime): TODO: type description here.
        document (string): TODO: type description here.
        mtype (string): TODO: type description here.
        fb_access_token (string): TODO: type description here.
        address (GetAddressResponse): TODO: type description here.
        metadata (dict): TODO: type description here.
        phones (GetPhonesResponse): TODO: type description here.
        fb_id (long|int): TODO: type description here.
        code (string): Código de referência do cliente no sistema da loja.
            Max: 52 caracteres
        document_type (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "name": 'name',
        "email": 'email',
        "delinquent": 'delinquent',
        "created_at": 'created_at',
        "updated_at": 'updated_at',
        "document": 'document',
        "mtype": 'type',
        "fb_access_token": 'fb_access_token',
        "address": 'address',
        "metadata": 'metadata',
        "phones": 'phones',
        "code": 'code',
        "document_type": 'document_type',
        "fb_id": 'fb_id'
    }

    _optionals = [
        'fb_id',
    ]

    def __init__(self,
                 id=None,
                 name=None,
                 email=None,
                 delinquent=None,
                 created_at=None,
                 updated_at=None,
                 document=None,
                 mtype=None,
                 fb_access_token=None,
                 address=None,
                 metadata=None,
                 phones=None,
                 code=None,
                 document_type=None,
                 fb_id=APIHelper.SKIP):
        """Constructor for the GetCustomerResponse class"""

        # Initialize members of the class
        self.id = id 
        self.name = name 
        self.email = email 
        self.delinquent = delinquent 
        self.created_at = APIHelper.RFC3339DateTime(created_at) if created_at else None 
        self.updated_at = APIHelper.RFC3339DateTime(updated_at) if updated_at else None 
        self.document = document 
        self.mtype = mtype 
        self.fb_access_token = fb_access_token 
        self.address = address 
        self.metadata = metadata 
        self.phones = phones 
        if fb_id is not APIHelper.SKIP:
            self.fb_id = fb_id 
        self.code = code 
        self.document_type = document_type 

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
        email = dictionary.get("email") if dictionary.get("email") else None
        delinquent = dictionary.get("delinquent") if "delinquent" in dictionary.keys() else None
        created_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("created_at")).datetime if dictionary.get("created_at") else None
        updated_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("updated_at")).datetime if dictionary.get("updated_at") else None
        document = dictionary.get("document") if dictionary.get("document") else None
        mtype = dictionary.get("type") if dictionary.get("type") else None
        fb_access_token = dictionary.get("fb_access_token") if dictionary.get("fb_access_token") else None
        address = GetAddressResponse.from_dictionary(dictionary.get('address')) if dictionary.get('address') else None
        metadata = dictionary.get("metadata") if dictionary.get("metadata") else None
        phones = GetPhonesResponse.from_dictionary(dictionary.get('phones')) if dictionary.get('phones') else None
        code = dictionary.get("code") if dictionary.get("code") else None
        document_type = dictionary.get("document_type") if dictionary.get("document_type") else None
        fb_id = dictionary.get("fb_id") if dictionary.get("fb_id") else APIHelper.SKIP
        # Return an object of this model
        return cls(id,
                   name,
                   email,
                   delinquent,
                   created_at,
                   updated_at,
                   document,
                   mtype,
                   fb_access_token,
                   address,
                   metadata,
                   phones,
                   code,
                   document_type,
                   fb_id)
