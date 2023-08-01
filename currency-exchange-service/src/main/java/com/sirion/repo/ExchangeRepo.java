package com.sirion.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirion.entity.ExchangeValue;

public interface ExchangeRepo extends JpaRepository<ExchangeValue, Integer> {
	public ExchangeValue findByCurrencyFromAndCurrencyTo(String from, String to);
}
