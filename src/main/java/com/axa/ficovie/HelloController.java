package com.axa.ficovie;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

  @GetMapping ("/api/customer/{id}")
  public Customer getCustomer(@PathVariable int id)
  {
    System.out.println(id);
    Customer customer = new Customer();
    customer.setId(id);
    customer.setName("bob");
    return customer;
  }
}
