package com.example.petshop.account.service;

import com.example.petshop.account.dto.AccountStatus;
import org.springframework.stereotype.Service;

@Service
public class DummyAccountServiceImpl implements AccountService{

    /*
    Just a simple service without database returning a status blocked when the id is odd.
     */
    @Override
    public AccountStatus getStatusById(Long id) {

        if(id.intValue() % 2 == 0){
            return new AccountStatus("regular");
        }

        return new AccountStatus("blocked");
    }
}
