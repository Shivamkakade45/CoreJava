//10) Check whether a number is duck or not using while loop

import java.util.*;

class DuckNum_30
{
	public static void main(String x[])
	{
		int n,duck=0,rem;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number:= ");
		n = sc.nextInt();
		
		while(n>0)
		{
			rem = n%10;
			if(duck == rem)
			{
			   System.out.println("Duck Number"); 
				
			}
			n = n/10;
		}
		
		System.out.println("it's Not Duck Number"); 
		
	}

}