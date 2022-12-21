package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(Complementary.Adapter.class)
public enum Complementary {
  
  DECLARACI_N_NO_PRESENTADA("Declaración no Presentada"),
  
  DEJAR_SIN_EFECTO_DECLARACI_N("Dejar sin Efecto Declaración"),
  
  DEJAR_SIN_EFECTO_OBLIGACI_N("Dejar sin Efecto Obligación"),
  
  ESQUEMA_ANTERIOR("Esquema Anterior"),
  
  MODIFICACI_N_DE_DECLARACI_N("Modificación de Declaración"),
  
  MODIFICACI_N_DE_OBLIGACIONES("Modificación de Obligaciones"),
  
  OBLIGACI_N_NO_PRESENTADA("Obligación no presentada");
  private String value;
  Complementary(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static Complementary fromValue(String text) {
    for (Complementary b : Complementary.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<Complementary> {
    @Override
    public void write(final JsonWriter jsonWriter, final Complementary enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public Complementary read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Complementary.fromValue(String.valueOf(value));
    }
  }
}
