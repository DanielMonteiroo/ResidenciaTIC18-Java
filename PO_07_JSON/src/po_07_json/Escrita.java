package po_07_json;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;
		
public class Escrita {

		    public static void main(String[] args) {
		        // Criando um objeto JSON para armazenar os estudantes
		        JSONArray estudantes = new JSONArray();

		        // Solicitar ao usuário inserir os dados dos estudantes
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Quantos estudantes deseja adicionar? ");
		        int qtdEstudantes = sc.nextInt();
		        
		        for (int i = 0; i < qtdEstudantes; i++) {
		            System.out.println("Estudante " + (i + 1) + ":");
		            
		            // Solicitar informações do estudante
		            System.out.print("Nome: ");
		            String nome = sc.next();
		            
		            System.out.print("Idade: ");
		            int idade = sc.nextInt();
		            
		            System.out.print("Curso: ");
		            String curso = sc.next();
		            
		            // Criar um objeto JSON para o estudante atual
		            JSONObject estudante = new JSONObject();
		            estudante.put("nome", nome);
		            estudante.put("idade", idade);
		            estudante.put("curso", curso);
		            
		            // Adicionar o objeto JSON do estudante ao JSON Array
		            estudantes.put(estudante);
		        }
		        
		        // Gravar os dados no arquivo estudantes.json
		        try (FileWriter file = new FileWriter("estudantes.json")) {
		            file.write(estudantes.toString());
		            System.out.println("Dados dos estudantes foram gravados com sucesso no arquivo estudantes.json.");
		        } catch (IOException e) {
		            System.out.println("Ocorreu um erro ao gravar os dados dos estudantes no arquivo estudantes.json.");
		            e.printStackTrace();
		        }
		        
		        // Fechar o scanner
		        sc.close();
		    
	
		
		
	}

}
