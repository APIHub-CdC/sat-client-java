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
@JsonAdapter(ResponseInvoiceCancellationStatus.Adapter.class)
public enum ResponseInvoiceCancellationStatus {
  
  CANCELABLE_SIN_ACEPTACI_N("Cancelable sin aceptación"),
  
  CANCELABLE_CON_ACEPTACI_N("Cancelable con aceptación"),
  
  NO_CANCELABLE("No cancelable");
  private String value;
  ResponseInvoiceCancellationStatus(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseInvoiceCancellationStatus fromValue(String text) {
    for (ResponseInvoiceCancellationStatus b : ResponseInvoiceCancellationStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseInvoiceCancellationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseInvoiceCancellationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseInvoiceCancellationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseInvoiceCancellationStatus.fromValue(String.valueOf(value));
    }
  }
}
