package calculadoraP004;
import java.util.ArrayList;

public class Calculadora {


	    public static int somar(int a, int b) {
	        return a + b;
	    }

	    public static double somar(double a, double b) {
	        return a + b;
	    }

	    public static int subtrair(int a, int b) {
	        return a - b;
	    }

	    public static double subtrair(double a, double b) {
	        return a - b;
	    }

	    public static int multiplicar(int a, int b) {
	        return a * b;
	    }

	    public static double multiplicar(double a, double b) {
	        return a * b;
	    }

	    public static double dividir(int a, int b) {
	        if (b != 0) {
	            return (double) a / b;
	        } else {
	            throw new ArithmeticException("Não é possível dividir por zero.");
	        }
	    }

	    public static double dividir(double a, double b) {
	        if (b != 0.0) {
	            return a / b;
	        } else {
	            throw new ArithmeticException("Não é possível dividir por zero.");
	        }
	    }

	    public static int calcular(ArrayList<Integer> numeros, char operacao) {
	        int resultado = numeros.get(0);
	        for (int i = 1; i < numeros.size(); i++) {
	            int numero = numeros.get(i);
	            switch (operacao) {
	                case '+':
	                    resultado = somar(resultado, numero);
	                    break;
	                case '-':
	                    resultado = subtrair(resultado, numero);
	                    break;
	                case '*':
	                    resultado = multiplicar(resultado, numero);
	                    break;
	                case '/':
	                    resultado = (int) dividir(resultado, numero);
	                    break;
	                default:
	                    throw new IllegalArgumentException("Operação inválida");
	            }
	        }
	        return resultado;
	    }

	    public static void main(String[] args) {
	        // Exemplos de uso para operações básicas
	        System.out.println("Soma (int): " + somar(5, 3));
	        System.out.println("Soma (double): " + somar(5.5, 3.2));

	        System.out.println("Subtração (int): " + subtrair(8, 3));
	        System.out.println("Subtração (double): " + subtrair(8.7, 3.2));

	        System.out.println("Multiplicação (int): " + multiplicar(4, 5));
	        System.out.println("Multiplicação (double): " + multiplicar(4.5, 2.2));

	        System.out.println("Divisão (int): " + dividir(8, 2));
	        System.out.println("Divisão (double): " + dividir(8.8, 2.2));

	        // Exemplo de uso para operações em sequência com ArrayList
	        ArrayList<Integer> numeros = new ArrayList<>();
	        numeros.add(10);
	        numeros.add(2);
	        numeros.add(5);

	        char operacao = '*';

	        int resultadoSequencia = calcular(numeros, operacao);
	        System.out.println("Resultado da operação em sequência: " + resultadoSequencia);
	    }
	}

	

