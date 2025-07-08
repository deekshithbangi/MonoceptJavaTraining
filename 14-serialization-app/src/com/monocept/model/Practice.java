package com.monocept.model;

public class Practice {
	public static void main(String[] args) {
		save obj = new save();

		obj.i = 12;

		System.out.println(obj.hashCode());

		save obj1 = obj;
		System.out.println(obj1.hashCode());
		System.out.println(obj1.i);
	}
}

class save {
	int i;
}