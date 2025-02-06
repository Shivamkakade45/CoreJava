//8) Reverse a number

import java.util.*;

class RevUseWhile_30
{
	public static void main(String x[])
	{
		int n,rev=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:= ");
		n = sc.nextInt();

		while(n>0)
		{
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}

		System.out.println("Reverse number is:= "+rev);
	}

}