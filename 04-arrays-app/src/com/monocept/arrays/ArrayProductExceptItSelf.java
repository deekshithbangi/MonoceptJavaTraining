package com.monocept.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProductExceptItSelf {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Elements in Array : "); // 4
		int n = sc.nextInt();

		System.out.print("Enter Array Elements : "); // 2 3 4 5
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int product = 1;
		for (int num : arr) {
			product *= num;
		}
		int[] resultantArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			resultantArr[i] = product / arr[i];
		}

		System.out.println(Arrays.toString(resultantArr)); // [60, 40, 30, 24]

	}
}
//
// int resultarray[]=new int[n];
//		int prefix=1;
//		for(int j=0;j<array.length;j++) {
//			resultarray[j]=prefix;
//			prefix*=array[j];
//			//[1,1,2,6]
//			
//		}
//		int postfix=1;//4
//		for(int k=array.length-1;k>=0;k--) {
//			resultarray[k]*=postfix;
//			postfix*=array[k];
//			//[24,12,8,6]
//		}
//		System.out.println(Arrays.toString(resultarray));
