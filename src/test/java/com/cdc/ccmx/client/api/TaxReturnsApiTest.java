package com.cdc.ccmx.client.api;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.OffsetDateTime;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;
import com.cdc.ccmx.client.ApiClient;
import com.cdc.ccmx.client.ApiException;
import com.cdc.ccmx.client.model.TaxpayerTaxReturnCollection;

import okhttp3.OkHttpClient;

public class TaxReturnsApiTest {
    private final TaxReturnsApi api = new TaxReturnsApi();
    
    private Logger logger = LoggerFactory.getLogger(TaxReturnsApiTest.class.getName());

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
    public void listTaxpayerTaxReturnTest() throws Exception {
    	String xApiKey = "";
        String xRequestId = "";
        String username = "";
        String password = "";
        String id = "";
        Double operationNumber = null;
        String type = null;
        String intervalUnit = null;
        String complementary = null;
        String captureLine = null;
        String period = null;
        OffsetDateTime presentedAtBefore = null;
        OffsetDateTime presentedAtStrictlyBefore = null;
        OffsetDateTime presentedAtAfter = null;
        OffsetDateTime presentedAtStrictlyAfter = null;
        String fiscalYear = null;
        String orderPeriod = null;
        String orderPresentedAt = null;
        Integer page = null;
        Integer itemsPerPage = null;
        
        try {
        	TaxpayerTaxReturnCollection response = api.listTaxpayerTaxReturn(xApiKey, xRequestId, username, password, id, operationNumber, type, intervalUnit, complementary, captureLine, period, presentedAtBefore, presentedAtStrictlyBefore, presentedAtAfter, presentedAtStrictlyAfter, fiscalYear, orderPeriod, orderPresentedAt, page, itemsPerPage);

			Assert.assertTrue(response != null);
			if (response != null) {
				logger.info(response.toString());
			}
		} catch (ApiException e) {
			logger.info(e.getResponseBody());
		}       
    }
    
}
