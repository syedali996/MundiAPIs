
# Get Invoice Item Response

Response object for getting an invoice item

## Structure

`GetInvoiceItemResponse`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `amount` | `int` | Required | - |
| `description` | `string` | Required | - |
| `pricing_scheme` | [`GetPricingSchemeResponse`](../../doc/models/get-pricing-scheme-response.md) | Required | - |
| `price_bracket` | [`GetPriceBracketResponse`](../../doc/models/get-price-bracket-response.md) | Required | - |
| `quantity` | `int` | Optional | - |
| `name` | `string` | Optional | - |
| `subscription_item_id` | `string` | Required | Subscription Item Id |

## Example (as JSON)

```json
{
  "amount": 46,
  "description": "description0",
  "pricing_scheme": {
    "price": 166,
    "scheme_type": "scheme_type8",
    "price_brackets": [
      {
        "start_quantity": 119,
        "price": 57,
        "end_quantity": null,
        "overage_price": null
      },
      {
        "start_quantity": 120,
        "price": 58,
        "end_quantity": null,
        "overage_price": null
      },
      {
        "start_quantity": 121,
        "price": 59,
        "end_quantity": null,
        "overage_price": null
      }
    ],
    "minimum_price": null,
    "percentage": null
  },
  "price_bracket": {
    "start_quantity": 164,
    "price": 154,
    "end_quantity": null,
    "overage_price": null
  },
  "quantity": null,
  "name": null,
  "subscription_item_id": "subscription_item_id4"
}
```

