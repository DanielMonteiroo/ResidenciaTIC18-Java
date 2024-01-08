package empresaOnibus;

import java.util.ArrayList;
import java.util.List;

public class PontoParada {
			private List<String> localEmbarque = new ArrayList<String>(); 
			private List<String> localDesembarque = new ArrayList<String>();
			
			//GETTERS E SETTERS
			public List<String> getLocalEmbarque() {
				return localEmbarque;
			}
			public void setLocalEmbarque(List<String> localEmbarque) {
				this.localEmbarque = localEmbarque;
			}
			public List<String> getLocalDesembarque() {
				return localDesembarque;
			}
			public void setLocalDesembarque(List<String> localDesembarque) {
				this.localDesembarque = localDesembarque;
			} 
		    			
			
}
