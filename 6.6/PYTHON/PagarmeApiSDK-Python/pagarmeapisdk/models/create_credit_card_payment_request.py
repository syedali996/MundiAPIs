# -*- coding: utf-8 -*-

"""
pagarmeapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmeapisdk.api_helper import APIHelper
from pagarmeapisdk.models.create_card_payment_contactless_request import CreateCardPaymentContactlessRequest
from pagarmeapisdk.models.create_card_request import CreateCardRequest
from pagarmeapisdk.models.create_payment_authentication_request import CreatePaymentAuthenticationRequest


class CreateCreditCardPaymentRequest(object):

    """Implementation of the 'CreateCreditCardPaymentRequest' model.

    The settings for creating a credit card payment

    Attributes:
        installments (int): Number of installments
        statement_descriptor (string): The text that will be shown on the
            credit card's statement
        card (CreateCardRequest): Credit card data
        card_id (string): The credit card id
        card_token (string): TODO: type description here.
        recurrence (bool): Indicates a recurrence
        capture (bool): Indicates if the operation should be only
            authorization or auth and capture.
        extended_limit_enabled (bool): Indicates whether the extended label
            (private label) is enabled
        extended_limit_code (string): Extended Limit Code
        merchant_category_code (long|int): Customer business segment code
        authentication (CreatePaymentAuthenticationRequest): The payment
            authentication request
        contactless (CreateCardPaymentContactlessRequest): The Credit card
            payment contactless request
        auto_recovery (bool): Indicates whether a particular payment will
            enter the offline retry flow
        operation_type (string): AuthOnly, AuthAndCapture, PreAuth
        recurrency_cycle (string): Defines whether the card has been used one
            or more times.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "installments": 'installments',
        "statement_descriptor": 'statement_descriptor',
        "card": 'card',
        "card_id": 'card_id',
        "card_token": 'card_token',
        "recurrence": 'recurrence',
        "capture": 'capture',
        "extended_limit_enabled": 'extended_limit_enabled',
        "extended_limit_code": 'extended_limit_code',
        "merchant_category_code": 'merchant_category_code',
        "authentication": 'authentication',
        "contactless": 'contactless',
        "auto_recovery": 'auto_recovery',
        "operation_type": 'operation_type',
        "recurrency_cycle": 'recurrency_cycle'
    }

    _optionals = [
        'installments',
        'statement_descriptor',
        'card',
        'card_id',
        'card_token',
        'recurrence',
        'capture',
        'extended_limit_enabled',
        'extended_limit_code',
        'merchant_category_code',
        'authentication',
        'contactless',
        'auto_recovery',
        'operation_type',
        'recurrency_cycle',
    ]

    def __init__(self,
                 installments=1,
                 statement_descriptor=APIHelper.SKIP,
                 card=APIHelper.SKIP,
                 card_id=APIHelper.SKIP,
                 card_token=APIHelper.SKIP,
                 recurrence=APIHelper.SKIP,
                 capture=True,
                 extended_limit_enabled=APIHelper.SKIP,
                 extended_limit_code=APIHelper.SKIP,
                 merchant_category_code=APIHelper.SKIP,
                 authentication=APIHelper.SKIP,
                 contactless=APIHelper.SKIP,
                 auto_recovery=APIHelper.SKIP,
                 operation_type=APIHelper.SKIP,
                 recurrency_cycle=APIHelper.SKIP):
        """Constructor for the CreateCreditCardPaymentRequest class"""

        # Initialize members of the class
        self.installments = installments 
        if statement_descriptor is not APIHelper.SKIP:
            self.statement_descriptor = statement_descriptor 
        if card is not APIHelper.SKIP:
            self.card = card 
        if card_id is not APIHelper.SKIP:
            self.card_id = card_id 
        if card_token is not APIHelper.SKIP:
            self.card_token = card_token 
        if recurrence is not APIHelper.SKIP:
            self.recurrence = recurrence 
        self.capture = capture 
        if extended_limit_enabled is not APIHelper.SKIP:
            self.extended_limit_enabled = extended_limit_enabled 
        if extended_limit_code is not APIHelper.SKIP:
            self.extended_limit_code = extended_limit_code 
        if merchant_category_code is not APIHelper.SKIP:
            self.merchant_category_code = merchant_category_code 
        if authentication is not APIHelper.SKIP:
            self.authentication = authentication 
        if contactless is not APIHelper.SKIP:
            self.contactless = contactless 
        if auto_recovery is not APIHelper.SKIP:
            self.auto_recovery = auto_recovery 
        if operation_type is not APIHelper.SKIP:
            self.operation_type = operation_type 
        if recurrency_cycle is not APIHelper.SKIP:
            self.recurrency_cycle = recurrency_cycle 

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

        installments = dictionary.get("installments") if dictionary.get("installments") else 1
        statement_descriptor = dictionary.get("statement_descriptor") if dictionary.get("statement_descriptor") else APIHelper.SKIP
        card = CreateCardRequest.from_dictionary(dictionary.get('card')) if 'card' in dictionary.keys() else APIHelper.SKIP 
        card_id = dictionary.get("card_id") if dictionary.get("card_id") else APIHelper.SKIP
        card_token = dictionary.get("card_token") if dictionary.get("card_token") else APIHelper.SKIP
        recurrence = dictionary.get("recurrence") if "recurrence" in dictionary.keys() else APIHelper.SKIP
        capture = dictionary.get("capture") if dictionary.get("capture") else True
        extended_limit_enabled = dictionary.get("extended_limit_enabled") if "extended_limit_enabled" in dictionary.keys() else APIHelper.SKIP
        extended_limit_code = dictionary.get("extended_limit_code") if dictionary.get("extended_limit_code") else APIHelper.SKIP
        merchant_category_code = dictionary.get("merchant_category_code") if dictionary.get("merchant_category_code") else APIHelper.SKIP
        authentication = CreatePaymentAuthenticationRequest.from_dictionary(dictionary.get('authentication')) if 'authentication' in dictionary.keys() else APIHelper.SKIP 
        contactless = CreateCardPaymentContactlessRequest.from_dictionary(dictionary.get('contactless')) if 'contactless' in dictionary.keys() else APIHelper.SKIP 
        auto_recovery = dictionary.get("auto_recovery") if "auto_recovery" in dictionary.keys() else APIHelper.SKIP
        operation_type = dictionary.get("operation_type") if dictionary.get("operation_type") else APIHelper.SKIP
        recurrency_cycle = dictionary.get("recurrency_cycle") if dictionary.get("recurrency_cycle") else APIHelper.SKIP
        # Return an object of this model
        return cls(installments,
                   statement_descriptor,
                   card,
                   card_id,
                   card_token,
                   recurrence,
                   capture,
                   extended_limit_enabled,
                   extended_limit_code,
                   merchant_category_code,
                   authentication,
                   contactless,
                   auto_recovery,
                   operation_type,
                   recurrency_cycle)
