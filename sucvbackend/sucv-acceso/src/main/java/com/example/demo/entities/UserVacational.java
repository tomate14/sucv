package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class UserVacational extends User{

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
	
	
}
