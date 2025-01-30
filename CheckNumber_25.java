// Q1. Write a java program to find maximum between three numbers.

import java.util.*;

public class CheckNumber_25

{

    public static void main(String [] args)

     {
	int n1, n2, n3;
	Scanner sc = new Scanner (System.in);

	System.out.println("Enter a 1st number");
	n1 = sc.nextInt();
	
	System.out.println("Enter a 2nd number");
	n2 = sc.nextInt();

	System.out.println("Enter a 3rd number");
	n3 = sc.nextInt();

	if((n1>n2) && (n1>n3)){

	System.out.println("1st is greater than other");

	}
	else if((n2>n3) && (n2>n1)){

	System.out.println("2nd is greater than other");

	}
	else{

	System.out.println("3rd is greater than other");

	}

     }

}