package com.akinmail.blockchain.immunostandussd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ussd")
public class UssdController {

    @GetMapping()
    public String getAll() {
        return "Hello";
    }
}
