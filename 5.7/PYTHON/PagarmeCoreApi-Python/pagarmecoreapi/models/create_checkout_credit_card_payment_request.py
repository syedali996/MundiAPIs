# -*- coding: utf-8 -*-

"""
pagarmecoreapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from pagarmecoreapi.api_helper import APIHelper
from pagarmecoreapi.models.create_checkout_card_installment_option_request import CreateCheckoutCardInstallmentOptionRequest
from pagarmecoreapi.models.create_payment_authentication_request import CreatePaymentAuthenticationRequest


class CreateCheckoutCreditCardPaymentRequest(object):

    """Implementation of the 'CreateCheckoutCreditCardPaymentRequest' model.

    Checkout card payment request

    Attributes:
        statement_descriptor (string): Card invoice text descriptor
        installments (list of CreateCheckoutCardInstallmentOptionRequest):
            Payment installment options
        authentication (CreatePaymentAuthenticationRequest): Creates payment
            authentication
        capture (bool): Authorize and capture?

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "statement_descriptor": 'statement_descriptor',
        "installments": 'installments',
        "authentication": 'authentication',
        "capture": 'capture'
    }

    _optionals = [
        'statement_descriptor',
        'installments',
        'authentication',
        'capture',
    ]

    def __init__(self,
                 statement_descriptor=APIHelper.SKIP,
                 installments=APIHelper.SKIP,
                 authentication=APIHelper.SKIP,
                 capture=APIHelper.SKIP):
        """Constructor for the CreateCheckoutCreditCardPaymentRequest class"""

        # Initialize members of the class
        if statement_descriptor is not APIHelper.SKIP:
            self.statement_descriptor = statement_descriptor 
        if installments is not APIHelper.SKIP:
            self.installments = installments 
        if authentication is not APIHelper.SKIP:
            self.authentication = authentication 
        if capture is not APIHelper.SKIP:
            self.capture = capture 

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

        statement_descriptor = dictionary.get("statement_descriptor") if dictionary.get("statement_descriptor") else APIHelper.SKIP
        installments = None
        if dictionary.get('installments') is not None:
            installments = [CreateCheckoutCardInstallmentOptionRequest.from_dictionary(x) for x in dictionary.get('installments')]
        else:
            installments = APIHelper.SKIP
        authentication = CreatePaymentAuthenticationRequest.from_dictionary(dictionary.get('authentication')) if 'authentication' in dictionary.keys() else APIHelper.SKIP 
        capture = dictionary.get("capture") if "capture" in dictionary.keys() else APIHelper.SKIP
        # Return an object of this model
        return cls(statement_descriptor,
                   installments,
                   authentication,
                   capture)
