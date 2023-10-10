package com.models;

public class Address {

	private String dno;
	private String email;
	private String phone;
	
	public Address(String dno, String email, String phone) {
		super();
		this.dno = dno;
		this.email = email;
		this.phone = phone;
	}

	public String getDno() {
		return dno;
	}

	public void setDno(String dno) {
		this.dno = dno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void PrintAdrs()
	{
		System.out.println("Door No : " + this.getDno());
		System.out.println("Phone Number : " + this.getPhone());
		System.out.println("Email : " + this.getEmail());
	}
}
