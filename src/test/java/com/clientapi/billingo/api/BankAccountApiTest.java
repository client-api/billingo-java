/*
 * Billingo API v3
 * This is a Billingo API v3 documentation. Our API based on REST software architectural style. API has resource-oriented URLs, accepts JSON-encoded request bodies and returns JSON-encoded responses. To use this API you have to generate a new API key on our [site](https://app.billingo.hu/api-key). After that, you can test your API key on this page.
 *
 * The version of the OpenAPI document: 3.0.14
 * Contact: hello@billingo.hu
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.clientapi.billingo.api;

import com.clientapi.billingo.invoker.ApiException;
import com.clientapi.billingo.model.BankAccount;
import com.clientapi.billingo.model.BankAccountList;
import com.clientapi.billingo.model.ClientErrorResponse;
import com.clientapi.billingo.model.ServerErrorResponse;
import com.clientapi.billingo.model.SubscriptionErrorResponse;
import com.clientapi.billingo.model.TooManyRequestsResponse;
import com.clientapi.billingo.model.ValidationErrorResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BankAccountApi
 */
@Disabled
public class BankAccountApiTest {

    private final BankAccountApi api = new BankAccountApi();

    /**
     * Create a bank account
     *
     * Create a new bank account. Returns a bank account object if the create is succeded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBankAccountTest() throws ApiException {
        BankAccount bankAccount = null;
        BankAccount response = api.createBankAccount(bankAccount);
        // TODO: test validations
    }

    /**
     * Delete a bank account
     *
     * Delete an existing bank account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteBankAccountTest() throws ApiException {
        Integer id = null;
        api.deleteBankAccount(id);
        // TODO: test validations
    }

    /**
     * Retrieve a bank account
     *
     * Retrieves the details of an existing bank account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBankAccountTest() throws ApiException {
        Integer id = null;
        BankAccount response = api.getBankAccount(id);
        // TODO: test validations
    }

    /**
     * List all bank account
     *
     * Returns a list of your bank accounts. The bank accounts are returned sorted by creation date, with the most recent bank account appearing first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBankAccountTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        BankAccountList response = api.listBankAccount(page, perPage);
        // TODO: test validations
    }

    /**
     * Update a bank account
     *
     * Update an existing bank accounts. Returns a bank account object if the update is succeded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBankAccountTest() throws ApiException {
        Integer id = null;
        BankAccount bankAccount = null;
        BankAccount response = api.updateBankAccount(id, bankAccount);
        // TODO: test validations
    }

}
