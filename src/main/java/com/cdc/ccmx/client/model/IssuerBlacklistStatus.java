package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(IssuerBlacklistStatus.Adapter.class)
public enum IssuerBlacklistStatus {
  
  PRESUMED("presumed"),
  
  DISMISSED("dismissed"),
  
  DEFINITIVE("definitive"),
  
  FAVORABLE("favorable");
  private String value;
  IssuerBlacklistStatus(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static IssuerBlacklistStatus fromValue(String text) {
    for (IssuerBlacklistStatus b : IssuerBlacklistStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<IssuerBlacklistStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final IssuerBlacklistStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public IssuerBlacklistStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IssuerBlacklistStatus.fromValue(String.valueOf(value));
    }
  }
}
