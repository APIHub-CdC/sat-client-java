package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;


public class ResponseTaxStatusTaxRegime {
  @SerializedName("name")
  private String name = null;
  @SerializedName("endDate")
  private LocalDate endDate = null;
  @SerializedName("startDate")
  private LocalDate startDate = null;
  public ResponseTaxStatusTaxRegime name(String name) {
    this.name = name;
    return this;
  }
   
  @ApiModelProperty(example = "Régimen de Sueldos y Salarios e Ingresos Asimilados a Salarios", value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public ResponseTaxStatusTaxRegime endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }
  public ResponseTaxStatusTaxRegime startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseTaxStatusTaxRegime responseTaxStatusTaxRegime = (ResponseTaxStatusTaxRegime) o;
    return Objects.equals(this.name, responseTaxStatusTaxRegime.name) &&
        Objects.equals(this.endDate, responseTaxStatusTaxRegime.endDate) &&
        Objects.equals(this.startDate, responseTaxStatusTaxRegime.startDate);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, endDate, startDate);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTaxStatusTaxRegime {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
