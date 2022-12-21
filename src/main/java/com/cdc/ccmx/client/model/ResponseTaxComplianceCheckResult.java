package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(ResponseTaxComplianceCheckResult.Adapter.class)
public enum ResponseTaxComplianceCheckResult {
  
  POSITIVE("positive"),
  
  NEGATIVE("negative"),
  
  NO_OBLIGATIONS("no_obligations");
  private String value;
  ResponseTaxComplianceCheckResult(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseTaxComplianceCheckResult fromValue(String text) {
    for (ResponseTaxComplianceCheckResult b : ResponseTaxComplianceCheckResult.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseTaxComplianceCheckResult> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseTaxComplianceCheckResult enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseTaxComplianceCheckResult read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseTaxComplianceCheckResult.fromValue(String.valueOf(value));
    }
  }
}
