// find sum of digits

import java.util.*;
class SumOfDigitWhile_30
{
	public static void main(String x[])
	{
	 int n,sum=0,rem;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Number");
	 n = sc.nextInt();

	 while(n>0)
	{
		rem = n%10;
		sum = sum + rem;
		n = n / 10;
	} 
	 System.out.println("Sum is:= "+n);
	}
}
