// write a program to print number is even or not.

import java.util.*;

public class EvenOrApp_25

{

     public static void main(String []args)
     {
	 int n;
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a number:= ");
         n = sc.nextInt();

	if (n%2 == 0){
	
	System.out.println("Number is Even");
        
	}
	else {

	System.out.println("Number is odd");

	}
    }

}
