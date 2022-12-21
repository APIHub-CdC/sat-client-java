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
@ApiModel(description = "CIEC")


public class CredentialCiecInput {
  @SerializedName("type")
  private String type = null;
  @SerializedName("rfc")
  private String rfc = null;
  @SerializedName("password")
  private String password = null;
  public CredentialCiecInput type(String type) {
    this.type = type;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public CredentialCiecInput rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }
   
  @ApiModelProperty(example = "PEIC211118IS0", required = true, value = "Taxpayer ID (Registro Federal de Contribuyentes)")
  public String getRfc() {
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }
  public CredentialCiecInput password(String password) {
    this.password = password;
    return this;
  }
   
  @ApiModelProperty(example = "secret123", required = true, value = "CIEC's password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialCiecInput credentialCiecInput = (CredentialCiecInput) o;
    return Objects.equals(this.type, credentialCiecInput.type) &&
        Objects.equals(this.rfc, credentialCiecInput.rfc) &&
        Objects.equals(this.password, credentialCiecInput.password);
  }
  @Override
  public int hashCode() {
    return Objects.hash(type, rfc, password);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialCiecInput {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
