package com.sda.javapoz11.hellospring.hellospring;

import com.sda.javapoz11.hellospring.hellospring.service.BigNumbersGenerator;
import com.sda.javapoz11.hellospring.hellospring.service.RandomGenerator;
import com.sda.javapoz11.hellospring.hellospring.service.SmallNumbersGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import java.util.Random;

@SpringBootApplication
public class HellospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellospringApplication.class, args);
	}


	@Bean // adnotacja na metodzie mówiąca Springowi, że ma tę metodę wywołać i zapisać w kontekście
	public RandomGenerator smallNumbersGenerator() {
		return new SmallNumbersGenerator();
	}

	@Profile("prod")
	@Primary
	@Bean
	public RandomGenerator myBigNumbersGenerator() {
		return new BigNumbersGenerator();
	}

	@Profile("!prod")
	@Primary // adnotacja mówiąca o wyższości tego beana nad pozostałymi - potencjalnie dostępnymi w kontekście
	@Bean
	public RandomGenerator bigNumbersGenerator() {
		return new BigNumbersGenerator();
	}
}
