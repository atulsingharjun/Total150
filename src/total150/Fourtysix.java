package total150;

import java.util.TreeSet;

public class Fourtysix {

	public static void main(String[] args) {
		// Remove a given element from a tree set
		TreeSet<Integer> in =new TreeSet<Integer>();
		in.add(10);
		in.add(20);
		//in.add(10);
		in.add(5);
		System.out.println("Greater than or equal to 8 : "+in.ceiling(8));
		System.out.println(in.remove(20));
		System.out.println(in);

	}

}
