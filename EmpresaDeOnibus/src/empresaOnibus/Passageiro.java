package empresaOnibus;

import java.util.List;

public class Passageiro extends Pessoa {
	
	private List<String> tipoCartao; //IDOSO,ESTUDANTE OU PASSAGEIRO COMUM

	//GETTER E SETTER
	public List<String> getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(List<String> tipoCartao) {
		this.tipoCartao = tipoCartao;
	}

	    
		 
	}

