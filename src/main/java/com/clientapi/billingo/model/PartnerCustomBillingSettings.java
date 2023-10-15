/*
 * Billingo API v3
 * This is a Billingo API v3 documentation. Our API based on REST software architectural style. API has resource-oriented URLs, accepts JSON-encoded request bodies and returns JSON-encoded responses. To use this API you have to generate a new API key on our [site](https://app.billingo.hu/api-key). After that, you can test your API key on this page.
 *
 * The version of the OpenAPI document: 3.0.14
 * Contact: hello@billingo.hu
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.clientapi.billingo.model;

import java.util.Objects;
import com.clientapi.billingo.model.Currency;
import com.clientapi.billingo.model.Discount;
import com.clientapi.billingo.model.DocumentForm;
import com.clientapi.billingo.model.DocumentLanguage;
import com.clientapi.billingo.model.PaymentMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.clientapi.billingo.invoker.JSON;

/**
 * PartnerCustomBillingSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-15T09:59:06.459642900+02:00[Europe/Budapest]")
public class PartnerCustomBillingSettings {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_DOCUMENT_FORM = "document_form";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_FORM)
  private DocumentForm documentForm;

  public static final String SERIALIZED_NAME_DUE_DAYS = "due_days";
  @SerializedName(SERIALIZED_NAME_DUE_DAYS)
  private Integer dueDays;

  public static final String SERIALIZED_NAME_DOCUMENT_CURRENCY = "document_currency";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_CURRENCY)
  private Currency documentCurrency;

  public static final String SERIALIZED_NAME_TEMPLATE_LANGUAGE_CODE = "template_language_code";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_LANGUAGE_CODE)
  private DocumentLanguage templateLanguageCode;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Discount discount;

  public PartnerCustomBillingSettings() {
  }

  public PartnerCustomBillingSettings paymentMethod(PaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PartnerCustomBillingSettings documentForm(DocumentForm documentForm) {
    
    this.documentForm = documentForm;
    return this;
  }

   /**
   * Get documentForm
   * @return documentForm
  **/
  @javax.annotation.Nullable
  public DocumentForm getDocumentForm() {
    return documentForm;
  }


  public void setDocumentForm(DocumentForm documentForm) {
    this.documentForm = documentForm;
  }


  public PartnerCustomBillingSettings dueDays(Integer dueDays) {
    
    this.dueDays = dueDays;
    return this;
  }

   /**
   * Get dueDays
   * @return dueDays
  **/
  @javax.annotation.Nullable
  public Integer getDueDays() {
    return dueDays;
  }


  public void setDueDays(Integer dueDays) {
    this.dueDays = dueDays;
  }


  public PartnerCustomBillingSettings documentCurrency(Currency documentCurrency) {
    
    this.documentCurrency = documentCurrency;
    return this;
  }

   /**
   * Get documentCurrency
   * @return documentCurrency
  **/
  @javax.annotation.Nullable
  public Currency getDocumentCurrency() {
    return documentCurrency;
  }


  public void setDocumentCurrency(Currency documentCurrency) {
    this.documentCurrency = documentCurrency;
  }


  public PartnerCustomBillingSettings templateLanguageCode(DocumentLanguage templateLanguageCode) {
    
    this.templateLanguageCode = templateLanguageCode;
    return this;
  }

   /**
   * Get templateLanguageCode
   * @return templateLanguageCode
  **/
  @javax.annotation.Nullable
  public DocumentLanguage getTemplateLanguageCode() {
    return templateLanguageCode;
  }


  public void setTemplateLanguageCode(DocumentLanguage templateLanguageCode) {
    this.templateLanguageCode = templateLanguageCode;
  }


  public PartnerCustomBillingSettings discount(Discount discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  public Discount getDiscount() {
    return discount;
  }


  public void setDiscount(Discount discount) {
    this.discount = discount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerCustomBillingSettings partnerCustomBillingSettings = (PartnerCustomBillingSettings) o;
    return Objects.equals(this.paymentMethod, partnerCustomBillingSettings.paymentMethod) &&
        Objects.equals(this.documentForm, partnerCustomBillingSettings.documentForm) &&
        Objects.equals(this.dueDays, partnerCustomBillingSettings.dueDays) &&
        Objects.equals(this.documentCurrency, partnerCustomBillingSettings.documentCurrency) &&
        Objects.equals(this.templateLanguageCode, partnerCustomBillingSettings.templateLanguageCode) &&
        Objects.equals(this.discount, partnerCustomBillingSettings.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, documentForm, dueDays, documentCurrency, templateLanguageCode, discount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerCustomBillingSettings {\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    documentForm: ").append(toIndentedString(documentForm)).append("\n");
    sb.append("    dueDays: ").append(toIndentedString(dueDays)).append("\n");
    sb.append("    documentCurrency: ").append(toIndentedString(documentCurrency)).append("\n");
    sb.append("    templateLanguageCode: ").append(toIndentedString(templateLanguageCode)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("payment_method");
    openapiFields.add("document_form");
    openapiFields.add("due_days");
    openapiFields.add("document_currency");
    openapiFields.add("template_language_code");
    openapiFields.add("discount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PartnerCustomBillingSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PartnerCustomBillingSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartnerCustomBillingSettings is not found in the empty JSON string", PartnerCustomBillingSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PartnerCustomBillingSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartnerCustomBillingSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `discount`
      if (jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonNull()) {
        Discount.validateJsonElement(jsonObj.get("discount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartnerCustomBillingSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartnerCustomBillingSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartnerCustomBillingSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartnerCustomBillingSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<PartnerCustomBillingSettings>() {
           @Override
           public void write(JsonWriter out, PartnerCustomBillingSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartnerCustomBillingSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PartnerCustomBillingSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartnerCustomBillingSettings
  * @throws IOException if the JSON string is invalid with respect to PartnerCustomBillingSettings
  */
  public static PartnerCustomBillingSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartnerCustomBillingSettings.class);
  }

 /**
  * Convert an instance of PartnerCustomBillingSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

