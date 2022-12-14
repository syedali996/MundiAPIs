# -*- coding: utf-8 -*-

"""
pagarmeapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmeapisdk.api_helper import APIHelper
from pagarmeapisdk.models.create_address_request import CreateAddressRequest
from pagarmeapisdk.models.create_fine_request import CreateFineRequest
from pagarmeapisdk.models.create_interest_request import CreateInterestRequest


class CreateBoletoPaymentRequest(object):

    """Implementation of the 'CreateBoletoPaymentRequest' model.

    Contains the settings for creating a boleto payment

    Attributes:
        retries (int): Number of retries
        bank (string): The bank code, containing three characters. The
            available codes are on the API specification
        instructions (string): The instructions field that will be printed on
            the boleto.
        due_at (datetime): Boleto due date
        billing_address (CreateAddressRequest): Card's billing address
        billing_address_id (string): The address id for the billing address
        nosso_numero (string): Customer identification number with the bank
        document_number (string): Boleto identification
        statement_descriptor (string): Soft Descriptor
        interest (CreateInterestRequest): TODO: type description here.
        fine (CreateFineRequest): TODO: type description here.
        max_days_to_pay_past_due (int): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "retries": 'retries',
        "bank": 'bank',
        "instructions": 'instructions',
        "billing_address": 'billing_address',
        "billing_address_id": 'billing_address_id',
        "document_number": 'document_number',
        "statement_descriptor": 'statement_descriptor',
        "due_at": 'due_at',
        "nosso_numero": 'nosso_numero',
        "interest": 'interest',
        "fine": 'fine',
        "max_days_to_pay_past_due": 'max_days_to_pay_past_due'
    }

    _optionals = [
        'due_at',
        'nosso_numero',
        'interest',
        'fine',
        'max_days_to_pay_past_due',
    ]

    def __init__(self,
                 retries=None,
                 bank=None,
                 instructions=None,
                 billing_address=None,
                 billing_address_id=None,
                 document_number=None,
                 statement_descriptor=None,
                 due_at=APIHelper.SKIP,
                 nosso_numero=APIHelper.SKIP,
                 interest=APIHelper.SKIP,
                 fine=APIHelper.SKIP,
                 max_days_to_pay_past_due=APIHelper.SKIP):
        """Constructor for the CreateBoletoPaymentRequest class"""

        # Initialize members of the class
        self.retries = retries 
        self.bank = bank 
        self.instructions = instructions 
        if due_at is not APIHelper.SKIP:
            self.due_at = APIHelper.RFC3339DateTime(due_at) if due_at else None 
        self.billing_address = billing_address 
        self.billing_address_id = billing_address_id 
        if nosso_numero is not APIHelper.SKIP:
            self.nosso_numero = nosso_numero 
        self.document_number = document_number 
        self.statement_descriptor = statement_descriptor 
        if interest is not APIHelper.SKIP:
            self.interest = interest 
        if fine is not APIHelper.SKIP:
            self.fine = fine 
        if max_days_to_pay_past_due is not APIHelper.SKIP:
            self.max_days_to_pay_past_due = max_days_to_pay_past_due 

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

        retries = dictionary.get("retries") if dictionary.get("retries") else None
        bank = dictionary.get("bank") if dictionary.get("bank") else None
        instructions = dictionary.get("instructions") if dictionary.get("instructions") else None
        billing_address = CreateAddressRequest.from_dictionary(dictionary.get('billing_address')) if dictionary.get('billing_address') else None
        billing_address_id = dictionary.get("billing_address_id") if dictionary.get("billing_address_id") else None
        document_number = dictionary.get("document_number") if dictionary.get("document_number") else None
        statement_descriptor = dictionary.get("statement_descriptor") if dictionary.get("statement_descriptor") else None
        due_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("due_at")).datetime if dictionary.get("due_at") else APIHelper.SKIP
        nosso_numero = dictionary.get("nosso_numero") if dictionary.get("nosso_numero") else APIHelper.SKIP
        interest = CreateInterestRequest.from_dictionary(dictionary.get('interest')) if 'interest' in dictionary.keys() else APIHelper.SKIP 
        fine = CreateFineRequest.from_dictionary(dictionary.get('fine')) if 'fine' in dictionary.keys() else APIHelper.SKIP 
        max_days_to_pay_past_due = dictionary.get("max_days_to_pay_past_due") if dictionary.get("max_days_to_pay_past_due") else APIHelper.SKIP
        # Return an object of this model
        return cls(retries,
                   bank,
                   instructions,
                   billing_address,
                   billing_address_id,
                   document_number,
                   statement_descriptor,
                   due_at,
                   nosso_numero,
                   interest,
                   fine,
                   max_days_to_pay_past_due)
