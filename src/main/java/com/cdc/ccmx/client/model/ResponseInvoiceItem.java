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


public class ResponseInvoiceItem {
  @SerializedName("identificationNumber")
  private String identificationNumber = null;
  @SerializedName("productIdentification")
  private String productIdentification = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("unitAmount")
  private Double unitAmount = null;
  @SerializedName("unitCode")
  private String unitCode = null;
  @SerializedName("quantity")
  private Double quantity = null;
  @SerializedName("discountAmount")
  private Double discountAmount = null;
  @SerializedName("taxType")
  private String taxType = null;
  @SerializedName("taxRate")
  private Double taxRate = null;
  @SerializedName("taxAmount")
  private Double taxAmount = null;
  @SerializedName("totalAmount")
  private Double totalAmount = null;
  public ResponseInvoiceItem identificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
    return this;
  }
   
  @ApiModelProperty(example = "Z0V0", value = "")
  public String getIdentificationNumber() {
    return identificationNumber;
  }
  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }
  public ResponseInvoiceItem productIdentification(String productIdentification) {
    this.productIdentification = productIdentification;
    return this;
  }
   
  @ApiModelProperty(example = "43211503", value = "")
  public String getProductIdentification() {
    return productIdentification;
  }
  public void setProductIdentification(String productIdentification) {
    this.productIdentification = productIdentification;
  }
  public ResponseInvoiceItem description(String description) {
    this.description = description;
    return this;
  }
   
  @ApiModelProperty(example = "MBP 15.4 SPACE GRAY", value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public ResponseInvoiceItem unitAmount(Double unitAmount) {
    this.unitAmount = unitAmount;
    return this;
  }
   
  @ApiModelProperty(example = "45905.0", value = "")
  public Double getUnitAmount() {
    return unitAmount;
  }
  public void setUnitAmount(Double unitAmount) {
    this.unitAmount = unitAmount;
  }
  public ResponseInvoiceItem unitCode(String unitCode) {
    this.unitCode = unitCode;
    return this;
  }
   
  @ApiModelProperty(example = "H87", value = "")
  public String getUnitCode() {
    return unitCode;
  }
  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }
  public ResponseInvoiceItem quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }
   
  @ApiModelProperty(example = "1.0", value = "")
  public Double getQuantity() {
    return quantity;
  }
  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }
  public ResponseInvoiceItem discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }
   
  @ApiModelProperty(example = "0.0", value = "")
  public Double getDiscountAmount() {
    return discountAmount;
  }
  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }
  public ResponseInvoiceItem taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }
   
  @ApiModelProperty(example = "002", value = "")
  public String getTaxType() {
    return taxType;
  }
  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }
  public ResponseInvoiceItem taxRate(Double taxRate) {
    this.taxRate = taxRate;
    return this;
  }
   
  @ApiModelProperty(example = "0.16", value = "")
  public Double getTaxRate() {
    return taxRate;
  }
  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }
  public ResponseInvoiceItem taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }
   
  @ApiModelProperty(example = "7344.8", value = "")
  public Double getTaxAmount() {
    return taxAmount;
  }
  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }
  public ResponseInvoiceItem totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }
   
  @ApiModelProperty(example = "45905.0", value = "")
  public Double getTotalAmount() {
    return totalAmount;
  }
  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseInvoiceItem responseInvoiceItem = (ResponseInvoiceItem) o;
    return Objects.equals(this.identificationNumber, responseInvoiceItem.identificationNumber) &&
        Objects.equals(this.productIdentification, responseInvoiceItem.productIdentification) &&
        Objects.equals(this.description, responseInvoiceItem.description) &&
        Objects.equals(this.unitAmount, responseInvoiceItem.unitAmount) &&
        Objects.equals(this.unitCode, responseInvoiceItem.unitCode) &&
        Objects.equals(this.quantity, responseInvoiceItem.quantity) &&
        Objects.equals(this.discountAmount, responseInvoiceItem.discountAmount) &&
        Objects.equals(this.taxType, responseInvoiceItem.taxType) &&
        Objects.equals(this.taxRate, responseInvoiceItem.taxRate) &&
        Objects.equals(this.taxAmount, responseInvoiceItem.taxAmount) &&
        Objects.equals(this.totalAmount, responseInvoiceItem.totalAmount);
  }
  @Override
  public int hashCode() {
    return Objects.hash(identificationNumber, productIdentification, description, unitAmount, unitCode, quantity, discountAmount, taxType, taxRate, taxAmount, totalAmount);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInvoiceItem {\n");
    
    sb.append("    identificationNumber: ").append(toIndentedString(identificationNumber)).append("\n");
    sb.append("    productIdentification: ").append(toIndentedString(productIdentification)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unitAmount: ").append(toIndentedString(unitAmount)).append("\n");
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
