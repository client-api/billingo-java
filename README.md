# billingo-client

Billingo API v3
- API version: 3.0.14
  - Build date: 2023-10-15T09:59:06.459642900+02:00[Europe/Budapest]

This is a Billingo API v3 documentation. Our API based on REST software architectural style. API has resource-oriented URLs, accepts JSON-encoded request bodies and returns JSON-encoded responses. To use this API you have to generate a new API key on our [site](https://app.billingo.hu/api-key). After that, you can test your API key on this page.

  For more information, please visit [https://www.billingo.hu/kapcsolat](https://www.billingo.hu/kapcsolat)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.clientapi</groupId>
  <artifactId>billingo-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'billingo-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'billingo-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.clientapi:billingo-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/billingo-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.clientapi.billingo.invoker.ApiClient;
import com.clientapi.billingo.invoker.ApiException;
import com.clientapi.billingo.invoker.Configuration;
import com.clientapi.billingo.invoker.auth.*;
import com.clientapi.billingo.invoker.models.*;
import com.clientapi.billingo.api.BankAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.billingo.hu/v3");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    BankAccountApi apiInstance = new BankAccountApi(defaultClient);
    BankAccount bankAccount = new BankAccount(); // BankAccount | BankAccount object that you would like to store.
    try {
      BankAccount result = apiInstance.createBankAccount(bankAccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountApi#createBankAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.billingo.hu/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BankAccountApi* | [**createBankAccount**](docs/BankAccountApi.md#createBankAccount) | **POST** /bank-accounts | Create a bank account
*BankAccountApi* | [**deleteBankAccount**](docs/BankAccountApi.md#deleteBankAccount) | **DELETE** /bank-accounts/{id} | Delete a bank account
*BankAccountApi* | [**getBankAccount**](docs/BankAccountApi.md#getBankAccount) | **GET** /bank-accounts/{id} | Retrieve a bank account
*BankAccountApi* | [**listBankAccount**](docs/BankAccountApi.md#listBankAccount) | **GET** /bank-accounts | List all bank account
*BankAccountApi* | [**updateBankAccount**](docs/BankAccountApi.md#updateBankAccount) | **PUT** /bank-accounts/{id} | Update a bank account
*CurrencyApi* | [**getConversionRate**](docs/CurrencyApi.md#getConversionRate) | **GET** /currencies | Get currencies exchange rate.
*DocumentApi* | [**archiveDocument**](docs/DocumentApi.md#archiveDocument) | **PUT** /documents/{id}/archive | Archive a proforma document.
*DocumentApi* | [**cancelDocument**](docs/DocumentApi.md#cancelDocument) | **POST** /documents/{id}/cancel | Cancel a document
*DocumentApi* | [**createDocument**](docs/DocumentApi.md#createDocument) | **POST** /documents | Create a document
*DocumentApi* | [**createDocumentFromDraft**](docs/DocumentApi.md#createDocumentFromDraft) | **PUT** /documents/{id} | Converts a draft to an invoice.
*DocumentApi* | [**createDocumentFromProforma**](docs/DocumentApi.md#createDocumentFromProforma) | **POST** /documents/{id}/create-from-proforma | Create a document from proforma.
*DocumentApi* | [**createModificationDocument**](docs/DocumentApi.md#createModificationDocument) | **POST** /documents/{id}/create-modification-document | Create a modification document.
*DocumentApi* | [**createReceipt**](docs/DocumentApi.md#createReceipt) | **POST** /documents/receipt | Create a receipt
*DocumentApi* | [**createReceiptFromDraft**](docs/DocumentApi.md#createReceiptFromDraft) | **PUT** /documents/receipt/{id} | Converts a draft to a receipt.
*DocumentApi* | [**deleteDocument**](docs/DocumentApi.md#deleteDocument) | **DELETE** /documents/{id} | Delete a draft.
*DocumentApi* | [**deletePayment**](docs/DocumentApi.md#deletePayment) | **DELETE** /documents/{id}/payments | Delete all payment history on document
*DocumentApi* | [**documentCopy**](docs/DocumentApi.md#documentCopy) | **POST** /documents/{id}/copy | Copy a document
*DocumentApi* | [**downloadDocument**](docs/DocumentApi.md#downloadDocument) | **GET** /documents/{id}/download | Download a document in PDF format.
*DocumentApi* | [**getDocument**](docs/DocumentApi.md#getDocument) | **GET** /documents/{id} | Retrieve a document
*DocumentApi* | [**getDocumentByVendorId**](docs/DocumentApi.md#getDocumentByVendorId) | **GET** /documents/vendor/{vendor_id} | Retrieve a document by vendor id
*DocumentApi* | [**getOnlineSzamlaStatus**](docs/DocumentApi.md#getOnlineSzamlaStatus) | **GET** /documents/{id}/online-szamla | Retrieve a document Online Számla status
*DocumentApi* | [**getPayment**](docs/DocumentApi.md#getPayment) | **GET** /documents/{id}/payments | Retrieve a payment histroy
*DocumentApi* | [**getPublicUrl**](docs/DocumentApi.md#getPublicUrl) | **GET** /documents/{id}/public-url | Retrieve a document download public url.
*DocumentApi* | [**listDocument**](docs/DocumentApi.md#listDocument) | **GET** /documents | List all documents
*DocumentApi* | [**posPrint**](docs/DocumentApi.md#posPrint) | **GET** /documents/{id}/print/pos | Returns a printable POS PDF
*DocumentApi* | [**sendDocument**](docs/DocumentApi.md#sendDocument) | **POST** /documents/{id}/send | Send invoice to given email adresses.
*DocumentApi* | [**updatePayment**](docs/DocumentApi.md#updatePayment) | **PUT** /documents/{id}/payments | Update payment history
*DocumentBlockApi* | [**listDocumentBlock**](docs/DocumentBlockApi.md#listDocumentBlock) | **GET** /document-blocks | List all document blocks
*DocumentExportApi* | [**create**](docs/DocumentExportApi.md#create) | **POST** /document-export | Create document export.
*DocumentExportApi* | [**download**](docs/DocumentExportApi.md#download) | **GET** /document-export/{id}/download | Return exported binary file.
*DocumentExportApi* | [**poll**](docs/DocumentExportApi.md#poll) | **GET** /document-export/{id}/poll | Retrieve export state.
*OrganizationApi* | [**getOrganizationData**](docs/OrganizationApi.md#getOrganizationData) | **GET** /organization | Retrieve a organization data.
*PartnerApi* | [**createPartner**](docs/PartnerApi.md#createPartner) | **POST** /partners | Create a partner
*PartnerApi* | [**deletePartner**](docs/PartnerApi.md#deletePartner) | **DELETE** /partners/{id} | Delete a partner
*PartnerApi* | [**getPartner**](docs/PartnerApi.md#getPartner) | **GET** /partners/{id} | Retrieve a partner
*PartnerApi* | [**listPartner**](docs/PartnerApi.md#listPartner) | **GET** /partners | List all partners
*PartnerApi* | [**updatePartner**](docs/PartnerApi.md#updatePartner) | **PUT** /partners/{id} | Update a partner
*ProductApi* | [**createProduct**](docs/ProductApi.md#createProduct) | **POST** /products | Create a product
*ProductApi* | [**deleteProduct**](docs/ProductApi.md#deleteProduct) | **DELETE** /products/{id} | Delete a product
*ProductApi* | [**getProduct**](docs/ProductApi.md#getProduct) | **GET** /products/{id} | Retrieve a product
*ProductApi* | [**listProduct**](docs/ProductApi.md#listProduct) | **GET** /products | List all product
*ProductApi* | [**updateProduct**](docs/ProductApi.md#updateProduct) | **PUT** /products/{id} | Update a product
*SpendingApi* | [**spendingDelete**](docs/SpendingApi.md#spendingDelete) | **DELETE** /spendings/{id} | Deletes a spending.
*SpendingApi* | [**spendingList**](docs/SpendingApi.md#spendingList) | **GET** /spendings | Lists all spending
*SpendingApi* | [**spendingSave**](docs/SpendingApi.md#spendingSave) | **POST** /spendings | Creates a new spending.
*SpendingApi* | [**spendingShow**](docs/SpendingApi.md#spendingShow) | **GET** /spendings/{id} | Retrieves one specific spending.
*SpendingApi* | [**spendingUpdate**](docs/SpendingApi.md#spendingUpdate) | **PUT** /spendings/{id} | Updates a spending item.
*UtilApi* | [**checkTaxNumber**](docs/UtilApi.md#checkTaxNumber) | **GET** /utils/check-tax-number/{tax_number} | Check tax number.
*UtilApi* | [**getId**](docs/UtilApi.md#getId) | **GET** /utils/convert-legacy-id/{id} | Convert legacy ID to v3 ID.
*UtilApi* | [**getServerTime**](docs/UtilApi.md#getServerTime) | **GET** /utils/time | Get the server time


## Documentation for Models

 - [Address](docs/Address.md)
 - [BankAccount](docs/BankAccount.md)
 - [BankAccountList](docs/BankAccountList.md)
 - [Category](docs/Category.md)
 - [CheckTaxNumberMessage](docs/CheckTaxNumberMessage.md)
 - [ClientError](docs/ClientError.md)
 - [ClientErrorResponse](docs/ClientErrorResponse.md)
 - [ConversationRate](docs/ConversationRate.md)
 - [CorrectionType](docs/CorrectionType.md)
 - [Country](docs/Country.md)
 - [CreateDocumentExport](docs/CreateDocumentExport.md)
 - [Currency](docs/Currency.md)
 - [DateType](docs/DateType.md)
 - [Discount](docs/Discount.md)
 - [DiscountType](docs/DiscountType.md)
 - [Document](docs/Document.md)
 - [DocumentAncestor](docs/DocumentAncestor.md)
 - [DocumentBankAccount](docs/DocumentBankAccount.md)
 - [DocumentBlock](docs/DocumentBlock.md)
 - [DocumentBlockList](docs/DocumentBlockList.md)
 - [DocumentBlockType](docs/DocumentBlockType.md)
 - [DocumentCancellation](docs/DocumentCancellation.md)
 - [DocumentExportFilterExtra](docs/DocumentExportFilterExtra.md)
 - [DocumentExportId](docs/DocumentExportId.md)
 - [DocumentExportOtherOptions](docs/DocumentExportOtherOptions.md)
 - [DocumentExportQueryType](docs/DocumentExportQueryType.md)
 - [DocumentExportSortBy](docs/DocumentExportSortBy.md)
 - [DocumentExportStatus](docs/DocumentExportStatus.md)
 - [DocumentExportStatusState](docs/DocumentExportStatusState.md)
 - [DocumentExportType](docs/DocumentExportType.md)
 - [DocumentForm](docs/DocumentForm.md)
 - [DocumentFormat](docs/DocumentFormat.md)
 - [DocumentInsert](docs/DocumentInsert.md)
 - [DocumentInsertItemsInner](docs/DocumentInsertItemsInner.md)
 - [DocumentInsertType](docs/DocumentInsertType.md)
 - [DocumentItem](docs/DocumentItem.md)
 - [DocumentItemData](docs/DocumentItemData.md)
 - [DocumentLanguage](docs/DocumentLanguage.md)
 - [DocumentList](docs/DocumentList.md)
 - [DocumentNotificationStatus](docs/DocumentNotificationStatus.md)
 - [DocumentOrganization](docs/DocumentOrganization.md)
 - [DocumentPartner](docs/DocumentPartner.md)
 - [DocumentProductData](docs/DocumentProductData.md)
 - [DocumentPublicUrl](docs/DocumentPublicUrl.md)
 - [DocumentSettings](docs/DocumentSettings.md)
 - [DocumentSummary](docs/DocumentSummary.md)
 - [DocumentType](docs/DocumentType.md)
 - [DocumentVatRateSummary](docs/DocumentVatRateSummary.md)
 - [Entitlement](docs/Entitlement.md)
 - [Feature](docs/Feature.md)
 - [Id](docs/Id.md)
 - [InvoiceSettings](docs/InvoiceSettings.md)
 - [LedgerNumberInformation](docs/LedgerNumberInformation.md)
 - [ModificationDocumentInsert](docs/ModificationDocumentInsert.md)
 - [OnlinePayment](docs/OnlinePayment.md)
 - [OnlineSzamlaStatus](docs/OnlineSzamlaStatus.md)
 - [OnlineSzamlaStatusEnum](docs/OnlineSzamlaStatusEnum.md)
 - [OnlineSzamlaStatusMessage](docs/OnlineSzamlaStatusMessage.md)
 - [OrganizationData](docs/OrganizationData.md)
 - [Partner](docs/Partner.md)
 - [PartnerCustomBillingSettings](docs/PartnerCustomBillingSettings.md)
 - [PartnerList](docs/PartnerList.md)
 - [PartnerTaxType](docs/PartnerTaxType.md)
 - [PaymentHistory](docs/PaymentHistory.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentStatus](docs/PaymentStatus.md)
 - [PaymentStatusSpending](docs/PaymentStatusSpending.md)
 - [Product](docs/Product.md)
 - [ProductList](docs/ProductList.md)
 - [ReceiptInsert](docs/ReceiptInsert.md)
 - [ReceiptInsertItemsInner](docs/ReceiptInsertItemsInner.md)
 - [ReceiptItemData](docs/ReceiptItemData.md)
 - [ReceiptProductData](docs/ReceiptProductData.md)
 - [Round](docs/Round.md)
 - [SendDocument](docs/SendDocument.md)
 - [ServerError](docs/ServerError.md)
 - [ServerErrorResponse](docs/ServerErrorResponse.md)
 - [ServerTime](docs/ServerTime.md)
 - [Source](docs/Source.md)
 - [Spending](docs/Spending.md)
 - [SpendingList](docs/SpendingList.md)
 - [SpendingListItem](docs/SpendingListItem.md)
 - [SpendingPartner](docs/SpendingPartner.md)
 - [SpendingPaymentMethod](docs/SpendingPaymentMethod.md)
 - [SpendingSave](docs/SpendingSave.md)
 - [Subscription](docs/Subscription.md)
 - [SubscriptionErrorResponse](docs/SubscriptionErrorResponse.md)
 - [TaxNumber](docs/TaxNumber.md)
 - [TooManyRequestsResponse](docs/TooManyRequestsResponse.md)
 - [UnitPriceType](docs/UnitPriceType.md)
 - [ValidationError](docs/ValidationError.md)
 - [ValidationErrorResponse](docs/ValidationErrorResponse.md)
 - [Vat](docs/Vat.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="api_key"></a>
### api_key

- **Type**: API key
- **API key parameter name**: X-API-KEY
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hello@billingo.hu

