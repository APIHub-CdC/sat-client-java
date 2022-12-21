package com.cdc.ccmx.client.model;

import java.util.Objects;
import java.util.Arrays;

import com.cdc.ccmx.client.model.ResponseCredentialType;
import com.cdc.ccmx.client.model.ResponseHydraSearch;
import com.cdc.ccmx.client.model.ResponseTaxReturn;
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


public class TaxpayerTaxReturnCollection {
  @SerializedName("@context")
  private String context = null;
  @SerializedName("@id")
  private String id = null;
  @SerializedName("@type")
  private String type = "hydra:Collection";
  @SerializedName("hydra:member")
  private List<ResponseTaxReturn> hydramember = null;
  @SerializedName("hydra:totalItems")
  private Integer hydratotalItems = null;
  @SerializedName("hydra:view")
  private ResponseCredentialType hydraview = null;
  @SerializedName("hydra:search")
  private ResponseHydraSearch hydrasearch = null;
  public TaxpayerTaxReturnCollection context(String context) {
    this.context = context;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }
  public TaxpayerTaxReturnCollection id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(example = "/taxpayers/PEIC211118IS0/tax-returns", value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public TaxpayerTaxReturnCollection type(String type) {
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
  public TaxpayerTaxReturnCollection hydramember(List<ResponseTaxReturn> hydramember) {
    this.hydramember = hydramember;
    return this;
  }
  public TaxpayerTaxReturnCollection addHydramemberItem(ResponseTaxReturn hydramemberItem) {
    if (this.hydramember == null) {
      this.hydramember = new ArrayList<ResponseTaxReturn>();
    }
    this.hydramember.add(hydramemberItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<ResponseTaxReturn> getHydramember() {
    return hydramember;
  }
  public void setHydramember(List<ResponseTaxReturn> hydramember) {
    this.hydramember = hydramember;
  }
  public TaxpayerTaxReturnCollection hydratotalItems(Integer hydratotalItems) {
    this.hydratotalItems = hydratotalItems;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "The total number of items found")
  public Integer getHydratotalItems() {
    return hydratotalItems;
  }
  public void setHydratotalItems(Integer hydratotalItems) {
    this.hydratotalItems = hydratotalItems;
  }
  public TaxpayerTaxReturnCollection hydraview(ResponseCredentialType hydraview) {
    this.hydraview = hydraview;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseCredentialType getHydraview() {
    return hydraview;
  }
  public void setHydraview(ResponseCredentialType hydraview) {
    this.hydraview = hydraview;
  }
  public TaxpayerTaxReturnCollection hydrasearch(ResponseHydraSearch hydrasearch) {
    this.hydrasearch = hydrasearch;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseHydraSearch getHydrasearch() {
    return hydrasearch;
  }
  public void setHydrasearch(ResponseHydraSearch hydrasearch) {
    this.hydrasearch = hydrasearch;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxpayerTaxReturnCollection taxpayerTaxReturnCollection = (TaxpayerTaxReturnCollection) o;
    return Objects.equals(this.context, taxpayerTaxReturnCollection.context) &&
        Objects.equals(this.id, taxpayerTaxReturnCollection.id) &&
        Objects.equals(this.type, taxpayerTaxReturnCollection.type) &&
        Objects.equals(this.hydramember, taxpayerTaxReturnCollection.hydramember) &&
        Objects.equals(this.hydratotalItems, taxpayerTaxReturnCollection.hydratotalItems) &&
        Objects.equals(this.hydraview, taxpayerTaxReturnCollection.hydraview) &&
        Objects.equals(this.hydrasearch, taxpayerTaxReturnCollection.hydrasearch);
  }
  @Override
  public int hashCode() {
    return Objects.hash(context, id, type, hydramember, hydratotalItems, hydraview, hydrasearch);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxpayerTaxReturnCollection {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hydramember: ").append(toIndentedString(hydramember)).append("\n");
    sb.append("    hydratotalItems: ").append(toIndentedString(hydratotalItems)).append("\n");
    sb.append("    hydraview: ").append(toIndentedString(hydraview)).append("\n");
    sb.append("    hydrasearch: ").append(toIndentedString(hydrasearch)).append("\n");
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
