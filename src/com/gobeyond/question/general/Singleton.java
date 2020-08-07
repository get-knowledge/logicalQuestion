package com.gobeyond.question.general;

import java.io.ObjectStreamException;
import java.io.Serializable;

/****
 * How to make singleton class thread safe? using double checked locking How to
 * prevent deserialization to create new object of singleton class? using
 * readResolve method to return same instance How to prevent cloning to create a
 * new object of singleton class? override clone method to return same instance
 * How to prevent reflexion to create a new object of singleton class? check
 * instance exist in private constructor and throw exception if already exist
 * You can find the singleton pattern implementation here. +91-9860275156
 * 
 *****/

public class Singleton implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Singleton instance = null;

	private static Object DUMMY_OBJECT = new Object();

	private Singleton() {

		/* To prevent object creation using reflection */
		if (instance != null) {

			throw new InstantiationError("Singleton Object is already created.");

		}
	}

	public static Singleton getInstance() {

		/* Double checked locking */

		if (instance == null) {

			synchronized (DUMMY_OBJECT) {

				if (instance == null) {

					instance = new Singleton();
				}
			}

		}

		return instance;

	}

	/* To prevent object creation using deserialization */
	private Object readResolve() throws ObjectStreamException {
		return instance;

	}

	/* To prevent object creation using cloning */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;

	}

}
