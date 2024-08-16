package total150;

import java.util.TreeSet;

public class Fourtyfour {

	public static void main(String[] args) {
		// Get the element in a tree set which is greater than or equal to the given element
		TreeSet<Integer> in =new TreeSet<Integer>();
in.add(10);
in.add(20);
//in.add(10);
in.add(5);
System.out.println("Greater than or equal to 8 : "+in.ceiling(8));
	}

}
