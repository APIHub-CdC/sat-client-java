package com.cdc.ccmx.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class ResponseTaxStatus {
  @SerializedName("@id")
  private String id1 = null;
  @SerializedName("@type")
  private String type = "TaxStatus";
  @SerializedName("id")
  private String id = null;
  @SerializedName("files")
  private List<ResponseFile> files = null;
  @SerializedName("rfc")
  private String rfc = null;
  @SerializedName("cif")
  private String cif = null;
  @SerializedName("person")
  private ResponseCredentialType person = null;
  @SerializedName("company")
  private ResponseCredentialType company = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("address")
  private ResponseTaxStatusAddress address = null;
  @SerializedName("economicActivities")
  private List<ResponseTaxStatusEconomicActivity> economicActivities = null;
  @SerializedName("taxRegimes")
  private List<ResponseTaxStatusTaxRegime> taxRegimes = null;
  @SerializedName("obligations")
  private List<ResponseTaxStatusObligation> obligations = null;
  @SerializedName("startedOperationsAt")
  private String startedOperationsAt = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("statusUpdatedAt")
  private String statusUpdatedAt = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
   
  @ApiModelProperty(example = "/tax-status/91106968-1abd-4d64-85c1-4e73d96fb997", value = "Tax status IRI reference")
  public String getId1() {
    return id1;
  }
   
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public ResponseTaxStatus id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(example = "91106968-1abd-4d64-85c1-4e73d96fb997", value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  
  
  
  public ResponseTaxStatus file(List<ResponseFile> files) {
	    this.files = files;
	    return this;
	  }
	  public ResponseTaxStatus addFileItem(ResponseFile fileItem) {
	    if (this.files == null) {
	      this.files = new ArrayList<ResponseFile>();
	    }
	    this.files.add(fileItem);
	    return this;
	  }
	   
	  @ApiModelProperty(value = "Tax return PDF files (ack receipt, transcript and payment receipt)")
	  public List<ResponseFile> getFile() {
	    return files;
	  }
	  public void setFiles(List<ResponseFile> files) {
	    this.files = files;
	  }
  
  
  
  public ResponseTaxStatus rfc(String rfc) {
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
  public ResponseTaxStatus cif(String cif) {
    this.cif = cif;
    return this;
  }
   
  @ApiModelProperty(example = "20060152922", value = "")
  public String getCif() {
    return cif;
  }
  public void setCif(String cif) {
    this.cif = cif;
  }
  public ResponseTaxStatus person(ResponseCredentialType person) {
    this.person = person;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseCredentialType getPerson() {
    return person;
  }
  public void setPerson(ResponseCredentialType person) {
    this.person = person;
  }
  public ResponseTaxStatus company(ResponseCredentialType company) {
    this.company = company;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseCredentialType getCompany() {
    return company;
  }
  public void setCompany(ResponseCredentialType company) {
    this.company = company;
  }
  public ResponseTaxStatus email(String email) {
    this.email = email;
    return this;
  }
   
  @ApiModelProperty(example = "my-email@test.com", value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public ResponseTaxStatus phone(String phone) {
    this.phone = phone;
    return this;
  }
   
  @ApiModelProperty(example = "5512345678", value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public ResponseTaxStatus address(ResponseTaxStatusAddress address) {
    this.address = address;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseTaxStatusAddress getAddress() {
    return address;
  }
  public void setAddress(ResponseTaxStatusAddress address) {
    this.address = address;
  }
  public ResponseTaxStatus economicActivities(List<ResponseTaxStatusEconomicActivity> economicActivities) {
    this.economicActivities = economicActivities;
    return this;
  }
  public ResponseTaxStatus addEconomicActivitiesItem(ResponseTaxStatusEconomicActivity economicActivitiesItem) {
    if (this.economicActivities == null) {
      this.economicActivities = new ArrayList<ResponseTaxStatusEconomicActivity>();
    }
    this.economicActivities.add(economicActivitiesItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<ResponseTaxStatusEconomicActivity> getEconomicActivities() {
    return economicActivities;
  }
  public void setEconomicActivities(List<ResponseTaxStatusEconomicActivity> economicActivities) {
    this.economicActivities = economicActivities;
  }
  public ResponseTaxStatus taxRegimes(List<ResponseTaxStatusTaxRegime> taxRegimes) {
    this.taxRegimes = taxRegimes;
    return this;
  }
  public ResponseTaxStatus addTaxRegimesItem(ResponseTaxStatusTaxRegime taxRegimesItem) {
    if (this.taxRegimes == null) {
      this.taxRegimes = new ArrayList<ResponseTaxStatusTaxRegime>();
    }
    this.taxRegimes.add(taxRegimesItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<ResponseTaxStatusTaxRegime> getTaxRegimes() {
    return taxRegimes;
  }
  public void setTaxRegimes(List<ResponseTaxStatusTaxRegime> taxRegimes) {
    this.taxRegimes = taxRegimes;
  }
  public ResponseTaxStatus obligations(List<ResponseTaxStatusObligation> obligations) {
    this.obligations = obligations;
    return this;
  }
  public ResponseTaxStatus addObligationsItem(ResponseTaxStatusObligation obligationsItem) {
    if (this.obligations == null) {
      this.obligations = new ArrayList<ResponseTaxStatusObligation>();
    }
    this.obligations.add(obligationsItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<ResponseTaxStatusObligation> getObligations() {
    return obligations;
  }
  public void setObligations(List<ResponseTaxStatusObligation> obligations) {
    this.obligations = obligations;
  }
  public ResponseTaxStatus startedOperationsAt(String startedOperationsAt) {
    this.startedOperationsAt = startedOperationsAt;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getStartedOperationsAt() {
    return startedOperationsAt;
  }
  public void setStartedOperationsAt(String startedOperationsAt) {
    this.startedOperationsAt = startedOperationsAt;
  }
  public ResponseTaxStatus status(String status) {
    this.status = status;
    return this;
  }
   
  @ApiModelProperty(example = "Activo", value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public ResponseTaxStatus statusUpdatedAt(String statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getStatusUpdatedAt() {
    return statusUpdatedAt;
  }
  public void setStatusUpdatedAt(String statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
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
    ResponseTaxStatus responseTaxStatus = (ResponseTaxStatus) o;
    return Objects.equals(this.id, responseTaxStatus.id) &&
        Objects.equals(this.type, responseTaxStatus.type) &&
        Objects.equals(this.id, responseTaxStatus.id) &&
        Objects.equals(this.files, responseTaxStatus.files) &&
        Objects.equals(this.rfc, responseTaxStatus.rfc) &&
        Objects.equals(this.cif, responseTaxStatus.cif) &&
        Objects.equals(this.person, responseTaxStatus.person) &&
        Objects.equals(this.company, responseTaxStatus.company) &&
        Objects.equals(this.email, responseTaxStatus.email) &&
        Objects.equals(this.phone, responseTaxStatus.phone) &&
        Objects.equals(this.address, responseTaxStatus.address) &&
        Objects.equals(this.economicActivities, responseTaxStatus.economicActivities) &&
        Objects.equals(this.taxRegimes, responseTaxStatus.taxRegimes) &&
        Objects.equals(this.obligations, responseTaxStatus.obligations) &&
        Objects.equals(this.startedOperationsAt, responseTaxStatus.startedOperationsAt) &&
        Objects.equals(this.status, responseTaxStatus.status) &&
        Objects.equals(this.statusUpdatedAt, responseTaxStatus.statusUpdatedAt) &&
        Objects.equals(this.createdAt, responseTaxStatus.createdAt) &&
        Objects.equals(this.updatedAt, responseTaxStatus.updatedAt);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, type, id, files, rfc, cif, person, company, email, phone, address, economicActivities, taxRegimes, obligations, startedOperationsAt, status, statusUpdatedAt, createdAt, updatedAt);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTaxStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id1)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    file: ").append(toIndentedString(files)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    cif: ").append(toIndentedString(cif)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    economicActivities: ").append(toIndentedString(economicActivities)).append("\n");
    sb.append("    taxRegimes: ").append(toIndentedString(taxRegimes)).append("\n");
    sb.append("    obligations: ").append(toIndentedString(obligations)).append("\n");
    sb.append("    startedOperationsAt: ").append(toIndentedString(startedOperationsAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdatedAt: ").append(toIndentedString(statusUpdatedAt)).append("\n");
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
