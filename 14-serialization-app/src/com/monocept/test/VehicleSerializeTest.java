package com.monocept.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.monocept.model.Car;

public class VehicleSerializeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Vechiles: ");
		int noOfVechiles = sc.nextInt();

		// creating noOfVechiles array of Car objects
		Car cars[] = new Car[noOfVechiles];

		try {
			// Serialization Variables
			FileOutputStream fileOutputStream = new FileOutputStream("vechiles-list.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			// Using Loop to Store all data
			for (int i = 0; i < noOfVechiles; ++i) {
				cars[i] = new Car();

				System.out.println("Enter " + i + 1 + " Vechile details: ");
				System.out.println("Enter Car Company Name: ");
				cars[i].setCompanyName(sc.next());

				System.out.println("Enter Car Company Mileage: ");
				cars[i].setMileage(sc.nextInt());

				System.out.println("Enter Car Company price: ");
				cars[i].setPrice(sc.nextDouble());

				// Serializing object
				objectOutputStream.writeObject(cars[i]);
			}
			objectOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Serialize completed");
		sc.close();
	}
}
