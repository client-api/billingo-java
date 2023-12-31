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
import com.clientapi.billingo.model.DocumentInsertItemsInner;
import com.clientapi.billingo.model.PaymentMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
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
 * ModificationDocumentInsert
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-15T09:59:06.459642900+02:00[Europe/Budapest]")
public class ModificationDocumentInsert {
  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private LocalDate dueDate;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_WITHOUT_FINANCIAL_FULFILLMENT = "without_financial_fulfillment";
  @SerializedName(SERIALIZED_NAME_WITHOUT_FINANCIAL_FULFILLMENT)
  private Boolean withoutFinancialFulfillment = false;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<DocumentInsertItemsInner> items;

  public ModificationDocumentInsert() {
  }

  public ModificationDocumentInsert dueDate(LocalDate dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nullable
  public LocalDate getDueDate() {
    return dueDate;
  }


  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }


  public ModificationDocumentInsert comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public ModificationDocumentInsert paymentMethod(PaymentMethod paymentMethod) {
    
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


  public ModificationDocumentInsert withoutFinancialFulfillment(Boolean withoutFinancialFulfillment) {
    
    this.withoutFinancialFulfillment = withoutFinancialFulfillment;
    return this;
  }

   /**
   * Get withoutFinancialFulfillment
   * @return withoutFinancialFulfillment
  **/
  @javax.annotation.Nullable
  public Boolean getWithoutFinancialFulfillment() {
    return withoutFinancialFulfillment;
  }


  public void setWithoutFinancialFulfillment(Boolean withoutFinancialFulfillment) {
    this.withoutFinancialFulfillment = withoutFinancialFulfillment;
  }


  public ModificationDocumentInsert items(List<DocumentInsertItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public ModificationDocumentInsert addItemsItem(DocumentInsertItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  public List<DocumentInsertItemsInner> getItems() {
    return items;
  }


  public void setItems(List<DocumentInsertItemsInner> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModificationDocumentInsert modificationDocumentInsert = (ModificationDocumentInsert) o;
    return Objects.equals(this.dueDate, modificationDocumentInsert.dueDate) &&
        Objects.equals(this.comment, modificationDocumentInsert.comment) &&
        Objects.equals(this.paymentMethod, modificationDocumentInsert.paymentMethod) &&
        Objects.equals(this.withoutFinancialFulfillment, modificationDocumentInsert.withoutFinancialFulfillment) &&
        Objects.equals(this.items, modificationDocumentInsert.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dueDate, comment, paymentMethod, withoutFinancialFulfillment, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationDocumentInsert {\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    withoutFinancialFulfillment: ").append(toIndentedString(withoutFinancialFulfillment)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("due_date");
    openapiFields.add("comment");
    openapiFields.add("payment_method");
    openapiFields.add("without_financial_fulfillment");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModificationDocumentInsert
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModificationDocumentInsert.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModificationDocumentInsert is not found in the empty JSON string", ModificationDocumentInsert.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModificationDocumentInsert.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModificationDocumentInsert` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            DocumentInsertItemsInner.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModificationDocumentInsert.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModificationDocumentInsert' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModificationDocumentInsert> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModificationDocumentInsert.class));

       return (TypeAdapter<T>) new TypeAdapter<ModificationDocumentInsert>() {
           @Override
           public void write(JsonWriter out, ModificationDocumentInsert value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModificationDocumentInsert read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModificationDocumentInsert given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModificationDocumentInsert
  * @throws IOException if the JSON string is invalid with respect to ModificationDocumentInsert
  */
  public static ModificationDocumentInsert fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModificationDocumentInsert.class);
  }

 /**
  * Convert an instance of ModificationDocumentInsert to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

