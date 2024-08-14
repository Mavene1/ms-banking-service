package com.mavene.ms_banking_service.service.implementation;

import com.mavene.ms_banking_service.dto.AccountDto;
import com.mavene.ms_banking_service.entity.Account;
import com.mavene.ms_banking_service.exception.ResourceNotFoundException;
import com.mavene.ms_banking_service.mapper.AccountMapper;
import com.mavene.ms_banking_service.repository.AccountRepository;
import com.mavene.ms_banking_service.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return AccountMapper.toAccountDtoList(accounts);
    }

    //Build get account by id
    @Override
    public AccountDto getAccountById(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Account not found with id: " + id));;
        return AccountMapper.toAccountDto(account);
    }

    @Override
    public AccountDto updateAccountById(Long id, AccountDto updatedAccountDto) {
        return null;
    }

    @Override
    public void deleteAccountById(Long id) {

    }
}
