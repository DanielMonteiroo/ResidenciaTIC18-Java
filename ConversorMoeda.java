package conversorMoeda;

import java.util.Scanner;

public class ConversorMoeda {

	private double dolar,taxaCambio;

	//getters e setters
	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public double getTaxaCambio() {
		return taxaCambio;
	}

	public void setTaxa(double taxaCambio) {
		this.taxaCambio = taxaCambio;
	}
	
	//Metodo para conversão da moeda
	public double converteMoeda(double dinheiro,double taxa )
	{
		return dinheiro * taxa;
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ConversorMoeda conv = new ConversorMoeda();
		double moeda,tx;
		int opcao;
		
		System.out.println("Informe o valor em Dolar: ");
		moeda = input.nextDouble();
		
		System.out.println("Informe a moeda a ser convertida");
		System.out.println("\n1 - EURO");
		System.out.println("\n2 - REAL");
		opcao = input.nextInt();
		
		if(opcao == 1)
		{
			tx = 0.92;
			System.out.println(moeda + " dolares é "+ conv.converteMoeda(moeda, tx) + " euros");
		}
		
		else if(opcao == 2)
		{
			tx = 4.86;
			System.out.println(moeda + " dolares é "+ conv.converteMoeda(moeda, tx) + " reais");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
