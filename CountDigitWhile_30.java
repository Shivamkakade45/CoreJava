//6) count number of digits of a number

import java.util.*;

class CountDigitWhile_30

{
	public static void main(String x[])
	{
		long n,i,count=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Numder:= ");
		n = sc.nextLong();

		while(n>0)
		{
			rem = n%10;
			count++;
			n = n/10;
		}
	
		System.out.println(count);
	
	}
}