package com.mpr.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name="Mpr.findAll", query="SELECT m FROM Mpr m")
public class Mpr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String username;
	private String password;

	public Mpr() {
	}

	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}