package com.ioliveira.controllers;

import com.ioliveira.domain.currency.Currency;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/currency")
public class CurrencyController {

    @Value("${currency.DOL.url}")
    private String url;

    @GetMapping()
    public ResponseEntity<Currency> getCurrency() {
        RestTemplate restTemplate = new RestTemplate();
        Currency currency = restTemplate.getForObject(url, Currency.class);
        return ResponseEntity.ok().body(currency);
    }

}
