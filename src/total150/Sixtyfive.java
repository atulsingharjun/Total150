package total150;

import java.util.Scanner;

public class Sixtyfive {

	public static void main(String[] args) {
		// Fahrenheit to Celsius degree
		Scanner sc = new Scanner(System.in);
		System.out.println("input the farenheit");
		double far = sc.nextDouble()
;
		double celsius = (( 5 *(far - 32.0)) / 9.0);
		System.out.println(celsius);
	}

}
