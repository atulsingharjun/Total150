package total150;

import java.util.TreeSet;

public class Fourtynine {

	public static void main(String[] args) {
		//Get an element in a tree set which is strictly less than the given element
		TreeSet<Integer> in =new TreeSet<Integer>();
		in.add(10);
		in.add(20);
		//in.add(10);
		in.add(5);
		System.out.println(in.lower(7));


	}

}
