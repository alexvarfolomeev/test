package com.varfolomeev.pazetest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result {

    private String id;

    private String referenceId;

    private PaymentType paymentType;

    private String state;

    private String description;

    private String parentPaymentId;

    private String paymentMethod;

    private PaymentMethodDetails paymentMethodDetails;

    private BigDecimal amount;

    private String currency;

    private BigDecimal customerAmount;

    private String customerCurrency;

    private String redirectUrl;

    private String errorCode;

    private String externalResultCode;

    private Customer customer;

    private BillingAddress billingAddress;

    private Boolean startRecurring;

    private String recurringToken;

    private String terminalName;

}
