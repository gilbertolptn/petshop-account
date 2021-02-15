package com.example.petshop.account;

import com.example.petshop.account.controller.AccountController;
import com.example.petshop.account.service.DummyAccountServiceImpl;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@Import({AccountController.class, DummyAccountServiceImpl.class})
public class BaseContractTest {

    @Autowired
    AccountController accountController;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(accountController);
    }
}