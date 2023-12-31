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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets DocumentExportSortBy
 */
@JsonAdapter(DocumentExportSortBy.Adapter.class)
public enum DocumentExportSortBy {
  
  FULFILLMENT_DATE("fulfillment_date"),
  
  INVOICE_DATE("invoice_date"),
  
  INVOICE_RAW_NUMBER("invoice_raw_number");

  private String value;

  DocumentExportSortBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DocumentExportSortBy fromValue(String value) {
    for (DocumentExportSortBy b : DocumentExportSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DocumentExportSortBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final DocumentExportSortBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DocumentExportSortBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DocumentExportSortBy.fromValue(value);
    }
  }
}

