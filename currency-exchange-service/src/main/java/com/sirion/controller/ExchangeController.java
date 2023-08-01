package com.sirion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirion.entity.ExchangeValue;
import com.sirion.repo.ExchangeRepo;

@RestController
@RequestMapping("exchange")
public class ExchangeController {
	@Autowired
	private ExchangeRepo repo;
	@Autowired
	private Environment env;
	
	@GetMapping("/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from,@PathVariable String to) {
		ExchangeValue ex = repo.findByCurrencyFromAndCurrencyTo(from, to);
		ex.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return ex;
	}
}
