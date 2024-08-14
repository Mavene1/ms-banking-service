package com.mavene.ms_banking_service.mapper;

import com.mavene.ms_banking_service.dto.AccountDto;
import com.mavene.ms_banking_service.entity.Account;

import java.util.List;
import java.util.stream.Collectors;

public class AccountMapper {
    //Build function to map account entity to accountDto;
    public static AccountDto toAccountDto(Account account) {
        return new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
    }

    //Build function to map accountDto to account entity
    public static Account toAccountEntity(AccountDto accountDto) {
        return new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
    }

    public static List<AccountDto> toAccountDtoList(List<Account> accounts) {
        return accounts.stream().map(AccountMapper::toAccountDto).collect(Collectors.toList());
    }
}

