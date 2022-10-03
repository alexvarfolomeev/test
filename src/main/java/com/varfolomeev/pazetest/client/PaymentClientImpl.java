package com.varfolomeev.pazetest.client;

import com.varfolomeev.pazetest.config.RestTemplateConfig;
import com.varfolomeev.pazetest.model.Request;
import com.varfolomeev.pazetest.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

import java.math.BigDecimal;

@Component
public class PaymentClientImpl implements PaymentClient {

    @Autowired
    RestTemplateConfig restTemplateConfig;

    private static final String BASE_URL = "https://app-demo.paze.eu/api/v1/";

    @Override
    public Response createPayment(BigDecimal amount, String token, Request request) {
        var template = restTemplateConfig.getRestTemplate();
        var httpEntity = createHttpEntity(token, request);
        try {
            ResponseEntity<Response> response = template.exchange(BASE_URL + "payments",
                    HttpMethod.POST, httpEntity, Response.class);
            return response.getBody();
        } catch (HttpClientErrorException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private HttpEntity<?> createHttpEntity(String token, Request request) {
        var httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + token);
        httpHeaders.set("Content type", "application/json");
        return new HttpEntity<>(request, httpHeaders);
    }
}
