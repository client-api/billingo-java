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
 * DocumentCancellation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-15T09:59:06.459642900+02:00[Europe/Budapest]")
public class DocumentCancellation {
  public static final String SERIALIZED_NAME_CANCELLATION_REASON = "cancellation_reason";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_REASON)
  private String cancellationReason;

  public static final String SERIALIZED_NAME_CANCELLATION_RECIPIENTS = "cancellation_recipients";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_RECIPIENTS)
  private String cancellationRecipients;

  public DocumentCancellation() {
  }

  public DocumentCancellation cancellationReason(String cancellationReason) {
    
    this.cancellationReason = cancellationReason;
    return this;
  }

   /**
   * Get cancellationReason
   * @return cancellationReason
  **/
  @javax.annotation.Nullable
  public String getCancellationReason() {
    return cancellationReason;
  }


  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }


  public DocumentCancellation cancellationRecipients(String cancellationRecipients) {
    
    this.cancellationRecipients = cancellationRecipients;
    return this;
  }

   /**
   * Get cancellationRecipients
   * @return cancellationRecipients
  **/
  @javax.annotation.Nullable
  public String getCancellationRecipients() {
    return cancellationRecipients;
  }


  public void setCancellationRecipients(String cancellationRecipients) {
    this.cancellationRecipients = cancellationRecipients;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCancellation documentCancellation = (DocumentCancellation) o;
    return Objects.equals(this.cancellationReason, documentCancellation.cancellationReason) &&
        Objects.equals(this.cancellationRecipients, documentCancellation.cancellationRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationReason, cancellationRecipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCancellation {\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    cancellationRecipients: ").append(toIndentedString(cancellationRecipients)).append("\n");
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
    openapiFields.add("cancellation_reason");
    openapiFields.add("cancellation_recipients");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentCancellation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentCancellation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentCancellation is not found in the empty JSON string", DocumentCancellation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentCancellation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentCancellation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cancellation_reason") != null && !jsonObj.get("cancellation_reason").isJsonNull()) && !jsonObj.get("cancellation_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancellation_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancellation_reason").toString()));
      }
      if ((jsonObj.get("cancellation_recipients") != null && !jsonObj.get("cancellation_recipients").isJsonNull()) && !jsonObj.get("cancellation_recipients").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancellation_recipients` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancellation_recipients").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentCancellation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentCancellation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentCancellation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentCancellation.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentCancellation>() {
           @Override
           public void write(JsonWriter out, DocumentCancellation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentCancellation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentCancellation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentCancellation
  * @throws IOException if the JSON string is invalid with respect to DocumentCancellation
  */
  public static DocumentCancellation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentCancellation.class);
  }

 /**
  * Convert an instance of DocumentCancellation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

