
# List Access Tokens Response

Response object for listing access tokens

## Structure

`ListAccessTokensResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetAccessTokenResponse>`](../../doc/models/get-access-token-response.md) | Required | The access token objects | List<GetAccessTokenResponse> getData() | setData(List<GetAccessTokenResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Required | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id5",
      "code": "code3",
      "status": "status7",
      "created_at": "2016-03-13T12:52:32.123Z",
      "customer": null
    },
    {
      "id": "id6",
      "code": "code4",
      "status": "status8",
      "created_at": "2016-03-13T12:52:32.123Z",
      "customer": null
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

