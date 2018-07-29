package com.akinmail.blockchain.immunostandussd;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UssdController {

    @RequestMapping(value="/ussd", method=RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String message(UssdRequest ussdRequest) {
        if(ussdRequest.getText().equals("")){
            return "CON Hello \n"+"1. Register Child \n"+ "2. Immunize Child \n";
        }
        return "CON Hello";
    }
}
