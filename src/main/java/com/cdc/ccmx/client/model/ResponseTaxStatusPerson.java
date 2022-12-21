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
@ApiModel(description = "Person information. Null when the taxpayer is not a physical person.")


public class ResponseTaxStatusPerson {
  @SerializedName("fullName")
  private String fullName = null;
  @SerializedName("firstName")
  private String firstName = null;
  @SerializedName("middleName")
  private String middleName = null;
  @SerializedName("lastName")
  private String lastName = null;
  @SerializedName("curp")
  private String curp = null;
  public ResponseTaxStatusPerson fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }
   
  @ApiModelProperty(example = "Pedro Infante Cruz", value = "")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
  public ResponseTaxStatusPerson firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
   
  @ApiModelProperty(example = "Pedro", value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public ResponseTaxStatusPerson middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }
   
  @ApiModelProperty(example = "Infante", value = "")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
  public ResponseTaxStatusPerson lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
   
  @ApiModelProperty(example = "Cruz", value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public ResponseTaxStatusPerson curp(String curp) {
    this.curp = curp;
    return this;
  }
   
  @ApiModelProperty(example = "PEIC90110UEYBVT85", value = "")
  public String getCurp() {
    return curp;
  }
  public void setCurp(String curp) {
    this.curp = curp;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseTaxStatusPerson responseTaxStatusPerson = (ResponseTaxStatusPerson) o;
    return Objects.equals(this.fullName, responseTaxStatusPerson.fullName) &&
        Objects.equals(this.firstName, responseTaxStatusPerson.firstName) &&
        Objects.equals(this.middleName, responseTaxStatusPerson.middleName) &&
        Objects.equals(this.lastName, responseTaxStatusPerson.lastName) &&
        Objects.equals(this.curp, responseTaxStatusPerson.curp);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fullName, firstName, middleName, lastName, curp);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTaxStatusPerson {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
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
