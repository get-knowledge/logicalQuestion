package com.gobeyond.question.serilizations.serialization.inheritance;

import com.gobeyond.question.serilizations.serialization.Employee;

import java.io.*;

/**
 * @author - 
 */
public class SerializableInheritanceObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GovtEmployee emp = new GovtEmployee("CS",9.8);
        emp.setId(101);
        emp.setName("Arvind");
        emp.setAddress("Noida");
        emp.setCategory("TEMP");
        emp.setDepartment("IT");

        Address address = new Address("Noida", "UP");

        emp.setAddress(address);

        System.out.println("Actual emp - " + emp);

       File file = new File("inheritance.ser");
       FileOutputStream fileOutputStream = new FileOutputStream(file);
       ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

       //storing the object
       oos.writeObject(emp);
    }
}
