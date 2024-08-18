package total150;

import java.util.Scanner;

public class fiftyseven {

	public static void main(String[] args) {
		// Compute the average of three numbers
		Scanner sc= new Scanner(System.in);
		System.out.print("Input the first number: ");
		Double x = sc.nextDouble();
		System.out.println("input second no");
		Double y = sc.nextDouble();
		System.out.println("input third no");
		Double z =sc.nextDouble();
		System.out.println(average(x,y,z));

	}
	
	public static double average(double x, double y, double z) {
		return (x+y+z)/3;
		
	}

}
