# DocumentBlockApi

All URIs are relative to *https://api.billingo.hu/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listDocumentBlock**](DocumentBlockApi.md#listDocumentBlock) | **GET** /document-blocks | List all document blocks |


<a id="listDocumentBlock"></a>
# **listDocumentBlock**
> DocumentBlockList listDocumentBlock(page, perPage, type)

List all document blocks

Returns a list of your document blocks. The document blocks are returned sorted by creation date, with the most recent document blocks appearing first.

### Example
```java
// Import classes:
import com.clientapi.billingo.invoker.ApiClient;
import com.clientapi.billingo.invoker.ApiException;
import com.clientapi.billingo.invoker.Configuration;
import com.clientapi.billingo.invoker.auth.*;
import com.clientapi.billingo.invoker.models.*;
import com.clientapi.billingo.api.DocumentBlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.billingo.hu/v3");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    DocumentBlockApi apiInstance = new DocumentBlockApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer perPage = 25; // Integer | 
    DocumentBlockType type = DocumentBlockType.fromValue("certificate_of_completion"); // DocumentBlockType | Filter document blocks by type
    try {
      DocumentBlockList result = apiInstance.listDocumentBlock(page, perPage, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentBlockApi#listDocumentBlock");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] [default to 25] |
| **type** | [**DocumentBlockType**](.md)| Filter document blocks by type | [optional] [enum: certificate_of_completion, dossier, invoice, offer, order_form, receipt, waybill] |

### Return type

[**DocumentBlockList**](DocumentBlockList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |
| **400** | The request is malformed. |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |
| **401** | Authorization information is missing or invalid. |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |
| **402** | Authenticated user doesn&#39;t have subscription. |  -  |
| **422** | Validation errors occured. |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |
| **429** | Too many requests |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |
| **500** | Internal server error. |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |

