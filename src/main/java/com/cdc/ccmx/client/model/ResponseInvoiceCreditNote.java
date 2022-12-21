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
import org.threeten.bp.OffsetDateTime;


public class ResponseInvoiceCreditNote {
  @SerializedName("@id")
  private String id = null;
  @SerializedName("@type")
  private String type = "InvoicePayment";
  @SerializedName("appliedInvoice")
  private String appliedInvoice = null;
  @SerializedName("issuedInvoice")
  private String issuedInvoice = null;
  @SerializedName("issuedAt")
  private OffsetDateTime issuedAt = null;
  @SerializedName("proportionalRate")
  private Double proportionalRate = null;
  @SerializedName("amount")
  private Double amount = null;
  @SerializedName("issuedInvoiceTotal")
  private Double issuedInvoiceTotal = null;
  @SerializedName("canceledAt")
  private OffsetDateTime canceledAt = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
   
  @ApiModelProperty(example = "/invoices/credit-note/91106968-1abd-4d64-85c1-4e73d96fb997", value = "Credit Note IRI reference")
  public String getId() {
    return id;
  }
   
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
   
  @ApiModelProperty(example = "/invoices/91106968-1abd-4d64-85c1-4e73d96fb997", value = "Invoice IRI reference")
  public String getAppliedInvoice() {
    return appliedInvoice;
  }
   
  @ApiModelProperty(example = "/invoices/91106968-1abd-4d64-85c1-4e73d96fb997", value = "Invoice IRI reference")
  public String getIssuedInvoice() {
    return issuedInvoice;
  }
  public ResponseInvoiceCreditNote issuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }
   
  @ApiModelProperty(value = "Set when the payment invoice is canceled")
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }
  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }
  public ResponseInvoiceCreditNote proportionalRate(Double proportionalRate) {
    this.proportionalRate = proportionalRate;
    return this;
  }
   
  @ApiModelProperty(example = "19.8", value = "The proportional credit rate applied to the target invoice.")
  public Double getProportionalRate() {
    return proportionalRate;
  }
  public void setProportionalRate(Double proportionalRate) {
    this.proportionalRate = proportionalRate;
  }
  public ResponseInvoiceCreditNote amount(Double amount) {
    this.amount = amount;
    return this;
  }
   
  @ApiModelProperty(example = "19.8", value = "The total amount of credits applied to the target invoice.")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }
  public ResponseInvoiceCreditNote issuedInvoiceTotal(Double issuedInvoiceTotal) {
    this.issuedInvoiceTotal = issuedInvoiceTotal;
    return this;
  }
   
  @ApiModelProperty(example = "19.8", value = "The total of the issued invoice that was taken into account to calculate the credit.")
  public Double getIssuedInvoiceTotal() {
    return issuedInvoiceTotal;
  }
  public void setIssuedInvoiceTotal(Double issuedInvoiceTotal) {
    this.issuedInvoiceTotal = issuedInvoiceTotal;
  }
  public ResponseInvoiceCreditNote canceledAt(OffsetDateTime canceledAt) {
    this.canceledAt = canceledAt;
    return this;
  }
   
  @ApiModelProperty(value = "Set when the payment invoice is canceled")
  public OffsetDateTime getCanceledAt() {
    return canceledAt;
  }
  public void setCanceledAt(OffsetDateTime canceledAt) {
    this.canceledAt = canceledAt;
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
    ResponseInvoiceCreditNote responseInvoiceCreditNote = (ResponseInvoiceCreditNote) o;
    return Objects.equals(this.id, responseInvoiceCreditNote.id) &&
        Objects.equals(this.type, responseInvoiceCreditNote.type) &&
        Objects.equals(this.appliedInvoice, responseInvoiceCreditNote.appliedInvoice) &&
        Objects.equals(this.issuedInvoice, responseInvoiceCreditNote.issuedInvoice) &&
        Objects.equals(this.issuedAt, responseInvoiceCreditNote.issuedAt) &&
        Objects.equals(this.proportionalRate, responseInvoiceCreditNote.proportionalRate) &&
        Objects.equals(this.amount, responseInvoiceCreditNote.amount) &&
        Objects.equals(this.issuedInvoiceTotal, responseInvoiceCreditNote.issuedInvoiceTotal) &&
        Objects.equals(this.canceledAt, responseInvoiceCreditNote.canceledAt) &&
        Objects.equals(this.createdAt, responseInvoiceCreditNote.createdAt) &&
        Objects.equals(this.updatedAt, responseInvoiceCreditNote.updatedAt);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, type, appliedInvoice, issuedInvoice, issuedAt, proportionalRate, amount, issuedInvoiceTotal, canceledAt, createdAt, updatedAt);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInvoiceCreditNote {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    appliedInvoice: ").append(toIndentedString(appliedInvoice)).append("\n");
    sb.append("    issuedInvoice: ").append(toIndentedString(issuedInvoice)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    proportionalRate: ").append(toIndentedString(proportionalRate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    issuedInvoiceTotal: ").append(toIndentedString(issuedInvoiceTotal)).append("\n");
    sb.append("    canceledAt: ").append(toIndentedString(canceledAt)).append("\n");
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
