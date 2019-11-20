package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseController {
	
	//Gerencia a conecção com o banco de dados
	private Connection connection = null;
	
	//Gerencia as consultas no banco de dados
	private Statement statement = null;
	
	//Armazena o retorno das consultas
	private ResultSet resultset = null;
	
	//conecta o servidor no localHost
	public void conectar( ) {
		String servidor = "jdbc:mysql://localhost:3306/ebbusiness?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String senha = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		String BD_URL = "jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		}catch (Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public boolean estaConectado() {
		if(this.connection != null)
		{
			return true;
		} else {
			return false;
		}
		
	}
	
	public String getUsuarioByName(String userLogin){
		
		String userLogado = null;
		
		try {
		String query = "SELECT login_employee ";
		query += "FROM company_employees_table ";
		query += "WHERE login_employee = " + userLogin;		
		
		this.resultset = this.statement.executeQuery(query);
		
		
			if(resultset.next() == false) {
			userLogado = "invalid";
			}else {
				userLogado = "valid"; 
			}
		
		}catch (SQLException e) {
			
			System.out.println("Erro ao completar ação - Erro: " + e.getMessage());
		}

		return userLogado;
	}
	
	
	public String getPasswordByName(String userLogin,String userPass) {
		
		String userPassword = "";
		
			try {
				
				String query = "SELECT login_pass ";
				query += "FROM company_employees_table ";
				query += "WHERE login_pass = " + userPass + " and login_employee = " + userLogin;
				
				this.resultset = this.statement.executeQuery(query);
				
				if(resultset.next() == false) {
					userPassword = "invalid";
					} else {
						userPassword = "valid";
					}
				
				
			} catch (SQLException e) {
				
				System.out.println("Erro ao completar ação - Erro: " + e.getMessage());		
			}
		
		return userPassword; 
		
		}
}
