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
import com.clientapi.billingo.model.DocumentVatRateSummary;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * DocumentSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-15T09:59:06.459642900+02:00[Europe/Budapest]")
public class DocumentSummary {
  public static final String SERIALIZED_NAME_NET_AMOUNT = "net_amount";
  @SerializedName(SERIALIZED_NAME_NET_AMOUNT)
  private Float netAmount;

  public static final String SERIALIZED_NAME_NET_AMOUNT_LOCAL = "net_amount_local";
  @SerializedName(SERIALIZED_NAME_NET_AMOUNT_LOCAL)
  private Float netAmountLocal;

  public static final String SERIALIZED_NAME_GROSS_AMOUNT_LOCAL = "gross_amount_local";
  @SerializedName(SERIALIZED_NAME_GROSS_AMOUNT_LOCAL)
  private Float grossAmountLocal;

  public static final String SERIALIZED_NAME_VAT_AMOUNT = "vat_amount";
  @SerializedName(SERIALIZED_NAME_VAT_AMOUNT)
  private Float vatAmount;

  public static final String SERIALIZED_NAME_VAT_AMOUNT_LOCAL = "vat_amount_local";
  @SerializedName(SERIALIZED_NAME_VAT_AMOUNT_LOCAL)
  private Float vatAmountLocal;

  public static final String SERIALIZED_NAME_VAT_RATE_SUMMARY = "vat_rate_summary";
  @SerializedName(SERIALIZED_NAME_VAT_RATE_SUMMARY)
  private List<DocumentVatRateSummary> vatRateSummary;

  public DocumentSummary() {
  }

  public DocumentSummary netAmount(Float netAmount) {
    
    this.netAmount = netAmount;
    return this;
  }

   /**
   * Get netAmount
   * @return netAmount
  **/
  @javax.annotation.Nullable
  public Float getNetAmount() {
    return netAmount;
  }


  public void setNetAmount(Float netAmount) {
    this.netAmount = netAmount;
  }


  public DocumentSummary netAmountLocal(Float netAmountLocal) {
    
    this.netAmountLocal = netAmountLocal;
    return this;
  }

   /**
   * Get netAmountLocal
   * @return netAmountLocal
  **/
  @javax.annotation.Nullable
  public Float getNetAmountLocal() {
    return netAmountLocal;
  }


  public void setNetAmountLocal(Float netAmountLocal) {
    this.netAmountLocal = netAmountLocal;
  }


  public DocumentSummary grossAmountLocal(Float grossAmountLocal) {
    
    this.grossAmountLocal = grossAmountLocal;
    return this;
  }

   /**
   * Get grossAmountLocal
   * @return grossAmountLocal
  **/
  @javax.annotation.Nullable
  public Float getGrossAmountLocal() {
    return grossAmountLocal;
  }


  public void setGrossAmountLocal(Float grossAmountLocal) {
    this.grossAmountLocal = grossAmountLocal;
  }


  public DocumentSummary vatAmount(Float vatAmount) {
    
    this.vatAmount = vatAmount;
    return this;
  }

   /**
   * Get vatAmount
   * @return vatAmount
  **/
  @javax.annotation.Nullable
  public Float getVatAmount() {
    return vatAmount;
  }


  public void setVatAmount(Float vatAmount) {
    this.vatAmount = vatAmount;
  }


  public DocumentSummary vatAmountLocal(Float vatAmountLocal) {
    
    this.vatAmountLocal = vatAmountLocal;
    return this;
  }

   /**
   * Get vatAmountLocal
   * @return vatAmountLocal
  **/
  @javax.annotation.Nullable
  public Float getVatAmountLocal() {
    return vatAmountLocal;
  }


  public void setVatAmountLocal(Float vatAmountLocal) {
    this.vatAmountLocal = vatAmountLocal;
  }


  public DocumentSummary vatRateSummary(List<DocumentVatRateSummary> vatRateSummary) {
    
    this.vatRateSummary = vatRateSummary;
    return this;
  }

  public DocumentSummary addVatRateSummaryItem(DocumentVatRateSummary vatRateSummaryItem) {
    if (this.vatRateSummary == null) {
      this.vatRateSummary = new ArrayList<>();
    }
    this.vatRateSummary.add(vatRateSummaryItem);
    return this;
  }

   /**
   * Get vatRateSummary
   * @return vatRateSummary
  **/
  @javax.annotation.Nullable
  public List<DocumentVatRateSummary> getVatRateSummary() {
    return vatRateSummary;
  }


  public void setVatRateSummary(List<DocumentVatRateSummary> vatRateSummary) {
    this.vatRateSummary = vatRateSummary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSummary documentSummary = (DocumentSummary) o;
    return Objects.equals(this.netAmount, documentSummary.netAmount) &&
        Objects.equals(this.netAmountLocal, documentSummary.netAmountLocal) &&
        Objects.equals(this.grossAmountLocal, documentSummary.grossAmountLocal) &&
        Objects.equals(this.vatAmount, documentSummary.vatAmount) &&
        Objects.equals(this.vatAmountLocal, documentSummary.vatAmountLocal) &&
        Objects.equals(this.vatRateSummary, documentSummary.vatRateSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netAmount, netAmountLocal, grossAmountLocal, vatAmount, vatAmountLocal, vatRateSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSummary {\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    netAmountLocal: ").append(toIndentedString(netAmountLocal)).append("\n");
    sb.append("    grossAmountLocal: ").append(toIndentedString(grossAmountLocal)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    vatAmountLocal: ").append(toIndentedString(vatAmountLocal)).append("\n");
    sb.append("    vatRateSummary: ").append(toIndentedString(vatRateSummary)).append("\n");
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
    openapiFields.add("net_amount");
    openapiFields.add("net_amount_local");
    openapiFields.add("gross_amount_local");
    openapiFields.add("vat_amount");
    openapiFields.add("vat_amount_local");
    openapiFields.add("vat_rate_summary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentSummary is not found in the empty JSON string", DocumentSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("vat_rate_summary") != null && !jsonObj.get("vat_rate_summary").isJsonNull()) {
        JsonArray jsonArrayvatRateSummary = jsonObj.getAsJsonArray("vat_rate_summary");
        if (jsonArrayvatRateSummary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vat_rate_summary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vat_rate_summary` to be an array in the JSON string but got `%s`", jsonObj.get("vat_rate_summary").toString()));
          }

          // validate the optional field `vat_rate_summary` (array)
          for (int i = 0; i < jsonArrayvatRateSummary.size(); i++) {
            DocumentVatRateSummary.validateJsonElement(jsonArrayvatRateSummary.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentSummary>() {
           @Override
           public void write(JsonWriter out, DocumentSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentSummary
  * @throws IOException if the JSON string is invalid with respect to DocumentSummary
  */
  public static DocumentSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentSummary.class);
  }

 /**
  * Convert an instance of DocumentSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

