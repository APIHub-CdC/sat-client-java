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
@JsonAdapter(ResponseTaxpayerBlacklistStatus.Adapter.class)
public enum ResponseTaxpayerBlacklistStatus {
  
  PRESUMED("presumed"),
  
  DISMISSED("dismissed"),
  
  DEFINITIVE("definitive"),
  
  FAVORABLE("favorable");
  private String value;
  ResponseTaxpayerBlacklistStatus(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseTaxpayerBlacklistStatus fromValue(String text) {
    for (ResponseTaxpayerBlacklistStatus b : ResponseTaxpayerBlacklistStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseTaxpayerBlacklistStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseTaxpayerBlacklistStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseTaxpayerBlacklistStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseTaxpayerBlacklistStatus.fromValue(String.valueOf(value));
    }
  }
}
