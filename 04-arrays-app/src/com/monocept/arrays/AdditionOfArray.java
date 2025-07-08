package com.monocept.arrays;

import java.util.Scanner;

public class AdditionOfArray {
	public static void main(String[] args) {

		int array[]; // array declaration
		array = new int[5]; // Allocating Space to array
		
//		int[] array = {03, 12, 19, 24, 31, 33, 42, 44, 49}; 
// 		int array[] = new int[5];
		
//		values = [0, 0, 0 , 0 , 0]
//		index = [0, 1, 2, 3, 4] 

		array[0] = 5;
		array[4] = 20;
		System.out.println(array[4]);

		// array inputs from user
		Scanner scanner = new Scanner(System.in);

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("Printin array values: ");
		for(int i = 0; i < array.length; i++) {
			System.out.println("i"+ i + " = " + array[i]);
		}
		
		scanner.close();
	}
}
