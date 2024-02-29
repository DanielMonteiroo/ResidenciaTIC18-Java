package com.danielmonteiro.leilao.model;

import jakarta.persistence.Entity;

@Entity
public class Concorrente {

	private Long id;
	private String nome,cpf;
	
	//construtor
	public Concorrente() {
	}

	public Concorrente(Long id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	//gets e sets
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String setCpf(String cpf) {
		return this.cpf = cpf;
	}
	
	
}
