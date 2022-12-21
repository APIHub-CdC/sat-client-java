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
@ApiModel(description = "Company information. Null when the taxpayer is not a legal person.")


public class ResponseTaxStatusCompany {
  @SerializedName("legalName")
  private String legalName = null;
  @SerializedName("tradeName")
  private String tradeName = null;
  @SerializedName("entityType")
  private String entityType = null;
  public ResponseTaxStatusCompany legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }
   
  @ApiModelProperty(example = "APPLE OPERATIONS MEXICO", value = "")
  public String getLegalName() {
    return legalName;
  }
  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }
  public ResponseTaxStatusCompany tradeName(String tradeName) {
    this.tradeName = tradeName;
    return this;
  }
   
  @ApiModelProperty(example = "APPLE OPERATIONS MEXICO S.A. DE C.V.", value = "")
  public String getTradeName() {
    return tradeName;
  }
  public void setTradeName(String tradeName) {
    this.tradeName = tradeName;
  }
  public ResponseTaxStatusCompany entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }
   
  @ApiModelProperty(example = "SOCIEDAD ANONIMA DE CAPITAL VARIABLE", value = "")
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseTaxStatusCompany responseTaxStatusCompany = (ResponseTaxStatusCompany) o;
    return Objects.equals(this.legalName, responseTaxStatusCompany.legalName) &&
        Objects.equals(this.tradeName, responseTaxStatusCompany.tradeName) &&
        Objects.equals(this.entityType, responseTaxStatusCompany.entityType);
  }
  @Override
  public int hashCode() {
    return Objects.hash(legalName, tradeName, entityType);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTaxStatusCompany {\n");
    
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    tradeName: ").append(toIndentedString(tradeName)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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
