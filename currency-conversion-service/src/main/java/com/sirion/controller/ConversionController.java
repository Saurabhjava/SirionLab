package com.sirion.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.sirion.entity.ConversionBean;
import com.sirion.proxy.ExchangeProxy;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("conversion")
public class ConversionController {
	@Autowired
	private ExchangeProxy proxy;
	
	@GetMapping("/from/{from}/to/{to}/qty/{qty}")
	@CircuitBreaker(name="exchangeService", fallbackMethod = "getExchangeValue")
	public ConversionBean getAmount(@PathVariable String from, @PathVariable String to, @PathVariable int qty) {
		ConversionBean cb = proxy.getExchangeValue(from, to);
		cb.setQty(qty);
		cb.setTotalAmount(qty * cb.getRate());
		return cb;
	}
	public ConversionBean getExchangeValue(Exception e) {
		return new ConversionBean(5, "DIN","INR", 45, 8081,225);
	}
}
