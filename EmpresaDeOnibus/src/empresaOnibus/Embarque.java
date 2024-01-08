package empresaOnibus;

public class Embarque {

		   private Passageiro passageiro;
		   private PontoParada pontoDeEmbarque;
		   
		   //GETTERS E SETTERS
		   public Passageiro getPassageiro() 
		   {
		    return passageiro;
		   }

		   public void setPassageiro(Passageiro passageiro) 
		   {
			this.passageiro = passageiro;
		   }

		   public PontoParada getPontoDeEmbarque() 
		   {
			return pontoDeEmbarque;
		   }

		  public void setPontoDeEmbarque(PontoParada pontoDeEmbarque) 
		  {
			this.pontoDeEmbarque = pontoDeEmbarque;
		  }

			//METODO 
		  public void registraEmbarque(Passageiro passageiro,PontoParada pontoParada)
		  {
		  }
		}

