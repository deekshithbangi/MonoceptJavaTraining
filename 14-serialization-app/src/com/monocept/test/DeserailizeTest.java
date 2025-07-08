package com.monocept.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.monocept.model.Car;

public class DeserailizeTest {
	public static void main(String[] args) {
		// Using try-catch Block -> to check for whether file exits or not, class exist
		// or not in the file, read exception
		try {
			FileInputStream fileInputStream = new FileInputStream("vechiles-list.ser");
			ObjectInputStream object = new ObjectInputStream(fileInputStream);
			int i = 0;
			while (true) {
				try {
					Car car = (Car) object.readObject();

					System.out.println("details of car " + (i + 1) + " : ");
					System.out.println("Car Name: " + car.getCompanyName());
					System.out.println("Car Mileage: " + car.getMileage());
					System.out.println("Car Price: " + car.getPrice());

					System.out.println();
					i++;
				} catch (EOFException e) { // end of file exception
					break;
				}
			}

			// closing object
			object.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
