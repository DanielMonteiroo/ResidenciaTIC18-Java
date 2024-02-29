package com.danielmonteiro.leilao.controller.form;



import com.danielmonteiro.leilao.model.Leilao;

public class LeilaoForm {
	
	private String descricao,status;
	private double valorMinimo;
	
	//construtor
	public LeilaoForm(String descricao, String status, double valorMinimo) {
		this.descricao = descricao;
		this.status = status;
		this.valorMinimo = valorMinimo;
	}

	public LeilaoForm() {
	}

	//gets e sets
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}
	
	
	//Metodo de criação
	public Leilao criaLeilao() {
		
		Leilao leilao = new Leilao();
		descricao = leilao.getDescricao();
		status = leilao.getStatus();
		valorMinimo = leilao.getValorMinimo();
		
		return leilao;
}
	
	//Metodo ToString
	public Leilao toLeilao() {
		
		Leilao leilao = new Leilao();
		descricao = leilao.setDescricao(descricao);
		status = leilao.setStatus(status);
		valorMinimo = leilao.setValorMinimo(valorMinimo);
		
		return leilao;
	}
	
	
	

}
