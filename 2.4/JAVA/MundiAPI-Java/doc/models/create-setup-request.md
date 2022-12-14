
# Create Setup Request

Request for creating a Setup for a subscription. The setup is an order that will be created at the subscription creation.

## Structure

`CreateSetupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | Setup amount | int getAmount() | setAmount(int amount) |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Payment` | [`CreatePaymentRequest`](../../doc/models/create-payment-request.md) | Required | Payment data | CreatePaymentRequest getPayment() | setPayment(CreatePaymentRequest payment) |

## Example (as JSON)

```json
{
  "amount": 46,
  "description": "description0",
  "payment": {
    "payment_method": "payment_method4",
    "credit_card": null,
    "debit_card": null,
    "boleto": null,
    "currency": null,
    "voucher": null,
    "split": null,
    "bank_transfer": null,
    "gateway_affiliation_id": null,
    "amount": null,
    "checkout": null,
    "customer_id": null,
    "customer": null,
    "metadata": null,
    "cash": null,
    "private_label": {
      "installments": null,
      "statement_descriptor": null,
      "card": null,
      "card_id": null,
      "card_token": null,
      "recurrence": null,
      "capture": null,
      "extended_limit_enabled": null,
      "extended_limit_code": null,
      "recurrency_cycle": null
    },
    "pix": null
  }
}
```

