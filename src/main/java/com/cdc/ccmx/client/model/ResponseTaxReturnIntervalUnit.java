package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(ResponseTaxReturnIntervalUnit.Adapter.class)
public enum ResponseTaxReturnIntervalUnit {
  
  ANUAL("Anual"),
  
  MENSUAL("Mensual"),
  
  RIF("RIF");
  private String value;
  ResponseTaxReturnIntervalUnit(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseTaxReturnIntervalUnit fromValue(String text) {
    for (ResponseTaxReturnIntervalUnit b : ResponseTaxReturnIntervalUnit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseTaxReturnIntervalUnit> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseTaxReturnIntervalUnit enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseTaxReturnIntervalUnit read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseTaxReturnIntervalUnit.fromValue(String.valueOf(value));
    }
  }
}
