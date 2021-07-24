package com.educacionit.daos;

import java.sql.SQLException;
import java.sql.Statement;

import com.educacionit.database.Conexion;
import com.educacionit.modelos.PersonaVO;

//DAO : Data Acces Object patron implementado para centralizar toda 
//la logica de acceso a los datos 

public class UserDAO {
	public boolean registrarUsuario(PersonaVO miPersona) {

		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate(
					"INSERT INTO user VALUE('" + miPersona.getIdName() + "','" + miPersona.getPassword() + "')");
			estatuto.close();
			conex.desconectar();
			System.out.println("se logro guardar el registro en la base ");
			return true;
		} catch (SQLException e) {
			System.out.println("Ocurrio un Error en el DAO , no pudimos persistir el dato ");
			e.printStackTrace();
			return false;
		}
	}

}
