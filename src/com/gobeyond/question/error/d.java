package com.gobeyond.question.error;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d {

	public static void main(String a[]) {

		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");

		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			
			String string = iterator.next();
			System.out.println(string);
		}
		
		
		list.forEach(val->{
			
			System.out.println(val);
		});
		
	}

}
