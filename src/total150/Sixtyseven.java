package total150;

import java.util.Scanner;

public class Sixtyseven {

	public static void main(String[] args) {
		//: Takes the user to input the minutes, and print the number of years and days for the minutes
		
		double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        System.out.println(years);

	}

}
