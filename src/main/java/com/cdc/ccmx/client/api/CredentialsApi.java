package com.cdc.ccmx.client.api;

import com.cdc.ccmx.client.ApiCallback;
import com.cdc.ccmx.client.ApiClient;
import com.cdc.ccmx.client.ApiException;
import com.cdc.ccmx.client.ApiResponse;
import com.cdc.ccmx.client.Configuration;
import com.cdc.ccmx.client.Pair;
import com.cdc.ccmx.client.ProgressRequestBody;
import com.cdc.ccmx.client.ProgressResponseBody;
import com.cdc.ccmx.client.model.CredentialCiecInput;
import com.cdc.ccmx.client.model.Errors;
import com.cdc.ccmx.client.model.ResponseCredential;
import com.cdc.ccmx.client.model.ResponseCredential400;
import com.cdc.ccmx.client.model.ResponseNotFound;
import com.cdc.ccmx.client.model.ResponseUnauthorized;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CredentialsApi {
    private ApiClient apiClient;
    public CredentialsApi() {
        this(Configuration.getDefaultApiClient());
    }
    public CredentialsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call createCredentialCall(String xApiKey, String username, String password, String subscriptionId, String contentType, CredentialCiecInput body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "/login";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        if (subscriptionId != null)
        localVarHeaderParams.put("subscriptionId", apiClient.parameterToString(subscriptionId));
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call createCredentialValidateBeforeCall(String xApiKey, String username, String password, String subscriptionId, String contentType, CredentialCiecInput body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling createCredential(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling createCredential(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling createCredential(Async)");
        }
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling createCredential(Async)");
        }
        
        okhttp3.Call call = createCredentialCall(xApiKey, username, password, subscriptionId, contentType, body, progressListener, progressRequestListener);
        return call;
    }
    
    public ResponseCredential createCredential(String xApiKey, String username, String password, String subscriptionId, String contentType, CredentialCiecInput body) throws ApiException {
        ApiResponse<ResponseCredential> resp = createCredentialWithHttpInfo(xApiKey, username, password, subscriptionId, contentType, body);
        return resp.getData();
    }
    
    public ApiResponse<ResponseCredential> createCredentialWithHttpInfo(String xApiKey, String username, String password, String subscriptionId, String contentType, CredentialCiecInput body) throws ApiException {
        okhttp3.Call call = createCredentialValidateBeforeCall(xApiKey, username, password, subscriptionId, contentType, body, null, null);
        Type localVarReturnType = new TypeToken<ResponseCredential>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call createCredentialAsync(String xSignature, String xApiKey, String username, String password, String subscriptionId, String contentType, CredentialCiecInput body, final ApiCallback<ResponseCredential> callback) throws ApiException {
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
        okhttp3.Call call = createCredentialValidateBeforeCall(xApiKey, username, password, subscriptionId, contentType, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseCredential>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call getCredentialCall(UUID id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/login/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/ld+json", "application/json"
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
    private okhttp3.Call getCredentialValidateBeforeCall(UUID id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getCredential(Async)");
        }
        
        okhttp3.Call call = getCredentialCall(id, progressListener, progressRequestListener);
        return call;
    }
    
    public ResponseCredential getCredential(UUID id) throws ApiException {
        ApiResponse<ResponseCredential> resp = getCredentialWithHttpInfo(id);
        return resp.getData();
    }
    
    public ApiResponse<ResponseCredential> getCredentialWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call call = getCredentialValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<ResponseCredential>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getCredentialAsync(UUID id, final ApiCallback<ResponseCredential> callback) throws ApiException {
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
        okhttp3.Call call = getCredentialValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseCredential>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
