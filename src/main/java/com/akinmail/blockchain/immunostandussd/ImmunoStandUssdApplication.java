package com.akinmail.blockchain.immunostandussd;

import com.africastalking.AfricasTalking;
import com.africastalking.UssdService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImmunoStandUssdApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ImmunoStandUssdApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Initialize
        String username = "sandbox";    // use 'sandbox' for development in the test environment
        String apiKey = "58fe5d51fe0f785fa8b6eb0b989507d89584c9e3acf15dbaea92b36c11f69e18";       // use your sandbox app API key for development in the test environment
        AfricasTalking.initialize(username, apiKey);
        UssdService ussdService = AfricasTalking.getService(AfricasTalking.SERVICE_USSD);


    }
}
