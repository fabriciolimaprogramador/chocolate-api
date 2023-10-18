package br.com.chocolates.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class ChocolatesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChocolatesApiApplication.class, args);
	}

}
