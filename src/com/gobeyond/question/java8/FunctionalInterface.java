package com.gobeyond.question.java8;

import java.util.ArrayList;
import java.util.List;

//A sample functional interface (An interface with 
//single abstract method 
interface FunInterface {

	// An abstract function
	void abstractFun(int x);
}

public class FunctionalInterface {

	public static void main(String a[]) {

		// lambda expression to implement above
		// functional interface. This interface
		// by default implements abstractFun()
		FunInterface fbb = (int x) -> System.out.println(x * 2);
		// This calls above lambda expression
		fbb.abstractFun(6);
		
		
		// Creating an ArrayList with elements 
        // {1, 2, 3, 4} 
		
		List<Integer> lstInt = new ArrayList<>();
		
		lstInt.add(1);
		lstInt.add(2);
		lstInt.add(3);
		lstInt.add(4);
		lstInt.add(5);
		lstInt.add(6);
		

        // Using lambda expression to print all elements 
        // of arrL 
		lstInt.forEach(n->System.out.println(n*2));

	}

}
