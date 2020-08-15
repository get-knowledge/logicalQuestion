package com.gobeyond.question.java8;

import java.util.function.Predicate;

public class Java8PredicateExample {
	
	public static void main(String a[]) {
		
		
		Predicate<Integer> predicate = i -> i > 100;
		
		System.out.println("is 200 greater than 100: "+predicate.test(200));
	}

}
