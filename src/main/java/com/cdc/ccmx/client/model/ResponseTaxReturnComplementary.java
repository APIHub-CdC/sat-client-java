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
@JsonAdapter(ResponseTaxReturnComplementary.Adapter.class)
public enum ResponseTaxReturnComplementary {
  
  DECLARACI_N_NO_PRESENTADA("Declaración no Presentada"),
  
  DEJAR_SIN_EFECTO_DECLARACI_N("Dejar sin Efecto Declaración"),
  
  DEJAR_SIN_EFECTO_OBLIGACI_N("Dejar sin Efecto Obligación"),
  
  ESQUEMA_ANTERIOR("Esquema Anterior"),
  
  MODIFICACI_N_DE_DECLARACI_N("Modificación de Declaración"),
  
  MODIFICACI_N_DE_OBLIGACIONES("Modificación de Obligaciones"),
  
  OBLIGACI_N_NO_PRESENTADA("Obligación no presentada");
  private String value;
  ResponseTaxReturnComplementary(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ResponseTaxReturnComplementary fromValue(String text) {
    for (ResponseTaxReturnComplementary b : ResponseTaxReturnComplementary.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ResponseTaxReturnComplementary> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseTaxReturnComplementary enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ResponseTaxReturnComplementary read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseTaxReturnComplementary.fromValue(String.valueOf(value));
    }
  }
}
