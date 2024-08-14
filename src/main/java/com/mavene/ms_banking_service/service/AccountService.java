package com.mavene.ms_banking_service.service;

import com.mavene.ms_banking_service.dto.AccountDto;

public interface AccountService {
    //create or save a new account
    AccountDto createAccount(AccountDto accountDto);
}
