package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;

import com.cdc.ccmx.client.model.ResponseCredential400Violation;
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


public class ResponseCredential400 {
  @SerializedName("@context")
  private String context = "/contexts/ConstraintViolationList";
  @SerializedName("@type")
  private String type = "ConstraintViolationList";
  @SerializedName("hydra:title")
  private String hydratitle = "An error occurred";
  @SerializedName("hydra:description")
  private String hydradescription = null;
  @SerializedName("violations")
  private List<ResponseCredential400Violation> violations = null;
  public ResponseCredential400 context(String context) {
    this.context = context;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }
  public ResponseCredential400 type(String type) {
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
  public ResponseCredential400 hydratitle(String hydratitle) {
    this.hydratitle = hydratitle;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getHydratitle() {
    return hydratitle;
  }
  public void setHydratitle(String hydratitle) {
    this.hydratitle = hydratitle;
  }
  public ResponseCredential400 hydradescription(String hydradescription) {
    this.hydradescription = hydradescription;
    return this;
  }
   
  @ApiModelProperty(example = "exampleField: This value should not be blank.", value = "Concatenated violation messages")
  public String getHydradescription() {
    return hydradescription;
  }
  public void setHydradescription(String hydradescription) {
    this.hydradescription = hydradescription;
  }
  public ResponseCredential400 violations(List<ResponseCredential400Violation> violations) {
    this.violations = violations;
    return this;
  }
  public ResponseCredential400 addViolationsItem(ResponseCredential400Violation violationsItem) {
    if (this.violations == null) {
      this.violations = new ArrayList<ResponseCredential400Violation>();
    }
    this.violations.add(violationsItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<ResponseCredential400Violation> getViolations() {
    return violations;
  }
  public void setViolations(List<ResponseCredential400Violation> violations) {
    this.violations = violations;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCredential400 responseCredential400 = (ResponseCredential400) o;
    return Objects.equals(this.context, responseCredential400.context) &&
        Objects.equals(this.type, responseCredential400.type) &&
        Objects.equals(this.hydratitle, responseCredential400.hydratitle) &&
        Objects.equals(this.hydradescription, responseCredential400.hydradescription) &&
        Objects.equals(this.violations, responseCredential400.violations);
  }
  @Override
  public int hashCode() {
    return Objects.hash(context, type, hydratitle, hydradescription, violations);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCredential400 {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hydratitle: ").append(toIndentedString(hydratitle)).append("\n");
    sb.append("    hydradescription: ").append(toIndentedString(hydradescription)).append("\n");
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
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
