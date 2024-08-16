package total150;

import java.util.HashSet;
import java.util.Iterator;

public class thirty {

	public static void main(String[] args) {
		//  ignoring duplicate elements
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        set.add("Five");
        Iterator ite =set.iterator();
        while(ite.hasNext()) {
        	System.out.println(ite.next()
        			);
        }
        
		
		

	}

}
