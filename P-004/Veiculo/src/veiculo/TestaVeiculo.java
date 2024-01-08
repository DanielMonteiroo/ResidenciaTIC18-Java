package veiculo;

import java.util.Scanner;

public class TestaVeiculo {

	public static void main(String[] args) {
		
		Carro carro = new Carro("", "", 0, 0);
		Moto moto = new Moto("", "", 0, 0);
		Scanner entrada = new Scanner(System.in);
		
		//CARRO
		System.out.println("CARRO");
		System.out.println("\nModelo: ");
		carro.setModelo(entrada.next());
		System.out.println("Cor: ");
		carro.setCor(entrada.next());
		System.out.println("Ano: ");
		carro.setAno(entrada.nextInt());
		System.out.println("Numero de portas: ");
		carro.setNumPortas(entrada.nextInt());
		
		//MOTO
		System.out.println("MOTO");
		System.out.println("\nModelo: ");
		moto.setModelo(entrada.next());
		System.out.println("Cor: ");
		moto.setCor(entrada.next());
		System.out.println("Ano: ");
		moto.setAno(entrada.nextInt());
		System.out.println("Numero de Rodas: ");
		moto.setNumRodas(entrada.nextInt());
		
		
		System.out.println("\nCARRO:");
		carro.exibirInformacoes();
		carro.ligar();
		carro.acelerar();
		carro.parar();
		
		System.out.println("\nMOTO:");
		moto.exibirInformacoes();
		moto.ligar();
		moto.acelerar();
		moto.parar();
	}
	
	
}
