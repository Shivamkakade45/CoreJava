//9) calculate sum of even and odd digits of a number.

import java.util.*;

class EvenOddWhile_30

{
	public static void main(String x[])
	{
		int n,sum_even=0,sum_odd=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();

		while(n>0)
		{
			if(n%2==0)
			{
			sum_even = sum_even + n; 
			}
			else
			{
			sum_odd = sum_odd + n;
			}
			
			n++;
		}
		
		System.out.println("Sum of even number:= "+sum_even);
		System.out.println("sum of odd number:= "+sum_odd);
	}
}