package com.danielmonteiro.leilao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lance {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Leilao leilao;
	private double valor;
	
	//construtor
	public Lance() {
	}

	public Lance(Long id, Leilao leilao, double valor) {
		this.id = id;
		this.leilao = leilao;
		this.valor = valor;
	}

	//gets e sets
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Leilao getLeilao() {
		return leilao;
	}

	public Leilao setLeilao(Leilao leilao) {
		return this.leilao = leilao;
	}

	public double getValor() {
		return valor;
	}

	public double setValor(double valor) {
		return this.valor = valor;
	}
	
	
	
}
