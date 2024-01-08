package empresaOnibus;

import java.util.ArrayList;
import java.util.List;

public class Motorista extends Pessoa{

    	private List<String> cnh = new ArrayList<String>();
       
    	//GETTERS E SETTERS
		public List<String> getCnh() {
			return cnh;
		}

		public void setCnh(List<String> cnh) {
			this.cnh = cnh;
		}
    	
		
    }

