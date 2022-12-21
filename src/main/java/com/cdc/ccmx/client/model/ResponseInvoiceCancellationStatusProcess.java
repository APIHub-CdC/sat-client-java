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
@JsonAdapter(ResponseInvoiceCancellationStatusProcess.Adapter.class)
public enum ResponseInvoiceCancellationStatusProcess {
  
  EN_PROCESO("En proceso"),
  
  SOLICITUD_RECHAZADA("Solicitud rechazada"),
  
  CANCELADO_SIN_ACEPTACI_N("Cancelado sin aceptación"),
  
  CANCELADO_CON_ACEPTACI_N("Cancelado con aceptación"),
  
  PLAZO_VENCIDO("Plazo vencido");
  private String value;
  ResponseInvoiceCancellationStatusProcess(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseInvoiceCancellationStatusProcess fromValue(String text) {
    for (ResponseInvoiceCancellationStatusProcess b : ResponseInvoiceCancellationStatusProcess.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseInvoiceCancellationStatusProcess> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseInvoiceCancellationStatusProcess enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseInvoiceCancellationStatusProcess read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseInvoiceCancellationStatusProcess.fromValue(String.valueOf(value));
    }
  }
}
