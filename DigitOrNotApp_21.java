//WAP to check given number is Digit or not.

import java.util.*;

public class DigitOrNotApp_21

{

    public static void main(String[]args)

    {

	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	ch = sc.next().charAt(0);

	if((ch >= '0') && (ch <= '9')){

	System.out.println("it is a digit");

	}
	else {

	System.out.println("it is not a digit");

	}

   }

}