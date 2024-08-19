package total150;

public class Seventythree {

	
		 int rollno;  
		 String name;  
		 String city;  
		  
		 Seventythree(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		 public String toString(){//overriding the toString() method  
			  return rollno+" "+name+" "+city;  
			 }  
		 public static void main(String args[]){  
			 Seventythree s1=new Seventythree(101,"Raj","lucknow");  
			 Seventythree s2=new Seventythree(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 }  
		}  

