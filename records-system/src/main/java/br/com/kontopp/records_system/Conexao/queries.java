package br.com.kontopp.records_system.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class queries {

	public static void main(String[] args) throws SQLException {
		
		Connection conexaoConnection = conexao.getConexao();

		String sql = "INSERT INTO public.\"User\"(\r\n"
				+ "	\"Name\", \"Gender\")\r\n"
				+ "	VALUES (?, ?);";
		
		PreparedStatement stmt = conexaoConnection.prepareStatement(sql);
		stmt.setString(1, "Carlos");
		stmt.setString(2, "Masculino");
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso !");
	
		conexaoConnection.close();
	}
}
