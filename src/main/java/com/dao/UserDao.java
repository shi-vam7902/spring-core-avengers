package com.dao;

public class UserDao {
	String dBname;

	public String getdBname() {
		return dBname;
	}

	public void setdBname(String dBname) {
		this.dBname = dBname;
		
	}
	public void init()
	{
		System.out.println("init Called()");
	}
	public void destroy()
	{
		System.out.println("destroy()");
	}
	
}
