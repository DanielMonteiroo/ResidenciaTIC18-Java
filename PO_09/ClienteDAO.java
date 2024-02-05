package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Cliente;

public class ClienteDAO {
    // Outros métodos da classe
    
    public void inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO Cliente (cpf, nome) VALUES (?, ?)";
        
        try (Connection con = ConexaoBD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.setString(2, cliente.getNome());
            
            int linhasAfetadas = statement.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Cliente inserido com sucesso no banco de dados.");
            } else {
                System.out.println("Falha ao inserir cliente no banco de dados.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente no banco de dados: " + e.getMessage());
        }
    }
}

