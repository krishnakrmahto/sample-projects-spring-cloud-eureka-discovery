package com.sampleprojects.ecommerce.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

  @GetMapping("/test-path")
  public String testPath() {
    return "Test path executed";
  }

}
