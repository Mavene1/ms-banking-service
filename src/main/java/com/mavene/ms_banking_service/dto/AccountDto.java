package com.mavene.ms_banking_service.dto;

import lombok.Data;

@Data
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private Double balance;
}
