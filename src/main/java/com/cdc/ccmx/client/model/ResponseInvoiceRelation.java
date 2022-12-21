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
import java.util.UUID;


public class ResponseInvoiceRelation {
  @SerializedName("@id")
  private String id1 = null;
  @SerializedName("@type")
  private String type1 = "InvoiceRelation";
  @SerializedName("id")
  private UUID id = null;
  @SerializedName("type")
  private Double type = null;
  @SerializedName("invoice")
  private String invoice = null;
  @SerializedName("relatedInvoice")
  private String relatedInvoice = null;
  @SerializedName("relatedInvoiceUuid")
  private UUID relatedInvoiceUuid = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
   
  @ApiModelProperty(example = "/invoices/relations/93a197e7-6baa-5dc5-bf8d-fb1645a770c1", value = "Invoice relation IRI reference")
  public String getId1() {
    return id1;
  }
   
  @ApiModelProperty(value = "")
  public String getType1() {
    return type1;
  }
   
  @ApiModelProperty(example = "91106968-1abd-4d64-85c1-4e73d96fb997", value = "Invoice relation ID")
  public UUID getId() {
    return id;
  }
  public ResponseInvoiceRelation type(Double type) {
    this.type = type;
    return this;
  }
   
  @ApiModelProperty(example = "7.0", value = "Invoice relation type code from `c_TipoRelacion` catalog")
  public Double getType() {
    return type;
  }
  public void setType(Double type) {
    this.type = type;
  }
  public ResponseInvoiceRelation invoice(String invoice) {
    this.invoice = invoice;
    return this;
  }
   
  @ApiModelProperty(example = "/invoices/92106967-2abd-5d64-95c2-4e73d96fb998", value = "Invoice IRI reference")
  public String getInvoice() {
    return invoice;
  }
  public void setInvoice(String invoice) {
    this.invoice = invoice;
  }
  public ResponseInvoiceRelation relatedInvoice(String relatedInvoice) {
    this.relatedInvoice = relatedInvoice;
    return this;
  }
   
  @ApiModelProperty(example = "/invoices/92106967-2abd-5d64-95c2-4e73d96fb998", value = "Invoice IRI reference")
  public String getRelatedInvoice() {
    return relatedInvoice;
  }
  public void setRelatedInvoice(String relatedInvoice) {
    this.relatedInvoice = relatedInvoice;
  }
   
  @ApiModelProperty(example = "def404af-5eef-4112-aa99-d1ec8493b89a", value = "The related Invoice UUID (Folio fiscal)")
  public UUID getRelatedInvoiceUuid() {
    return relatedInvoiceUuid;
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
    ResponseInvoiceRelation responseInvoiceRelation = (ResponseInvoiceRelation) o;
    return Objects.equals(this.id1, responseInvoiceRelation.id1) &&
        Objects.equals(this.type1, responseInvoiceRelation.type1) &&
        Objects.equals(this.id, responseInvoiceRelation.id) &&
        Objects.equals(this.type, responseInvoiceRelation.type) &&
        Objects.equals(this.invoice, responseInvoiceRelation.invoice) &&
        Objects.equals(this.relatedInvoice, responseInvoiceRelation.relatedInvoice) &&
        Objects.equals(this.relatedInvoiceUuid, responseInvoiceRelation.relatedInvoiceUuid) &&
        Objects.equals(this.createdAt, responseInvoiceRelation.createdAt) &&
        Objects.equals(this.updatedAt, responseInvoiceRelation.updatedAt);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, type, id, type, invoice, relatedInvoice, relatedInvoiceUuid, createdAt, updatedAt);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInvoiceRelation {\n");
    
    sb.append("    id: ").append(toIndentedString(id1)).append("\n");
    sb.append("    type: ").append(toIndentedString(type1)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    relatedInvoice: ").append(toIndentedString(relatedInvoice)).append("\n");
    sb.append("    relatedInvoiceUuid: ").append(toIndentedString(relatedInvoiceUuid)).append("\n");
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
