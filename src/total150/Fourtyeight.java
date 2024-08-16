package total150;

import java.util.TreeSet;

public class Fourtyeight {

	public static void main(String[] args) {
		// Retrieve and remove the last element of a tree set
		TreeSet<Integer> in =new TreeSet<Integer>();
		in.add(10);
		in.add(20);
		//in.add(10);
		in.add(5);
		System.out.println(in.pollLast());


	}

}
