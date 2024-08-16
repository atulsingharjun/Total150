package total150;

import java.util.HashSet;

public class Thirtyfour {

	public static void main(String[] args) {
		// Test a hash set is empty or not
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        System.out.println("Original element "+set);
      
        System.out.println(set.isEmpty());
        set.removeAll(set);
        System.out.println("after removing"+set);
        System.out.println(set.isEmpty());
	}

}
