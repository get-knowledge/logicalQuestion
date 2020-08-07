package com.gobeyond.question.gc;

//Java program to illustrate 
//Automatic Resource Management 
//in Java with multiple resource 
public class Resource 
{ 
	public static void main(String s[]) 
	{ 
		//note the order of opening the resources 
		try(Demo d = new Demo(); Demo4 d1 = new Demo4()) 
		{ 
			int x = 10/0; 
			d.show(); 
			d1.show1(); 
		} 
		catch(ArithmeticException e) 
		{ 
			System.out.println(e); 
		} 
	} 
} 

//custom resource 1 
class Demo implements AutoCloseable 
{ 
	void show() 
	{ 
		System.out.println("inside show"); 
	} 
	public void close() 
	{ 
		System.out.println("close from demo"); 
	} 
} 

//custom resource 2 
class Demo4 implements AutoCloseable 
{ 
	void show1() 
	{ 
		System.out.println("inside show1"); 
	} 
	public void close() 
	{ 
		System.out.println("close from demo1"); 
	} 
} 

