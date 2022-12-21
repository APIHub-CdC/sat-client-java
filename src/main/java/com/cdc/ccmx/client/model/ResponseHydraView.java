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
@ApiModel(description = "Pagination information")


public class ResponseHydraView {
  @SerializedName("@id")
  private String id = null;
  @SerializedName("@type")
  private String type = "hydra:PartialCollectionView";
  @SerializedName("hydra:first")
  private String hydrafirst = null;
  @SerializedName("hydra:next")
  private String hydranext = null;
  @SerializedName("hydra:last")
  private String hydralast = null;
  public ResponseHydraView id(String id) {
    this.id = id;
    return this;
  }
   
  @ApiModelProperty(value = "Current page IRI reference")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public ResponseHydraView type(String type) {
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
  public ResponseHydraView hydrafirst(String hydrafirst) {
    this.hydrafirst = hydrafirst;
    return this;
  }
   
  @ApiModelProperty(value = "First page IRI reference. This property is omitted if there is no pagination.")
  public String getHydrafirst() {
    return hydrafirst;
  }
  public void setHydrafirst(String hydrafirst) {
    this.hydrafirst = hydrafirst;
  }
  public ResponseHydraView hydranext(String hydranext) {
    this.hydranext = hydranext;
    return this;
  }
   
  @ApiModelProperty(value = "Next page IRI reference. This property is omitted if there is no pagination.")
  public String getHydranext() {
    return hydranext;
  }
  public void setHydranext(String hydranext) {
    this.hydranext = hydranext;
  }
  public ResponseHydraView hydralast(String hydralast) {
    this.hydralast = hydralast;
    return this;
  }
   
  @ApiModelProperty(value = "Last page IRI reference. This property is omitted if there is no pagination.")
  public String getHydralast() {
    return hydralast;
  }
  public void setHydralast(String hydralast) {
    this.hydralast = hydralast;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHydraView responseHydraView = (ResponseHydraView) o;
    return Objects.equals(this.id, responseHydraView.id) &&
        Objects.equals(this.type, responseHydraView.type) &&
        Objects.equals(this.hydrafirst, responseHydraView.hydrafirst) &&
        Objects.equals(this.hydranext, responseHydraView.hydranext) &&
        Objects.equals(this.hydralast, responseHydraView.hydralast);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, type, hydrafirst, hydranext, hydralast);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHydraView {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hydrafirst: ").append(toIndentedString(hydrafirst)).append("\n");
    sb.append("    hydranext: ").append(toIndentedString(hydranext)).append("\n");
    sb.append("    hydralast: ").append(toIndentedString(hydralast)).append("\n");
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
