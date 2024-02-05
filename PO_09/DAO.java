package org.junit.jupiter.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	
	private static final String URL = "jdbc:mysql://ukkedfpqvziyq1lb:wwI3cqUpa6S2Lok5GIo9@b5rtz91pppmlijrzdmzf-mysql.services.clever-cloud.com:3306/b5rtz91pppmlijrzdmzf";
	
	private static final String USER = "ukkedfpqvziyq1lb";
	
	private static final String PASSWD = "wwI3cqUpa6S2Lok5GIo9";
	
	public static Connection conectar()
	{
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("Conexão feita com sucesso!");
		}catch (SQLException e) {
			System.out.println("Erro de conexão!");
		}
		return con;
	}

}
