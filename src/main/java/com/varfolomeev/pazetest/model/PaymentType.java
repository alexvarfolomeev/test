package com.varfolomeev.pazetest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PaymentType {
    DEPOSIT("DEPOSIT"), WITHDRAWAL("WITHDRAWAL"), REFUND("REFUND");
    String name;
}
