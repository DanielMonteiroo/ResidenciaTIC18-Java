package calculadoraExcecao;

import java.util.Scanner;
import java.lang.*;


public class CalculadoraExcecao
{
	//declaração das variavéis
	public float num1,num2;
	public int numero1,numero2;
	
	//getters e setters
	public float getNum1() {
		return num1;
	}
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	public float getNum2() {
		return num2;
	}
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	//Métodos das operações float
	public float adicao(float n1,float n2)
	{
		return n1 + n2;
	}
	
	public float subtracao(float n1,float n2)
	{
		return n1 - n2;
	}
	
	public float multiplicacao(float n1,float n2)
	{
		return n1 * n2;
	}
	
	public float divisaoFloat(float n1,float n2)
	{
		return n1 / n2;
	}
	
	//Métodos das operações Int
	public int adicaoInt(int n1,int n2)
	{
		return n1 + n2;
	}
	
	public float subtracaoInt(int n1,int n2)
	{
		return n1 - n2;
	}
	
	public float multiplicacaoInt(int n1,int n2)
	{
		return n1 * n2;
	}
	
	public int divisaoInt(int n1,int n2)
	{
		return n1 / n2;
	}
	
	
	public static void main(String[] args) throws DivisionByZeroException 
	{
		Scanner input = new Scanner(System.in);
		CalculadoraExcecao calc = new CalculadoraExcecao();
		
		int operacao,opcao,n1,n2;
		float num1,num2;
		
		//Escolha do tipo da operação
		System.out.println("\n** ESCOLHA UMA OPERAÇÃO **");
		System.out.println("\n1- Operação com inteiro ");
		System.out.println("\n2-  Operação com float ");
		opcao = input.nextInt();
		
		if(opcao == 1)
		{
			System.out.println("Digite o primeiro numero: ");
			n1 = input.nextInt();
			System.out.println("Digite o segundo numero: ");
			n2 = input.nextInt();
			
			//Escolha da operação a ser feita
			System.out.println("\n** ESCOLHA UMA OPERAÇÃO **");
			System.out.println("\n1- Adição ");
			System.out.println("\n2- Subtração ");
			System.out.println("\n3- Muliplicação ");
			System.out.println("\n4- Divisão ");
			operacao = input.nextInt();
			
			if(operacao == 1)
			{
				System.out.println("A soma dos dois numeros é = "+ calc.adicaoInt(n1, n2));
			}
			else if(operacao == 2)
			{
				System.out.println("A subtração entre os numeros é = "+ calc.subtracaoInt(n1, n2));
			}
			else if(operacao == 3)
			{
				System.out.println("A multiplicação entre os numeros é = "+ calc.multiplicacaoInt(n1, n2));
			}
			else if(operacao == 4)
			{
				if(n2 == 0)
				{
				throw new DivisionByZeroException("Não é possivel a divisão por zero");
				}
				else
				{
				System.out.println("A divisão entre os numeros é = "+ calc.divisaoInt(n1, n2));
			    }
				}
		}
		else
		{
		    System.out.println("Digite o primeiro numero: ");
		    num1 = input.nextFloat();
		    System.out.println("Digite o segundo numero: ");
		    num2 = input.nextFloat();
		    
		  //Escolha da operação a ser feita
			System.out.println("\n** ESCOLHA UMA OPERAÇÃO **");
			System.out.println("\n1- Adição ");
			System.out.println("\n2- Subtração ");
			System.out.println("\n3- Muliplicação ");
			System.out.println("\n4- Divisão ");
			operacao = input.nextInt();
			
			if(operacao == 1)
			{
				System.out.println("A soma dos dois numeros é = "+ calc.adicao(num1, num2));
			}
			else if(operacao == 2)
			{
				System.out.println("A subtração entre os numeros é = "+ calc.subtracao(num1, num2));
			}
			else if(operacao == 3)
			{
				System.out.println("A multiplicação entre os numeros é = "+ calc.multiplicacao(num1, num2));
			}
			else if(operacao == 4)
			{   
				if(num2 == 0)
				{
				throw new DivisionByZeroException("Não é possivel a divisão por zero");
				}
				else
				{
				System.out.println("A divisão entre os numeros é = "+ calc.divisaoFloat(num1, num2));
				}
				
			}
		}	
		
	}
	

}
