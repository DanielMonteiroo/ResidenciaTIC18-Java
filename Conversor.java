package conversor;

import java.util.Scanner;

public class Conversor {

	double temperatura;
	String unidade;
	
	//getters e setters
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	//Método para conversão de Celsius para Fahrenheit
	public double converteFahrenheit(double temp)
	{
		return (temp * 9/5) + 32;
	}
	
	//Método para conversão de Fahrenheit para Celsius
	public double converteCelsius(double temp)
	{
		return (temp - 32) / 1.8;
	}

	public static void main(String[] args) {
		
		Conversor converte = new Conversor();
		Scanner input = new Scanner(System.in);
		
		double temperatura;
		String unidade;
		
		System.out.println("Informe a temperatura a ser convertida: ");
		temperatura = input.nextDouble();
		System.out.println("* * * Informe a unidade de origem * * *");
	    System.out.println("\nC para Celsius ou F para Fahrenheit: ");
		unidade = input.next();
		
		//Conversão em Fahrenheit
		if(unidade.equals("C") || unidade.equals("c"))
		{
		 System.out.println(temperatura + "°C em Fahrenheit é = " 
		 + converte.converteCelsius(temperatura)+"°F");
		}
		
		//Conversão em Celsius
		else if (unidade.equals("F") || unidade.equals("f"))
		{
		 System.out.println(temperatura + "°F em Celsius é = " 
		 + converte.converteCelsius(temperatura)+"°C");
		}
		
	}
	
	
	
	
}
