package empresaOnibus;


	import java.util.Date;
	import java.util.List;
   	
	public class EmpresaDeOnibus {
	
	class Veiculo 
	{
	  private String tipoVeiculo; //ONIBUS COMUM OU MICRO-ONIBUS
	  private String placa,modelo;
	  int capacidade;

	//GETTERS E SETTERS  
	public String getTipoVeiculo() 
	{
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) 
	{
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getPlaca() 
	{
		return placa;
	}

	public void setPlaca(String placa) 
	{
		this.placa = placa;
	}

	public String getModelo() 
	{
		return modelo;
	}

	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}

	public int getCapacidade() 
	{
		return capacidade;
	}

	public void setCapacidade(int capacidade) 
	{
		this.capacidade = capacidade;
	} 
	
	}
	

	//CLASSE FUNCIONARIO
    class Funcionario
    {
      private String nome;
      private int numCadastro;
      private Date dataNascimento;
      
	    //GETTERS E SETTERS
		public String getNome() 
		{
			return nome;
		}
		public void setNome(String nome) 
		{
			this.nome = nome;
		}
		public int getNumCadastro() 
		{
			return numCadastro;
		}
		public void setNumCadastro(int numCadastro) 
		{
			this.numCadastro = numCadastro;
		}
		public Date getDataNascimento() 
		{
			return dataNascimento;
		}
		public void setDataNascimento(Date dataNascimento) 
		{
			this.dataNascimento = dataNascimento;
		}
    }
	
    class Motorista extends Funcionario
    {
    	int cnh;
        
    	//GETTERS E SETTERS
		public int getCnh() 
		{
			return cnh;
		}

		public void setCnh(int cnh) 
		{
			this.cnh = cnh;
		}
    }
    
    class Cobrador extends Funcionario
    {
    	
    }
    
    //CLASSE PASSAGEIRO
	class Passageiro 
	{
		private String tipoCartao; //IDOSO,ESTUDANTE OU PASSAGEIRO COMUM

	public String getTipoCartao() 
	{
		return tipoCartao;
	}

	public void setTipoCartao(String tipoCartao)
	{
		this.tipoCartao = tipoCartao;
	}
	 
	}
    
	//CLASSE PONTO DE PARADA
	class PontoDeParada 
	{
		private String localEmbarque,localDesembarque; 
        
	    //GETTERS E SETTERS
		public String getLocalEmbarque() 
		{
			return localEmbarque;
		}

		public void setLocalEmbarque(String localEmbarque) 
		{
			this.localEmbarque = localEmbarque;
		}

		public String getLocalDesembarque() 
		{
			return localDesembarque;
		}

		public void setLocalDesembarque(String localDesembarque)
		{
			this.localDesembarque = localDesembarque;
		}
	    
		//METODOS
		public void embarquePassageiro(String localEmbarque)
		{
			
		}
		public void desembarquePassageiro(String localDesembarque)
		{
			
		}
	}
    
	//CLASSE JORNADA
	class Jornada 
	{
		private Trajeto trajeto;
		private Funcionario funcionario;
		private Veiculo veiculo;
		private Date dataHoraInicio;  
	    
		
		//GETTERS E SETTERS
		public Trajeto getTrajeto()
		{
			return trajeto;
		}

		public void setTrajeto(Trajeto trajeto) 
		{
			this.trajeto = trajeto;
		}

		public Funcionario getFuncionario() 
		{
			return funcionario;
		}

		public void setFuncionario(Funcionario funcionario)
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

		public Date getDataHoraInicio() 
		{
			return dataHoraInicio;
		}

		public void setDataHoraInicio(Date dataHoraInicio) 
		{
			this.dataHoraInicio = dataHoraInicio;
		}

		//METODO
	    public void novaJornada(Trajeto trajeto,Funcionario funcionario,Veiculo veiculo, Date horaInicio)
	    {
	      	
	    }
	}
    
	//CLASSE EMBARQUE
	class Embarque 
	{
	   private Passageiro passageiro;
	   private PontoDeParada pontoDeEmbarque;
	   
	   //GETTERS E SETTERS
	   public Passageiro getPassageiro() 
	   {
	    return passageiro;
	   }

	   public void setPassageiro(Passageiro passageiro) 
	   {
		this.passageiro = passageiro;
	   }

	   public PontoDeParada getPontoDeEmbarque() 
	   {
		return pontoDeEmbarque;
	   }

	  public void setPontoDeEmbarque(PontoDeParada pontoDeEmbarque) 
	  {
		this.pontoDeEmbarque = pontoDeEmbarque;
	  }

		//METODO 
	  public void registraEmbarque(Passageiro passageiro,PontoDeParada pontoParada)
	  {
	  }
	}

	//CLASSE CHECKPOINT
	class Checkpoint 
	{
	   private Jornada jornada;
	   private Date dataHoraFim;
	
	//GETTERS E SETTERS
	public Jornada getJornada() 
	{
		return jornada;
	}
	public void setJornada(Jornada jornada) 
	{
		this.jornada = jornada;
	}
	public Date getDataHoraFim() 
	{
		return dataHoraFim;
	}
	public void setDataHoraFim(Date dataHoraFim) 
	{
		this.dataHoraFim = dataHoraFim;
	}
	
	}
    
	//CLASSE TRAJETO
	class Trajeto 
	{
	    private List<PontoDeParada> pontosDeParada;
	    private Checkpoint checkpoint;
        
	    //GETTERS E SETTERS
		public List<PontoDeParada> getPontosDeParada() 
		{
			return pontosDeParada;
		}

		public void setPontosDeParada(List<PontoDeParada> pontosDeParada) 
		{
			this.pontosDeParada = pontosDeParada;
		}

		public Checkpoint getCheckpoint() 
		{
			return checkpoint;
		}

		public void setCheckpoint(Checkpoint checkpoint) 
		{
			this.checkpoint = checkpoint;
		}  		
	}

	}
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


