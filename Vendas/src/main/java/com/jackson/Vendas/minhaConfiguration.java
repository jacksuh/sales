package com.jackson.Vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class minhaConfiguration {

	/*@Bean(name ="applicationName")
	public String applicationName() {
		return "Sistema de Vendas";*/
	
	@Bean
	public CommandLineRunner executar() {
		return args -> {
			System.out.println("Rodando a configuração de Desenvolvimento");
		};
	}
	
	}
