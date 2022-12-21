package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(OrderCertifiedAt.Adapter.class)
public enum OrderCertifiedAt {
  
  ASC("asc"),
  
  DESC("desc");
  private String value;
  OrderCertifiedAt(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static OrderCertifiedAt fromValue(String text) {
    for (OrderCertifiedAt b : OrderCertifiedAt.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<OrderCertifiedAt> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderCertifiedAt enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public OrderCertifiedAt read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderCertifiedAt.fromValue(String.valueOf(value));
    }
  }
}
