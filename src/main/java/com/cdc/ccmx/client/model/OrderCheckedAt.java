package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(OrderCheckedAt.Adapter.class)
public enum OrderCheckedAt {
  
  ASC("asc"),
  
  DESC("desc");
  private String value;
  OrderCheckedAt(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static OrderCheckedAt fromValue(String text) {
    for (OrderCheckedAt b : OrderCheckedAt.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<OrderCheckedAt> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderCheckedAt enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public OrderCheckedAt read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderCheckedAt.fromValue(String.valueOf(value));
    }
  }
}
