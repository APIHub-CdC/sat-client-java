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


public class ResponseTaxComplianceTaxpayer {
  @SerializedName("rfc")
  private String rfc = null;
  @SerializedName("name")
  private String name = null;
  public ResponseTaxComplianceTaxpayer rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }
   
  @ApiModelProperty(example = "PEIC211118IS0", value = "RFC (Registro Federal de Contribuyentes)")
  public String getRfc() {
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }
  public ResponseTaxComplianceTaxpayer name(String name) {
    this.name = name;
    return this;
  }
   
  @ApiModelProperty(example = "Pedro Infante Cruz", value = "Taxpayer name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseTaxComplianceTaxpayer responseTaxComplianceTaxpayer = (ResponseTaxComplianceTaxpayer) o;
    return Objects.equals(this.rfc, responseTaxComplianceTaxpayer.rfc) &&
        Objects.equals(this.name, responseTaxComplianceTaxpayer.name);
  }
  @Override
  public int hashCode() {
    return Objects.hash(rfc, name);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTaxComplianceTaxpayer {\n");
    
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
