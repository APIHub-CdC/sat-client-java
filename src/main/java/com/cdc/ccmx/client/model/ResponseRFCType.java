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
@JsonAdapter(ResponseRFCType.Adapter.class)
public enum ResponseRFCType {
  
  PHYSICAL("physical"),
  
  LEGAL("legal");
  private String value;
  ResponseRFCType(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseRFCType fromValue(String text) {
    for (ResponseRFCType b : ResponseRFCType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseRFCType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseRFCType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseRFCType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseRFCType.fromValue(String.valueOf(value));
    }
  }
}
