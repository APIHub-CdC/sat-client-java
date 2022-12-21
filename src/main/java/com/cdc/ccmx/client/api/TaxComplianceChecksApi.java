package com.cdc.ccmx.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cdc.ccmx.client.ApiCallback;
import com.cdc.ccmx.client.ApiClient;
import com.cdc.ccmx.client.ApiException;
import com.cdc.ccmx.client.ApiResponse;
import com.cdc.ccmx.client.Configuration;
import com.cdc.ccmx.client.Pair;
import com.cdc.ccmx.client.ProgressRequestBody;
import com.cdc.ccmx.client.ProgressResponseBody;
import com.cdc.ccmx.client.model.ResponseTaxpayerTaxComplianceCheckCollection;
import com.google.gson.reflect.TypeToken;

public class TaxComplianceChecksApi {
    private ApiClient apiClient;
    public TaxComplianceChecksApi() {
        this(Configuration.getDefaultApiClient());
    }
    public TaxComplianceChecksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call listTaxpayerTaxComplianceCheckCall(String xApiKey, String xRequestId, String username, String password, String id, String internalIdentifier, String taxpayerRfc, String taxpayerName, String result, String checkedAtBefore, String checkedAtStrictlyBefore, String checkedAtAfter, String checkedAtStrictlyAfter, String createdAtBefore, String createdAtStrictlyBefore, String createdAtAfter, String createdAtStrictlyAfter, String orderCheckedAt, String orderCreatedAt, Integer page, Integer itemsPerPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/taxpayers/{id}/tax-compliance-checks"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (internalIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("internalIdentifier", internalIdentifier));
        if (taxpayerRfc != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("taxpayer.rfc", taxpayerRfc));
        if (taxpayerName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("taxpayer.name", taxpayerName));
        if (result != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("result", result));
        if (checkedAtBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("checkedAt[before]", checkedAtBefore));
        if (checkedAtStrictlyBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("checkedAt[strictly_before]", checkedAtStrictlyBefore));
        if (checkedAtAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("checkedAt[after]", checkedAtAfter));
        if (checkedAtStrictlyAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("checkedAt[strictly_after]", checkedAtStrictlyAfter));
        if (createdAtBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdAt[before]", createdAtBefore));
        if (createdAtStrictlyBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdAt[strictly_before]", createdAtStrictlyBefore));
        if (createdAtAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdAt[after]", createdAtAfter));
        if (createdAtStrictlyAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdAt[strictly_after]", createdAtStrictlyAfter));
        if (orderCheckedAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order[checkedAt]", orderCheckedAt));
        if (orderCreatedAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order[createdAt]", orderCreatedAt));
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
    private okhttp3.Call listTaxpayerTaxComplianceCheckValidateBeforeCall(String xApiKey, String xRequestId, String username, String password, String id, String internalIdentifier, String taxpayerRfc, String taxpayerName, String result, String checkedAtBefore, String checkedAtStrictlyBefore, String checkedAtAfter, String checkedAtStrictlyAfter, String createdAtBefore, String createdAtStrictlyBefore, String createdAtAfter, String createdAtStrictlyAfter, String orderCheckedAt, String orderCreatedAt, Integer page, Integer itemsPerPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling listTaxpayerTaxComplianceCheck(Async)");
        }
        if (xRequestId == null) {
            throw new ApiException("Missing the required parameter 'xRequestId' when calling listTaxpayerTaxComplianceCheck(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling listTaxpayerTaxComplianceCheck(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling listTaxpayerTaxComplianceCheck(Async)");
        }
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling listTaxpayerTaxComplianceCheck(Async)");
        }
        
        okhttp3.Call call = listTaxpayerTaxComplianceCheckCall(xApiKey, xRequestId, username, password, id, internalIdentifier, taxpayerRfc, taxpayerName, result, checkedAtBefore, checkedAtStrictlyBefore, checkedAtAfter, checkedAtStrictlyAfter, createdAtBefore, createdAtStrictlyBefore, createdAtAfter, createdAtStrictlyAfter, orderCheckedAt, orderCreatedAt, page, itemsPerPage, progressListener, progressRequestListener);
        return call;
    }
    
    public ResponseTaxpayerTaxComplianceCheckCollection listTaxpayerTaxComplianceCheck(String xApiKey, String xRequestId, String username, String password, String id, String internalIdentifier, String taxpayerRfc, String taxpayerName, String result, String checkedAtBefore, String checkedAtStrictlyBefore, String checkedAtAfter, String checkedAtStrictlyAfter, String createdAtBefore, String createdAtStrictlyBefore, String createdAtAfter, String createdAtStrictlyAfter, String orderCheckedAt, String orderCreatedAt, Integer page, Integer itemsPerPage) throws ApiException {
        ApiResponse<ResponseTaxpayerTaxComplianceCheckCollection> resp = listTaxpayerTaxComplianceCheckWithHttpInfo(xApiKey, xRequestId, username, password, id, internalIdentifier, taxpayerRfc, taxpayerName, result, checkedAtBefore, checkedAtStrictlyBefore, checkedAtAfter, checkedAtStrictlyAfter, createdAtBefore, createdAtStrictlyBefore, createdAtAfter, createdAtStrictlyAfter, orderCheckedAt, orderCreatedAt, page, itemsPerPage);
        return resp.getData();
    }
    
    public ApiResponse<ResponseTaxpayerTaxComplianceCheckCollection> listTaxpayerTaxComplianceCheckWithHttpInfo(String xApiKey, String xRequestId, String username, String password, String id, String internalIdentifier, String taxpayerRfc, String taxpayerName, String result, String checkedAtBefore, String checkedAtStrictlyBefore, String checkedAtAfter, String checkedAtStrictlyAfter, String createdAtBefore, String createdAtStrictlyBefore, String createdAtAfter, String createdAtStrictlyAfter, String orderCheckedAt, String orderCreatedAt, Integer page, Integer itemsPerPage) throws ApiException {
        okhttp3.Call call = listTaxpayerTaxComplianceCheckValidateBeforeCall(xApiKey, xRequestId, username, password, id, internalIdentifier, taxpayerRfc, taxpayerName, result, checkedAtBefore, checkedAtStrictlyBefore, checkedAtAfter, checkedAtStrictlyAfter, createdAtBefore, createdAtStrictlyBefore, createdAtAfter, createdAtStrictlyAfter, orderCheckedAt, orderCreatedAt, page, itemsPerPage, null, null);
        Type localVarReturnType = new TypeToken<ResponseTaxpayerTaxComplianceCheckCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call listTaxpayerTaxComplianceCheckAsync(String xSignature, String xApiKey, String xRequestId, String username, String password, String id, String internalIdentifier, String taxpayerRfc, String taxpayerName, String result, String checkedAtBefore, String checkedAtStrictlyBefore, String checkedAtAfter, String checkedAtStrictlyAfter, String createdAtBefore, String createdAtStrictlyBefore, String createdAtAfter, String createdAtStrictlyAfter, String orderCheckedAt, String orderCreatedAt, Integer page, Integer itemsPerPage, final ApiCallback<ResponseTaxpayerTaxComplianceCheckCollection> callback) throws ApiException {
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
        okhttp3.Call call = listTaxpayerTaxComplianceCheckValidateBeforeCall(xApiKey, xRequestId, username, password, id, internalIdentifier, taxpayerRfc, taxpayerName, result, checkedAtBefore, checkedAtStrictlyBefore, checkedAtAfter, checkedAtStrictlyAfter, createdAtBefore, createdAtStrictlyBefore, createdAtAfter, createdAtStrictlyAfter, orderCheckedAt, orderCreatedAt, page, itemsPerPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseTaxpayerTaxComplianceCheckCollection>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
