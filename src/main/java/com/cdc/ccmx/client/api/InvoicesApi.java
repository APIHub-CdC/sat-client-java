package com.cdc.ccmx.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.threeten.bp.OffsetDateTime;

import com.cdc.ccmx.client.ApiCallback;
import com.cdc.ccmx.client.ApiClient;
import com.cdc.ccmx.client.ApiException;
import com.cdc.ccmx.client.ApiResponse;
import com.cdc.ccmx.client.Configuration;
import com.cdc.ccmx.client.Pair;
import com.cdc.ccmx.client.ProgressRequestBody;
import com.cdc.ccmx.client.ProgressResponseBody;
import com.cdc.ccmx.client.model.ResponseTaxPayerInvoice;
import com.google.gson.reflect.TypeToken;

public class InvoicesApi {
    private ApiClient apiClient;
    public InvoicesApi() {
        this(Configuration.getDefaultApiClient());
    }
    public InvoicesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call listTaxpayerInvoiceCall(String xApiKey, String xRequestId, String username, String password, String id, UUID uuid, Double version, String type, String usage, String paymentType, String paymentMethod, String issuerRfc, String issuerName, Double issuerTaxRegime, String issuerBlacklistStatus, Boolean isIssuer, String receiverRfc, String receiverName, String receiverBlacklistStatus, Boolean isReceiver, String currency, String status, String pac, String cancellationStatus, String cancellationStatusProcess, OffsetDateTime issuedAtBefore, OffsetDateTime issuedAtStrictlyBefore, OffsetDateTime issuedAtAfter, OffsetDateTime issuedAtStrictlyAfter, OffsetDateTime canceledAtBefore, OffsetDateTime canceledAtStrictlyBefore, OffsetDateTime canceledAtAfter, OffsetDateTime canceledAtStrictlyAfter, String createdAtBefore, String createdAtStrictlyBefore, String createdAtAfter, String createdAtStrictlyAfter, String updatedAtBefore, String updatedAtStrictlyBefore, String updatedAtAfter, String updatedAtStrictlyAfter, OffsetDateTime certifiedAtBefore, OffsetDateTime certifiedAtStrictlyBefore, OffsetDateTime certifiedAtAfter, OffsetDateTime certifiedAtStrictlyAfter, OffsetDateTime lastPaymentDateBefore, OffsetDateTime lastPaymentDateStrictlyBefore, OffsetDateTime lastPaymentDateAfter, OffsetDateTime lastPaymentDateStrictlyAfter, OffsetDateTime fullyPaidAtBefore, OffsetDateTime fullyPaidAtStrictlyBefore, OffsetDateTime fullyPaidAtAfter, OffsetDateTime fullyPaidAtStrictlyAfter, String taxBetween, Double taxGt, Double taxGte, Double taxLt, Double taxLte, String discountBetween, Double discountGt, Double discountGte, Double discountLt, Double discountLte, String subtotalBetween, Double subtotalGt, Double subtotalGte, Double subtotalLt, Double subtotalLte, String totalBetween, Double totalGt, Double totalGte, Double totalLt, Double totalLte, String paidAmountBetween, Double paidAmountGt, Double paidAmountGte, Double paidAmountLt, Double paidAmountLte, String dueAmountBetween, Double dueAmountGt, Double dueAmountGte, Double dueAmountLt, Double dueAmountLte, Boolean hasXml, Boolean hasPdf, String orderIssuedAt, String orderCanceledAt, String orderCertifiedAt, String orderAmount, Integer page, Integer itemsPerPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/taxpayers/{id}/invoices"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (uuid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("uuid", uuid));
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("version", version));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (usage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("usage", usage));
        if (paymentType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("paymentType", paymentType));
        if (paymentMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("paymentMethod", paymentMethod));
        if (issuerRfc != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("issuer.rfc", issuerRfc));
        if (issuerName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("issuer.name", issuerName));
        if (issuerTaxRegime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("issuer.taxRegime", issuerTaxRegime));
        if (issuerBlacklistStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("issuer.blacklistStatus", issuerBlacklistStatus));
        if (isIssuer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isIssuer", isIssuer));
        if (receiverRfc != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("receiver.rfc", receiverRfc));
        if (receiverName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("receiver.name", receiverName));
        if (receiverBlacklistStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("receiver.blacklistStatus", receiverBlacklistStatus));
        if (isReceiver != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isReceiver", isReceiver));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (pac != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pac", pac));
        if (cancellationStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cancellationStatus", cancellationStatus));
        if (cancellationStatusProcess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cancellationStatusProcess", cancellationStatusProcess));
        if (issuedAtBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("issuedAt[before]", issuedAtBefore));
        if (issuedAtStrictlyBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("issuedAt[strictly_before]", issuedAtStrictlyBefore));
        if (issuedAtAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("issuedAt[after]", issuedAtAfter));
        if (issuedAtStrictlyAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("issuedAt[strictly_after]", issuedAtStrictlyAfter));
        if (canceledAtBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("canceledAt[before]", canceledAtBefore));
        if (canceledAtStrictlyBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("canceledAt[strictly_before]", canceledAtStrictlyBefore));
        if (canceledAtAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("canceledAt[after]", canceledAtAfter));
        if (canceledAtStrictlyAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("canceledAt[strictly_after]", canceledAtStrictlyAfter));
        if (createdAtBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdAt[before]", createdAtBefore));
        if (createdAtStrictlyBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdAt[strictly_before]", createdAtStrictlyBefore));
        if (createdAtAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdAt[after]", createdAtAfter));
        if (createdAtStrictlyAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdAt[strictly_after]", createdAtStrictlyAfter));
        if (updatedAtBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("updatedAt[before]", updatedAtBefore));
        if (updatedAtStrictlyBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("updatedAt[strictly_before]", updatedAtStrictlyBefore));
        if (updatedAtAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("updatedAt[after]", updatedAtAfter));
        if (updatedAtStrictlyAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("updatedAt[strictly_after]", updatedAtStrictlyAfter));
        if (certifiedAtBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("certifiedAt[before]", certifiedAtBefore));
        if (certifiedAtStrictlyBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("certifiedAt[strictly_before]", certifiedAtStrictlyBefore));
        if (certifiedAtAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("certifiedAt[after]", certifiedAtAfter));
        if (certifiedAtStrictlyAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("certifiedAt[strictly_after]", certifiedAtStrictlyAfter));
        if (lastPaymentDateBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lastPaymentDate[before]", lastPaymentDateBefore));
        if (lastPaymentDateStrictlyBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lastPaymentDate[strictly_before]", lastPaymentDateStrictlyBefore));
        if (lastPaymentDateAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lastPaymentDate[after]", lastPaymentDateAfter));
        if (lastPaymentDateStrictlyAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lastPaymentDate[strictly_after]", lastPaymentDateStrictlyAfter));
        if (fullyPaidAtBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fullyPaidAt[before]", fullyPaidAtBefore));
        if (fullyPaidAtStrictlyBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fullyPaidAt[strictly_before]", fullyPaidAtStrictlyBefore));
        if (fullyPaidAtAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fullyPaidAt[after]", fullyPaidAtAfter));
        if (fullyPaidAtStrictlyAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fullyPaidAt[strictly_after]", fullyPaidAtStrictlyAfter));
        if (taxBetween != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tax[between]", taxBetween));
        if (taxGt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tax[gt]", taxGt));
        if (taxGte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tax[gte]", taxGte));
        if (taxLt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tax[lt]", taxLt));
        if (taxLte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tax[lte]", taxLte));
        if (discountBetween != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("discount[between]", discountBetween));
        if (discountGt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("discount[gt]", discountGt));
        if (discountGte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("discount[gte]", discountGte));
        if (discountLt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("discount[lt]", discountLt));
        if (discountLte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("discount[lte]", discountLte));
        if (subtotalBetween != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("subtotal[between]", subtotalBetween));
        if (subtotalGt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("subtotal[gt]", subtotalGt));
        if (subtotalGte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("subtotal[gte]", subtotalGte));
        if (subtotalLt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("subtotal[lt]", subtotalLt));
        if (subtotalLte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("subtotal[lte]", subtotalLte));
        if (totalBetween != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("total[between]", totalBetween));
        if (totalGt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("total[gt]", totalGt));
        if (totalGte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("total[gte]", totalGte));
        if (totalLt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("total[lt]", totalLt));
        if (totalLte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("total[lte]", totalLte));
        if (paidAmountBetween != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("paidAmount[between]", paidAmountBetween));
        if (paidAmountGt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("paidAmount[gt]", paidAmountGt));
        if (paidAmountGte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("paidAmount[gte]", paidAmountGte));
        if (paidAmountLt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("paidAmount[lt]", paidAmountLt));
        if (paidAmountLte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("paidAmount[lte]", paidAmountLte));
        if (dueAmountBetween != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dueAmount[between]", dueAmountBetween));
        if (dueAmountGt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dueAmount[gt]", dueAmountGt));
        if (dueAmountGte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dueAmount[gte]", dueAmountGte));
        if (dueAmountLt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dueAmount[lt]", dueAmountLt));
        if (dueAmountLte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dueAmount[lte]", dueAmountLte));
        if (hasXml != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("hasXml", hasXml));
        if (hasPdf != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("hasPdf", hasPdf));
        if (orderIssuedAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order[issuedAt]", orderIssuedAt));
        if (orderCanceledAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order[canceledAt]", orderCanceledAt));
        if (orderCertifiedAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order[certifiedAt]", orderCertifiedAt));
        if (orderAmount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order[amount]", orderAmount));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (itemsPerPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("itemsPerPage", itemsPerPage));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (xRequestId != null)
        localVarHeaderParams.put("x-request-id", apiClient.parameterToString(xRequestId));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call listTaxpayerInvoiceValidateBeforeCall(String xApiKey, String xRequestId, String username, String password, String id, UUID uuid, Double version, String type, String usage, String paymentType, String paymentMethod, String issuerRfc, String issuerName, Double issuerTaxRegime, String issuerBlacklistStatus, Boolean isIssuer, String receiverRfc, String receiverName, String receiverBlacklistStatus, Boolean isReceiver, String currency, String status, String pac, String cancellationStatus, String cancellationStatusProcess, OffsetDateTime issuedAtBefore, OffsetDateTime issuedAtStrictlyBefore, OffsetDateTime issuedAtAfter, OffsetDateTime issuedAtStrictlyAfter, OffsetDateTime canceledAtBefore, OffsetDateTime canceledAtStrictlyBefore, OffsetDateTime canceledAtAfter, OffsetDateTime canceledAtStrictlyAfter, String createdAtBefore, String createdAtStrictlyBefore, String createdAtAfter, String createdAtStrictlyAfter, String updatedAtBefore, String updatedAtStrictlyBefore, String updatedAtAfter, String updatedAtStrictlyAfter, OffsetDateTime certifiedAtBefore, OffsetDateTime certifiedAtStrictlyBefore, OffsetDateTime certifiedAtAfter, OffsetDateTime certifiedAtStrictlyAfter, OffsetDateTime lastPaymentDateBefore, OffsetDateTime lastPaymentDateStrictlyBefore, OffsetDateTime lastPaymentDateAfter, OffsetDateTime lastPaymentDateStrictlyAfter, OffsetDateTime fullyPaidAtBefore, OffsetDateTime fullyPaidAtStrictlyBefore, OffsetDateTime fullyPaidAtAfter, OffsetDateTime fullyPaidAtStrictlyAfter, String taxBetween, Double taxGt, Double taxGte, Double taxLt, Double taxLte, String discountBetween, Double discountGt, Double discountGte, Double discountLt, Double discountLte, String subtotalBetween, Double subtotalGt, Double subtotalGte, Double subtotalLt, Double subtotalLte, String totalBetween, Double totalGt, Double totalGte, Double totalLt, Double totalLte, String paidAmountBetween, Double paidAmountGt, Double paidAmountGte, Double paidAmountLt, Double paidAmountLte, String dueAmountBetween, Double dueAmountGt, Double dueAmountGte, Double dueAmountLt, Double dueAmountLte, Boolean hasXml, Boolean hasPdf, String orderIssuedAt, String orderCanceledAt, String orderCertifiedAt, String orderAmount, Integer page, Integer itemsPerPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling listTaxpayerInvoice(Async)");
        }
        if (xRequestId == null) {
            throw new ApiException("Missing the required parameter 'xRequestId' when calling listTaxpayerInvoice(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling listTaxpayerInvoice(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling listTaxpayerInvoice(Async)");
        }
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling listTaxpayerInvoice(Async)");
        }
        
        okhttp3.Call call = listTaxpayerInvoiceCall(xApiKey, xRequestId, username, password, id, uuid, version, type, usage, paymentType, paymentMethod, issuerRfc, issuerName, issuerTaxRegime, issuerBlacklistStatus, isIssuer, receiverRfc, receiverName, receiverBlacklistStatus, isReceiver, currency, status, pac, cancellationStatus, cancellationStatusProcess, issuedAtBefore, issuedAtStrictlyBefore, issuedAtAfter, issuedAtStrictlyAfter, canceledAtBefore, canceledAtStrictlyBefore, canceledAtAfter, canceledAtStrictlyAfter, createdAtBefore, createdAtStrictlyBefore, createdAtAfter, createdAtStrictlyAfter, updatedAtBefore, updatedAtStrictlyBefore, updatedAtAfter, updatedAtStrictlyAfter, certifiedAtBefore, certifiedAtStrictlyBefore, certifiedAtAfter, certifiedAtStrictlyAfter, lastPaymentDateBefore, lastPaymentDateStrictlyBefore, lastPaymentDateAfter, lastPaymentDateStrictlyAfter, fullyPaidAtBefore, fullyPaidAtStrictlyBefore, fullyPaidAtAfter, fullyPaidAtStrictlyAfter, taxBetween, taxGt, taxGte, taxLt, taxLte, discountBetween, discountGt, discountGte, discountLt, discountLte, subtotalBetween, subtotalGt, subtotalGte, subtotalLt, subtotalLte, totalBetween, totalGt, totalGte, totalLt, totalLte, paidAmountBetween, paidAmountGt, paidAmountGte, paidAmountLt, paidAmountLte, dueAmountBetween, dueAmountGt, dueAmountGte, dueAmountLt, dueAmountLte, hasXml, hasPdf, orderIssuedAt, orderCanceledAt, orderCertifiedAt, orderAmount, page, itemsPerPage, progressListener, progressRequestListener);
        return call;
    }
    
    public ResponseTaxPayerInvoice listTaxpayerInvoice(String xApiKey, String xRequestId, String username, String password, String id, UUID uuid, Double version, String type, String usage, String paymentType, String paymentMethod, String issuerRfc, String issuerName, Double issuerTaxRegime, String issuerBlacklistStatus, Boolean isIssuer, String receiverRfc, String receiverName, String receiverBlacklistStatus, Boolean isReceiver, String currency, String status, String pac, String cancellationStatus, String cancellationStatusProcess, OffsetDateTime issuedAtBefore, OffsetDateTime issuedAtStrictlyBefore, OffsetDateTime issuedAtAfter, OffsetDateTime issuedAtStrictlyAfter, OffsetDateTime canceledAtBefore, OffsetDateTime canceledAtStrictlyBefore, OffsetDateTime canceledAtAfter, OffsetDateTime canceledAtStrictlyAfter, String createdAtBefore, String createdAtStrictlyBefore, String createdAtAfter, String createdAtStrictlyAfter, String updatedAtBefore, String updatedAtStrictlyBefore, String updatedAtAfter, String updatedAtStrictlyAfter, OffsetDateTime certifiedAtBefore, OffsetDateTime certifiedAtStrictlyBefore, OffsetDateTime certifiedAtAfter, OffsetDateTime certifiedAtStrictlyAfter, OffsetDateTime lastPaymentDateBefore, OffsetDateTime lastPaymentDateStrictlyBefore, OffsetDateTime lastPaymentDateAfter, OffsetDateTime lastPaymentDateStrictlyAfter, OffsetDateTime fullyPaidAtBefore, OffsetDateTime fullyPaidAtStrictlyBefore, OffsetDateTime fullyPaidAtAfter, OffsetDateTime fullyPaidAtStrictlyAfter, String taxBetween, Double taxGt, Double taxGte, Double taxLt, Double taxLte, String discountBetween, Double discountGt, Double discountGte, Double discountLt, Double discountLte, String subtotalBetween, Double subtotalGt, Double subtotalGte, Double subtotalLt, Double subtotalLte, String totalBetween, Double totalGt, Double totalGte, Double totalLt, Double totalLte, String paidAmountBetween, Double paidAmountGt, Double paidAmountGte, Double paidAmountLt, Double paidAmountLte, String dueAmountBetween, Double dueAmountGt, Double dueAmountGte, Double dueAmountLt, Double dueAmountLte, Boolean hasXml, Boolean hasPdf, String orderIssuedAt, String orderCanceledAt, String orderCertifiedAt, String orderAmount, Integer page, Integer itemsPerPage) throws ApiException {
        ApiResponse<ResponseTaxPayerInvoice> resp = listTaxpayerInvoiceWithHttpInfo(xApiKey, xRequestId, username, password, id, uuid, version, type, usage, paymentType, paymentMethod, issuerRfc, issuerName, issuerTaxRegime, issuerBlacklistStatus, isIssuer, receiverRfc, receiverName, receiverBlacklistStatus, isReceiver, currency, status, pac, cancellationStatus, cancellationStatusProcess, issuedAtBefore, issuedAtStrictlyBefore, issuedAtAfter, issuedAtStrictlyAfter, canceledAtBefore, canceledAtStrictlyBefore, canceledAtAfter, canceledAtStrictlyAfter, createdAtBefore, createdAtStrictlyBefore, createdAtAfter, createdAtStrictlyAfter, updatedAtBefore, updatedAtStrictlyBefore, updatedAtAfter, updatedAtStrictlyAfter, certifiedAtBefore, certifiedAtStrictlyBefore, certifiedAtAfter, certifiedAtStrictlyAfter, lastPaymentDateBefore, lastPaymentDateStrictlyBefore, lastPaymentDateAfter, lastPaymentDateStrictlyAfter, fullyPaidAtBefore, fullyPaidAtStrictlyBefore, fullyPaidAtAfter, fullyPaidAtStrictlyAfter, taxBetween, taxGt, taxGte, taxLt, taxLte, discountBetween, discountGt, discountGte, discountLt, discountLte, subtotalBetween, subtotalGt, subtotalGte, subtotalLt, subtotalLte, totalBetween, totalGt, totalGte, totalLt, totalLte, paidAmountBetween, paidAmountGt, paidAmountGte, paidAmountLt, paidAmountLte, dueAmountBetween, dueAmountGt, dueAmountGte, dueAmountLt, dueAmountLte, hasXml, hasPdf, orderIssuedAt, orderCanceledAt, orderCertifiedAt, orderAmount, page, itemsPerPage);
        return resp.getData();
    }
    
    public ApiResponse<ResponseTaxPayerInvoice> listTaxpayerInvoiceWithHttpInfo(String xApiKey, String xRequestId, String username, String password, String id, UUID uuid, Double version, String type, String usage, String paymentType, String paymentMethod, String issuerRfc, String issuerName, Double issuerTaxRegime, String issuerBlacklistStatus, Boolean isIssuer, String receiverRfc, String receiverName, String receiverBlacklistStatus, Boolean isReceiver, String currency, String status, String pac, String cancellationStatus, String cancellationStatusProcess, OffsetDateTime issuedAtBefore, OffsetDateTime issuedAtStrictlyBefore, OffsetDateTime issuedAtAfter, OffsetDateTime issuedAtStrictlyAfter, OffsetDateTime canceledAtBefore, OffsetDateTime canceledAtStrictlyBefore, OffsetDateTime canceledAtAfter, OffsetDateTime canceledAtStrictlyAfter, String createdAtBefore, String createdAtStrictlyBefore, String createdAtAfter, String createdAtStrictlyAfter, String updatedAtBefore, String updatedAtStrictlyBefore, String updatedAtAfter, String updatedAtStrictlyAfter, OffsetDateTime certifiedAtBefore, OffsetDateTime certifiedAtStrictlyBefore, OffsetDateTime certifiedAtAfter, OffsetDateTime certifiedAtStrictlyAfter, OffsetDateTime lastPaymentDateBefore, OffsetDateTime lastPaymentDateStrictlyBefore, OffsetDateTime lastPaymentDateAfter, OffsetDateTime lastPaymentDateStrictlyAfter, OffsetDateTime fullyPaidAtBefore, OffsetDateTime fullyPaidAtStrictlyBefore, OffsetDateTime fullyPaidAtAfter, OffsetDateTime fullyPaidAtStrictlyAfter, String taxBetween, Double taxGt, Double taxGte, Double taxLt, Double taxLte, String discountBetween, Double discountGt, Double discountGte, Double discountLt, Double discountLte, String subtotalBetween, Double subtotalGt, Double subtotalGte, Double subtotalLt, Double subtotalLte, String totalBetween, Double totalGt, Double totalGte, Double totalLt, Double totalLte, String paidAmountBetween, Double paidAmountGt, Double paidAmountGte, Double paidAmountLt, Double paidAmountLte, String dueAmountBetween, Double dueAmountGt, Double dueAmountGte, Double dueAmountLt, Double dueAmountLte, Boolean hasXml, Boolean hasPdf, String orderIssuedAt, String orderCanceledAt, String orderCertifiedAt, String orderAmount, Integer page, Integer itemsPerPage) throws ApiException {
        okhttp3.Call call = listTaxpayerInvoiceValidateBeforeCall(xApiKey, xRequestId, username, password, id, uuid, version, type, usage, paymentType, paymentMethod, issuerRfc, issuerName, issuerTaxRegime, issuerBlacklistStatus, isIssuer, receiverRfc, receiverName, receiverBlacklistStatus, isReceiver, currency, status, pac, cancellationStatus, cancellationStatusProcess, issuedAtBefore, issuedAtStrictlyBefore, issuedAtAfter, issuedAtStrictlyAfter, canceledAtBefore, canceledAtStrictlyBefore, canceledAtAfter, canceledAtStrictlyAfter, createdAtBefore, createdAtStrictlyBefore, createdAtAfter, createdAtStrictlyAfter, updatedAtBefore, updatedAtStrictlyBefore, updatedAtAfter, updatedAtStrictlyAfter, certifiedAtBefore, certifiedAtStrictlyBefore, certifiedAtAfter, certifiedAtStrictlyAfter, lastPaymentDateBefore, lastPaymentDateStrictlyBefore, lastPaymentDateAfter, lastPaymentDateStrictlyAfter, fullyPaidAtBefore, fullyPaidAtStrictlyBefore, fullyPaidAtAfter, fullyPaidAtStrictlyAfter, taxBetween, taxGt, taxGte, taxLt, taxLte, discountBetween, discountGt, discountGte, discountLt, discountLte, subtotalBetween, subtotalGt, subtotalGte, subtotalLt, subtotalLte, totalBetween, totalGt, totalGte, totalLt, totalLte, paidAmountBetween, paidAmountGt, paidAmountGte, paidAmountLt, paidAmountLte, dueAmountBetween, dueAmountGt, dueAmountGte, dueAmountLt, dueAmountLte, hasXml, hasPdf, orderIssuedAt, orderCanceledAt, orderCertifiedAt, orderAmount, page, itemsPerPage, null, null);
        Type localVarReturnType = new TypeToken<ResponseTaxPayerInvoice>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call listTaxpayerInvoiceAsync(String xSignature, String xApiKey, String xRequestId, String username, String password, String id, UUID uuid, Double version, String type, String usage, String paymentType, String paymentMethod, String issuerRfc, String issuerName, Double issuerTaxRegime, String issuerBlacklistStatus, Boolean isIssuer, String receiverRfc, String receiverName, String receiverBlacklistStatus, Boolean isReceiver, String currency, String status, String pac, String cancellationStatus, String cancellationStatusProcess, OffsetDateTime issuedAtBefore, OffsetDateTime issuedAtStrictlyBefore, OffsetDateTime issuedAtAfter, OffsetDateTime issuedAtStrictlyAfter, OffsetDateTime canceledAtBefore, OffsetDateTime canceledAtStrictlyBefore, OffsetDateTime canceledAtAfter, OffsetDateTime canceledAtStrictlyAfter, String createdAtBefore, String createdAtStrictlyBefore, String createdAtAfter, String createdAtStrictlyAfter, String updatedAtBefore, String updatedAtStrictlyBefore, String updatedAtAfter, String updatedAtStrictlyAfter, OffsetDateTime certifiedAtBefore, OffsetDateTime certifiedAtStrictlyBefore, OffsetDateTime certifiedAtAfter, OffsetDateTime certifiedAtStrictlyAfter, OffsetDateTime lastPaymentDateBefore, OffsetDateTime lastPaymentDateStrictlyBefore, OffsetDateTime lastPaymentDateAfter, OffsetDateTime lastPaymentDateStrictlyAfter, OffsetDateTime fullyPaidAtBefore, OffsetDateTime fullyPaidAtStrictlyBefore, OffsetDateTime fullyPaidAtAfter, OffsetDateTime fullyPaidAtStrictlyAfter, String taxBetween, Double taxGt, Double taxGte, Double taxLt, Double taxLte, String discountBetween, Double discountGt, Double discountGte, Double discountLt, Double discountLte, String subtotalBetween, Double subtotalGt, Double subtotalGte, Double subtotalLt, Double subtotalLte, String totalBetween, Double totalGt, Double totalGte, Double totalLt, Double totalLte, String paidAmountBetween, Double paidAmountGt, Double paidAmountGte, Double paidAmountLt, Double paidAmountLte, String dueAmountBetween, Double dueAmountGt, Double dueAmountGte, Double dueAmountLt, Double dueAmountLte, Boolean hasXml, Boolean hasPdf, String orderIssuedAt, String orderCanceledAt, String orderCertifiedAt, String orderAmount, Integer page, Integer itemsPerPage, final ApiCallback<ResponseTaxPayerInvoice> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = listTaxpayerInvoiceValidateBeforeCall(xApiKey, xRequestId, username, password, id, uuid, version, type, usage, paymentType, paymentMethod, issuerRfc, issuerName, issuerTaxRegime, issuerBlacklistStatus, isIssuer, receiverRfc, receiverName, receiverBlacklistStatus, isReceiver, currency, status, pac, cancellationStatus, cancellationStatusProcess, issuedAtBefore, issuedAtStrictlyBefore, issuedAtAfter, issuedAtStrictlyAfter, canceledAtBefore, canceledAtStrictlyBefore, canceledAtAfter, canceledAtStrictlyAfter, createdAtBefore, createdAtStrictlyBefore, createdAtAfter, createdAtStrictlyAfter, updatedAtBefore, updatedAtStrictlyBefore, updatedAtAfter, updatedAtStrictlyAfter, certifiedAtBefore, certifiedAtStrictlyBefore, certifiedAtAfter, certifiedAtStrictlyAfter, lastPaymentDateBefore, lastPaymentDateStrictlyBefore, lastPaymentDateAfter, lastPaymentDateStrictlyAfter, fullyPaidAtBefore, fullyPaidAtStrictlyBefore, fullyPaidAtAfter, fullyPaidAtStrictlyAfter, taxBetween, taxGt, taxGte, taxLt, taxLte, discountBetween, discountGt, discountGte, discountLt, discountLte, subtotalBetween, subtotalGt, subtotalGte, subtotalLt, subtotalLte, totalBetween, totalGt, totalGte, totalLt, totalLte, paidAmountBetween, paidAmountGt, paidAmountGte, paidAmountLt, paidAmountLte, dueAmountBetween, dueAmountGt, dueAmountGte, dueAmountLt, dueAmountLte, hasXml, hasPdf, orderIssuedAt, orderCanceledAt, orderCertifiedAt, orderAmount, page, itemsPerPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseTaxPayerInvoice>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
