package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(PaymentType.Adapter.class)
public enum PaymentType {
  
  PUE("PUE"),
  
  PPD("PPD");
  private String value;
  PaymentType(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static PaymentType fromValue(String text) {
    for (PaymentType b : PaymentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<PaymentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public PaymentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentType.fromValue(String.valueOf(value));
    }
  }
}
