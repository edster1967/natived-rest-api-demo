package com.example.nativedrestapidemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiController {

    private final Logger logger = LoggerFactory.getLogger(RestApiController.class);


    @GetMapping
    public String getCustomer(){
        logger.info("Starting getCustomer method");
        return "get customer was called";
    }

    @PostMapping
    public String createCustomer(){
        logger.info("Starting createCustomer method");
        return "create customer was called";
    }

    @PutMapping
    public String updateCustomer(){
        logger.info("Starting updateCustomer method");
        return "update customer was called";
    }

    @DeleteMapping
    public String deleteCustomer(){
        logger.info("Starting deleteCustomer method");
        return "delete customer was called";
    }


}
