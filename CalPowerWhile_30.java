//7) calculate power of a number

import java.util.*;

class CalPowerWhile_30

{
	public static void main (String x[])

	{
		int n,exp,power=1,count=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number:= ");
		n = sc.nextInt();

		System.out.println("Enter a Power:= ");
		exp = sc.nextInt();

		while(count<exp)
		{
			power = power*n;
			count++;
		}
	
		System.out.println("Number of power is:= "+power);

	}

}