package com.mavene.ms_banking_service.service.implementation;

import com.mavene.ms_banking_service.dto.AccountDto;
import com.mavene.ms_banking_service.entity.Account;
import com.mavene.ms_banking_service.mapper.AccountMapper;
import com.mavene.ms_banking_service.repository.AccountRepository;
import com.mavene.ms_banking_service.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    //Build create or save a new account
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.toAccountEntity(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.toAccountDto(savedAccount);
    }
}
