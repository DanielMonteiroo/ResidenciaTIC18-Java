package dao;

import java.sql.Connection;
import energiaCoelho.Reembolso;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.ConexaoBD;

public class ReembolsoDAO {
    private Connection conexao;

    public ReembolsoDAO() {
        this.conexao = ConexaoBD.getConnection();
    }

    public void adicionarReembolso(Reembolso reembolso) {
        String sql = "INSERT INTO Reembolso (valor, data, descricao, id_funcionario) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setDouble(1, reembolso.getValor());
            stmt.setDate(2, new java.sql.Date(reembolso.getData().getTime()));
            stmt.setString(3, reembolso.getDescricao());
            stmt.setInt(4, reembolso.getIdFuncionario());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Métodos para listar, atualizar e excluir reembolsos
}
