package com.rajesh.ws.spring_ws.repo;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.rajesh.ws.types.v1.Country;
import com.rajesh.ws.types.v1.Currency;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		
		Country india = new Country();
		india.setName("India");
		india.setCapital("Delhi");
		india.setCurrency(Currency.INR);
		india.setPopulation(146704314);

		countries.put(india.getName(), india);
		
		Country usa = new Country();
		usa.setName("USA");
		usa.setCapital("Washington DC");
		usa.setCurrency(Currency.USD);
		usa.setPopulation(25704516);

		countries.put(usa.getName(), usa);
		
		Country spain = new Country();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(46704314);

		countries.put(spain.getName(), spain);

		Country poland = new Country();
		poland.setName("Poland");
		poland.setCapital("Warsaw");
		poland.setCurrency(Currency.PLN);
		poland.setPopulation(38186860);

		countries.put(poland.getName(), poland);

		Country uk = new Country();
		uk.setName("United Kingdom");
		uk.setCapital("London");
		uk.setCurrency(Currency.GBP);
		uk.setPopulation(63705000);

		countries.put(uk.getName(), uk);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}