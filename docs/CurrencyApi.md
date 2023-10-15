# CurrencyApi

All URIs are relative to *https://api.billingo.hu/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConversionRate**](CurrencyApi.md#getConversionRate) | **GET** /currencies | Get currencies exchange rate. |


<a id="getConversionRate"></a>
# **getConversionRate**
> ConversationRate getConversionRate(from, to, date)

Get currencies exchange rate.

Return with the exchange value of given currencies.

### Example
```java
// Import classes:
import com.clientapi.billingo.invoker.ApiClient;
import com.clientapi.billingo.invoker.ApiException;
import com.clientapi.billingo.invoker.Configuration;
import com.clientapi.billingo.invoker.auth.*;
import com.clientapi.billingo.invoker.models.*;
import com.clientapi.billingo.api.CurrencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.billingo.hu/v3");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    Currency from = Currency.fromValue("AED"); // Currency | 
    Currency to = Currency.fromValue("AED"); // Currency | 
    LocalDate date = LocalDate.now(); // LocalDate | 
    try {
      ConversationRate result = apiInstance.getConversionRate(from, to, date);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyApi#getConversionRate");
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
| **from** | [**Currency**](.md)|  | [enum: AED, AUD, BGN, BRL, CAD, CHF, CNY, CZK, DKK, EUR, GBP, HKD, HRK, HUF, IDR, ILS, INR, ISK, JPY, KRW, MXN, MYR, NOK, NZD, PHP, PLN, RON, RSD, RUB, SEK, SGD, THB, TRY, UAH, USD, ZAR] |
| **to** | [**Currency**](.md)|  | [enum: AED, AUD, BGN, BRL, CAD, CHF, CNY, CZK, DKK, EUR, GBP, HKD, HRK, HUF, IDR, ILS, INR, ISK, JPY, KRW, MXN, MYR, NOK, NZD, PHP, PLN, RON, RSD, RUB, SEK, SGD, THB, TRY, UAH, USD, ZAR] |
| **date** | **LocalDate**|  | [optional] |

### Return type

[**ConversationRate**](ConversationRate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Currencies exchange rate returned. |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |
| **400** | The request is malformed. |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |
| **401** | Authorization information is missing or invalid. |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |
| **402** | Authenticated user doesn&#39;t have subscription. |  -  |
| **422** | Validation errors occured. |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |
| **429** | Too many requests |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |
| **500** | Internal server error. |  * X-RateLimit-Limit - Request limit per minute. <br>  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  * X-RateLimit-Reset - The timestamp at which the current rate limit window resets. <br>  * Retry-After - How many seconds you have to wait before making new request. <br>  |

