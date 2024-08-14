package com.mavene.ms_banking_service.service;

import com.mavene.ms_banking_service.dto.AccountDto;

import java.util.List;

public interface AccountService {
    //Build create or save a new account
    AccountDto createAccount(AccountDto accountDto);

    //Build get all accounts
    List<AccountDto> getAllAccounts();

    //Build get account by id
    AccountDto getAccountById(Long id);

    //Build update account by id
    AccountDto updateAccountById(Long id, AccountDto updatedAccountDto);

    //Build deposit account by id
    AccountDto depositAccountById(Long id, Double depositedAmount);

    //Build withdraw account by id
    AccountDto withdrawAccountById(Long id, Double withdrawnAmount);

    //Build delete account by id
    void deleteAccountById(Long id);
}
