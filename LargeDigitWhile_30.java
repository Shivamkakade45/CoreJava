//3) find largest digit


import java.util.*;
class LargeDigitWhile_30
{
	public static void main(String x[])
	{
		int n,large=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:= ");
		n = sc.nextInt();

		while(n>0)
		{
			rem = n%10;
			if(large < rem)
			{
			    large=rem;
				
			}
			n = n / 10;
		}
		System.out.println("Large Number is:= "+large);
	}
}