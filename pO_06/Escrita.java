package pO_06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class Escrita {

	public static void main(String[] args) throws IOException {

		Scanner ent = new Scanner(System.in);
		String dados;
		
		System.out.println("Escrever para gravar no arquivo");
		dados = ent.nextLine();
		
		FileWriter arquivo = new FileWriter("C:/Users/danie/OneDrive/Documentos/JAVA_ECLIPSE/PO_06/src//pO_06/saida.txt");
		PrintWriter gravar = new PrintWriter(arquivo);
		gravar.print(dados);
		
		arquivo.close();
		
		System.out.println("Dados gravados com sucesso!");
	}
	
}
