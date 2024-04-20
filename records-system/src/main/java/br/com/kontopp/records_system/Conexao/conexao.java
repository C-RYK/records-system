package br.com.kontopp.records_system.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

	public static Connection getConexao() {
		
		try {
			final String url = "jdbc:postgresql://localhost:5432/database_user_register";
			final String usuario = "postgres";
			final String senha = "54544761Chpj";
			
			return DriverManager.getConnection(url, usuario, senha);
			
		} catch (SQLException e) {
				throw new RuntimeException(e);
		}
	}
}
