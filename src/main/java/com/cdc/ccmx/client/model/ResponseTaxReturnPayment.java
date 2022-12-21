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
@ApiModel(description = "Payment")


public class ResponseTaxReturnPayment {
  @SerializedName("dueAmount")
  private Double dueAmount = null;
  @SerializedName("dueDate")
  private OffsetDateTime dueDate = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("bank")
  private String bank = null;
  @SerializedName("paidAmount")
  private Double paidAmount = null;
  @SerializedName("date")
  private OffsetDateTime date = null;
  @SerializedName("operationNumber")
  private String operationNumber = null;
  public ResponseTaxReturnPayment dueAmount(Double dueAmount) {
    this.dueAmount = dueAmount;
    return this;
  }
   
  @ApiModelProperty(example = "53249.8", value = "")
  public Double getDueAmount() {
    return dueAmount;
  }
  public void setDueAmount(Double dueAmount) {
    this.dueAmount = dueAmount;
  }
  public ResponseTaxReturnPayment dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }
   
  @ApiModelProperty(example = "2019-01-03T21:10:40Z", value = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }
  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }
  public ResponseTaxReturnPayment code(String code) {
    this.code = code;
    return this;
  }
   
  @ApiModelProperty(example = "0777555544443332222", value = "Payment code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public ResponseTaxReturnPayment bank(String bank) {
    this.bank = bank;
    return this;
  }
   
  @ApiModelProperty(example = "BBVA Bancomer, S.A.", value = "Payer bank")
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }
  public ResponseTaxReturnPayment paidAmount(Double paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }
   
  @ApiModelProperty(value = "Tax return paid amount")
  public Double getPaidAmount() {
    return paidAmount;
  }
  public void setPaidAmount(Double paidAmount) {
    this.paidAmount = paidAmount;
  }
  public ResponseTaxReturnPayment date(OffsetDateTime date) {
    this.date = date;
    return this;
  }
   
  @ApiModelProperty(value = "Payment date")
  public OffsetDateTime getDate() {
    return date;
  }
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }
  public ResponseTaxReturnPayment operationNumber(String operationNumber) {
    this.operationNumber = operationNumber;
    return this;
  }
   
  @ApiModelProperty(example = "123456", value = "")
  public String getOperationNumber() {
    return operationNumber;
  }
  public void setOperationNumber(String operationNumber) {
    this.operationNumber = operationNumber;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseTaxReturnPayment responseTaxReturnPayment = (ResponseTaxReturnPayment) o;
    return Objects.equals(this.dueAmount, responseTaxReturnPayment.dueAmount) &&
        Objects.equals(this.dueDate, responseTaxReturnPayment.dueDate) &&
        Objects.equals(this.code, responseTaxReturnPayment.code) &&
        Objects.equals(this.bank, responseTaxReturnPayment.bank) &&
        Objects.equals(this.paidAmount, responseTaxReturnPayment.paidAmount) &&
        Objects.equals(this.date, responseTaxReturnPayment.date) &&
        Objects.equals(this.operationNumber, responseTaxReturnPayment.operationNumber);
  }
  @Override
  public int hashCode() {
    return Objects.hash(dueAmount, dueDate, code, bank, paidAmount, date, operationNumber);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTaxReturnPayment {\n");
    
    sb.append("    dueAmount: ").append(toIndentedString(dueAmount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    operationNumber: ").append(toIndentedString(operationNumber)).append("\n");
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
