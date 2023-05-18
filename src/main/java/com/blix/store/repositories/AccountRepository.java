package com.blix.store.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blix.store.models.Account;

import java.util.Optional;


public interface AccountRepository extends MongoRepository<Account, String> {

   Optional<Account> findAccountByEmail(String email); 

}