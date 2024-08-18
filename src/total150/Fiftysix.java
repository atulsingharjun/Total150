package total150;

import java.util.Scanner;

public class Fiftysix {

	public static void main(String[] args) {
		// Check all the characters in a string are vowels or not
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Input a vowelletter: ");
	    String str = sc.nextLine();
	    System.out.print("Check all the characters of the said string are vowels or not!\n");
	    System.out.print(test(str));
	  }

	  public static boolean test(String input) {
	    String str_vowels = "aeiou";
	    String phrase = input.toLowerCase();
	    for (int i = 0; i < phrase.length(); i++) {
	      if (str_vowels.indexOf(phrase.charAt(i)) == -1)
	        return false;
	    }
	    return true;
	  }

}
