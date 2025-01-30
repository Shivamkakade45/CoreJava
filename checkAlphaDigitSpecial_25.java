// Write a java program to input any character and check whether it is alphabet, digit or special character.

import java.util.*;

public class CheckAlphaDigitSpecial_25

{

  public static void main (String []args)

     {

	char ch;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a character");
	ch = sc.next().charAt(0);

	if ((ch >= 'A') && (ch <='Z') || (ch >= 'a') && (ch <='z')){

	System.out.println("Alphabet");

	}
	else if((ch >= '0' ) && (ch <= '9')){
	
	System.out.println("Digit");

	}
	else {
	
	System.out.println("Special Symbol");

	}
   }

}