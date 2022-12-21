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


public class ResponseCredential400Violation {
  @SerializedName("propertyPath")
  private String propertyPath = null;
  @SerializedName("message")
  private String message = null;
  public ResponseCredential400Violation propertyPath(String propertyPath) {
    this.propertyPath = propertyPath;
    return this;
  }
   
  @ApiModelProperty(example = "exampleField", value = "Property access path")
  public String getPropertyPath() {
    return propertyPath;
  }
  public void setPropertyPath(String propertyPath) {
    this.propertyPath = propertyPath;
  }
  public ResponseCredential400Violation message(String message) {
    this.message = message;
    return this;
  }
   
  @ApiModelProperty(example = "This value should not be blank.", value = "Validaton error message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCredential400Violation responseCredential400Violation = (ResponseCredential400Violation) o;
    return Objects.equals(this.propertyPath, responseCredential400Violation.propertyPath) &&
        Objects.equals(this.message, responseCredential400Violation.message);
  }
  @Override
  public int hashCode() {
    return Objects.hash(propertyPath, message);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCredential400Violation {\n");
    
    sb.append("    propertyPath: ").append(toIndentedString(propertyPath)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
