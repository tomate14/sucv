package com.example.demo.dto;

import java.sql.Date;

public class UserDto {
	private Integer id;	
	private int dni;	
	private String name;
	private Date birthday;	
	private String borncity;	
	private String email;

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getBornCity() {
		return borncity;
	}

	public void setBornCity(String borncity) {
		this.borncity = borncity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
