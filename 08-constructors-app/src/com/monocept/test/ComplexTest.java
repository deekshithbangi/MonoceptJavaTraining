package com.monocept.test;

import com.monocept.model.Complex;

public class ComplexTest {
	public static void main(String[] args) {

//		Complex 1
		Complex complex1 = new Complex(10, 4);
		System.out.println("Comple1: " + complex1.getReal() + " + " + complex1.getImaginary() + "i");

//		Complex 2
		Complex complex2 = new Complex(20, 8);
		System.out.println("Comple2: " + complex2.getReal() + " + " + complex2.getImaginary() + "i");

//		Addition of Complex
		Complex addition = new Complex();
		System.out.println("addition : " + addition.getReal() + " + " + addition.getImaginary() + "i");
		System.out.println("Addition of Two Complex: " + addition.Addition(complex1, complex2));
	}
}
