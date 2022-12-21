package com.cdc.ccmx.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class ResponseTaxpayer {
  @SerializedName("@id")
  private String id1 = null;
  @SerializedName("@type")
  private String type = "Taxpayer";
  @SerializedName("id")
  private String id = null;
  @SerializedName("personType")
  private String personType = null;
  @SerializedName("registrationDate")
  private String registrationDate = null;
  @SerializedName("name")
  private String name = null;
   
  @ApiModelProperty(example = "/taxpayers/PEIC211118IS0", value = "Taxpayer IRI reference")
  public String getId1() {
    return id1;
  }
   
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public ResponseTaxpayer id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(example = "PEIC211118IS0", value = "RFC (Registro Federal de Contribuyentes)")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public ResponseTaxpayer personType(String personType) {
    this.personType = personType;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getPersonType() {
    return personType;
  }
  public void setPersonType(String personType) {
    this.personType = personType;
  }
  public ResponseTaxpayer registrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getRegistrationDate() {
    return registrationDate;
  }
  public void setRegistrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
  }
  public ResponseTaxpayer name(String name) {
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
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseTaxpayer responseTaxpayer = (ResponseTaxpayer) o;
    return Objects.equals(this.id, responseTaxpayer.id) &&
        Objects.equals(this.type, responseTaxpayer.type) &&
        Objects.equals(this.id, responseTaxpayer.id) &&
        Objects.equals(this.personType, responseTaxpayer.personType) &&
        Objects.equals(this.registrationDate, responseTaxpayer.registrationDate) &&
        Objects.equals(this.name, responseTaxpayer.name);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, type, id, personType, registrationDate, name);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTaxpayer {\n");
    
    sb.append("    id: ").append(toIndentedString(id1)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    personType: ").append(toIndentedString(personType)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
