//Q2. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote. 

import java.util.*;

public class CheckEligible_25

{  
    
   public static void main(String[]args)

   {

        int age;
	Scanner sc = new Scanner (System.in);
        System.out.println("Enter a age");
	age = sc.nextInt();

	if(age >= 18){
	
	System.out.println("Eligible for vote");

	}

	else{

	System.out.println("Eligible for vote");

	}

   }

}