// WAP to check given number is positive or not.

import java.util.*;

public class CheckNumberApp_21

{

   public static void main(String []args)

   { 

	int no;
        Scanner sc = new Scanner (System.in);
	System.out.println("Enter a number");
	no = sc.nextInt();

	if(no > 0){
	System.out.println("Positive Number");
	}
	else if( no == 0 ){
	System.out.println("Neutral Number");
	}
	else if( no < 0 ) {
	System.out.println("Negative Number");
	}
	else{
	System.out.println("Invalid data");
	}

    }

}
     