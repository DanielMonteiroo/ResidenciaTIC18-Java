package empresaOnibus;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private List<String> nome = new ArrayList<String>();
	private List<String> dtNascimento = new ArrayList<String>();
	 
	  //GETTERS E SETTERS
	public List<String> getNomes() {
		return nome;
	}
	public void setNomes(List<String> nomes) {
		this.nome = nomes;
	}
	public List<String> getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(List<String> dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
}

