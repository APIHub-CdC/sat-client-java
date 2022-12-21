package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.UUID;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class ResponseFile {
  @SerializedName("@id")
  private String id1 = null;
  @SerializedName("@type")
  private String type1 = "File";
  @SerializedName("id")
  private UUID id = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("resource")
  private String resource = null;
  @SerializedName("mimeType")
  private String mimeType = null;
  @SerializedName("extension")
  private String extension = null;
  @SerializedName("size")
  private Integer size = null;
  @SerializedName("filename")
  private String filename = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
   
  @ApiModelProperty(example = "/files/91106968-1abd-4d64-85c1-4e73d96fb997", value = "File IRI reference")
  public String getId1() {
    return id1;
  }
   
  @ApiModelProperty(value = "")
  public String getType1() {
    return type1;
  }
  public ResponseFile id(UUID id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(example = "91106968-1abd-4d64-85c1-4e73d96fb997", value = "")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }
  public ResponseFile type(String type) {
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
  public ResponseFile resource(String resource) {
    this.resource = resource;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getResource() {
    return resource;
  }
  public void setResource(String resource) {
    this.resource = resource;
  }
  public ResponseFile mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }
  public ResponseFile extension(String extension) {
    this.extension = extension;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }
  public ResponseFile size(Integer size) {
    this.size = size;
    return this;
  }
   
  @ApiModelProperty(example = "40544", value = "")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }
  public ResponseFile filename(String filename) {
    this.filename = filename;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
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
    ResponseFile responseFile = (ResponseFile) o;
    return Objects.equals(this.id1, responseFile.id1) &&
        Objects.equals(this.type1, responseFile.type1) &&
        Objects.equals(this.id, responseFile.id) &&
        Objects.equals(this.type, responseFile.type) &&
        Objects.equals(this.resource, responseFile.resource) &&
        Objects.equals(this.mimeType, responseFile.mimeType) &&
        Objects.equals(this.extension, responseFile.extension) &&
        Objects.equals(this.size, responseFile.size) &&
        Objects.equals(this.filename, responseFile.filename) &&
        Objects.equals(this.createdAt, responseFile.createdAt) &&
        Objects.equals(this.updatedAt, responseFile.updatedAt);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, type, id, type, resource, mimeType, extension, size, filename, createdAt, updatedAt);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseFile {\n");
    
    sb.append("    id: ").append(toIndentedString(id1)).append("\n");
    sb.append("    type: ").append(toIndentedString(type1)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
