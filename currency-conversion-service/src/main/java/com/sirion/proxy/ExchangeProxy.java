package com.sirion.proxy;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sirion.entity.ConversionBean;

@FeignClient(name = "exchange-service")
@LoadBalancerClient(name="exchange-service")
//@FeignClient(name = "exchange-service", url = "localhost:8081")
public interface ExchangeProxy {
	@GetMapping("/exchange/from/{from}/to/{to}")
	public ConversionBean getExchangeValue(@PathVariable String from,@PathVariable String to);
}
