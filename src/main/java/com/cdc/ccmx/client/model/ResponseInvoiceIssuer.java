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


public class ResponseInvoiceIssuer {
  @SerializedName("rfc")
  private String rfc = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("taxRegime")
  private Double taxRegime = null;
  @SerializedName("blacklistStatus")
  private ResponseCredentialType blacklistStatus = null;
  public ResponseInvoiceIssuer rfc(String rfc) {
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
  public ResponseInvoiceIssuer name(String name) {
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
  public ResponseInvoiceIssuer taxRegime(Double taxRegime) {
    this.taxRegime = taxRegime;
    return this;
  }
   
  @ApiModelProperty(example = "601.0", value = "Tax regime code from `c_RegimenFiscal` catalog")
  public Double getTaxRegime() {
    return taxRegime;
  }
  public void setTaxRegime(Double taxRegime) {
    this.taxRegime = taxRegime;
  }
  public ResponseInvoiceIssuer blacklistStatus(ResponseCredentialType blacklistStatus) {
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
    ResponseInvoiceIssuer responseInvoiceIssuer = (ResponseInvoiceIssuer) o;
    return Objects.equals(this.rfc, responseInvoiceIssuer.rfc) &&
        Objects.equals(this.name, responseInvoiceIssuer.name) &&
        Objects.equals(this.taxRegime, responseInvoiceIssuer.taxRegime) &&
        Objects.equals(this.blacklistStatus, responseInvoiceIssuer.blacklistStatus);
  }
  @Override
  public int hashCode() {
    return Objects.hash(rfc, name, taxRegime, blacklistStatus);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInvoiceIssuer {\n");
    
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxRegime: ").append(toIndentedString(taxRegime)).append("\n");
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
