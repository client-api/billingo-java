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
import com.clientapi.billingo.model.Entitlement;
import com.clientapi.billingo.model.Vat;
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
 * DocumentItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-15T09:59:06.459642900+02:00[Europe/Budapest]")
public class DocumentItem {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NET_UNIT_AMOUNT = "net_unit_amount";
  @SerializedName(SERIALIZED_NAME_NET_UNIT_AMOUNT)
  private Float netUnitAmount;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Float quantity;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_NET_AMOUNT = "net_amount";
  @SerializedName(SERIALIZED_NAME_NET_AMOUNT)
  private Float netAmount;

  public static final String SERIALIZED_NAME_GROSS_AMOUNT = "gross_amount";
  @SerializedName(SERIALIZED_NAME_GROSS_AMOUNT)
  private Float grossAmount;

  public static final String SERIALIZED_NAME_VAT = "vat";
  @SerializedName(SERIALIZED_NAME_VAT)
  private Vat vat;

  public static final String SERIALIZED_NAME_VAT_AMOUNT = "vat_amount";
  @SerializedName(SERIALIZED_NAME_VAT_AMOUNT)
  private Float vatAmount;

  public static final String SERIALIZED_NAME_ENTITLEMENT = "entitlement";
  @SerializedName(SERIALIZED_NAME_ENTITLEMENT)
  private Entitlement entitlement;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public DocumentItem() {
  }

  public DocumentItem productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public DocumentItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DocumentItem netUnitAmount(Float netUnitAmount) {
    
    this.netUnitAmount = netUnitAmount;
    return this;
  }

   /**
   * Get netUnitAmount
   * @return netUnitAmount
  **/
  @javax.annotation.Nullable
  public Float getNetUnitAmount() {
    return netUnitAmount;
  }


  public void setNetUnitAmount(Float netUnitAmount) {
    this.netUnitAmount = netUnitAmount;
  }


  public DocumentItem quantity(Float quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Float getQuantity() {
    return quantity;
  }


  public void setQuantity(Float quantity) {
    this.quantity = quantity;
  }


  public DocumentItem unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public DocumentItem netAmount(Float netAmount) {
    
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


  public DocumentItem grossAmount(Float grossAmount) {
    
    this.grossAmount = grossAmount;
    return this;
  }

   /**
   * Get grossAmount
   * @return grossAmount
  **/
  @javax.annotation.Nullable
  public Float getGrossAmount() {
    return grossAmount;
  }


  public void setGrossAmount(Float grossAmount) {
    this.grossAmount = grossAmount;
  }


  public DocumentItem vat(Vat vat) {
    
    this.vat = vat;
    return this;
  }

   /**
   * Get vat
   * @return vat
  **/
  @javax.annotation.Nullable
  public Vat getVat() {
    return vat;
  }


  public void setVat(Vat vat) {
    this.vat = vat;
  }


  public DocumentItem vatAmount(Float vatAmount) {
    
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


  public DocumentItem entitlement(Entitlement entitlement) {
    
    this.entitlement = entitlement;
    return this;
  }

   /**
   * Get entitlement
   * @return entitlement
  **/
  @javax.annotation.Nullable
  public Entitlement getEntitlement() {
    return entitlement;
  }


  public void setEntitlement(Entitlement entitlement) {
    this.entitlement = entitlement;
  }


  public DocumentItem comment(String comment) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentItem documentItem = (DocumentItem) o;
    return Objects.equals(this.productId, documentItem.productId) &&
        Objects.equals(this.name, documentItem.name) &&
        Objects.equals(this.netUnitAmount, documentItem.netUnitAmount) &&
        Objects.equals(this.quantity, documentItem.quantity) &&
        Objects.equals(this.unit, documentItem.unit) &&
        Objects.equals(this.netAmount, documentItem.netAmount) &&
        Objects.equals(this.grossAmount, documentItem.grossAmount) &&
        Objects.equals(this.vat, documentItem.vat) &&
        Objects.equals(this.vatAmount, documentItem.vatAmount) &&
        Objects.equals(this.entitlement, documentItem.entitlement) &&
        Objects.equals(this.comment, documentItem.comment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, name, netUnitAmount, quantity, unit, netAmount, grossAmount, vat, vatAmount, entitlement, comment);
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
    sb.append("class DocumentItem {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    netUnitAmount: ").append(toIndentedString(netUnitAmount)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    entitlement: ").append(toIndentedString(entitlement)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
    openapiFields.add("product_id");
    openapiFields.add("name");
    openapiFields.add("net_unit_amount");
    openapiFields.add("quantity");
    openapiFields.add("unit");
    openapiFields.add("net_amount");
    openapiFields.add("gross_amount");
    openapiFields.add("vat");
    openapiFields.add("vat_amount");
    openapiFields.add("entitlement");
    openapiFields.add("comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentItem is not found in the empty JSON string", DocumentItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentItem.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentItem>() {
           @Override
           public void write(JsonWriter out, DocumentItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentItem
  * @throws IOException if the JSON string is invalid with respect to DocumentItem
  */
  public static DocumentItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentItem.class);
  }

 /**
  * Convert an instance of DocumentItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

