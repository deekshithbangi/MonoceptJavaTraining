package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student(1001, "deekshith", 20);

		// Serialization
		try {
			FileOutputStream fileOut = new FileOutputStream("student.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(student1); // pass the object, which need to be Serialized

			System.out.println("Object serialized successfully.");

			// De-Serialization
			FileInputStream fileIn = new FileInputStream("student.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Student s = (Student) in.readObject();
			System.out.println(s.getName());

			out.close();
			in.close();

		} catch (Exception e) {
			System.out.println("in exception");
			e.printStackTrace();
		}
	}
}
