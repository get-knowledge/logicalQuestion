package com.gobeyond.question.gc;

 class demo {

	 
	 
	public demo() {
		System.out.println("::P C");
	}

	public void show(Integer a) {

		System.out.println("::Show Integer Value ::" + a);
	}

	public void show(Double a) {

		System.out.println("::Show Double Value ::" + a);
	}

}

class Demo1 extends demo {

	public void show(Double a) {

		System.out.println("::Childe Show Double Value ::" + a);
	}
	
	public void show(Integer a) {

		System.out.println("::Chile Show Integer Value ::" + a);
	}
	
	public Demo1() {
		System.out.println("::C C");
	}
}

public class mainDemo{
	
	public static void main(String a[]) {
		
		demo d = new Demo1();
		d.show(10);
		
	}
	
}
