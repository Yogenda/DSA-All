package com.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private String ename;
	private Account account;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Account getAccount() {
		return account;
	}
	@Autowired(required=true)
	@Qualifier("objAcc2")
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
