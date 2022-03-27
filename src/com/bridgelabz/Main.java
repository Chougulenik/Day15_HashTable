package com.bridgelabz;

public class Main {

	public static void main(String[] args) {
		
		MyHashFunction func = new MyHashFunction("Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations",4); 
		func.deleteData("Paranoids");
		func.showTable();

	}
}
