package total150;

public class Eighty {

	public static void main(String[] args) {
		// Pattern 4
//		    *
//		   **
//		  ***
//		 ****
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("X");
			}
			System.out.println();
		}

	}

}
