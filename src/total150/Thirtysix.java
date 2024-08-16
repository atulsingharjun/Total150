package total150;

import java.util.HashSet;

public class Thirtysix {

	public static void main(String[] args) {
		// Convert a hash set to an array
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        
        //creating array
        String[] a = new String[set.size()];
        set.toArray(a);
        System.out.println("Array elements: ");
        for(String element : a){
          System.out.println(element);
       }
        

	}

}
