package energiaCoelho;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ListarFaturasTest {

    private List<Fatura> faturas;
    
  
    public void setUp() {
      
        faturas = new ArrayList<>();
        faturas.add(new Fatura(0, 0, null));
     
    }

  
    public void testListarFaturas() {
     
    }
}
