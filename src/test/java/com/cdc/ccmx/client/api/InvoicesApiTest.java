package com.cdc.ccmx.client.api;

import java.util.UUID;
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
import com.cdc.ccmx.client.model.ResponseTaxPayerInvoice;

import okhttp3.OkHttpClient;

public class InvoicesApiTest {
    private final InvoicesApi api = new InvoicesApi();
    
    private Logger logger = LoggerFactory.getLogger(InvoicesApiTest.class.getName());

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
    public void listTaxpayerInvoiceTest() throws Exception {
        String xApiKey = "";
        String xRequestId = "";
        String username = "";
        String password = "";
        String id = "";
        UUID uuid = null;
        Double version = null;
        String type = null;
        String usage = null;
        String paymentType = null;
        String paymentMethod = null;
        String issuerRfc = null;
        String issuerName = null;
        Double issuerTaxRegime = null;
        String issuerBlacklistStatus = null;
        Boolean isIssuer = null;
        String receiverRfc = null;
        String receiverName = null;
        String receiverBlacklistStatus = null;
        Boolean isReceiver = null;
        String currency = null;
        String status = null;
        String pac = null;
        String cancellationStatus = null;
        String cancellationStatusProcess = null;
        OffsetDateTime issuedAtBefore = null;
        OffsetDateTime issuedAtStrictlyBefore = null;
        OffsetDateTime issuedAtAfter = null;
        OffsetDateTime issuedAtStrictlyAfter = null;
        OffsetDateTime canceledAtBefore = null;
        OffsetDateTime canceledAtStrictlyBefore = null;
        OffsetDateTime canceledAtAfter = null;
        OffsetDateTime canceledAtStrictlyAfter = null;
        String createdAtBefore = null;
        String createdAtStrictlyBefore = null;
        String createdAtAfter = null;
        String createdAtStrictlyAfter = null;
        String updatedAtBefore = null;
        String updatedAtStrictlyBefore = null;
        String updatedAtAfter = null;
        String updatedAtStrictlyAfter = null;
        OffsetDateTime certifiedAtBefore = null;
        OffsetDateTime certifiedAtStrictlyBefore = null;
        OffsetDateTime certifiedAtAfter = null;
        OffsetDateTime certifiedAtStrictlyAfter = null;
        OffsetDateTime lastPaymentDateBefore = null;
        OffsetDateTime lastPaymentDateStrictlyBefore = null;
        OffsetDateTime lastPaymentDateAfter = null;
        OffsetDateTime lastPaymentDateStrictlyAfter = null;
        OffsetDateTime fullyPaidAtBefore = null;
        OffsetDateTime fullyPaidAtStrictlyBefore = null;
        OffsetDateTime fullyPaidAtAfter = null;
        OffsetDateTime fullyPaidAtStrictlyAfter = null;
        String taxBetween = null;
        Double taxGt = null;
        Double taxGte = null;
        Double taxLt = null;
        Double taxLte = null;
        String discountBetween = null;
        Double discountGt = null;
        Double discountGte = null;
        Double discountLt = null;
        Double discountLte = null;
        String subtotalBetween = null;
        Double subtotalGt = null;
        Double subtotalGte = null;
        Double subtotalLt = null;
        Double subtotalLte = null;
        String totalBetween = null;
        Double totalGt = null;
        Double totalGte = null;
        Double totalLt = null;
        Double totalLte = null;
        String paidAmountBetween = null;
        Double paidAmountGt = null;
        Double paidAmountGte = null;
        Double paidAmountLt = null;
        Double paidAmountLte = null;
        String dueAmountBetween = null;
        Double dueAmountGt = null;
        Double dueAmountGte = null;
        Double dueAmountLt = null;
        Double dueAmountLte = null;
        Boolean hasXml = null;
        Boolean hasPdf = null;
        String orderIssuedAt = null;
        String orderCanceledAt = null;
        String orderCertifiedAt = null;
        String orderAmount = null;
        Integer page = null;
        Integer itemsPerPage = null;
        
        try {
        	ResponseTaxPayerInvoice response = api.listTaxpayerInvoice(xApiKey, xRequestId, username, password, id, uuid, version, type, usage, paymentType, paymentMethod, issuerRfc, issuerName, issuerTaxRegime, issuerBlacklistStatus, isIssuer, receiverRfc, receiverName, receiverBlacklistStatus, isReceiver, currency, status, pac, cancellationStatus, cancellationStatusProcess, issuedAtBefore, issuedAtStrictlyBefore, issuedAtAfter, issuedAtStrictlyAfter, canceledAtBefore, canceledAtStrictlyBefore, canceledAtAfter, canceledAtStrictlyAfter, createdAtBefore, createdAtStrictlyBefore, createdAtAfter, createdAtStrictlyAfter, updatedAtBefore, updatedAtStrictlyBefore, updatedAtAfter, updatedAtStrictlyAfter, certifiedAtBefore, certifiedAtStrictlyBefore, certifiedAtAfter, certifiedAtStrictlyAfter, lastPaymentDateBefore, lastPaymentDateStrictlyBefore, lastPaymentDateAfter, lastPaymentDateStrictlyAfter, fullyPaidAtBefore, fullyPaidAtStrictlyBefore, fullyPaidAtAfter, fullyPaidAtStrictlyAfter, taxBetween, taxGt, taxGte, taxLt, taxLte, discountBetween, discountGt, discountGte, discountLt, discountLte, subtotalBetween, subtotalGt, subtotalGte, subtotalLt, subtotalLte, totalBetween, totalGt, totalGte, totalLt, totalLte, paidAmountBetween, paidAmountGt, paidAmountGte, paidAmountLt, paidAmountLte, dueAmountBetween, dueAmountGt, dueAmountGte, dueAmountLt, dueAmountLte, hasXml, hasPdf, orderIssuedAt, orderCanceledAt, orderCertifiedAt, orderAmount, page, itemsPerPage);

			Assert.assertTrue(response != null);
			if (response != null) {
				logger.info(response.toString());
			}
		} catch (ApiException e) {
			logger.info(e.getResponseBody());
		}        
    }
    
}
