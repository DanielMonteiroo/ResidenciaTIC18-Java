package pO_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura {
  public static void main(String[] args) throws FileNotFoundException {
	  
	File arquivo = new File("C:/Users/danie/OneDrive/Documentos/JAVA_ECLIPSE/PO_06/src//pO_06/leitura.txt");
	
	Scanner scan = new Scanner(arquivo);
	
	while(scan.hasNextLine()) {
		System.out.println(scan.nextLine());
	}
	
  }
	
	
}
