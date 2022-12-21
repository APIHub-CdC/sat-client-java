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
@JsonAdapter(ResponseInvoiceStatus.Adapter.class)
public enum ResponseInvoiceStatus {
  
  VIGENTE("VIGENTE"),
  
  CANCELADO("CANCELADO");
  private String value;
  ResponseInvoiceStatus(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseInvoiceStatus fromValue(String text) {
    for (ResponseInvoiceStatus b : ResponseInvoiceStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseInvoiceStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseInvoiceStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseInvoiceStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseInvoiceStatus.fromValue(String.valueOf(value));
    }
  }
}
