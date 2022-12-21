package com.cdc.ccmx.client.api;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;
import com.cdc.ccmx.client.ApiClient;
import com.cdc.ccmx.client.ApiException;
import com.cdc.ccmx.client.model.ResponseTaxpayerTaxComplianceCheckCollection;

import okhttp3.OkHttpClient;

public class TaxComplianceChecksApiTest {
    private final TaxComplianceChecksApi api = new TaxComplianceChecksApi();

    private Logger logger = LoggerFactory.getLogger(TaxComplianceChecksApiTest.class.getName());

    private ApiClient apiClient;
    
    private String url		= "";
   
    private String keystoreFile		= "";
    private String cdcCertFile		= "";
    private String keystorePassword = "";
    private String keyAlias			= "";
    private String keyPassword		= "";
    
    @Before()
    public void Setup() {
       this.apiClient = api.getApiClient();
         this.apiClient.setBasePath(url);
         OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor(
		            keystoreFile, 
		            cdcCertFile, 
		            keystorePassword, 
		            keyAlias, 
		            keyPassword))
                .build();
         apiClient.setHttpClient(okHttpClient);
    }
    
    
    @Test
    public void listTaxpayerTaxComplianceCheckTest() throws Exception {
    	String xApiKey = "";
        String xRequestId = "";
        String username = "";
        String password = "";
        String id = "";
        String internalIdentifier = null;
        String taxpayerRfc = null;
        String taxpayerName = null;
        String result = null;
        String checkedAtBefore = null;
        String checkedAtStrictlyBefore = null;
        String checkedAtAfter = null;
        String checkedAtStrictlyAfter = null;
        String createdAtBefore = null;
        String createdAtStrictlyBefore = null;
        String createdAtAfter = null;
        String createdAtStrictlyAfter = null;
        String orderCheckedAt = null;
        String orderCreatedAt = null;
        Integer page = null;
        Integer itemsPerPage = null;
        
        try {
        	ResponseTaxpayerTaxComplianceCheckCollection response = api.listTaxpayerTaxComplianceCheck(xApiKey, xRequestId, username, password, id, internalIdentifier, taxpayerRfc, taxpayerName, result, checkedAtBefore, checkedAtStrictlyBefore, checkedAtAfter, checkedAtStrictlyAfter, createdAtBefore, createdAtStrictlyBefore, createdAtAfter, createdAtStrictlyAfter, orderCheckedAt, orderCreatedAt, page, itemsPerPage);

			Assert.assertTrue(response != null);
			if (response != null) {
				logger.info(response.toString());
			}
		} catch (ApiException e) {
			logger.info(e.getResponseBody());
		} 
    }
    
}
