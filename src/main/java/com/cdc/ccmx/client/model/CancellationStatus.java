package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CancellationStatus.Adapter.class)
public enum CancellationStatus {
  
  CANCELABLE_SIN_ACEPTACI_N("Cancelable sin aceptación"),
  
  CANCELABLE_CON_ACEPTACI_N("Cancelable con aceptación"),
  
  NO_CANCELABLE("No cancelable");
  private String value;
  CancellationStatus(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CancellationStatus fromValue(String text) {
    for (CancellationStatus b : CancellationStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CancellationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CancellationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CancellationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CancellationStatus.fromValue(String.valueOf(value));
    }
  }
}
