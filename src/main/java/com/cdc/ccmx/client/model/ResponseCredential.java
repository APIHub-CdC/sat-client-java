package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.UUID;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class ResponseCredential {
  @SerializedName("@context")
  private String context = "/contexts/Credential";
  @SerializedName("@id")
  private String id1 = null;
  @SerializedName("@type")
  private String type1 = "Credential";
  @SerializedName("id")
  private UUID id = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("rfc")
  private String rfc = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
  public ResponseCredential context(String context) {
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
   
  @ApiModelProperty(example = "/credentials/91106968-1abd-4d64-85c1-4e73d96fb997", value = "Credential IRI reference")
  public String getId1() {
    return id1;
  }
   
  @ApiModelProperty(value = "")
  public String getType1() {
    return type1;
  }
   
  @ApiModelProperty(example = "91106968-1abd-4d64-85c1-4e73d96fb997", value = "")
  public UUID getId() {
    return id;
  }
  public ResponseCredential type(String type) {
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
  public ResponseCredential rfc(String rfc) {
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
  public ResponseCredential status(String status) {
    this.status = status;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
   
  @ApiModelProperty(example = "2020-01-01T12:15:00.000Z", value = "Date and time the resource was created")
  public String getCreatedAt() {
    return createdAt;
  }
   
  @ApiModelProperty(example = "2020-01-01T12:15:00.000Z", value = "Date and time the resource was last updated")
  public String getUpdatedAt() {
    return updatedAt;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCredential responseCredential = (ResponseCredential) o;
    return Objects.equals(this.context, responseCredential.context) &&
        Objects.equals(this.id1, responseCredential.id1) &&
        Objects.equals(this.type1, responseCredential.type1) &&
        Objects.equals(this.id, responseCredential.id) &&
        Objects.equals(this.type, responseCredential.type) &&
        Objects.equals(this.rfc, responseCredential.rfc) &&
        Objects.equals(this.status, responseCredential.status) &&
        Objects.equals(this.createdAt, responseCredential.createdAt) &&
        Objects.equals(this.updatedAt, responseCredential.updatedAt);
  }
  @Override
  public int hashCode() {
    return Objects.hash(context, id, type, id, type, rfc, status, createdAt, updatedAt);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCredential {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    id: ").append(toIndentedString(id1)).append("\n");
    sb.append("    type: ").append(toIndentedString(type1)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
