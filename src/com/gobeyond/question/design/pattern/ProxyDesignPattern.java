package com.gobeyond.question.design.pattern;

//"Controls and manage access to the object they are protecting".

//Proxy is a structural design pattern that lets you provide a substitute or
//placeholder for another object. A proxy controls access to the original object, 
//allowing you to perform something either before or after the request gets through 
//to the original object.

interface DatabaseExecuter {
	public void executeDatabase(String query) throws Exception;
}

class DatabaseExecuterImpl implements DatabaseExecuter {

	@Override
	public void executeDatabase(String query) throws Exception {
		System.out.println("Going to execute Query: " + query);
	}

}

class DatabaseExecuterProxy implements DatabaseExecuter {
	boolean ifAdmin;
	DatabaseExecuterImpl dbExecuter;

	public DatabaseExecuterProxy(String name, String passwd) {
		if (name == "Admin" && passwd == "Admin@123") {
			ifAdmin = true;
		}
		dbExecuter = new DatabaseExecuterImpl();
	}

	@Override
	public void executeDatabase(String query) throws Exception {
		if (ifAdmin) {
			dbExecuter.executeDatabase(query);
		} else {
			if (query.equals("DELETE")) {
				throw new Exception("DELETE not allowed for non-admin user");
			} else {
				dbExecuter.executeDatabase(query);
			}
		}
	}
}

public class ProxyDesignPattern {

	public static void main(String[] args) throws Exception {
		DatabaseExecuter nonAdminExecuter = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
		nonAdminExecuter.executeDatabase("DELEE");

		/*
		 * DatabaseExecuter nonAdminExecuterDELETE = new
		 * DatabaseExecuterProxy("NonAdmin", "Admin@123");
		 * nonAdminExecuterDELETE.executeDatabase("DELETE");
		 * 
		 * DatabaseExecuter adminExecuter = new DatabaseExecuterProxy("Admin",
		 * "Admin@123"); adminExecuter.executeDatabase("DELETE");
		 */
	}
}
