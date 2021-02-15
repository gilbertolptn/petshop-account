package com.example.petshop.account.controller;

import com.example.petshop.account.dto.AccountStatus;
import com.example.petshop.account.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/account")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}/status")
    @ResponseStatus(HttpStatus.OK)
    public AccountStatus getAccountStatus(@PathVariable Long id){
        return accountService.getStatusById(id);
    }
}
