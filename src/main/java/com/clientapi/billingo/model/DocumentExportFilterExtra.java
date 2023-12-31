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
import com.clientapi.billingo.model.LedgerNumberInformation;
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
 * DocumentExportFilterExtra
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-15T09:59:06.459642900+02:00[Europe/Budapest]")
public class DocumentExportFilterExtra {
  public static final String SERIALIZED_NAME_TENSOFT_VKOD = "tensoft_vkod";
  @SerializedName(SERIALIZED_NAME_TENSOFT_VKOD)
  private String tensoftVkod;

  public static final String SERIALIZED_NAME_LEDGER_NUMBER = "ledger_number";
  @SerializedName(SERIALIZED_NAME_LEDGER_NUMBER)
  private LedgerNumberInformation ledgerNumber;

  public static final String SERIALIZED_NAME_FORINTSOFT_KONYVELESI_NAPLO_SZAM = "forintsoft_konyvelesi_naplo_szam";
  @SerializedName(SERIALIZED_NAME_FORINTSOFT_KONYVELESI_NAPLO_SZAM)
  private String forintsoftKonyvelesiNaploSzam;

  public static final String SERIALIZED_NAME_POSITIVE_LEDGER_NUMBER = "positive_ledger_number";
  @SerializedName(SERIALIZED_NAME_POSITIVE_LEDGER_NUMBER)
  private String positiveLedgerNumber;

  public static final String SERIALIZED_NAME_NEGATIVE_LEDGER_NUMBER = "negative_ledger_number";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_LEDGER_NUMBER)
  private String negativeLedgerNumber;

  public static final String SERIALIZED_NAME_RLB_KATA = "rlb_kata";
  @SerializedName(SERIALIZED_NAME_RLB_KATA)
  private Boolean rlbKata;

  public static final String SERIALIZED_NAME_RLB_NOTE = "rlb_note";
  @SerializedName(SERIALIZED_NAME_RLB_NOTE)
  private String rlbNote;

  public static final String SERIALIZED_NAME_NOVITAX_NAPLOKOD = "novitax_naplokod";
  @SerializedName(SERIALIZED_NAME_NOVITAX_NAPLOKOD)
  private String novitaxNaplokod;

  public static final String SERIALIZED_NAME_USE_GROSS_VALUES = "use_gross_values";
  @SerializedName(SERIALIZED_NAME_USE_GROSS_VALUES)
  private Boolean useGrossValues;

  public DocumentExportFilterExtra() {
  }

  public DocumentExportFilterExtra tensoftVkod(String tensoftVkod) {
    
    this.tensoftVkod = tensoftVkod;
    return this;
  }

   /**
   * Get tensoftVkod
   * @return tensoftVkod
  **/
  @javax.annotation.Nullable
  public String getTensoftVkod() {
    return tensoftVkod;
  }


  public void setTensoftVkod(String tensoftVkod) {
    this.tensoftVkod = tensoftVkod;
  }


  public DocumentExportFilterExtra ledgerNumber(LedgerNumberInformation ledgerNumber) {
    
    this.ledgerNumber = ledgerNumber;
    return this;
  }

   /**
   * Get ledgerNumber
   * @return ledgerNumber
  **/
  @javax.annotation.Nullable
  public LedgerNumberInformation getLedgerNumber() {
    return ledgerNumber;
  }


  public void setLedgerNumber(LedgerNumberInformation ledgerNumber) {
    this.ledgerNumber = ledgerNumber;
  }


  public DocumentExportFilterExtra forintsoftKonyvelesiNaploSzam(String forintsoftKonyvelesiNaploSzam) {
    
    this.forintsoftKonyvelesiNaploSzam = forintsoftKonyvelesiNaploSzam;
    return this;
  }

   /**
   * Get forintsoftKonyvelesiNaploSzam
   * @return forintsoftKonyvelesiNaploSzam
  **/
  @javax.annotation.Nullable
  public String getForintsoftKonyvelesiNaploSzam() {
    return forintsoftKonyvelesiNaploSzam;
  }


  public void setForintsoftKonyvelesiNaploSzam(String forintsoftKonyvelesiNaploSzam) {
    this.forintsoftKonyvelesiNaploSzam = forintsoftKonyvelesiNaploSzam;
  }


  public DocumentExportFilterExtra positiveLedgerNumber(String positiveLedgerNumber) {
    
    this.positiveLedgerNumber = positiveLedgerNumber;
    return this;
  }

   /**
   * Get positiveLedgerNumber
   * @return positiveLedgerNumber
  **/
  @javax.annotation.Nullable
  public String getPositiveLedgerNumber() {
    return positiveLedgerNumber;
  }


  public void setPositiveLedgerNumber(String positiveLedgerNumber) {
    this.positiveLedgerNumber = positiveLedgerNumber;
  }


  public DocumentExportFilterExtra negativeLedgerNumber(String negativeLedgerNumber) {
    
    this.negativeLedgerNumber = negativeLedgerNumber;
    return this;
  }

   /**
   * Get negativeLedgerNumber
   * @return negativeLedgerNumber
  **/
  @javax.annotation.Nullable
  public String getNegativeLedgerNumber() {
    return negativeLedgerNumber;
  }


  public void setNegativeLedgerNumber(String negativeLedgerNumber) {
    this.negativeLedgerNumber = negativeLedgerNumber;
  }


  public DocumentExportFilterExtra rlbKata(Boolean rlbKata) {
    
    this.rlbKata = rlbKata;
    return this;
  }

   /**
   * Get rlbKata
   * @return rlbKata
  **/
  @javax.annotation.Nullable
  public Boolean getRlbKata() {
    return rlbKata;
  }


  public void setRlbKata(Boolean rlbKata) {
    this.rlbKata = rlbKata;
  }


  public DocumentExportFilterExtra rlbNote(String rlbNote) {
    
    this.rlbNote = rlbNote;
    return this;
  }

   /**
   * Get rlbNote
   * @return rlbNote
  **/
  @javax.annotation.Nullable
  public String getRlbNote() {
    return rlbNote;
  }


  public void setRlbNote(String rlbNote) {
    this.rlbNote = rlbNote;
  }


  public DocumentExportFilterExtra novitaxNaplokod(String novitaxNaplokod) {
    
    this.novitaxNaplokod = novitaxNaplokod;
    return this;
  }

   /**
   * Get novitaxNaplokod
   * @return novitaxNaplokod
  **/
  @javax.annotation.Nullable
  public String getNovitaxNaplokod() {
    return novitaxNaplokod;
  }


  public void setNovitaxNaplokod(String novitaxNaplokod) {
    this.novitaxNaplokod = novitaxNaplokod;
  }


  public DocumentExportFilterExtra useGrossValues(Boolean useGrossValues) {
    
    this.useGrossValues = useGrossValues;
    return this;
  }

   /**
   * Get useGrossValues
   * @return useGrossValues
  **/
  @javax.annotation.Nullable
  public Boolean getUseGrossValues() {
    return useGrossValues;
  }


  public void setUseGrossValues(Boolean useGrossValues) {
    this.useGrossValues = useGrossValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentExportFilterExtra documentExportFilterExtra = (DocumentExportFilterExtra) o;
    return Objects.equals(this.tensoftVkod, documentExportFilterExtra.tensoftVkod) &&
        Objects.equals(this.ledgerNumber, documentExportFilterExtra.ledgerNumber) &&
        Objects.equals(this.forintsoftKonyvelesiNaploSzam, documentExportFilterExtra.forintsoftKonyvelesiNaploSzam) &&
        Objects.equals(this.positiveLedgerNumber, documentExportFilterExtra.positiveLedgerNumber) &&
        Objects.equals(this.negativeLedgerNumber, documentExportFilterExtra.negativeLedgerNumber) &&
        Objects.equals(this.rlbKata, documentExportFilterExtra.rlbKata) &&
        Objects.equals(this.rlbNote, documentExportFilterExtra.rlbNote) &&
        Objects.equals(this.novitaxNaplokod, documentExportFilterExtra.novitaxNaplokod) &&
        Objects.equals(this.useGrossValues, documentExportFilterExtra.useGrossValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tensoftVkod, ledgerNumber, forintsoftKonyvelesiNaploSzam, positiveLedgerNumber, negativeLedgerNumber, rlbKata, rlbNote, novitaxNaplokod, useGrossValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentExportFilterExtra {\n");
    sb.append("    tensoftVkod: ").append(toIndentedString(tensoftVkod)).append("\n");
    sb.append("    ledgerNumber: ").append(toIndentedString(ledgerNumber)).append("\n");
    sb.append("    forintsoftKonyvelesiNaploSzam: ").append(toIndentedString(forintsoftKonyvelesiNaploSzam)).append("\n");
    sb.append("    positiveLedgerNumber: ").append(toIndentedString(positiveLedgerNumber)).append("\n");
    sb.append("    negativeLedgerNumber: ").append(toIndentedString(negativeLedgerNumber)).append("\n");
    sb.append("    rlbKata: ").append(toIndentedString(rlbKata)).append("\n");
    sb.append("    rlbNote: ").append(toIndentedString(rlbNote)).append("\n");
    sb.append("    novitaxNaplokod: ").append(toIndentedString(novitaxNaplokod)).append("\n");
    sb.append("    useGrossValues: ").append(toIndentedString(useGrossValues)).append("\n");
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
    openapiFields.add("tensoft_vkod");
    openapiFields.add("ledger_number");
    openapiFields.add("forintsoft_konyvelesi_naplo_szam");
    openapiFields.add("positive_ledger_number");
    openapiFields.add("negative_ledger_number");
    openapiFields.add("rlb_kata");
    openapiFields.add("rlb_note");
    openapiFields.add("novitax_naplokod");
    openapiFields.add("use_gross_values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentExportFilterExtra
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentExportFilterExtra.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentExportFilterExtra is not found in the empty JSON string", DocumentExportFilterExtra.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentExportFilterExtra.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentExportFilterExtra` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tensoft_vkod") != null && !jsonObj.get("tensoft_vkod").isJsonNull()) && !jsonObj.get("tensoft_vkod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tensoft_vkod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tensoft_vkod").toString()));
      }
      // validate the optional field `ledger_number`
      if (jsonObj.get("ledger_number") != null && !jsonObj.get("ledger_number").isJsonNull()) {
        LedgerNumberInformation.validateJsonElement(jsonObj.get("ledger_number"));
      }
      if ((jsonObj.get("forintsoft_konyvelesi_naplo_szam") != null && !jsonObj.get("forintsoft_konyvelesi_naplo_szam").isJsonNull()) && !jsonObj.get("forintsoft_konyvelesi_naplo_szam").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `forintsoft_konyvelesi_naplo_szam` to be a primitive type in the JSON string but got `%s`", jsonObj.get("forintsoft_konyvelesi_naplo_szam").toString()));
      }
      if ((jsonObj.get("positive_ledger_number") != null && !jsonObj.get("positive_ledger_number").isJsonNull()) && !jsonObj.get("positive_ledger_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `positive_ledger_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("positive_ledger_number").toString()));
      }
      if ((jsonObj.get("negative_ledger_number") != null && !jsonObj.get("negative_ledger_number").isJsonNull()) && !jsonObj.get("negative_ledger_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `negative_ledger_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("negative_ledger_number").toString()));
      }
      if ((jsonObj.get("rlb_note") != null && !jsonObj.get("rlb_note").isJsonNull()) && !jsonObj.get("rlb_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rlb_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rlb_note").toString()));
      }
      if ((jsonObj.get("novitax_naplokod") != null && !jsonObj.get("novitax_naplokod").isJsonNull()) && !jsonObj.get("novitax_naplokod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `novitax_naplokod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("novitax_naplokod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentExportFilterExtra.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentExportFilterExtra' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentExportFilterExtra> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentExportFilterExtra.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentExportFilterExtra>() {
           @Override
           public void write(JsonWriter out, DocumentExportFilterExtra value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentExportFilterExtra read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentExportFilterExtra given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentExportFilterExtra
  * @throws IOException if the JSON string is invalid with respect to DocumentExportFilterExtra
  */
  public static DocumentExportFilterExtra fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentExportFilterExtra.class);
  }

 /**
  * Convert an instance of DocumentExportFilterExtra to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

