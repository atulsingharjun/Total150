package total150;

import java.util.Iterator;
import java.util.TreeSet;

public class fourtyone {

	public static void main(String[] args) {
		//Create a reverse order view of the elements contained in a given tree set
		TreeSet<String> tree_set = new TreeSet<String>();
		  tree_set.add("Red");
		  tree_set.add("Green");
		  tree_set.add("Orange");
		  tree_set.add("White");
		  tree_set.add("Black");
		  System.out.println("Tree set: ");
		  System.out.println(tree_set);
		  Iterator it = tree_set.descendingIterator();
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		  

	}

}
