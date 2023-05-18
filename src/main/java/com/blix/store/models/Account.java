package com.blix.store.models;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;


@Data
@Document
public class Account {

   @Id
   private String id;
   private String firstName;
   private String lastName;
   @Indexed(unique = true)
   private String email;
   private LocalDateTime created;


   public Account(String firstName, String lastName, String email, LocalDateTime created){
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.created = created;
   }
} 