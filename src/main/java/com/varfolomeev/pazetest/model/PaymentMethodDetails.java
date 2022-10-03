package com.varfolomeev.pazetest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMethodDetails {

    private String customerAccountNumber;

    private String cardholderName;

    private String cardExpiryMonth;

    private String cardExpiryYear;


}
