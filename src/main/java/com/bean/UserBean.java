package com.bean;

public class UserBean  extends RoleBean{
	String firstname, email,password;
	String rname ="user";
	public UserBean()
	{
		RoleBean r = new RoleBean();
		
		r.setRoleName(rname);
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
