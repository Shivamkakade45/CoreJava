//4) check whether number is prime Using while loop.

import java.util.*;

class PrimeNumberWhile_30

{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number:= ");
		int n = sc.nextInt();
		int count = 0;
		int i = 1;
		while(n>=i)
		{
			if (n%i==0)
			{
			    count++;
			}

			i++;

		}
	
		if(count == 2)
		{
			System.out.println("Number is Prime");
		}
		else 
		{
			System.out.println("Number is Composite");
		}
	}
}
