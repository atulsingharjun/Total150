package total150;

import java.util.HashSet;

public class Thirtyeight {

	public static void main(String[] args) {
		// Compare two hash set
		HashSet<String> h_set = new HashSet<String>();
	    
	          h_set.add("Red");
	          h_set.add("Green");
	          h_set.add("Black");
	          h_set.add("White");

	          HashSet<String>h_set2 = new HashSet<String>();
	          h_set2.add("Red");
	          h_set2.add("Pink");
	          h_set2.add("Black");
	          h_set2.add("Orange");
	          HashSet<String> result_set = new HashSet<String>();
	          for (String element : h_set){
	              System.out.println(h_set2.contains(element) ? "Yes" : "No");
	           }      
	}

}
