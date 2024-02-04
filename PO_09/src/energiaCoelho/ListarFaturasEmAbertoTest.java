package energiaCoelho;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ListarFaturasEmAbertoTest {

    private List<Fatura> faturas;
    
    
    public void setUp() {
        // Inicializa a lista de faturas com algumas faturas para teste
        faturas = new ArrayList<>();
        faturas.add(new Fatura(0, 0, null/* valores das faturas para teste */));
        // Adicione mais faturas, se necessário, para testar diferentes cenários
    }

    
    public void testListarFaturasEmAberto() {
      
    }
}
