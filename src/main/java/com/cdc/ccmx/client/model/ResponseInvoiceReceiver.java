package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;

import com.cdc.ccmx.client.model.ResponseCredentialType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;


public class ResponseInvoiceReceiver {
  @SerializedName("rfc")
  private String rfc = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("blacklistStatus")
  private ResponseCredentialType blacklistStatus = null;
  public ResponseInvoiceReceiver rfc(String rfc) {
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
  public ResponseInvoiceReceiver name(String name) {
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
  public ResponseInvoiceReceiver blacklistStatus(ResponseCredentialType blacklistStatus) {
    this.blacklistStatus = blacklistStatus;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseCredentialType getBlacklistStatus() {
    return blacklistStatus;
  }
  public void setBlacklistStatus(ResponseCredentialType blacklistStatus) {
    this.blacklistStatus = blacklistStatus;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseInvoiceReceiver responseInvoiceReceiver = (ResponseInvoiceReceiver) o;
    return Objects.equals(this.rfc, responseInvoiceReceiver.rfc) &&
        Objects.equals(this.name, responseInvoiceReceiver.name) &&
        Objects.equals(this.blacklistStatus, responseInvoiceReceiver.blacklistStatus);
  }
  @Override
  public int hashCode() {
    return Objects.hash(rfc, name, blacklistStatus);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInvoiceReceiver {\n");
    
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    blacklistStatus: ").append(toIndentedString(blacklistStatus)).append("\n");
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
