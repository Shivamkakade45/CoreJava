//Write a java program to check whether a number is divisible by 5 and 11 or not.

import java.util.*;

public class NumberIsDivisibleApp_25
{

   public static void main(String []args)

   {

	int no;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a no:= ");
        no = sc.nextInt();

        if (( no%5 == 0) && ( no%11 == 0 )){

	System.out.println("Number is divisible by 5 & 11");

	}
         else {

	System.out.println("Number is not divisible by 5 & 11");

	}

   }

}