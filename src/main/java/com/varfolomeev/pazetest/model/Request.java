package com.varfolomeev.pazetest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    private PaymentType paymentType;

    private BigDecimal amount;

    private String currency;
}
