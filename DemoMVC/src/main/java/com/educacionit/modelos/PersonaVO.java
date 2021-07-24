package com.educacionit.modelos;

//VO : Value Object o antes conocido como DTO (Data Transfer Object )
//POJOS , son clase simples (atributos , get , set , contructores)
//representan a una entidad (tabla) de nuestra DB
public class PersonaVO {
	private String idName;
	private int password;

	public PersonaVO() {
	}

	public PersonaVO(String idName, int password) {
		this.idName = idName;
		this.password = password;
	}

	public String getIdName() {
		return idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}
