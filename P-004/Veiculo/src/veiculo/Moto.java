package veiculo;

public class Moto extends Veiculo{
	private int numRodas;

	//constructor
	public Moto(String modelo, String cor, int ano, int numRodas) {
		super(modelo, cor, ano);
		this.numRodas = numRodas;
	}

	//getters e setters
	public int getNumRodas() {
		return numRodas;
	}

	public void setNumRodas(int numRodas) {
		this.numRodas = numRodas;
	}
    
    @Override
    public void exibirInformacoes()
    {
    	super.exibirInformacoes();
    	System.out.println("Numero de Rodas: " + numRodas);
    }
   
    public void ligar()
	{   
    	super.ligar();
		System.out.println("Moto ligada!");
	}
	
	public void acelerar()
	{
		super.acelerar();
		System.out.println("Moto acelerando!");
	}
	
	public void parar()
	{
		super.parar();
		System.out.println("Moto parada!");
	}

    
    
    
}
