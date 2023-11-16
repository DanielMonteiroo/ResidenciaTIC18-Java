package calculadora;

import java.util.Scanner;

public class Calculadora {

private	double opcao,num1,num2;
	
public double getOpcao() {
	return opcao;
}

public void setOpcao(double opcao) {
	this.opcao = opcao;
}

public double getNum1() {
	return num1;
}

public void setNum1(double num1) {
	this.num1 = num1;
}

public double getNum2() {
	return num2;
}

public void setNum2(double num2) {
	this.num2 = num2;
}

	public double adicao(double n1,double n2)
	{
		return n1 + n2;
	}
	
	public double subtracao(double n1,double n2)
	{
		return n1 - n2;
	}
	
	public double multiplicacao(double n1,double n2)
	{
		return n1 * n2;
	}
	
	
	public double divisao(double n1,double n2)
	{
		return n1 / n2;
	}
	
	
public static void main(String[] args) {
		
		Calculadora calcula = new Calculadora();
		int option;
		double numero1,numero2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		numero1 = input.nextDouble();
		System.out.println("Informe o segundo numero: ");
		numero2 = input.nextDouble();
		
		System.out.println("Escolha uma operação a se fazer: ");
		System.out.println("\n1 - Adição ");
		System.out.println("\n2 - Subtração ");
		System.out.println("\n3 - Multiplicação ");
		System.out.println("\n4 - Divisão ");
		option = input.nextInt();
		
		switch (option) 
		{
		case 1: {
			System.out.println("A soma dos dois numeros é = "+ calcula.adicao(numero1, numero2));
			break;
		}
		case 2: {
			System.out.println("A subtração dos dois numeros é = "+ calcula.subtracao(numero1, numero2));
			break;
		}
		case 3: {
			System.out.println("A multiplicação entre dois numeros é = "+ calcula.multiplicacao(numero1, numero2));
			break;
		}
		case 4: {
			System.out.println("A divisão entre os dois numeros é = "+ calcula.divisao(numero1, numero2));
			break;
		}
		
		}
	}
	
}
	
	
	
	

