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


public class ResponseTaxStatusObligation {
  @SerializedName("description")
  private String description = null;
  @SerializedName("dueDate")
  private String dueDate = null;
  @SerializedName("endDate")
  private LocalDate endDate = null;
  @SerializedName("startDate")
  private LocalDate startDate = null;
  public ResponseTaxStatusObligation description(String description) {
    this.description = description;
    return this;
  }
   
  @ApiModelProperty(example = "Pago definitivo mensual de IVA.", value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public ResponseTaxStatusObligation dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }
   
  @ApiModelProperty(example = "A más tardar el día 17 del mes inmediato posterior al periodo que corresponda.", value = "")
  public String getDueDate() {
    return dueDate;
  }
  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }
  public ResponseTaxStatusObligation endDate(LocalDate endDate) {
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
  public ResponseTaxStatusObligation startDate(LocalDate startDate) {
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
    ResponseTaxStatusObligation responseTaxStatusObligation = (ResponseTaxStatusObligation) o;
    return Objects.equals(this.description, responseTaxStatusObligation.description) &&
        Objects.equals(this.dueDate, responseTaxStatusObligation.dueDate) &&
        Objects.equals(this.endDate, responseTaxStatusObligation.endDate) &&
        Objects.equals(this.startDate, responseTaxStatusObligation.startDate);
  }
  @Override
  public int hashCode() {
    return Objects.hash(description, dueDate, endDate, startDate);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTaxStatusObligation {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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
