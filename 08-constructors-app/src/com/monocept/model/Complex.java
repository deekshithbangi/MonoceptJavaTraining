package com.monocept.model;

public class Complex {

	private int real;
	private int imaginary;

//	Constructors 
	public Complex() {
		this.real = 0;
		this.imaginary = 0;
	}

	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

//	Getters 
	public int getReal() {
		return real;
	}

	public int getImaginary() {
		return imaginary;
	}

//	Setters
	public void setReal(int real) {
		this.real = real;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

//	ToString 
	public String Addition(Complex complex1, Complex complex2) {
		int addReal = complex1.getReal() + complex2.getReal();
		int addImaginary = complex1.getImaginary() + complex2.getImaginary();
		return addReal + " + " + addImaginary + "i";
	}
}
