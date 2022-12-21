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
import com.cdc.ccmx.client.model.ResponseTaxpayerTaxStatusCollection;
import com.google.gson.reflect.TypeToken;

public class TaxStatusApi {
    private ApiClient apiClient;
    public TaxStatusApi() {
        this(Configuration.getDefaultApiClient());
    }
    public TaxStatusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call listTaxpayerTaxStatusCall(String xApiKey, String xRequestId, String username, String password, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/taxpayers/{id}/tax-status"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private okhttp3.Call listTaxpayerTaxStatusValidateBeforeCall(String xApiKey, String xRequestId, String username, String password, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling listTaxpayerTaxStatus(Async)");
        }
        if (xRequestId == null) {
            throw new ApiException("Missing the required parameter 'xRequestId' when calling listTaxpayerTaxStatus(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling listTaxpayerTaxStatus(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling listTaxpayerTaxStatus(Async)");
        }
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling listTaxpayerTaxStatus(Async)");
        }
        
        okhttp3.Call call = listTaxpayerTaxStatusCall(xApiKey, xRequestId, username, password, id, progressListener, progressRequestListener);
        return call;
    }
    
    public ResponseTaxpayerTaxStatusCollection listTaxpayerTaxStatus(String xApiKey, String xRequestId, String username, String password, String id) throws ApiException {
        ApiResponse<ResponseTaxpayerTaxStatusCollection> resp = listTaxpayerTaxStatusWithHttpInfo(xApiKey, xRequestId, username, password, id);
        return resp.getData();
    }
    
    public ApiResponse<ResponseTaxpayerTaxStatusCollection> listTaxpayerTaxStatusWithHttpInfo(String xApiKey, String xRequestId, String username, String password, String id) throws ApiException {
        okhttp3.Call call = listTaxpayerTaxStatusValidateBeforeCall(xApiKey, xRequestId, username, password, id, null, null);
        Type localVarReturnType = new TypeToken<ResponseTaxpayerTaxStatusCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call listTaxpayerTaxStatusAsync(String xSignature, String xApiKey, String xRequestId, String username, String password, String id, final ApiCallback<ResponseTaxpayerTaxStatusCollection> callback) throws ApiException {
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
        okhttp3.Call call = listTaxpayerTaxStatusValidateBeforeCall(xApiKey, xRequestId, username, password, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseTaxpayerTaxStatusCollection>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
