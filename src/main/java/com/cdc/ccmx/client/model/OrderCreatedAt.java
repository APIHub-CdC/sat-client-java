package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(OrderCreatedAt.Adapter.class)
public enum OrderCreatedAt {
  
  ASC("asc"),
  
  DESC("desc");
  private String value;
  OrderCreatedAt(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static OrderCreatedAt fromValue(String text) {
    for (OrderCreatedAt b : OrderCreatedAt.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<OrderCreatedAt> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderCreatedAt enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public OrderCreatedAt read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderCreatedAt.fromValue(String.valueOf(value));
    }
  }
}
