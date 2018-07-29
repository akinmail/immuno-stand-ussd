package com.akinmail.blockchain.immunostandussd;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ussd")
public class UssdController {

    @RequestMapping(value="", method=RequestMethod.POST)
    public String message(@RequestBody UssdRequest ussdRequest) {
        return "Hello";
    }
}
