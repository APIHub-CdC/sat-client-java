package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(ResponseInvoicePaymentType.Adapter.class)
public enum ResponseInvoicePaymentType {
  
  PUE("PUE"),
  
  PPD("PPD");
  private String value;
  ResponseInvoicePaymentType(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseInvoicePaymentType fromValue(String text) {
    for (ResponseInvoicePaymentType b : ResponseInvoicePaymentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseInvoicePaymentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseInvoicePaymentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseInvoicePaymentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseInvoicePaymentType.fromValue(String.valueOf(value));
    }
  }
}
