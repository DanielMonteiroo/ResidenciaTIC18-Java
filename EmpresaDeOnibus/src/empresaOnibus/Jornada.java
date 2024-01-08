package empresaOnibus;

import java.util.Date;

public class Jornada {
	
		private Trajeto trajeto;
		private Pessoa funcionario;
		private Veiculo veiculo;
		private String dataHoraInicio;  
	    
		//GETTERS E SETTERS
		public Trajeto getTrajeto()
		{
			return trajeto;
		}

		public void setTrajeto(Trajeto trajeto) 
		{
			this.trajeto = trajeto;
		}

		public Pessoa getFuncionario() 
		{
			return funcionario;
		}

		public void setFuncionario(Pessoa funcionario)
		{
			this.funcionario = funcionario;
		}

		public Veiculo getVeiculo() 
		{
			return veiculo;
		}

		public void setVeiculo(Veiculo veiculo) 
		{
			this.veiculo = veiculo;
		}

		public String getDataHoraInicio() 
		{
			return dataHoraInicio;
		}

		public void setDataHoraInicio(String dataHoraInicio) 
		{
			this.dataHoraInicio = dataHoraInicio;
		}
		
		//METODO
	    public void novaJornada(Trajeto trajeto,Pessoa funcionario,Veiculo veiculo, Date horaInicio)
	    {
	      	
	    }
}
