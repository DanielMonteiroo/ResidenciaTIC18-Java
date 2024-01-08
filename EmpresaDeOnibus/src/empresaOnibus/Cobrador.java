package empresaOnibus;

import java.util.ArrayList;
import java.util.List;

public class Cobrador extends Pessoa{

	private List<Integer> numCadastro = new ArrayList<Integer>();

	//GETTER E SETTER
	public List<Integer> getNumCadastro() {
		return numCadastro;
	}

	public void setNumCadastro(List<Integer> numCadastro) {
		this.numCadastro = numCadastro;
	}
	
	
	
}


