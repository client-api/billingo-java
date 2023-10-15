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
import com.clientapi.billingo.model.ClientErrorResponse;
import com.clientapi.billingo.model.Product;
import com.clientapi.billingo.model.ProductList;
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
 * API tests for ProductApi
 */
@Disabled
public class ProductApiTest {

    private final ProductApi api = new ProductApi();

    /**
     * Create a product
     *
     * Create a new product. Returns a product object if the create is succeded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProductTest() throws ApiException {
        Product product = null;
        Product response = api.createProduct(product);
        // TODO: test validations
    }

    /**
     * Delete a product
     *
     * Delete an existing product.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProductTest() throws ApiException {
        Integer id = null;
        api.deleteProduct(id);
        // TODO: test validations
    }

    /**
     * Retrieve a product
     *
     * Retrieves the details of an existing product.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductTest() throws ApiException {
        Integer id = null;
        Product response = api.getProduct(id);
        // TODO: test validations
    }

    /**
     * List all product
     *
     * Returns a list of your products. The partners are returned sorted by creation date, with the most recent partners appearing first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProductTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        String query = null;
        ProductList response = api.listProduct(page, perPage, query);
        // TODO: test validations
    }

    /**
     * Update a product
     *
     * Update an existing product. Returns a product object if the update is succeded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProductTest() throws ApiException {
        Integer id = null;
        Product product = null;
        Product response = api.updateProduct(id, product);
        // TODO: test validations
    }

}
