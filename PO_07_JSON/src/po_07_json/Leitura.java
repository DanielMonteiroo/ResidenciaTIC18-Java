package po_07_json;
import java.io.FileReader;
import java.io.IOException;
import org.json.parser.JSONParser;
import org.json.parser.ParseException;
import org.json.JSONArray;
import org.json.JSONObject;

public class Leitura {

	    public static void main(String[] args) {
	        // Definir o caminho do arquivo estudantes.json
	        String filePath = "estudantes.json";
	        
	        // Criar um objeto JSON Parser
	        JSONParser jsonParser = new JSONParser();
	        
	        try (FileReader reader = new FileReader(filePath)) {
	            // Ler o arquivo JSON e converter para um objeto JSON Array
	            JSONArray estudantes = (JSONArray) jsonParser.parse(reader);
	            
	            // Exibir os dados dos estudantes na saída padrão
	            for (Object object : estudantes) {
	                JSONObject estudante = (JSONObject) object;
	                String nome = (String) estudante.get("nome");
	                int idade = Math.toIntExact((Long) estudante.get("idade"));
	                String curso = (String) estudante.get("curso");
	                
	                System.out.println("Nome: " + nome);
	                System.out.println("Idade: " + idade);
	                System.out.println("Curso: " + curso);
	                System.out.println();
	            }
	        } catch (IOException e) {
	            System.out.println("Ocorreu um erro ao ler o arquivo estudantes.json.");
	            e.printStackTrace();
	        }
	    }
	}

	
	

