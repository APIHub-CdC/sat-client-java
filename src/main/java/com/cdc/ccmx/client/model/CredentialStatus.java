package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CredentialStatus.Adapter.class)
public enum CredentialStatus {
  
  PENDING("pending"),
  
  VALID("valid"),
  
  INVALID("invalid"),
  
  DEACTIVATED("deactivated"),
  
  ERROR("error");
  private String value;
  CredentialStatus(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CredentialStatus fromValue(String text) {
    for (CredentialStatus b : CredentialStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CredentialStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CredentialStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CredentialStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CredentialStatus.fromValue(String.valueOf(value));
    }
  }
}
