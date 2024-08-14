package com.mavene.ms_banking_service.controller;

import com.mavene.ms_banking_service.dto.AccountDto;
import com.mavene.ms_banking_service.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/account")
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;

    //Build create or save a new account REST API
    @PostMapping("/createAccount")
    public ResponseEntity<Map<String, Object>> createAccount(@RequestBody AccountDto accountDto) {
        AccountDto createdAccount = accountService.createAccount(accountDto);
        System.out.println("Creating and saving account....");

        // Creating the headers object
        Map<String, Object> headers = new HashMap<>();
        headers.put("responseMessage", "Operation Successful");
        headers.put("responseCode", "200");

        // Creating the body object
        Map<String, Object> body = new HashMap<>();
        body.put("message", "Account created successfully");
        body.put("account", createdAccount);

        // Creating the final response object with separated headers and body
        Map<String, Object> response = new HashMap<>();
        response.put("headers", headers);
        response.put("body", body);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    //Build get account by id REST API
    @GetMapping("/getAccountById/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id) {
        AccountDto accountDto = accountService.getAccountById(id);
        System.out.println("Get account by Id.....");
        return ResponseEntity.ok(accountDto);
    }

    //Build get all accounts REST API
    @GetMapping("/getAllAccounts")
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        List<AccountDto> accountDtos = accountService.getAllAccounts();
        System.out.println("Getting all accounts.....");
        return ResponseEntity.ok(accountDtos);
    }

    //Build update account by id REST API
    @PutMapping("/updateAccountById/{id}")
    public ResponseEntity<AccountDto> updateAccountById(@PathVariable Long id, @RequestBody AccountDto updatedAccountDto) {
        AccountDto accountDto = accountService.updateAccountById(id, updatedAccountDto);
        System.out.println("Updating account by Id.....");
        return ResponseEntity.ok(accountDto);
    }

    //Build delete account by id REST API
    @DeleteMapping("/deleteAccountById")
    public ResponseEntity<String> deleteAccountById(@RequestParam Long id) {
        accountService.deleteAccountById(id);
        System.out.println("Deleting account by Id.....");
        return ResponseEntity.ok("Account deleted successfully");
    }
}
