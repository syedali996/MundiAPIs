# -*- coding: utf-8 -*-

"""
mundiapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from mundiapi.api_helper import APIHelper
from mundiapi.models.get_address_response import GetAddressResponse
from mundiapi.models.get_checkout_bank_transfer_payment_response import GetCheckoutBankTransferPaymentResponse
from mundiapi.models.get_checkout_boleto_payment_response import GetCheckoutBoletoPaymentResponse
from mundiapi.models.get_checkout_credit_card_payment_response import GetCheckoutCreditCardPaymentResponse
from mundiapi.models.get_checkout_debit_card_payment_response import GetCheckoutDebitCardPaymentResponse
from mundiapi.models.get_customer_response import GetCustomerResponse
from mundiapi.models.get_shipping_response import GetShippingResponse


class GetCheckoutPaymentResponse(object):

    """Implementation of the 'GetCheckoutPaymentResponse' model.

    Resposta das configurações de pagamento do checkout

    Attributes:
        id (string): TODO: type description here.
        amount (int): Valor em centavos
        default_payment_method (string): Meio de pagamento padrão no checkout
        success_url (string): Url de redirecionamento de sucesso após o
            checkou
        payment_url (string): Url para pagamento usando o checkout
        gateway_affiliation_id (string): Código da afiliação onde o pagamento
            será processado no gateway
        accepted_payment_methods (list of string): Meios de pagamento aceitos
            no checkout
        status (string): Status do checkout
        skip_checkout_success_page (bool): Pular tela de sucesso
            pós-pagamento?
        created_at (datetime): Data de criação
        updated_at (datetime): Data de atualização
        canceled_at (datetime): Data de cancelamento
        customer_editable (bool): Torna o objeto customer editável
        customer (GetCustomerResponse): Dados do comprador
        billingaddress (GetAddressResponse): Dados do endereço de cobrança
        credit_card (GetCheckoutCreditCardPaymentResponse): Configurações de
            cartão de crédito
        boleto (GetCheckoutBoletoPaymentResponse): Configurações de boleto
        billing_address_editable (bool): Indica se o billing address poderá
            ser editado
        shipping (GetShippingResponse): Configurações  de entrega
        shippable (bool): Indica se possui entrega
        closed_at (datetime): Data de fechamento
        expires_at (datetime): Data de expiração
        currency (string): Moeda
        debit_card (GetCheckoutDebitCardPaymentResponse): Configurações de
            cartão de débito
        bank_transfer (GetCheckoutBankTransferPaymentResponse): Bank transfer
            payment response
        accepted_brands (list of string): Accepted Brands

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "default_payment_method": 'default_payment_method',
        "success_url": 'success_url',
        "payment_url": 'payment_url',
        "gateway_affiliation_id": 'gateway_affiliation_id',
        "accepted_payment_methods": 'accepted_payment_methods',
        "status": 'status',
        "skip_checkout_success_page": 'skip_checkout_success_page',
        "created_at": 'created_at',
        "updated_at": 'updated_at',
        "customer_editable": 'customer_editable',
        "billingaddress": 'billingaddress',
        "credit_card": 'credit_card',
        "boleto": 'boleto',
        "billing_address_editable": 'billing_address_editable',
        "shipping": 'shipping',
        "shippable": 'shippable',
        "currency": 'currency',
        "accepted_brands": 'accepted_brands',
        "amount": 'amount',
        "canceled_at": 'canceled_at',
        "customer": 'customer',
        "closed_at": 'closed_at',
        "expires_at": 'expires_at',
        "debit_card": 'debit_card',
        "bank_transfer": 'bank_transfer'
    }

    _optionals = [
        'amount',
        'canceled_at',
        'customer',
        'closed_at',
        'expires_at',
        'debit_card',
        'bank_transfer',
    ]

    def __init__(self,
                 id=None,
                 default_payment_method=None,
                 success_url=None,
                 payment_url=None,
                 gateway_affiliation_id=None,
                 accepted_payment_methods=None,
                 status=None,
                 skip_checkout_success_page=None,
                 created_at=None,
                 updated_at=None,
                 customer_editable=None,
                 billingaddress=None,
                 credit_card=None,
                 boleto=None,
                 billing_address_editable=None,
                 shipping=None,
                 shippable=None,
                 currency=None,
                 accepted_brands=None,
                 amount=APIHelper.SKIP,
                 canceled_at=APIHelper.SKIP,
                 customer=APIHelper.SKIP,
                 closed_at=APIHelper.SKIP,
                 expires_at=APIHelper.SKIP,
                 debit_card=APIHelper.SKIP,
                 bank_transfer=APIHelper.SKIP):
        """Constructor for the GetCheckoutPaymentResponse class"""

        # Initialize members of the class
        self.id = id 
        if amount is not APIHelper.SKIP:
            self.amount = amount 
        self.default_payment_method = default_payment_method 
        self.success_url = success_url 
        self.payment_url = payment_url 
        self.gateway_affiliation_id = gateway_affiliation_id 
        self.accepted_payment_methods = accepted_payment_methods 
        self.status = status 
        self.skip_checkout_success_page = skip_checkout_success_page 
        self.created_at = APIHelper.RFC3339DateTime(created_at) if created_at else None 
        self.updated_at = APIHelper.RFC3339DateTime(updated_at) if updated_at else None 
        if canceled_at is not APIHelper.SKIP:
            self.canceled_at = APIHelper.RFC3339DateTime(canceled_at) if canceled_at else None 
        self.customer_editable = customer_editable 
        if customer is not APIHelper.SKIP:
            self.customer = customer 
        self.billingaddress = billingaddress 
        self.credit_card = credit_card 
        self.boleto = boleto 
        self.billing_address_editable = billing_address_editable 
        self.shipping = shipping 
        self.shippable = shippable 
        if closed_at is not APIHelper.SKIP:
            self.closed_at = APIHelper.RFC3339DateTime(closed_at) if closed_at else None 
        if expires_at is not APIHelper.SKIP:
            self.expires_at = APIHelper.RFC3339DateTime(expires_at) if expires_at else None 
        self.currency = currency 
        if debit_card is not APIHelper.SKIP:
            self.debit_card = debit_card 
        if bank_transfer is not APIHelper.SKIP:
            self.bank_transfer = bank_transfer 
        self.accepted_brands = accepted_brands 

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
        default_payment_method = dictionary.get("default_payment_method") if dictionary.get("default_payment_method") else None
        success_url = dictionary.get("success_url") if dictionary.get("success_url") else None
        payment_url = dictionary.get("payment_url") if dictionary.get("payment_url") else None
        gateway_affiliation_id = dictionary.get("gateway_affiliation_id") if dictionary.get("gateway_affiliation_id") else None
        accepted_payment_methods = dictionary.get("accepted_payment_methods") if dictionary.get("accepted_payment_methods") else None
        status = dictionary.get("status") if dictionary.get("status") else None
        skip_checkout_success_page = dictionary.get("skip_checkout_success_page") if "skip_checkout_success_page" in dictionary.keys() else None
        created_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("created_at")).datetime if dictionary.get("created_at") else None
        updated_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("updated_at")).datetime if dictionary.get("updated_at") else None
        customer_editable = dictionary.get("customer_editable") if "customer_editable" in dictionary.keys() else None
        billingaddress = GetAddressResponse.from_dictionary(dictionary.get('billingaddress')) if dictionary.get('billingaddress') else None
        credit_card = GetCheckoutCreditCardPaymentResponse.from_dictionary(dictionary.get('credit_card')) if dictionary.get('credit_card') else None
        boleto = GetCheckoutBoletoPaymentResponse.from_dictionary(dictionary.get('boleto')) if dictionary.get('boleto') else None
        billing_address_editable = dictionary.get("billing_address_editable") if "billing_address_editable" in dictionary.keys() else None
        shipping = GetShippingResponse.from_dictionary(dictionary.get('shipping')) if dictionary.get('shipping') else None
        shippable = dictionary.get("shippable") if "shippable" in dictionary.keys() else None
        currency = dictionary.get("currency") if dictionary.get("currency") else None
        accepted_brands = dictionary.get("accepted_brands") if dictionary.get("accepted_brands") else None
        amount = dictionary.get("amount") if dictionary.get("amount") else APIHelper.SKIP
        canceled_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("canceled_at")).datetime if dictionary.get("canceled_at") else APIHelper.SKIP
        customer = GetCustomerResponse.from_dictionary(dictionary.get('customer')) if 'customer' in dictionary.keys() else APIHelper.SKIP 
        closed_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("closed_at")).datetime if dictionary.get("closed_at") else APIHelper.SKIP
        expires_at = APIHelper.RFC3339DateTime.from_value(dictionary.get("expires_at")).datetime if dictionary.get("expires_at") else APIHelper.SKIP
        debit_card = GetCheckoutDebitCardPaymentResponse.from_dictionary(dictionary.get('debit_card')) if 'debit_card' in dictionary.keys() else APIHelper.SKIP 
        bank_transfer = GetCheckoutBankTransferPaymentResponse.from_dictionary(dictionary.get('bank_transfer')) if 'bank_transfer' in dictionary.keys() else APIHelper.SKIP 
        # Return an object of this model
        return cls(id,
                   default_payment_method,
                   success_url,
                   payment_url,
                   gateway_affiliation_id,
                   accepted_payment_methods,
                   status,
                   skip_checkout_success_page,
                   created_at,
                   updated_at,
                   customer_editable,
                   billingaddress,
                   credit_card,
                   boleto,
                   billing_address_editable,
                   shipping,
                   shippable,
                   currency,
                   accepted_brands,
                   amount,
                   canceled_at,
                   customer,
                   closed_at,
                   expires_at,
                   debit_card,
                   bank_transfer)
