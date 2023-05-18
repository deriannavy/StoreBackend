package com.blix.store.services;

import lombok.AllArgsConstructor;

import com.blix.store.repositories.AccountRepository;
import com.blix.store.models.Account;

import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AccountService {

   private final AccountRepository accountRepository;

   public List<Account> getAllAccounts(){
      return accountRepository.findAll();
   }

}