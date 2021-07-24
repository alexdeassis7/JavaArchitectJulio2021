package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	static String db = "users";
	static String login = "root";
	static String password ="";
	static String url = "jdbc:mysql://localhost/" + db;
	Connection conn = null;

	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, password);
			if (conn != null) {
				System.out.println("Se logro establecer Exitosamente la conexion");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("no se logro establecer la conexion con la db");
			e.printStackTrace();
		}
	}

	
	public Connection getConnection() {
		return conn;
	}

	public void desconectar() {
		try {
			conn.close();
			conn = null;
			System.out.println("se logro desconectar de la base ");
		} catch (SQLException e) {
			System.out.println("no se logro cerra la conexion a la base ");
			e.printStackTrace();
		}
	}

}
