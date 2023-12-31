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
import com.clientapi.billingo.model.Entitlement;
import com.clientapi.billingo.model.Vat;
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
 * Product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-15T09:59:06.459642900+02:00[Europe/Budapest]")
public class Product {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_VAT = "vat";
  @SerializedName(SERIALIZED_NAME_VAT)
  private Vat vat;

  public static final String SERIALIZED_NAME_NET_UNIT_PRICE = "net_unit_price";
  @SerializedName(SERIALIZED_NAME_NET_UNIT_PRICE)
  private Float netUnitPrice;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_GENERAL_LEDGER_NUMBER = "general_ledger_number";
  @SerializedName(SERIALIZED_NAME_GENERAL_LEDGER_NUMBER)
  private String generalLedgerNumber;

  public static final String SERIALIZED_NAME_GENERAL_LEDGER_TAXCODE = "general_ledger_taxcode";
  @SerializedName(SERIALIZED_NAME_GENERAL_LEDGER_TAXCODE)
  private String generalLedgerTaxcode;

  public static final String SERIALIZED_NAME_ENTITLEMENT = "entitlement";
  @SerializedName(SERIALIZED_NAME_ENTITLEMENT)
  private Entitlement entitlement;

  public Product() {
  }

  
  public Product(
     Integer id
  ) {
    this();
    this.id = id;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }




  public Product name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Product comment(String comment) {
    
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


  public Product currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public Product vat(Vat vat) {
    
    this.vat = vat;
    return this;
  }

   /**
   * Get vat
   * @return vat
  **/
  @javax.annotation.Nonnull
  public Vat getVat() {
    return vat;
  }


  public void setVat(Vat vat) {
    this.vat = vat;
  }


  public Product netUnitPrice(Float netUnitPrice) {
    
    this.netUnitPrice = netUnitPrice;
    return this;
  }

   /**
   * Get netUnitPrice
   * @return netUnitPrice
  **/
  @javax.annotation.Nullable
  public Float getNetUnitPrice() {
    return netUnitPrice;
  }


  public void setNetUnitPrice(Float netUnitPrice) {
    this.netUnitPrice = netUnitPrice;
  }


  public Product unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nonnull
  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public Product generalLedgerNumber(String generalLedgerNumber) {
    
    this.generalLedgerNumber = generalLedgerNumber;
    return this;
  }

   /**
   * Get generalLedgerNumber
   * @return generalLedgerNumber
  **/
  @javax.annotation.Nullable
  public String getGeneralLedgerNumber() {
    return generalLedgerNumber;
  }


  public void setGeneralLedgerNumber(String generalLedgerNumber) {
    this.generalLedgerNumber = generalLedgerNumber;
  }


  public Product generalLedgerTaxcode(String generalLedgerTaxcode) {
    
    this.generalLedgerTaxcode = generalLedgerTaxcode;
    return this;
  }

   /**
   * Get generalLedgerTaxcode
   * @return generalLedgerTaxcode
  **/
  @javax.annotation.Nullable
  public String getGeneralLedgerTaxcode() {
    return generalLedgerTaxcode;
  }


  public void setGeneralLedgerTaxcode(String generalLedgerTaxcode) {
    this.generalLedgerTaxcode = generalLedgerTaxcode;
  }


  public Product entitlement(Entitlement entitlement) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.comment, product.comment) &&
        Objects.equals(this.currency, product.currency) &&
        Objects.equals(this.vat, product.vat) &&
        Objects.equals(this.netUnitPrice, product.netUnitPrice) &&
        Objects.equals(this.unit, product.unit) &&
        Objects.equals(this.generalLedgerNumber, product.generalLedgerNumber) &&
        Objects.equals(this.generalLedgerTaxcode, product.generalLedgerTaxcode) &&
        Objects.equals(this.entitlement, product.entitlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, comment, currency, vat, netUnitPrice, unit, generalLedgerNumber, generalLedgerTaxcode, entitlement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    netUnitPrice: ").append(toIndentedString(netUnitPrice)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    generalLedgerNumber: ").append(toIndentedString(generalLedgerNumber)).append("\n");
    sb.append("    generalLedgerTaxcode: ").append(toIndentedString(generalLedgerTaxcode)).append("\n");
    sb.append("    entitlement: ").append(toIndentedString(entitlement)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("comment");
    openapiFields.add("currency");
    openapiFields.add("vat");
    openapiFields.add("net_unit_price");
    openapiFields.add("unit");
    openapiFields.add("general_ledger_number");
    openapiFields.add("general_ledger_taxcode");
    openapiFields.add("entitlement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("vat");
    openapiRequiredFields.add("unit");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Product
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Product.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Product is not found in the empty JSON string", Product.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Product.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Product` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Product.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (!jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
      if ((jsonObj.get("general_ledger_number") != null && !jsonObj.get("general_ledger_number").isJsonNull()) && !jsonObj.get("general_ledger_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `general_ledger_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("general_ledger_number").toString()));
      }
      if ((jsonObj.get("general_ledger_taxcode") != null && !jsonObj.get("general_ledger_taxcode").isJsonNull()) && !jsonObj.get("general_ledger_taxcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `general_ledger_taxcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("general_ledger_taxcode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Product.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Product' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Product> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Product.class));

       return (TypeAdapter<T>) new TypeAdapter<Product>() {
           @Override
           public void write(JsonWriter out, Product value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Product read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Product given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Product
  * @throws IOException if the JSON string is invalid with respect to Product
  */
  public static Product fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Product.class);
  }

 /**
  * Convert an instance of Product to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

