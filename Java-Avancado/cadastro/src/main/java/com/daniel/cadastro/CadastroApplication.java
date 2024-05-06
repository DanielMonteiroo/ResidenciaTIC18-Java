package com.daniel.cadastro;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Locale;

@SpringBootApplication
public class CadastroApplication {
	public static final Logger log = LoggerFactory.getLogger(CadastroApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CadastroApplication.class, args);
		log.info("Aplicação em execução");
		

		//Gerando dados com FAKER
		Faker fake = new Faker(new Locale("pt-BR"));
	    System.out.printf("\nNome: %s%n",fake.name().fullName());
	    System.out.printf("Endereço completo: %s%n",fake.address().fullAddress());
	    System.out.printf("Telefone: %s%n",fake.phoneNumber().cellPhone());
	    System.out.printf("Idade: %s%n",fake.date().birthday());
	    System.out.printf("Email: %s%n",fake.internet().emailAddress());
	    System.out.printf("Profissão: %s%n",fake.job().position());

	}

}
