package total150;

public class Sixtythree {

	
//		//Write a Java program to create a class called “Cat” with instance variables name and age. 
//		
//		Implement a default constructor that initializes the name to "Unknown" and the age to 0.
//		Print the values of the variables.

		public String name;
		public int age;
		//default constructor
		public Sixtythree() {
			this.name ="unknown";
			this.age=21;
			
		}
		
	    public static void main(String[] args) {
	     
	        Sixtythree myprg = new Sixtythree();
	       
	        System.out.println(" Name: " + myprg.name);
	        System.out.println(" Age: " + myprg.age);
	    
	}

}
