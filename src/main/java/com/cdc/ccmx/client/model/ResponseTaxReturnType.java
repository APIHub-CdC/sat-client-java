package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(ResponseTaxReturnType.Adapter.class)
public enum ResponseTaxReturnType {
  
  COMPLEMENTARIA("Complementaria"),
  
  COMPLEMENTARIA_CORRECCI_N_FISCAL("Complementaria Corrección Fiscal"),
  
  COMPLEMENTARIA_DICTAMEN("Complementaria Dictamen"),
  
  NORMAL("Normal"),
  
  NORMAL_POR_CORRECCI_N_FISCAL("Normal por Corrección Fiscal");
  private String value;
  ResponseTaxReturnType(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseTaxReturnType fromValue(String text) {
    for (ResponseTaxReturnType b : ResponseTaxReturnType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseTaxReturnType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseTaxReturnType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseTaxReturnType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseTaxReturnType.fromValue(String.valueOf(value));
    }
  }
}
