package com.varfolomeev.pazetest.client;

import com.varfolomeev.pazetest.model.Request;
import com.varfolomeev.pazetest.model.Response;

import java.math.BigDecimal;

public interface PaymentClient {
    Response createPayment(BigDecimal amount, String token, Request request);
}
