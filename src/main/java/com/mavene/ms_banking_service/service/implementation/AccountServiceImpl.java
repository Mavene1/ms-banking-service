package com.mavene.ms_banking_service.service.implementation;

import com.mavene.ms_banking_service.dto.AccountDto;
import com.mavene.ms_banking_service.repository.AccountRepository;
import com.mavene.ms_banking_service.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }
}
