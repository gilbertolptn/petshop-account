package com.example.petshop.account.service;

import com.example.petshop.account.dto.AccountStatus;

public interface AccountService {
    AccountStatus getStatusById(Long id);
}
