package com.axa.ficovie.model;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import com.axa.ficovie.model.*;
import com.axa.ficovie.service.*;

@RestController
public class HelloController {

  private CustomerService service;

  public HelloController(CustomerService service){
    this.service = service;
  }

  @GetMapping ("/api/customer/{id}")
  public Customer getCustomer(@PathVariable long id)
  {
    System.out.println(id);

    return service.getCustomerById(id);
  }
}
