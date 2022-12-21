package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;

import com.cdc.ccmx.client.model.ResponseHydraMapping;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ResponseHydraSearch {
  @SerializedName("@type")
  private String type = null;
  @SerializedName("hydra:template")
  private String hydratemplate = null;
  @SerializedName("hydra:variableRepresentation")
  private String hydravariableRepresentation = null;
  @SerializedName("hydra:mapping")
  private List<ResponseHydraMapping> hydramapping = null;
  public ResponseHydraSearch type(String type) {
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
  public ResponseHydraSearch hydratemplate(String hydratemplate) {
    this.hydratemplate = hydratemplate;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getHydratemplate() {
    return hydratemplate;
  }
  public void setHydratemplate(String hydratemplate) {
    this.hydratemplate = hydratemplate;
  }
  public ResponseHydraSearch hydravariableRepresentation(String hydravariableRepresentation) {
    this.hydravariableRepresentation = hydravariableRepresentation;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getHydravariableRepresentation() {
    return hydravariableRepresentation;
  }
  public void setHydravariableRepresentation(String hydravariableRepresentation) {
    this.hydravariableRepresentation = hydravariableRepresentation;
  }
  public ResponseHydraSearch hydramapping(List<ResponseHydraMapping> hydramapping) {
    this.hydramapping = hydramapping;
    return this;
  }
  public ResponseHydraSearch addHydramappingItem(ResponseHydraMapping hydramappingItem) {
    if (this.hydramapping == null) {
      this.hydramapping = new ArrayList<ResponseHydraMapping>();
    }
    this.hydramapping.add(hydramappingItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<ResponseHydraMapping> getHydramapping() {
    return hydramapping;
  }
  public void setHydramapping(List<ResponseHydraMapping> hydramapping) {
    this.hydramapping = hydramapping;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHydraSearch responseHydraSearch = (ResponseHydraSearch) o;
    return Objects.equals(this.type, responseHydraSearch.type) &&
        Objects.equals(this.hydratemplate, responseHydraSearch.hydratemplate) &&
        Objects.equals(this.hydravariableRepresentation, responseHydraSearch.hydravariableRepresentation) &&
        Objects.equals(this.hydramapping, responseHydraSearch.hydramapping);
  }
  @Override
  public int hashCode() {
    return Objects.hash(type, hydratemplate, hydravariableRepresentation, hydramapping);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHydraSearch {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hydratemplate: ").append(toIndentedString(hydratemplate)).append("\n");
    sb.append("    hydravariableRepresentation: ").append(toIndentedString(hydravariableRepresentation)).append("\n");
    sb.append("    hydramapping: ").append(toIndentedString(hydramapping)).append("\n");
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
