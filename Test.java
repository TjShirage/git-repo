package com.velocity.java;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {

	public static void m1()
	{
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println( "addition =" +c);
	}
	public void m2()
	{
		int a=50;
		int b=10;
		int c;
		c= a-b;
		System.out.println("substraction=" +c);
	}
	public int m3(int x, int y)
	{
		int z=x/y;
		System.out.println(z);
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test.m1();
	Test test=new Test();
	test.m2();
	test.m3(9, 6);
	}

}
