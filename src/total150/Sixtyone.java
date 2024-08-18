package total150;

import java.util.Scanner;

public class Sixtyone {


		

			public static void main(String[] args) {
				//Compute the sum of the digits in an integer
				//if 25 then ans is 7
				
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the number ");
				int number = sc.nextInt();
				System.out.print(add(number));
				
				

			}
			public static int add(int number) {
			
				int result=0;
				
								while(number>0) {
					result = number % 10+result;
					number = number/10;

				}
				return result;
			}

		
	}


