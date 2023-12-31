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
import com.clientapi.billingo.model.DocumentType;
import com.clientapi.billingo.model.OnlinePayment;
import com.clientapi.billingo.model.Round;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * DocumentSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-15T09:59:06.459642900+02:00[Europe/Budapest]")
public class DocumentSettings {
  public static final String SERIALIZED_NAME_MEDIATED_SERVICE = "mediated_service";
  @SerializedName(SERIALIZED_NAME_MEDIATED_SERVICE)
  private Boolean mediatedService = false;

  public static final String SERIALIZED_NAME_WITHOUT_FINANCIAL_FULFILLMENT = "without_financial_fulfillment";
  @SerializedName(SERIALIZED_NAME_WITHOUT_FINANCIAL_FULFILLMENT)
  private Boolean withoutFinancialFulfillment = false;

  public static final String SERIALIZED_NAME_ONLINE_PAYMENT = "online_payment";
  @SerializedName(SERIALIZED_NAME_ONLINE_PAYMENT)
  private OnlinePayment onlinePayment;

  public static final String SERIALIZED_NAME_ROUND = "round";
  @SerializedName(SERIALIZED_NAME_ROUND)
  private Round round;

  public static final String SERIALIZED_NAME_NO_SEND_ONLINESZAMLA_BY_USER = "no_send_onlineszamla_by_user";
  @SerializedName(SERIALIZED_NAME_NO_SEND_ONLINESZAMLA_BY_USER)
  private Boolean noSendOnlineszamlaByUser;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "order_number";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_PLACE_ID = "place_id";
  @SerializedName(SERIALIZED_NAME_PLACE_ID)
  private Integer placeId;

  public static final String SERIALIZED_NAME_INSTANT_PAYMENT = "instant_payment";
  @SerializedName(SERIALIZED_NAME_INSTANT_PAYMENT)
  private Boolean instantPayment;

  public static final String SERIALIZED_NAME_SELECTED_TYPE = "selected_type";
  @SerializedName(SERIALIZED_NAME_SELECTED_TYPE)
  private DocumentType selectedType;

  public DocumentSettings() {
  }

  public DocumentSettings mediatedService(Boolean mediatedService) {
    
    this.mediatedService = mediatedService;
    return this;
  }

   /**
   * Get mediatedService
   * @return mediatedService
  **/
  @javax.annotation.Nullable
  public Boolean getMediatedService() {
    return mediatedService;
  }


  public void setMediatedService(Boolean mediatedService) {
    this.mediatedService = mediatedService;
  }


  public DocumentSettings withoutFinancialFulfillment(Boolean withoutFinancialFulfillment) {
    
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


  public DocumentSettings onlinePayment(OnlinePayment onlinePayment) {
    
    this.onlinePayment = onlinePayment;
    return this;
  }

   /**
   * Get onlinePayment
   * @return onlinePayment
  **/
  @javax.annotation.Nullable
  public OnlinePayment getOnlinePayment() {
    return onlinePayment;
  }


  public void setOnlinePayment(OnlinePayment onlinePayment) {
    this.onlinePayment = onlinePayment;
  }


  public DocumentSettings round(Round round) {
    
    this.round = round;
    return this;
  }

   /**
   * Get round
   * @return round
  **/
  @javax.annotation.Nullable
  public Round getRound() {
    return round;
  }


  public void setRound(Round round) {
    this.round = round;
  }


  public DocumentSettings noSendOnlineszamlaByUser(Boolean noSendOnlineszamlaByUser) {
    
    this.noSendOnlineszamlaByUser = noSendOnlineszamlaByUser;
    return this;
  }

   /**
   * Get noSendOnlineszamlaByUser
   * @return noSendOnlineszamlaByUser
  **/
  @javax.annotation.Nullable
  public Boolean getNoSendOnlineszamlaByUser() {
    return noSendOnlineszamlaByUser;
  }


  public void setNoSendOnlineszamlaByUser(Boolean noSendOnlineszamlaByUser) {
    this.noSendOnlineszamlaByUser = noSendOnlineszamlaByUser;
  }


  public DocumentSettings orderNumber(String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public DocumentSettings placeId(Integer placeId) {
    
    this.placeId = placeId;
    return this;
  }

   /**
   * Get placeId
   * @return placeId
  **/
  @javax.annotation.Nullable
  public Integer getPlaceId() {
    return placeId;
  }


  public void setPlaceId(Integer placeId) {
    this.placeId = placeId;
  }


  public DocumentSettings instantPayment(Boolean instantPayment) {
    
    this.instantPayment = instantPayment;
    return this;
  }

   /**
   * Get instantPayment
   * @return instantPayment
  **/
  @javax.annotation.Nullable
  public Boolean getInstantPayment() {
    return instantPayment;
  }


  public void setInstantPayment(Boolean instantPayment) {
    this.instantPayment = instantPayment;
  }


  public DocumentSettings selectedType(DocumentType selectedType) {
    
    this.selectedType = selectedType;
    return this;
  }

   /**
   * Get selectedType
   * @return selectedType
  **/
  @javax.annotation.Nullable
  public DocumentType getSelectedType() {
    return selectedType;
  }


  public void setSelectedType(DocumentType selectedType) {
    this.selectedType = selectedType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSettings documentSettings = (DocumentSettings) o;
    return Objects.equals(this.mediatedService, documentSettings.mediatedService) &&
        Objects.equals(this.withoutFinancialFulfillment, documentSettings.withoutFinancialFulfillment) &&
        Objects.equals(this.onlinePayment, documentSettings.onlinePayment) &&
        Objects.equals(this.round, documentSettings.round) &&
        Objects.equals(this.noSendOnlineszamlaByUser, documentSettings.noSendOnlineszamlaByUser) &&
        Objects.equals(this.orderNumber, documentSettings.orderNumber) &&
        Objects.equals(this.placeId, documentSettings.placeId) &&
        Objects.equals(this.instantPayment, documentSettings.instantPayment) &&
        Objects.equals(this.selectedType, documentSettings.selectedType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediatedService, withoutFinancialFulfillment, onlinePayment, round, noSendOnlineszamlaByUser, orderNumber, placeId, instantPayment, selectedType);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSettings {\n");
    sb.append("    mediatedService: ").append(toIndentedString(mediatedService)).append("\n");
    sb.append("    withoutFinancialFulfillment: ").append(toIndentedString(withoutFinancialFulfillment)).append("\n");
    sb.append("    onlinePayment: ").append(toIndentedString(onlinePayment)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    noSendOnlineszamlaByUser: ").append(toIndentedString(noSendOnlineszamlaByUser)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    instantPayment: ").append(toIndentedString(instantPayment)).append("\n");
    sb.append("    selectedType: ").append(toIndentedString(selectedType)).append("\n");
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
    openapiFields.add("mediated_service");
    openapiFields.add("without_financial_fulfillment");
    openapiFields.add("online_payment");
    openapiFields.add("round");
    openapiFields.add("no_send_onlineszamla_by_user");
    openapiFields.add("order_number");
    openapiFields.add("place_id");
    openapiFields.add("instant_payment");
    openapiFields.add("selected_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentSettings is not found in the empty JSON string", DocumentSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("order_number") != null && !jsonObj.get("order_number").isJsonNull()) && !jsonObj.get("order_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentSettings>() {
           @Override
           public void write(JsonWriter out, DocumentSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentSettings
  * @throws IOException if the JSON string is invalid with respect to DocumentSettings
  */
  public static DocumentSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentSettings.class);
  }

 /**
  * Convert an instance of DocumentSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

