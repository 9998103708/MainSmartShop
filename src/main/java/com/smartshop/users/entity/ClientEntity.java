package com.smartshop.users.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class ClientEntity {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String fName;
    private String lName;
    private String username;
    private String email;
    private String address;
    private String password;
    
	
	public ClientEntity(int id, String fName, String lName, String username, String email, String address,
			String password) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.username = username;
		this.email = email;
		this.address = address;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getUsername() {
		return username;
	}


	public void setUserName(String userName) {
		this.username = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public ClientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
    


}
