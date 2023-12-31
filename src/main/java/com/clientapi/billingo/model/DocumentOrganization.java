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
import com.clientapi.billingo.model.Address;
import com.clientapi.billingo.model.DocumentBankAccount;
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
 * DocumentOrganization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-15T09:59:06.459642900+02:00[Europe/Budapest]")
public class DocumentOrganization {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAX_NUMBER = "tax_number";
  @SerializedName(SERIALIZED_NAME_TAX_NUMBER)
  private String taxNumber;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private DocumentBankAccount bankAccount;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_SMALL_TAXPAYER = "small_taxpayer";
  @SerializedName(SERIALIZED_NAME_SMALL_TAXPAYER)
  private Boolean smallTaxpayer;

  public static final String SERIALIZED_NAME_EV_NUMBER = "ev_number";
  @SerializedName(SERIALIZED_NAME_EV_NUMBER)
  private String evNumber;

  public static final String SERIALIZED_NAME_EU_TAX_NUMBER = "eu_tax_number";
  @SerializedName(SERIALIZED_NAME_EU_TAX_NUMBER)
  private String euTaxNumber;

  public static final String SERIALIZED_NAME_CASH_SETTLED = "cash_settled";
  @SerializedName(SERIALIZED_NAME_CASH_SETTLED)
  private Boolean cashSettled;

  public DocumentOrganization() {
  }

  public DocumentOrganization name(String name) {
    
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


  public DocumentOrganization taxNumber(String taxNumber) {
    
    this.taxNumber = taxNumber;
    return this;
  }

   /**
   * Get taxNumber
   * @return taxNumber
  **/
  @javax.annotation.Nullable
  public String getTaxNumber() {
    return taxNumber;
  }


  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }


  public DocumentOrganization bankAccount(DocumentBankAccount bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  public DocumentBankAccount getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(DocumentBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }


  public DocumentOrganization address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public DocumentOrganization smallTaxpayer(Boolean smallTaxpayer) {
    
    this.smallTaxpayer = smallTaxpayer;
    return this;
  }

   /**
   * Get smallTaxpayer
   * @return smallTaxpayer
  **/
  @javax.annotation.Nullable
  public Boolean getSmallTaxpayer() {
    return smallTaxpayer;
  }


  public void setSmallTaxpayer(Boolean smallTaxpayer) {
    this.smallTaxpayer = smallTaxpayer;
  }


  public DocumentOrganization evNumber(String evNumber) {
    
    this.evNumber = evNumber;
    return this;
  }

   /**
   * Get evNumber
   * @return evNumber
  **/
  @javax.annotation.Nullable
  public String getEvNumber() {
    return evNumber;
  }


  public void setEvNumber(String evNumber) {
    this.evNumber = evNumber;
  }


  public DocumentOrganization euTaxNumber(String euTaxNumber) {
    
    this.euTaxNumber = euTaxNumber;
    return this;
  }

   /**
   * Get euTaxNumber
   * @return euTaxNumber
  **/
  @javax.annotation.Nullable
  public String getEuTaxNumber() {
    return euTaxNumber;
  }


  public void setEuTaxNumber(String euTaxNumber) {
    this.euTaxNumber = euTaxNumber;
  }


  public DocumentOrganization cashSettled(Boolean cashSettled) {
    
    this.cashSettled = cashSettled;
    return this;
  }

   /**
   * Get cashSettled
   * @return cashSettled
  **/
  @javax.annotation.Nullable
  public Boolean getCashSettled() {
    return cashSettled;
  }


  public void setCashSettled(Boolean cashSettled) {
    this.cashSettled = cashSettled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentOrganization documentOrganization = (DocumentOrganization) o;
    return Objects.equals(this.name, documentOrganization.name) &&
        Objects.equals(this.taxNumber, documentOrganization.taxNumber) &&
        Objects.equals(this.bankAccount, documentOrganization.bankAccount) &&
        Objects.equals(this.address, documentOrganization.address) &&
        Objects.equals(this.smallTaxpayer, documentOrganization.smallTaxpayer) &&
        Objects.equals(this.evNumber, documentOrganization.evNumber) &&
        Objects.equals(this.euTaxNumber, documentOrganization.euTaxNumber) &&
        Objects.equals(this.cashSettled, documentOrganization.cashSettled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, taxNumber, bankAccount, address, smallTaxpayer, evNumber, euTaxNumber, cashSettled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentOrganization {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    smallTaxpayer: ").append(toIndentedString(smallTaxpayer)).append("\n");
    sb.append("    evNumber: ").append(toIndentedString(evNumber)).append("\n");
    sb.append("    euTaxNumber: ").append(toIndentedString(euTaxNumber)).append("\n");
    sb.append("    cashSettled: ").append(toIndentedString(cashSettled)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("tax_number");
    openapiFields.add("bank_account");
    openapiFields.add("address");
    openapiFields.add("small_taxpayer");
    openapiFields.add("ev_number");
    openapiFields.add("eu_tax_number");
    openapiFields.add("cash_settled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentOrganization
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentOrganization.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentOrganization is not found in the empty JSON string", DocumentOrganization.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentOrganization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentOrganization` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("tax_number") != null && !jsonObj.get("tax_number").isJsonNull()) && !jsonObj.get("tax_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_number").toString()));
      }
      // validate the optional field `bank_account`
      if (jsonObj.get("bank_account") != null && !jsonObj.get("bank_account").isJsonNull()) {
        DocumentBankAccount.validateJsonElement(jsonObj.get("bank_account"));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("address"));
      }
      if ((jsonObj.get("ev_number") != null && !jsonObj.get("ev_number").isJsonNull()) && !jsonObj.get("ev_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ev_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ev_number").toString()));
      }
      if ((jsonObj.get("eu_tax_number") != null && !jsonObj.get("eu_tax_number").isJsonNull()) && !jsonObj.get("eu_tax_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eu_tax_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eu_tax_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentOrganization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentOrganization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentOrganization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentOrganization.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentOrganization>() {
           @Override
           public void write(JsonWriter out, DocumentOrganization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentOrganization read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentOrganization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentOrganization
  * @throws IOException if the JSON string is invalid with respect to DocumentOrganization
  */
  public static DocumentOrganization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentOrganization.class);
  }

 /**
  * Convert an instance of DocumentOrganization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

