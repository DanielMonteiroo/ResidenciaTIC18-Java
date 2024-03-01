package com.danielmonteiro.leilao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Leilao {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao,status;
	private double valorMinimo;
	
	//construtor
	public Leilao(Long id, String descricao, String status, double valorMinimo) {
		this.id = id;
		this.descricao = descricao;
		this.status = status;
		this.valorMinimo = valorMinimo;
	}

	public Leilao() {
	}

	//gets e sets
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public String setDescricao(String descricao) {
		return this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public String setStatus(String status) {
		return this.status = status;
	}

	public double getValorMinimo() {
		return valorMinimo;
	}

	public double setValorMinimo(double valorMinimo) {
		return this.valorMinimo = valorMinimo;
	}

	
	
}
