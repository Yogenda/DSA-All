package com.oops;

public class Poly1 {

	
	// method overloading: calculating area of different shapes
	
	static void Area(float r)
	{
		System.out.println("Area of Circle is : " + (3.14f*r*r));
	}
	
	static void Area(int l, int b)
	{
		System.out.println("Area of Rectangle is : " + (l*b));
	}
	
	static void Area(float b, float h)
	{
		System.out.println("Area of Traingle : " + (0.5*b*h));
	}
	
	public static void main(String[] args) {

		Area(4,5);
		Area(1.5f);
		Area(1.4f,1.2f);
	}

}
