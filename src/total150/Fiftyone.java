package total150;

import java.util.Scanner;

public class Fiftyone {

	public static void main(String[] args) {
		// Write a Java program that takes two numbers as input and displays the product of two numbers.
		Scanner in = new Scanner(System.in);
		System.out.println("inter first no");
		int n1 = in.nextInt();	
		Scanner in2 = new Scanner(System.in);
		System.out.println("inter second no");
		int n2 = in2.nextInt();	
		
		int product = n1*n2;
		System.out.println(product);

	}

}
