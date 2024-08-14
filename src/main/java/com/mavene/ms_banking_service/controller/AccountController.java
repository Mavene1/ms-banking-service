package com.mavene.ms_banking_service.controller;

import com.mavene.ms_banking_service.dto.AccountDto;
import com.mavene.ms_banking_service.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/account")
@AllArgsConstructor
public class AccountController {

    private AccountService accountService;

    //Build create or save a new account REST API
    @PostMapping("/createAccount")
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto) {
        AccountDto createdAccount = accountService.createAccount(accountDto);
        System.out.println("Creating and saving employee.....");
        return new ResponseEntity<>(createdAccount, null, 201);
    }
}
