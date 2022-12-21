package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(OrderCanceledAt.Adapter.class)
public enum OrderCanceledAt {
  
  ASC("asc"),
  
  DESC("desc");
  private String value;
  OrderCanceledAt(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static OrderCanceledAt fromValue(String text) {
    for (OrderCanceledAt b : OrderCanceledAt.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<OrderCanceledAt> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderCanceledAt enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public OrderCanceledAt read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderCanceledAt.fromValue(String.valueOf(value));
    }
  }
}
