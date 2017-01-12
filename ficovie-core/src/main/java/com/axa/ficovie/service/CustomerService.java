package com.axa.ficovie.service;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import com.axa.ficovie.model.*;

@Service
public class CustomerService{

  public Customer getCustomerById(long id){
    Customer customer = new Customer();
    customer.setId(id);
    customer.setName("bob");
    return customer;
  }
}
