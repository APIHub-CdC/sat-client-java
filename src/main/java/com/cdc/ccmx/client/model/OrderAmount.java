package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(OrderAmount.Adapter.class)
public enum OrderAmount {
  
  ASC("asc"),
  
  DESC("desc");
  private String value;
  OrderAmount(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static OrderAmount fromValue(String text) {
    for (OrderAmount b : OrderAmount.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<OrderAmount> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderAmount enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public OrderAmount read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderAmount.fromValue(String.valueOf(value));
    }
  }
}
