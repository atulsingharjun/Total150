package total150;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Thirtyseven {

	public static void main(String[] args) {
		//Convert a hash set to a tree set
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        System.out.println("orginal"+set);
        Set<String> treeset = new TreeSet<String>(set);
        
        System.out.println("tree set elements ");
        for(String tree:treeset) {
        	System.out.println(tree);
        }

	}

}
