package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseController {
	
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
		
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		}catch (Exception e){
			System.out.println("Erro : " + e.getMessage());
		}
	}
	
	public void desconectar() {
		
		try {
			connection.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Metodo utilizada para pegar o usuario com base no valor digitado na variavel
	 * 
	 * @param userLogin - Nome do usuario
	 * @return true or false
	 */
	public boolean getUsuarioByName(String userLogin){
		
		boolean userLogado = false;
		
		try {
		String query = "SELECT login_employee ";
		query += "FROM company_employees_table ";
		query += "WHERE login_employee = " + userLogin;		
		
		this.resultset = this.statement.executeQuery(query);
		
		
			if(resultset.next() == false) {
				
			userLogado = false;
			
			}else {
				
				userLogado = true;
			}
			

		
		}catch (SQLException e) {
			
			System.out.println("Erro ao completar ação - Erro: " + e.getMessage());
		}

		return userLogado;
	}

	/**
	 * Verifica se este usuario esta dentro do Banco de dados pesquisando atraves do input colocado
	 * 
	 * @param userLogin
	 * @param userPass
	 * @return - retorna se o usuario e valido e esta no banco
	 */
	public boolean getPasswordByName(String userLogin,String userPass) {

		
		boolean userPassword = false;
		
			try {
				
				String query = "SELECT login_pass ";
				query += "FROM company_employees_table ";
				query += "WHERE login_pass = " + userPass + " and login_employee = " + userLogin;
				
				this.resultset = this.statement.executeQuery(query);
				
				if(resultset.next() == false) {
					
					userPassword = false;
					
					} else {
						
						userPassword = true;
					}
				
				
			} catch (SQLException e) {
				
				System.out.println("Erro ao completar ação - Erro: " + e.getMessage());		
			}
		
		return userPassword; 
		
		}
	
	/**
	 * Pega do banco de dados qual e o nivel de usuario atraves do nome
	 * 
	 * @param userLogin
	 * @return - o nivel do usuario
	 */
	public int getUserRoleByUser(String userLogin) {
		
		int userRole = 0;
		
			try {
				
				String query = "SELECT user_role ";
				query += "FROM company_employees_table ";
				query += "WHERE login_employee = " + userLogin;
				
				this.resultset = this.statement.executeQuery(query);
				
				userRole = resultset.getInt("user_role");
				
				
			} catch (SQLException e) {
				
				System.out.println("Erro ao completar ação - Erro: " + e.getMessage());		
			}
			
		
		return userRole;
		
	}

	/** 
	 * Pega o nome da empresa que o usuario trabalha atraves do nome de usuario
	 * 
	 * @param UserLogin
	 * @return
	 */
	public String getCompanyByUser(String UserLogin) {
		
		String companyName = null;
		
		try {
			
			String query = "SELECT c.company_trading_name ";
				   query += "FROM company_table c, company_employees_table ce ";
				   query += "WHERE c.company_id = ce.employee_company and ce.login_employee = " + UserLogin;
				   //+ UserLogin;
			
			this.resultset = this.statement.executeQuery(query);
			
			resultset.next();
			
			companyName = resultset.getString("company_trading_name");
			
			
		} catch (SQLException e) {
			
			System.out.println("Erro ao completar ação - Erro: " + e.getMessage());		
		}
		
		return companyName;
		
	}
}
