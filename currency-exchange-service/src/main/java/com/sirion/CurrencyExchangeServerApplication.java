package com.sirion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServerApplication.class, args);
	}

}
