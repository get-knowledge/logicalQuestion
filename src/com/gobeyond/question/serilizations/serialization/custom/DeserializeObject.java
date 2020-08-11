package com.gobeyond.question.serilizations.serialization.custom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author - 
 */
public class DeserializeObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("arvind1234.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        //read the object
        Employee employee = (Employee) ois.readObject();
        System.out.println("Deserialized emp - " + employee);

        fis.close();
        ois.close();
    }
}
