package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(Type.Adapter.class)
public enum Type {
  
  I("I"),
  
  E("E"),
  
  P("P"),
  
  N("N"),
  
  T("T");
  private String value;
  Type(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static Type fromValue(String text) {
    for (Type b : Type.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<Type> {
    @Override
    public void write(final JsonWriter jsonWriter, final Type enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public Type read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Type.fromValue(String.valueOf(value));
    }
  }
}
