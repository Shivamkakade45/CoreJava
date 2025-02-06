
//2) find sum of digits
import java.util.*;

class SumOfDigi_30

{

   public static void main (String [] x)

     {

	int no,n, sum=0;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a Number:=");
	no = sc.nextInt();

	while(no > 0)
	{
	    n = no%10;
	   sum = n + sum;
	   no = no/10;

	}

         System.out.println(sum);

   }

}


	