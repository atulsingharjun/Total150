package total150;

public class Eightytwo {

	public static void main(String[] args) {
		// Pattern6
//		   *
//		  ***
//		 *****
//		*******
		   for(int i=1;i<=4;i++) {
			   for(int j=4;j>=i;j--) {
				   System.out.print("-");
			   }
			   
			   for(int k=1;k<=i;k++) {
				   System.out.print("X");
			   }
			   for(int l=2;l<=i;l++) {
				   System.out.print("X");
			   }
			   System.out.println();
		   }

	}

}
