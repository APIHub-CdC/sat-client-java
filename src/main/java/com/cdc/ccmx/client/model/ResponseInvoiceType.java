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
@JsonAdapter(ResponseInvoiceType.Adapter.class)
public enum ResponseInvoiceType {
  
  I("I"),
  
  E("E"),
  
  P("P"),
  
  N("N"),
  
  T("T");
  private String value;
  ResponseInvoiceType(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseInvoiceType fromValue(String text) {
    for (ResponseInvoiceType b : ResponseInvoiceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseInvoiceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseInvoiceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseInvoiceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseInvoiceType.fromValue(String.valueOf(value));
    }
  }
}
