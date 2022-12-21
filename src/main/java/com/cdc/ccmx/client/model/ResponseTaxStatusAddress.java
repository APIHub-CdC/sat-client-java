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
import java.util.ArrayList;
import java.util.List;


public class ResponseTaxStatusAddress {
  @SerializedName("streetReferences")
  private List<String> streetReferences = null;
  @SerializedName("streetNumber")
  private String streetNumber = null;
  @SerializedName("buildingNumber")
  private String buildingNumber = null;
  @SerializedName("locality")
  private String locality = null;
  @SerializedName("municipality")
  private String municipality = null;
  @SerializedName("postalCode")
  private String postalCode = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("streetName")
  private String streetName = null;
  @SerializedName("streetType")
  private String streetType = null;
  @SerializedName("neighborhood")
  private String neighborhood = null;
  @SerializedName("statusRaw")
  private String statusRaw = null;
  public ResponseTaxStatusAddress streetReferences(List<String> streetReferences) {
    this.streetReferences = streetReferences;
    return this;
  }
  public ResponseTaxStatusAddress addStreetReferencesItem(String streetReferencesItem) {
    if (this.streetReferences == null) {
      this.streetReferences = new ArrayList<String>();
    }
    this.streetReferences.add(streetReferencesItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<String> getStreetReferences() {
    return streetReferences;
  }
  public void setStreetReferences(List<String> streetReferences) {
    this.streetReferences = streetReferences;
  }
  public ResponseTaxStatusAddress streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }
   
  @ApiModelProperty(example = "8124", value = "")
  public String getStreetNumber() {
    return streetNumber;
  }
  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }
  public ResponseTaxStatusAddress buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }
   
  @ApiModelProperty(example = "496", value = "")
  public String getBuildingNumber() {
    return buildingNumber;
  }
  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }
  public ResponseTaxStatusAddress locality(String locality) {
    this.locality = locality;
    return this;
  }
   
  @ApiModelProperty(example = "TUXTLA GUTIERREZ", value = "")
  public String getLocality() {
    return locality;
  }
  public void setLocality(String locality) {
    this.locality = locality;
  }
  public ResponseTaxStatusAddress municipality(String municipality) {
    this.municipality = municipality;
    return this;
  }
   
  @ApiModelProperty(example = "TUXTLA GUTIERREZ", value = "")
  public String getMunicipality() {
    return municipality;
  }
  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }
  public ResponseTaxStatusAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }
   
  @ApiModelProperty(example = "29000", value = "")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
  public ResponseTaxStatusAddress state(String state) {
    this.state = state;
    return this;
  }
   
  @ApiModelProperty(example = "CHIAPAS", value = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  public ResponseTaxStatusAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }
   
  @ApiModelProperty(example = "Plaza Jorge Luis", value = "")
  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }
  public ResponseTaxStatusAddress streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }
   
  @ApiModelProperty(example = "Calle", value = "")
  public String getStreetType() {
    return streetType;
  }
  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }
  public ResponseTaxStatusAddress neighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }
   
  @ApiModelProperty(example = "Paseo Ricardo", value = "")
  public String getNeighborhood() {
    return neighborhood;
  }
  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }
  public ResponseTaxStatusAddress statusRaw(String statusRaw) {
    this.statusRaw = statusRaw;
    return this;
  }
   
  @ApiModelProperty(example = "LOCALIZADO - Domicilio Localizado", value = "")
  public String getStatusRaw() {
    return statusRaw;
  }
  public void setStatusRaw(String statusRaw) {
    this.statusRaw = statusRaw;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseTaxStatusAddress responseTaxStatusAddress = (ResponseTaxStatusAddress) o;
    return Objects.equals(this.streetReferences, responseTaxStatusAddress.streetReferences) &&
        Objects.equals(this.streetNumber, responseTaxStatusAddress.streetNumber) &&
        Objects.equals(this.buildingNumber, responseTaxStatusAddress.buildingNumber) &&
        Objects.equals(this.locality, responseTaxStatusAddress.locality) &&
        Objects.equals(this.municipality, responseTaxStatusAddress.municipality) &&
        Objects.equals(this.postalCode, responseTaxStatusAddress.postalCode) &&
        Objects.equals(this.state, responseTaxStatusAddress.state) &&
        Objects.equals(this.streetName, responseTaxStatusAddress.streetName) &&
        Objects.equals(this.streetType, responseTaxStatusAddress.streetType) &&
        Objects.equals(this.neighborhood, responseTaxStatusAddress.neighborhood) &&
        Objects.equals(this.statusRaw, responseTaxStatusAddress.statusRaw);
  }
  @Override
  public int hashCode() {
    return Objects.hash(streetReferences, streetNumber, buildingNumber, locality, municipality, postalCode, state, streetName, streetType, neighborhood, statusRaw);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTaxStatusAddress {\n");
    
    sb.append("    streetReferences: ").append(toIndentedString(streetReferences)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    statusRaw: ").append(toIndentedString(statusRaw)).append("\n");
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
