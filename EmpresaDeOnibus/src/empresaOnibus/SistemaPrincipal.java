package empresaOnibus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcao; //variavel para escolha no menu
		
		//variaveis e listas para objeto VEICULO
		int capacidad;
		String tpVeiculo,placaVeiculo,modeloVeiculo;
		List<String> tipoVeiculo = new ArrayList<String>(); 
		List<String> placa = new ArrayList<String>();
		List<String> modelo = new ArrayList<String>();
		List<Integer> capacidade = new ArrayList<Integer>();
		Veiculo veiculo = new Veiculo();
		
		//variaveis e listas para objeto MOTORISTA 
		String nome,dtNascimento,cnhMotorista; 
		List<String> nomes = new ArrayList<String>();
		List<String> dataNasci = new ArrayList<String>();
		List<String> habilitacao = new ArrayList<String>();
		Motorista motorista = new Motorista();
		
		//variaveis e listas para objeto COBRADOR
	    Cobrador cobrador = new Cobrador();
		int codCadastro;
		List<Integer> cadastro = new ArrayList<Integer>();
		
		//variaveis e listas para objeto PASSAGEIRO
		Passageiro passageiro = new Passageiro();
		String tpCartao;
		List<String> cartao = new ArrayList<String>();
		
		//variaveis e listas para objeto PONTOS DE PARADA
		PontoParada pontoParada = new PontoParada();
		String embarque,desembarque;
		List<String> localEmbarque = new ArrayList<String>(); 
		List<String> localDesembarque = new ArrayList<String>();
		
		//variaveis e listas para objeto TRAJETO
		Trajeto trajeto = new Trajeto();
		String trecho,checkpoint;
		List<PontoParada> trechos = new ArrayList<PontoParada>();
		List<CheckPoint> checkpoints = new ArrayList<CheckPoint>();
		
				
		do{
			System.out.println("ESCOLHA UMA OPÇÃO ABAIXO:");
			System.out.println("\n\n1 - CADASTRAR VEÍCULO");
			System.out.println("\n2 - CADASTRAR MOTORISTA");
			System.out.println("\n3 - CADASTRAR COBRADOR");
			System.out.println("\n4 - CADASTRAR PASSAGEIRO");
			System.out.println("\n5 - CADASTRAR PONTO DE PARADA");
			System.out.println("\n6 - CADASTRAR TRAJETO");
			System.out.println("\n7 - LISTAR VEICULOS");
			System.out.println("\n0 - SAIR DO SISTEMA");
			opcao = entrada.nextInt();
			
	    	switch (opcao) {
			case 1: {
				System.out.println("\n-*-*-* Cadastrar Veículo -*-*-*");
				System.out.println("Tipo do veículo:");
				tpVeiculo = entrada.next();
				tipoVeiculo.add(tpVeiculo);
				veiculo.setTipoVeiculo(tipoVeiculo);
				
				System.out.println("Placa do veículo:");
				placaVeiculo = entrada.next();
				placa.add(placaVeiculo);
				veiculo.setPlaca(placa);
				
				System.out.println("Modelo do veículo:");
				modeloVeiculo = entrada.next();
				modelo.add(modeloVeiculo);
				veiculo.setModelo(modelo);
				
				System.out.println("Capacidade do veículo:");
				capacidad = entrada.nextInt();
				capacidade.add(capacidad);
				veiculo.setCapacidade(capacidade);
				break;
			}//case1
			
			case 2:
			{   
				System.out.println("\n-*-*-* Cadastrar motorista -*-*-* ");
				System.out.println("\nNome:");
				nome = entrada.next();
				nomes.add(nome);
				motorista.setNomes(nomes);
				
				System.out.println("\nData de Nascimento:");
				dtNascimento = entrada.next();
				dataNasci.add(dtNascimento);
				motorista.setDtNascimento(dataNasci);
				
				System.out.println("\nCNH:");
				cnhMotorista = entrada.next();
				habilitacao.add(cnhMotorista);
				motorista.setCnh(habilitacao);
				break;
			}
			
			case 3:
			{   
				System.out.println("\n-*-*-* Cadastrar cobrador -*-*-* ");
				System.out.println("\nNome:");
				nome = entrada.next();
				nomes.add(nome);
				cobrador.setNomes(nomes);
				
				System.out.println("\nData de Nascimento:");
				dtNascimento = entrada.next();
				dataNasci.add(dtNascimento);
				cobrador.setDtNascimento(dataNasci);
				
				System.out.println("\nNº Cadastro:");
				codCadastro = entrada.nextInt();
				cadastro.add(codCadastro);
				cobrador.setNumCadastro(cadastro);
				
				break;
			}
			
			case 4:
			{   
				System.out.println("\n-*-*-* Cadastrar passageiro -*-*-* ");
				System.out.println("\nNome:");
				nome = entrada.next();
				nomes.add(nome);
				passageiro.setNomes(nomes);
				
				System.out.println("\nData de Nascimento:");
				dtNascimento = entrada.next();
				dataNasci.add(dtNascimento);
				passageiro.setDtNascimento(dataNasci);
				
				System.out.println("\nTipo de Cartão:");
				tpCartao = entrada.next();
				cartao.add(tpCartao);
				passageiro.setTipoCartao(cartao);
				
				break;
			}
			
			case 5:
			{   
				System.out.println("\n-*-*-* Cadastrar Ponto de Parada -*-*-* ");
				System.out.println("\nLocal de Embarque:");
				embarque = entrada.next();
				localEmbarque.add(embarque);
				pontoParada.setLocalEmbarque(localEmbarque);
				
				System.out.println("\nLocal de Desembarque:");
				desembarque = entrada.next();
				localDesembarque.add(embarque);
				pontoParada.setLocalEmbarque(localDesembarque);	
				break;
			}
			
			case 6:
			{
				System.out.println("Informar trecho:");
				trecho = entrada.next();
				trechos.add(pontoParada);
				
				break;
			}
			
						
			}//switch
	    }//do
		while(opcao != 0);
		
		
		
}//main
	
}//class
