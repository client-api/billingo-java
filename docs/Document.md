

# Document

Document object representing your invoice. NOTE: partner property is deprecated. Please use document_partner instead.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The document&#39;s unique identifier. |  [optional] |
|**invoiceNumber** | **String** | The document&#39;s invoice number. |  [optional] |
|**type** | **DocumentType** |  |  [optional] |
|**cancelled** | **Boolean** |  |  [optional] |
|**blockId** | **Integer** | DocumentBlock&#39;s identifier. |  [optional] |
|**paymentStatus** | **PaymentStatus** |  |  [optional] |
|**paymentMethod** | **PaymentMethod** |  |  [optional] |
|**grossTotal** | **Float** | The document&#39;s gross total price. |  [optional] |
|**currency** | **Currency** |  |  [optional] |
|**conversionRate** | **Float** |  |  [optional] |
|**invoiceDate** | **LocalDate** |  |  [optional] |
|**fulfillmentDate** | **LocalDate** |  |  [optional] |
|**dueDate** | **LocalDate** |  |  [optional] |
|**paidDate** | **LocalDate** |  |  [optional] |
|**organization** | [**DocumentOrganization**](DocumentOrganization.md) |  |  [optional] |
|**partner** | [**Partner**](Partner.md) |  |  [optional] |
|**documentPartner** | [**DocumentPartner**](DocumentPartner.md) |  |  [optional] |
|**electronic** | **Boolean** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**notificationStatus** | **DocumentNotificationStatus** |  |  [optional] |
|**language** | **DocumentLanguage** |  |  [optional] |
|**items** | [**List&lt;DocumentItem&gt;**](DocumentItem.md) |  |  [optional] |
|**summary** | [**DocumentSummary**](DocumentSummary.md) |  |  [optional] |
|**settings** | [**DocumentSettings**](DocumentSettings.md) |  |  [optional] |
|**onlineSzamlaStatus** | **OnlineSzamlaStatusEnum** |  |  [optional] |
|**relatedDocuments** | [**List&lt;DocumentAncestor&gt;**](DocumentAncestor.md) |  |  [optional] |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**correctionType** | **CorrectionType** |  |  [optional] |



