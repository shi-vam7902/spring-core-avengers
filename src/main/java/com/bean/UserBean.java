package com.bean;

public class UserBean  {
	String firstname, email,password;
	
	RoleBean role;
	
		
	public UserBean(RoleBean role) {
		this.role = role;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
