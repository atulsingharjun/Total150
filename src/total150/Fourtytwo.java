package total150;

import java.util.TreeSet;

public class Fourtytwo {

	public static void main(String[] args) {
		// Get the first and last elements in a tree set
		TreeSet<String> tree_set = new TreeSet<String>();
		  tree_set.add("Red");
		  tree_set.add("Green");
		  tree_set.add("Orange");
		  tree_set.add("White");
		  tree_set.add("Black");
		  System.out.println("Tree set: ");
		  System.out.println(tree_set);
		  System.out.println(tree_set.first());
	}

}
