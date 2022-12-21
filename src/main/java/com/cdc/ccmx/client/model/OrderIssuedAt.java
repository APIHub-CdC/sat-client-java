package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(OrderIssuedAt.Adapter.class)
public enum OrderIssuedAt {
  
  ASC("asc"),
  
  DESC("desc");
  private String value;
  OrderIssuedAt(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static OrderIssuedAt fromValue(String text) {
    for (OrderIssuedAt b : OrderIssuedAt.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<OrderIssuedAt> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderIssuedAt enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public OrderIssuedAt read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderIssuedAt.fromValue(String.valueOf(value));
    }
  }
}
