package total150;

public class Seventysix {

	public static void main(String[] args) {
		//  Copy an array by iterating the array
		int a[]= {6,8,3,4};
		int b[]=new int[4]; 
		//int b[]= new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		

	}

}
