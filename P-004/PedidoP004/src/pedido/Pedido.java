package pedido;

import java.util.ArrayList;
import java.util.List;


	public class Pedido {
	    int numeroPedido;
	    String cpfCliente;
	    List<ItemPedido> itens;

	    public Pedido(int numeroPedido, String cpfCliente) {
	        this.numeroPedido = numeroPedido;
	        this.cpfCliente = cpfCliente;
	        this.itens = new ArrayList<>();
	    }

	    // Adiciona um único item ao pedido
	    public void adicionarItem(String nome, double preco, int quantidade) {
	        ItemPedido item = new ItemPedido(nome, preco, quantidade);
	        itens.add(item);
	    }

	    // Adiciona uma lista de itens ao pedido (sobrecarga)
	    public void adicionarItens(List<ItemPedido> listaItens) {
	        itens.addAll(listaItens);
	    }

	    // Calcula o total do pedido com desconto à vista (sobrecarga)
	    public double calcularTotal(double percentualDesconto) {
	        double total = 0;
	        for (ItemPedido item : itens) {
	            total += item.preco * item.quantidade;
	        }
	        return total - (total * percentualDesconto / 100);
	    }

	    // Calcula o total do pedido a prazo com juros (sobrecarga)
	    public double calcularTotal(int numeroPrestacoes, double taxaJuros) {
	        double total = 0;
	        for (ItemPedido item : itens) {
	            total += item.preco * item.quantidade;
	        }
	        return total + (total * taxaJuros / 100 * numeroPrestacoes);
	    }

	    // Exibe as informações do pedido
	    public void exibirPedido() {
	        System.out.println("Número do Pedido: " + numeroPedido);
	        System.out.println("CPF do Cliente: " + cpfCliente);
	        System.out.println("Itens do Pedido:");
	        for (ItemPedido item : itens) {
	            System.out.println("  - Nome: " + item.nome + ", Preço: " + item.preco + ", Quantidade: " + item.quantidade);
	        }
	    }

	    public static void main(String[] args) {
	        // Exemplo de pedido com desconto à vista
	        Pedido pedidoComDesconto = new Pedido(1, "123.456.789-01");
	        pedidoComDesconto.adicionarItem("Produto A", 50.0, 2);
	        pedidoComDesconto.adicionarItem("Produto B", 30.0, 3);

	        System.out.println("Total do Pedido com Desconto: " + pedidoComDesconto.calcularTotal(10) + " (10% de desconto)");

	        // Exemplo de pedido a prazo com juros
	        Pedido pedidoAPrazo = new Pedido(2, "987.654.321-01");
	        List<ItemPedido> itensPedidoAPrazo = new ArrayList<>();
	        itensPedidoAPrazo.add(new ItemPedido("Produto C", 40.0, 1));
	        itensPedidoAPrazo.add(new ItemPedido("Produto D", 25.0, 2));
	        pedidoAPrazo.adicionarItens(itensPedidoAPrazo);

	        System.out.println("Total do Pedido a Prazo: " + pedidoAPrazo.calcularTotal(3, 5) + " (3 prestações a 5% de juros)");

	        // Exibindo as informações dos pedidos
	        pedidoComDesconto.exibirPedido();
	        System.out.println("\n----------------\n");
	        pedidoAPrazo.exibirPedido();
	    }
	}

