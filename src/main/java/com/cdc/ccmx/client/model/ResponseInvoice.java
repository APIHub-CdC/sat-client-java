package com.cdc.ccmx.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class ResponseInvoice {
  @SerializedName("@id")
  private String id1 = null;
  @SerializedName("@type")
  private String type1 = "Invoice";
  @SerializedName("id")
  private UUID id = null;
  @SerializedName("uuid")
  private UUID uuid = null;
  @SerializedName("version")
  private Double version = null;
  @SerializedName("reference")
  private String reference = null;
  @SerializedName("internalIdentifier")
  private String internalIdentifier = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("usage")
  private String usage = null;
  @SerializedName("paymentType")
  private String paymentType = null;
  @SerializedName("paymentMethod")
  private String paymentMethod = null;
  @SerializedName("placeOfIssue")
  private String placeOfIssue = null;
  @SerializedName("issuer")
  private ResponseCredentialType issuer = null;
  @SerializedName("isIssuer")
  private Boolean isIssuer = null;
  @SerializedName("receiver")
  private ResponseInvoiceReceiver receiver = null;
  @SerializedName("isReceiver")
  private Boolean isReceiver = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("discount")
  private Double discount = null;
  @SerializedName("tax")
  private Double tax = null;
  @SerializedName("subtotal")
  private Double subtotal = null;
  @SerializedName("total")
  private Double total = null;
  @SerializedName("exchangeRate")
  private Double exchangeRate = null;
  @SerializedName("paidAmount")
  private Double paidAmount = null;
  @SerializedName("dueAmount")
  private Double dueAmount = null;
  @SerializedName("lastPaymentDate")
  private String lastPaymentDate = null;
  @SerializedName("fullyPaidAt")
  private String fullyPaidAt = null;
  @SerializedName("paymentTermsRaw")
  private String paymentTermsRaw = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("pac")
  private String pac = null;
  @SerializedName("issuedAt")
  private String issuedAt = null;
  @SerializedName("certifiedAt")
  private String certifiedAt = null;
  @SerializedName("cancellationStatus")
  private String cancellationStatus = null;
  @SerializedName("cancellationProcessStatus")
  private ResponseCredentialType cancellationProcessStatus = null;
  @SerializedName("canceledAt")
  private String canceledAt = null;
  @SerializedName("items")
  private List<ResponseInvoiceItem> items = null;
  @SerializedName("relations")
  private List<ResponseInvoiceRelation> relations = null;
  @SerializedName("appliedCredits")
  private List<ResponseInvoiceCreditNote> appliedCredits = null;
  @SerializedName("issuedCredits")
  private List<ResponseInvoiceCreditNote> issuedCredits = null;
  @SerializedName("xml")
  private Boolean xml = null;
  @SerializedName("pdf")
  private Boolean pdf = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("updatedAt")
  private String updatedAt = null;
   
  @ApiModelProperty(example = "/invoices/91106968-1abd-4d64-85c1-4e73d96fb997", value = "Invoice IRI reference")
  public String getId1() {
    return id1;
  }
   
  @ApiModelProperty(value = "")
  public String getType1() {
    return type1;
  }
   
  @ApiModelProperty(example = "91106968-1abd-4d64-85c1-4e73d96fb997", value = "Invoice ID")
  public UUID getId() {
    return id;
  }
   
  @ApiModelProperty(example = "def404af-5eef-4112-aa99-d1ec8493b89a", value = "Invoice UUID (Folio fiscal)")
  public UUID getUuid() {
    return uuid;
  }
  public ResponseInvoice version(Double version) {
    this.version = version;
    return this;
  }
   
  @ApiModelProperty(example = "3.3", value = "CFDI version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }
  public ResponseInvoice reference(String reference) {
    this.reference = reference;
    return this;
  }
   
  @ApiModelProperty(example = "Branch-A", value = "It is an open field for internal identification. Communly it is used to identify a branch")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }
  public ResponseInvoice internalIdentifier(String internalIdentifier) {
    this.internalIdentifier = internalIdentifier;
    return this;
  }
   
  @ApiModelProperty(example = "00001", value = "It is an open field for internal identification. Communly it is used to identify an invoice")
  public String getInternalIdentifier() {
    return internalIdentifier;
  }
  public void setInternalIdentifier(String internalIdentifier) {
    this.internalIdentifier = internalIdentifier;
  }
  public ResponseInvoice type(String type) {
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
  public ResponseInvoice usage(String usage) {
    this.usage = usage;
    return this;
  }
   
  @ApiModelProperty(example = "G03", value = "Invoice usage code from `c_UsoCFDI` catalog")
  public String getUsage() {
    return usage;
  }
  public void setUsage(String usage) {
    this.usage = usage;
  }
  public ResponseInvoice paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }
  public ResponseInvoice paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }
   
  @ApiModelProperty(example = "04", value = "Payment method code from `c_FormaPago` catalog")
  public String getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
   
  @ApiModelProperty(example = "01210", value = "Postal code of the place of issue")
  public String getPlaceOfIssue() {
    return placeOfIssue;
  }
  public ResponseInvoice issuer(ResponseCredentialType issuer) {
    this.issuer = issuer;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseCredentialType getIssuer() {
    return issuer;
  }
  public void setIssuer(ResponseCredentialType issuer) {
    this.issuer = issuer;
  }
   
  @ApiModelProperty(example = "true", value = "`true` if the invoice issuer is the taxpayer from the link")
  public Boolean isIsIssuer() {
    return isIssuer;
  }
  public ResponseInvoice receiver(ResponseInvoiceReceiver receiver) {
    this.receiver = receiver;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseInvoiceReceiver getReceiver() {
    return receiver;
  }
  public void setReceiver(ResponseInvoiceReceiver receiver) {
    this.receiver = receiver;
  }
   
  @ApiModelProperty(example = "false", value = "`true` if the invoice receiver is the taxpayer from the link")
  public Boolean isIsReceiver() {
    return isReceiver;
  }
  public ResponseInvoice currency(String currency) {
    this.currency = currency;
    return this;
  }
   
  @ApiModelProperty(example = "MXN", value = "ISO 4217 alphabetic currency code")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }
  public ResponseInvoice discount(Double discount) {
    this.discount = discount;
    return this;
  }
   
  @ApiModelProperty(example = "3324.0", value = "Discount amount")
  public Double getDiscount() {
    return discount;
  }
  public void setDiscount(Double discount) {
    this.discount = discount;
  }
  public ResponseInvoice tax(Double tax) {
    this.tax = tax;
    return this;
  }
   
  @ApiModelProperty(example = "5224.0", value = "Tax amount")
  public Double getTax() {
    return tax;
  }
  public void setTax(Double tax) {
    this.tax = tax;
  }
  public ResponseInvoice subtotal(Double subtotal) {
    this.subtotal = subtotal;
    return this;
  }
   
  @ApiModelProperty(example = "51349.8", value = "Subtotal amount")
  public Double getSubtotal() {
    return subtotal;
  }
  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }
  public ResponseInvoice total(Double total) {
    this.total = total;
    return this;
  }
   
  @ApiModelProperty(example = "53249.8", value = "Invoice total amount")
  public Double getTotal() {
    return total;
  }
  public void setTotal(Double total) {
    this.total = total;
  }
  public ResponseInvoice exchangeRate(Double exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }
   
  @ApiModelProperty(example = "19.8", value = "Set when *currency* is different than MXN (Mexican Peso).")
  public Double getExchangeRate() {
    return exchangeRate;
  }
  public void setExchangeRate(Double exchangeRate) {
    this.exchangeRate = exchangeRate;
  }
  public ResponseInvoice paidAmount(Double paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }
   
  @ApiModelProperty(example = "53249.8", value = "For a deferred invoice this field state the paid amount. (Applies only for \"PPD\" invoices).")
  public Double getPaidAmount() {
    return paidAmount;
  }
  public void setPaidAmount(Double paidAmount) {
    this.paidAmount = paidAmount;
  }
  public ResponseInvoice dueAmount(Double dueAmount) {
    this.dueAmount = dueAmount;
    return this;
  }
   
  @ApiModelProperty(example = "0.0", value = "For a deferred invoice this field state the due amount. (Applies only for \"PPD\" invoices).")
  public Double getDueAmount() {
    return dueAmount;
  }
  public void setDueAmount(Double dueAmount) {
    this.dueAmount = dueAmount;
  }
  public ResponseInvoice lastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }
   
  @ApiModelProperty(value = "This field is populated with the last related payment date (Applies only for \"PPD\" invoices).")
  public String getLastPaymentDate() {
    return lastPaymentDate;
  }
  public void setLastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }
  public ResponseInvoice fullyPaidAt(String fullyPaidAt) {
    this.fullyPaidAt = fullyPaidAt;
    return this;
  }
   
  @ApiModelProperty(value = "This field is populated when the total debt is paid. (Applies only for \"PPD\" invoices).")
  public String getFullyPaidAt() {
    return fullyPaidAt;
  }
  public void setFullyPaidAt(String fullyPaidAt) {
    this.fullyPaidAt = fullyPaidAt;
  }
  public ResponseInvoice paymentTermsRaw(String paymentTermsRaw) {
    this.paymentTermsRaw = paymentTermsRaw;
    return this;
  }
   
  @ApiModelProperty(example = "Tarjeta de crédito", value = "The invoice payment terms text exactly as it comes from the invoice, i.e. immediate, 30 days, cash, credit card, etc")
  public String getPaymentTermsRaw() {
    return paymentTermsRaw;
  }
  public void setPaymentTermsRaw(String paymentTermsRaw) {
    this.paymentTermsRaw = paymentTermsRaw;
  }
  public ResponseInvoice status(String status) {
    this.status = status;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public ResponseInvoice pac(String pac) {
    this.pac = pac;
    return this;
  }
   
  @ApiModelProperty(example = "SAT970701NN3", value = "Certification provider tax ID (Proveedor Autorizado de Certificación)")
  public String getPac() {
    return pac;
  }
  public void setPac(String pac) {
    this.pac = pac;
  }
  public ResponseInvoice issuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }
   
  @ApiModelProperty(example = "2019-01-03T21:10:40Z", value = "Invoice issue date")
  public String getIssuedAt() {
    return issuedAt;
  }
  public void setIssuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
  }
  public ResponseInvoice certifiedAt(String certifiedAt) {
    this.certifiedAt = certifiedAt;
    return this;
  }
   
  @ApiModelProperty(example = "2019-01-03T21:10:41Z", value = "Invoice certification date")
  public String getCertifiedAt() {
    return certifiedAt;
  }
  public void setCertifiedAt(String certifiedAt) {
    this.certifiedAt = certifiedAt;
  }
  public ResponseInvoice cancellationStatus(String cancellationStatus) {
    this.cancellationStatus = cancellationStatus;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getCancellationStatus() {
    return cancellationStatus;
  }
  public void setCancellationStatus(String cancellationStatus) {
    this.cancellationStatus = cancellationStatus;
  }
  public ResponseInvoice cancellationProcessStatus(ResponseCredentialType cancellationProcessStatus) {
    this.cancellationProcessStatus = cancellationProcessStatus;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResponseCredentialType getCancellationProcessStatus() {
    return cancellationProcessStatus;
  }
  public void setCancellationProcessStatus(ResponseCredentialType cancellationProcessStatus) {
    this.cancellationProcessStatus = cancellationProcessStatus;
  }
  public ResponseInvoice canceledAt(String canceledAt) {
    this.canceledAt = canceledAt;
    return this;
  }
   
  @ApiModelProperty(value = "Set when *status* is `CANCELADO`")
  public String getCanceledAt() {
    return canceledAt;
  }
  public void setCanceledAt(String canceledAt) {
    this.canceledAt = canceledAt;
  }
  public ResponseInvoice items(List<ResponseInvoiceItem> items) {
    this.items = items;
    return this;
  }
  public ResponseInvoice addItemsItem(ResponseInvoiceItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ResponseInvoiceItem>();
    }
    this.items.add(itemsItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<ResponseInvoiceItem> getItems() {
    return items;
  }
  public void setItems(List<ResponseInvoiceItem> items) {
    this.items = items;
  }
  public ResponseInvoice relations(List<ResponseInvoiceRelation> relations) {
    this.relations = relations;
    return this;
  }
  public ResponseInvoice addRelationsItem(ResponseInvoiceRelation relationsItem) {
    if (this.relations == null) {
      this.relations = new ArrayList<ResponseInvoiceRelation>();
    }
    this.relations.add(relationsItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<ResponseInvoiceRelation> getRelations() {
    return relations;
  }
  public void setRelations(List<ResponseInvoiceRelation> relations) {
    this.relations = relations;
  }
  public ResponseInvoice appliedCredits(List<ResponseInvoiceCreditNote> appliedCredits) {
    this.appliedCredits = appliedCredits;
    return this;
  }
  public ResponseInvoice addAppliedCreditsItem(ResponseInvoiceCreditNote appliedCreditsItem) {
    if (this.appliedCredits == null) {
      this.appliedCredits = new ArrayList<ResponseInvoiceCreditNote>();
    }
    this.appliedCredits.add(appliedCreditsItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<ResponseInvoiceCreditNote> getAppliedCredits() {
    return appliedCredits;
  }
  public void setAppliedCredits(List<ResponseInvoiceCreditNote> appliedCredits) {
    this.appliedCredits = appliedCredits;
  }
  public ResponseInvoice issuedCredits(List<ResponseInvoiceCreditNote> issuedCredits) {
    this.issuedCredits = issuedCredits;
    return this;
  }
  public ResponseInvoice addIssuedCreditsItem(ResponseInvoiceCreditNote issuedCreditsItem) {
    if (this.issuedCredits == null) {
      this.issuedCredits = new ArrayList<ResponseInvoiceCreditNote>();
    }
    this.issuedCredits.add(issuedCreditsItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<ResponseInvoiceCreditNote> getIssuedCredits() {
    return issuedCredits;
  }
  public void setIssuedCredits(List<ResponseInvoiceCreditNote> issuedCredits) {
    this.issuedCredits = issuedCredits;
  }
   
  @ApiModelProperty(value = "`true` when the CFDI is available in the XML format. The file can be downloaded through the [retrieve an invoice CFDI](#operation/GetInvoiceCFDI) operation")
  public Boolean isXml() {
    return xml;
  }
   
  @ApiModelProperty(value = "`true` when the CFDI is available in the PDF format. The file can be downloaded through the [retrieve an invoice CFDI](#operation/GetInvoiceCFDI) operation")
  public Boolean isPdf() {
    return pdf;
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
    ResponseInvoice responseInvoice = (ResponseInvoice) o;
    return Objects.equals(this.id, responseInvoice.id) &&
        Objects.equals(this.type, responseInvoice.type) &&
        Objects.equals(this.id, responseInvoice.id) &&
        Objects.equals(this.uuid, responseInvoice.uuid) &&
        Objects.equals(this.version, responseInvoice.version) &&
        Objects.equals(this.reference, responseInvoice.reference) &&
        Objects.equals(this.internalIdentifier, responseInvoice.internalIdentifier) &&
        Objects.equals(this.type, responseInvoice.type) &&
        Objects.equals(this.usage, responseInvoice.usage) &&
        Objects.equals(this.paymentType, responseInvoice.paymentType) &&
        Objects.equals(this.paymentMethod, responseInvoice.paymentMethod) &&
        Objects.equals(this.placeOfIssue, responseInvoice.placeOfIssue) &&
        Objects.equals(this.issuer, responseInvoice.issuer) &&
        Objects.equals(this.isIssuer, responseInvoice.isIssuer) &&
        Objects.equals(this.receiver, responseInvoice.receiver) &&
        Objects.equals(this.isReceiver, responseInvoice.isReceiver) &&
        Objects.equals(this.currency, responseInvoice.currency) &&
        Objects.equals(this.discount, responseInvoice.discount) &&
        Objects.equals(this.tax, responseInvoice.tax) &&
        Objects.equals(this.subtotal, responseInvoice.subtotal) &&
        Objects.equals(this.total, responseInvoice.total) &&
        Objects.equals(this.exchangeRate, responseInvoice.exchangeRate) &&
        Objects.equals(this.paidAmount, responseInvoice.paidAmount) &&
        Objects.equals(this.dueAmount, responseInvoice.dueAmount) &&
        Objects.equals(this.lastPaymentDate, responseInvoice.lastPaymentDate) &&
        Objects.equals(this.fullyPaidAt, responseInvoice.fullyPaidAt) &&
        Objects.equals(this.paymentTermsRaw, responseInvoice.paymentTermsRaw) &&
        Objects.equals(this.status, responseInvoice.status) &&
        Objects.equals(this.pac, responseInvoice.pac) &&
        Objects.equals(this.issuedAt, responseInvoice.issuedAt) &&
        Objects.equals(this.certifiedAt, responseInvoice.certifiedAt) &&
        Objects.equals(this.cancellationStatus, responseInvoice.cancellationStatus) &&
        Objects.equals(this.cancellationProcessStatus, responseInvoice.cancellationProcessStatus) &&
        Objects.equals(this.canceledAt, responseInvoice.canceledAt) &&
        Objects.equals(this.items, responseInvoice.items) &&
        Objects.equals(this.relations, responseInvoice.relations) &&
        Objects.equals(this.appliedCredits, responseInvoice.appliedCredits) &&
        Objects.equals(this.issuedCredits, responseInvoice.issuedCredits) &&
        Objects.equals(this.xml, responseInvoice.xml) &&
        Objects.equals(this.pdf, responseInvoice.pdf) &&
        Objects.equals(this.createdAt, responseInvoice.createdAt) &&
        Objects.equals(this.updatedAt, responseInvoice.updatedAt);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, type, id, uuid, version, reference, internalIdentifier, type, usage, paymentType, paymentMethod, placeOfIssue, issuer, isIssuer, receiver, isReceiver, currency, discount, tax, subtotal, total, exchangeRate, paidAmount, dueAmount, lastPaymentDate, fullyPaidAt, paymentTermsRaw, status, pac, issuedAt, certifiedAt, cancellationStatus, cancellationProcessStatus, canceledAt, items, relations, appliedCredits, issuedCredits, xml, pdf, createdAt, updatedAt);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInvoice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    internalIdentifier: ").append(toIndentedString(internalIdentifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    placeOfIssue: ").append(toIndentedString(placeOfIssue)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    isIssuer: ").append(toIndentedString(isIssuer)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    isReceiver: ").append(toIndentedString(isReceiver)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    dueAmount: ").append(toIndentedString(dueAmount)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    fullyPaidAt: ").append(toIndentedString(fullyPaidAt)).append("\n");
    sb.append("    paymentTermsRaw: ").append(toIndentedString(paymentTermsRaw)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pac: ").append(toIndentedString(pac)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    certifiedAt: ").append(toIndentedString(certifiedAt)).append("\n");
    sb.append("    cancellationStatus: ").append(toIndentedString(cancellationStatus)).append("\n");
    sb.append("    cancellationProcessStatus: ").append(toIndentedString(cancellationProcessStatus)).append("\n");
    sb.append("    canceledAt: ").append(toIndentedString(canceledAt)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    appliedCredits: ").append(toIndentedString(appliedCredits)).append("\n");
    sb.append("    issuedCredits: ").append(toIndentedString(issuedCredits)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
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
