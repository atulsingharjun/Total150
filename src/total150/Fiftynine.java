package total150;

import java.util.Scanner;

public class Fiftynine {

	public static void main(String[] args) {
		//Count all vowels in a string
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string having vowel");
		String str = sc.nextLine();
		
		 System.out.print(count_Vowels(str));
	}
	
	
	//making method
	public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }

}
