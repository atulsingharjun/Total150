package total150;

import java.util.HashSet;

public class Thirtytwo {

	public static void main(String[] args) {
		// Empty an hash set
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        System.out.println("original elemenst"+set);
        set.removeAll(set);
        System.out.println("After removing"+set);

	}

}
