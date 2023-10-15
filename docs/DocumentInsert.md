

# DocumentInsert


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vendorId** | **String** |  |  [optional] |
|**partnerId** | **Integer** |  |  |
|**blockId** | **Integer** |  |  |
|**bankAccountId** | **Integer** |  |  [optional] |
|**type** | **DocumentInsertType** |  |  |
|**fulfillmentDate** | **LocalDate** |  |  |
|**dueDate** | **LocalDate** |  |  |
|**paymentMethod** | **PaymentMethod** |  |  |
|**language** | **DocumentLanguage** |  |  |
|**currency** | **Currency** |  |  |
|**conversionRate** | **Float** |  |  [optional] |
|**electronic** | **Boolean** |  |  [optional] |
|**paid** | **Boolean** |  |  [optional] |
|**items** | [**List&lt;DocumentInsertItemsInner&gt;**](DocumentInsertItemsInner.md) |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**settings** | [**DocumentSettings**](DocumentSettings.md) |  |  [optional] |
|**advanceInvoice** | **List&lt;Integer&gt;** |  |  [optional] |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**instantPayment** | **Boolean** |  |  [optional] |



