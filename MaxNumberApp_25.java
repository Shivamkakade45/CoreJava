//Write a java program to find maximum between two numbers.

import java.util.*;

public class MaxNumberApp_25

{

   public static void main(String[]args)
   
   {

	int no1, no2;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a First number:= ");
        no1 = sc.nextInt();

	System.out.println("Enter a First number:= ");
        no2 = sc.nextInt();

	if( no1 > no2) {

	System.out.println(" First number is Maximum than second number");

	}

	else if( no1 == no2) {

        System.out.println(" First number equal to second number");

	}

        else{
	
	System.out.println(" First number Minimum than second number");

	}

   }

}