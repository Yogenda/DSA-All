package com.oops;

interface iface1{
	void get();
}
interface iface2{
	void put();
}

public class DemoIface implements iface1, iface2{

	@Override
	public void put() {
		// TODO Auto-generated method stub
		System.out.println("this if get()");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("This is put()");
	}  // multiple inheritance
		
}

