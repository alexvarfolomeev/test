package com.varfolomeev.pazetest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Customer {

    private String referenceId;

    private String citizenshipCountryCode;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    private String email;

    private String phone;

    private String locale;

    private String accountNumber;

    private String accountName;

    private String bank;

    private String bankBranch;

    private String routingGroup;

    private String kycStatus;

    private Boolean paymentInstrumentKycStatus;

    private String dateOfFirstDeposit;

    private Integer depositsAmount;

    private Integer withdrawalsAmount;

    private Integer depositsCnt;

    private Integer withdrawalsCnt;
}
