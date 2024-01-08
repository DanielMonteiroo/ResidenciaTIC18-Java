package empresaOnibus;

import java.util.ArrayList;
import java.util.List;

public class Trajeto {
	
	        private List<PontoParada> pontosDeParada = new ArrayList<PontoParada>();
		    private List<CheckPoint> checkpoint = new ArrayList<CheckPoint>();
	        
		    //GETTERS E SETTERS
			public List<PontoParada> getPontosDeParada() 
			{
				return pontosDeParada;
			}

			public void setPontosDeParada(List<PontoParada> pontosDeParada) 
			{
				this.pontosDeParada = pontosDeParada;
			}

			public List<CheckPoint> getCheckpoint() 
			{
				return checkpoint;
			}

			public void setCheckpoint(List<CheckPoint> checkpoint) 
			{
				this.checkpoint = checkpoint;
			}  	
			
		
		}
