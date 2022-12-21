package com.cdc.ccmx.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class ResponseRFCValidator {
  @SerializedName("valid")
  private Boolean valid = null;
  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  public ResponseRFCValidator valid(Boolean valid) {
    this.valid = valid;
    return this;
  }
   
  @ApiModelProperty(example = "true", value = "It is `true` if the format is correct")
  public Boolean isValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
  public ResponseRFCValidator active(Boolean active) {
    this.active = active;
    return this;
  }
   
  @ApiModelProperty(value = "Due to the removal of the service used to determine the active status of an RFC, the `active` field will always return `null`")
  public Boolean isActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }
  public ResponseRFCValidator type(String type) {
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
  public ResponseRFCValidator createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRFCValidator responseRFCValidator = (ResponseRFCValidator) o;
    return Objects.equals(this.valid, responseRFCValidator.valid) &&
        Objects.equals(this.active, responseRFCValidator.active) &&
        Objects.equals(this.type, responseRFCValidator.type) &&
        Objects.equals(this.createdAt, responseRFCValidator.createdAt);
  }
  @Override
  public int hashCode() {
    return Objects.hash(valid, active, type, createdAt);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRFCValidator {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
