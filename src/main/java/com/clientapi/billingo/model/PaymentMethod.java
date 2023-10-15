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
 * Gets or Sets PaymentMethod
 */
@JsonAdapter(PaymentMethod.Adapter.class)
public enum PaymentMethod {
  
  ARUHITEL("aruhitel"),
  
  BANKCARD("bankcard"),
  
  BARION("barion"),
  
  BARTER("barter"),
  
  CASH("cash"),
  
  CASH_ON_DELIVERY("cash_on_delivery"),
  
  COUPON("coupon"),
  
  ELORE_UTALAS("elore_utalas"),
  
  EP_KARTYA("ep_kartya"),
  
  KOMPENZACIO("kompenzacio"),
  
  LEVONAS("levonas"),
  
  ONLINE_BANKCARD("online_bankcard"),
  
  OTHER("other"),
  
  PAYLIKE("paylike"),
  
  PAYONEER("payoneer"),
  
  PAYPAL("paypal"),
  
  PAYPAL_UTOLAG("paypal_utolag"),
  
  PAYU("payu"),
  
  PICK_PACK_PONT("pick_pack_pont"),
  
  POSTAI_CSEKK("postai_csekk"),
  
  POSTAUTALVANY("postautalvany"),
  
  SKRILL("skrill"),
  
  SZEP_CARD("szep_card"),
  
  TRANSFERWISE("transferwise"),
  
  UPWORK("upwork"),
  
  UTALVANY("utalvany"),
  
  VALTO("valto"),
  
  WIRE_TRANSFER("wire_transfer");

  private String value;

  PaymentMethod(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentMethod fromValue(String value) {
    for (PaymentMethod b : PaymentMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PaymentMethod> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentMethod enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentMethod read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentMethod.fromValue(value);
    }
  }
}

