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


public class ResponseHydraMapping {
  @SerializedName("@type")
  private String type = null;
  @SerializedName("variable")
  private String variable = null;
  @SerializedName("property")
  private String property = null;
  @SerializedName("required")
  private Boolean required = null;
  public ResponseHydraMapping type(String type) {
    this.type = type;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public ResponseHydraMapping variable(String variable) {
    this.variable = variable;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getVariable() {
    return variable;
  }
  public void setVariable(String variable) {
    this.variable = variable;
  }
  public ResponseHydraMapping property(String property) {
    this.property = property;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }
  public ResponseHydraMapping required(Boolean required) {
    this.required = required;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHydraMapping responseHydraMapping = (ResponseHydraMapping) o;
    return Objects.equals(this.type, responseHydraMapping.type) &&
        Objects.equals(this.variable, responseHydraMapping.variable) &&
        Objects.equals(this.property, responseHydraMapping.property) &&
        Objects.equals(this.required, responseHydraMapping.required);
  }
  @Override
  public int hashCode() {
    return Objects.hash(type, variable, property, required);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHydraMapping {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
