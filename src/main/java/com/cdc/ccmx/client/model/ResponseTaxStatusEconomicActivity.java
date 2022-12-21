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


public class ResponseTaxStatusEconomicActivity {
  @SerializedName("name")
  private String name = null;
  @SerializedName("order")
  private String order = null;
  @SerializedName("percentage")
  private String percentage = null;
  @SerializedName("endDate")
  private LocalDate endDate = null;
  @SerializedName("startDate")
  private LocalDate startDate = null;
  public ResponseTaxStatusEconomicActivity name(String name) {
    this.name = name;
    return this;
  }
   
  @ApiModelProperty(example = "Asalariado", value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public ResponseTaxStatusEconomicActivity order(String order) {
    this.order = order;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }
  public ResponseTaxStatusEconomicActivity percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }
   
  @ApiModelProperty(example = "100", value = "")
  public String getPercentage() {
    return percentage;
  }
  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }
  public ResponseTaxStatusEconomicActivity endDate(LocalDate endDate) {
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
  public ResponseTaxStatusEconomicActivity startDate(LocalDate startDate) {
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
    ResponseTaxStatusEconomicActivity responseTaxStatusEconomicActivity = (ResponseTaxStatusEconomicActivity) o;
    return Objects.equals(this.name, responseTaxStatusEconomicActivity.name) &&
        Objects.equals(this.order, responseTaxStatusEconomicActivity.order) &&
        Objects.equals(this.percentage, responseTaxStatusEconomicActivity.percentage) &&
        Objects.equals(this.endDate, responseTaxStatusEconomicActivity.endDate) &&
        Objects.equals(this.startDate, responseTaxStatusEconomicActivity.startDate);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, order, percentage, endDate, startDate);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTaxStatusEconomicActivity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
