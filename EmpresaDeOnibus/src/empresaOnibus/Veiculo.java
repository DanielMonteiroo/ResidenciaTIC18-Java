package empresaOnibus;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
	
	  private List<String> tipoVeiculo = new ArrayList<String>(); 
	  private List<String> placa = new ArrayList<String>();
	  private List<String> modelo = new ArrayList<String>();
	  private List<Integer> capacidade = new ArrayList<Integer>();
	
    //GETTER E SETTER  
	public List<String> getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(List<String> tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public List<String> getPlaca() {
		return placa;
	}
	public void setPlaca(List<String> placa) {
		this.placa = placa;
	}
	public List<String> getModelo() {
		return modelo;
	}
	public void setModelo(List<String> modelo) {
		this.modelo = modelo;
	}
	public List<Integer> getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(List<Integer> capacidade) {
		this.capacidade = capacidade;
	}	
		
}
  


	
	
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


