package total150;

import java.util.TreeSet;

public class fourty {

	public static void main(String[] args) {
		// Iterate through all elements in a tree set
		TreeSet<String> tree_set = new TreeSet<String>();
		  tree_set.add("Red");
		  tree_set.add("Green");
		  tree_set.add("Orange");
		  tree_set.add("White");
		  tree_set.add("Black");
		  System.out.println("Tree set: ");
		  System.out.println(tree_set);
		  for(String set :tree_set) {
			  System.out.println(set);
		  }
		  
	}

}
