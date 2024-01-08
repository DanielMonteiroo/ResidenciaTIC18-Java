package veiculo;

public class Carro extends Veiculo{

	private int numPortas;
	
	//constructor
	public Carro(String modelo, String cor, int ano, int numPortas) {
        super(modelo, cor, ano);
        this.setNumPortas(numPortas);
    }

	//getters e setters
	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	//method
	@Override
	public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Numero de portas: " + numPortas);
    }
	
	public void ligar()
	{   
    	super.ligar();
		System.out.println("Carro ligado!");
	}
	
	public void acelerar()
	{
		super.acelerar();
		System.out.println("Carro acelerando!");
	}
	
	public void parar()
	{
		super.parar();
		System.out.println("Carro parado!");
	}
	
}
