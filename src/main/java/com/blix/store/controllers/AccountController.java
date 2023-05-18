package com.blix.store.controllers;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.blix.store.models.Account;
import com.blix.store.services.AccountService;

import java.util.List;


@RestController
@RequestMapping("api/v1/account")
@AllArgsConstructor
public class AccountController {

   private final AccountService accountService;

   @GetMapping
   public List<Account> fetchAllAccounts(){
      return accountService.getAllAccounts();
   }
}