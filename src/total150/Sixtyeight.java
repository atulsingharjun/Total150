package total150;

import java.util.Scanner;

public class Sixtyeight {

	public static void main(String[] args) {
		// Compute body mass index (BMI)
		Scanner input = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Input height in inches: ");
        double inches = input.nextDouble();
        
        double bmi = weight/(inches*inches);
        System.out.println(bmi);

	}

}
