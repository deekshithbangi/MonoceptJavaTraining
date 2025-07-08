package com.monocept.enums;

public class LaptopPrices {
	// Enum is special type of class
	enum Laptop {
		MACBOOK(2000), // MACBOOK, WINDOWS, XPS, SURFACE, THINKPAD -> all are objects of Laptop
		WINDOWS(1500), XPS(2200), SURFACE(2000), THINKPAD(1800);

		int price;

		private Laptop(int price) { // Using Constructor to set values for this objects
			this.price = price;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
	}

	public static void main(String[] args) {
		Laptop macbook = Laptop.MACBOOK;
		macbook.setPrice(2400);

		for (Laptop myLaptop : Laptop.values()) {
			System.out.println(myLaptop + " : " + myLaptop.price);
		}
	}
}
