package pO_06;

import java.io.*;
import java.nio.channels.FileChannel;

public class Copia {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	
		FileChannel origem = null; //VARIAVEL DE ORIGEM
	    FileChannel destino = null; //VARIAVEL DE DESTINO
	    try {
	    	origem = new FileInputStream("C:/Users/danie/OneDrive/Documentos/JAVA_ECLIPSE/PO_06/src//pO_06/origem.txt").getChannel();
	    	destino = new FileOutputStream("C:/Users/danie/OneDrive/Documentos/JAVA_ECLIPSE/PO_06/src//pO_06/destino.txt").getChannel();
	    	destino.transferFrom(origem, 0, origem.size());
	       }finally{
	    	   origem.close();
	    	   destino.close();
	    	   System.out.println("Cópia realizada com sucesso!");
	   }
		
		
		
	}
	
}
