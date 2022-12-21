package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(ResponseTaxpayerPersonType.Adapter.class)
public enum ResponseTaxpayerPersonType {
  
  PHYSICAL("physical"),
  
  LEGAL("legal");
  private String value;
  ResponseTaxpayerPersonType(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseTaxpayerPersonType fromValue(String text) {
    for (ResponseTaxpayerPersonType b : ResponseTaxpayerPersonType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseTaxpayerPersonType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseTaxpayerPersonType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseTaxpayerPersonType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseTaxpayerPersonType.fromValue(String.valueOf(value));
    }
  }
}
