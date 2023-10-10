package com.models;

public class Customer {
	private String cname;
	private Address adrs;
	public Customer(String cname, Address adrs) {
		super();
		this.cname = cname;
		this.adrs = adrs;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Address getAdrs() {
		return adrs;
	}
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	
	public void PrintCustomerInfo()
	{
		System.out.println("Customer Name : " + this.getCname());
		this.getAdrs().PrintAdrs();
	}
}
