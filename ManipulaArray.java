package manipulaArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {

private int[]arrayUsuario = new int[5];
private int[]arrayAleatorio = new int[5];

//getters e setters
public int[] getArrayUsuario() {
	return arrayUsuario;
}
public void setArrayUsuario(int[] arrayUsuario) {
	this.arrayUsuario = arrayUsuario;
}
public int[] getArrayAleatorio() {
	return arrayAleatorio;
}
public void setArrayAleatorio(int[] arrayAleatorio) {
	this.arrayAleatorio = arrayAleatorio;
}

//Metodo que soma todos os elementos do vetor
public int somaArray(int[] numArray,int soma)
{
 for(int i=0; i<numArray.length; i++)
      {
	   soma += numArray[i];
      }
return soma;
}

//Metodo para encontrar o maior valor
public int maiorValor(int[] numArray,int maior)
{   
	maior = 0;
	for(int i=0; i<numArray.length; i++)
	{
		if(numArray[i] > maior )
		{
			maior = numArray[i];
		}
		
	}
	return maior;
}

//Metodo para encontrar menor valor
public int menorValor(int[] numArray,int menor)
{   
	menor = 1;
	for(int i=0; i<numArray.length -1; i++)
	{
		if(numArray[i] < menor )
		{
			menor = numArray[i];
		}
		
	}
	return menor;
}


//MAIN
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	ManipulaArray m = new ManipulaArray();
	
	int[] vetUsuario = new int[5];
	int[] vetAleatorio = new int[5];
	int soma = 0,menor = 1, maior = 0;
	
	//Laço para gerar os numeros aleatorios no array
	for(int i=0;i<vetAleatorio.length;i++)
	{
		Random aleatorio = new Random();
		vetAleatorio[i] = aleatorio.nextInt();
	}
	
	//Laço para guardar os numeros digitados pelo usuario
	for(int i=0;i<vetUsuario.length;i++)
	{
	System.out.println("Digite os 5 numeros do array: ");
	vetUsuario[i] = input.nextInt();
	}
	
	
	System.out.println("SOMA DOS NUMEROS DIGITADOS: " + m.somaArray(vetUsuario, soma));
	
	System.out.println("SOMA DOS NUMEROS ALEATORIOS: " + m.somaArray(vetAleatorio, soma));
	
	System.out.println("MENOR NUMERO ALEATORIO: " + m.menorValor(vetAleatorio,menor));
	
	System.out.println("MAIOR NUMERO ALEATORIO: " + m.maiorValor(vetAleatorio,maior));
	
	System.out.println("MENOR NUMERO DOS DIGITADOS: " + m.menorValor(vetUsuario,menor));
	
	System.out.println("MAIOR NUMERO DOS DIGITADOS: " + m.maiorValor(vetUsuario,maior));
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
