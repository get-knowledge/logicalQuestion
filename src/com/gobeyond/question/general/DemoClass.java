package com.gobeyond.question.general;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DemoClass {

	public static void main(String a[]) throws ParseException {

		ImmutablePerson person1 = new ImmutablePerson("Adam", 55,
				new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2001"));

		ImmutablePerson person2 = new ImmutablePerson("Ben", 50,
				new SimpleDateFormat("dd-MM-yyyy").parse("02-02-2002"));

		Set<ImmutablePerson> setOfPerson = new HashSet<>(Arrays.asList(person1, person2));
		System.out.println(setOfPerson);

		/**
		 * ImmutablePerson do not provide setter methods, no way to mutate name, weight,
		 * or date property fields.
		 */

		String s1 = new String("CodingNConcepts");
		String s2 = s1.toUpperCase();
		System.out.println(s1 == s2); // false
		s1 = s2; // assign back to s1
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true

		System.out.println("S1 ::" + s1); //

		System.out.println("S2 ::" + s2); //

		Integer oneV1 = new Integer(1);
		Integer oneV2 = new Integer(1);
		System.out.println(oneV1 == oneV2); // false
		System.out.println(oneV1.equals(oneV2)); // true

		oneV1 = Integer.valueOf(-1300000000); // returns cached instance
		oneV2 = Integer.valueOf(1); // returns cached instance
		System.out.println(oneV1 == oneV2); // true
		System.out.println(oneV1.equals(oneV2)); // true

		System.out.println("oneV1 ::" + oneV1); //

		System.out.println("oneV2 ::" + oneV2); //

	}

}
