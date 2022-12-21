package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(OrderPeriod.Adapter.class)
public enum OrderPeriod {
  
  ASC("asc"),
  
  DESC("desc");
  private String value;
  OrderPeriod(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static OrderPeriod fromValue(String text) {
    for (OrderPeriod b : OrderPeriod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<OrderPeriod> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderPeriod enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public OrderPeriod read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderPeriod.fromValue(String.valueOf(value));
    }
  }
}
