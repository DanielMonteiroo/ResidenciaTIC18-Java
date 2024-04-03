package com.daniel.cadastro;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.javafaker.Faker;

@SpringBootApplication
public class CadastroApplication {
	public static final Logger log = LoggerFactory.getLogger(CadastroApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CadastroApplication.class, args);
		log.info("Aplicação em execução");
		
		//Gerando dados com FAKER
		Faker fake = new Faker(new Locale("pt-BR"));	
	    System.out.println(String.format("\nNome: %s",fake.name().fullName()));
	    System.out.println(String.format("Endereço: %s",fake.address().streetAddress()));
	    System.out.println(String.format("Cidade: %s",fake.address().cityName()));
	    System.out.println(String.format("País: %s",fake.address().country()));
	    System.out.println(String.format("Telefone: %s",fake.phoneNumber().cellPhone()));
	    System.out.println(String.format("Idade: %s",fake.date().birthday()));
	    System.out.println(String.format("Email: %s",fake.internet().emailAddress()));
	    System.out.println(String.format("Profissão: %s",fake.job().position()));
		
	}

}
