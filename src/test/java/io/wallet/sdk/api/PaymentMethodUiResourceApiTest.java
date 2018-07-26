/*
 * Wallet
 * User application
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.wallet.sdk.api;

import io.wallet.sdk.api.ApiException;
import io.wallet.sdk.model.PaymentMethodListResponse;
import io.wallet.sdk.model.PaymentMethodRequest;
import io.wallet.sdk.model.PaymentMethodResponse;
import io.wallet.sdk.model.RestResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentMethodUiResourceApi
 */
//@Ignore
public class PaymentMethodUiResourceApiTest {

    private final PaymentMethodUiResourceApi api = new PaymentMethodUiResourceApi( "", "");

    
    /**
     * create
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsingPOSTTest() throws ApiException {
    
    	try{
    	
	        PaymentMethodRequest request = null;
	        RestResponse response = api.createUsingPOST(request);
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
    /**
     * create
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsingPOST1Test() throws ApiException {
    
    	try{
    	
	        String userId = null;
	        PaymentMethodRequest request = null;
	        PaymentMethodResponse response = api.createUsingPOST1(userId, request);
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
    /**
     * delete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUsingPOSTTest() throws ApiException {
    
    	try{
    	
	        String methodId = null;
	        RestResponse response = api.deleteUsingPOST(methodId);
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
    /**
     * delete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUsingPOST1Test() throws ApiException {
    
    	try{
    	
	        String userId = null;
	        String methodId = null;
	        RestResponse response = api.deleteUsingPOST1(userId, methodId);
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
    /**
     * get
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsingGETTest() throws ApiException {
    
    	try{
    	
	        String methodId = null;
	        PaymentMethodResponse response = api.getUsingGET(methodId);
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
    /**
     * get
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsingGET1Test() throws ApiException {
    
    	try{
    	
	        String userId = null;
	        String methodId = null;
	        PaymentMethodResponse response = api.getUsingGET1(userId, methodId);
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUsingGETTest() throws ApiException {
    
    	try{
    	
	        Integer limit = null;
	        Integer offset = null;
	        String q = null;
	        PaymentMethodListResponse response = api.listUsingGET(limit, offset, q);
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUsingGET1Test() throws ApiException {
    
    	try{
    	
	        String userId = null;
	        String q = null;
	        PaymentMethodListResponse response = api.listUsingGET1(userId, q);
	   }
	   catch(Exception e){
	   }

        // TODO: test validations
    }
    
}