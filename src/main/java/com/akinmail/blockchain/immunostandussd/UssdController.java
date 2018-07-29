package com.akinmail.blockchain.immunostandussd;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ussd")
public class UssdController {

    @RequestMapping(value="", method=RequestMethod.POST, headers = {"content-type=application/x-www-form-urlencoded;charset=UTF-8"})
    public String message(@RequestBody UssdRequest ussdRequest) {
        if(ussdRequest.getText().equals("")){
            return "CON Hello \n"+"1. Register Child \n"+ "2. Immunize Child \n";
        }
        return "CON Hello";
    }
}
