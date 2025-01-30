//Write a java program to check whether a character is uppercase or lowercase alphabet.

import java.util.*;

public class UppercaseOrLowercaseApp_25

{

   public static void main(String []args)

    {
	char ch;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a Character");
	ch = sc.next().charAt(0);

	if((ch >= 'A') && (ch <= 'Z')){

	System.out.println("Uppercase");

	}
	else if((ch >= 'a') && (ch <= 'z')){

	System.out.println("Lowercase");

	}
	else{

	System.out.println("invalid");
	
	}	

    }

}