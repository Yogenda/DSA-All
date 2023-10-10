package com.oops;

public abstract class AbsParent {
	protected int x;
	public void get(int x)
	{
		this.x = x;
	}
	
	abstract void putdata();// method declaration
	abstract void print(int n);
}

class AbsChild extends AbsParent
{
	@Override
	void putdata() {
		System.out.println("X value is : " + x);
	}

	@Override
	void print(int n) {
		System.out.println("N value is " + n);
	}
	
}
