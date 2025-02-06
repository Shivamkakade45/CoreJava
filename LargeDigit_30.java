//3) find largest digit

import java.util.*;

class LargeDigit_30

{

	public static void main(String [] x)
	{
		int no,lar=0,r;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		no = sc.nextInt();
		
		while(no > 0)
		{
			r = no % 10;
			if(lar < r)
			{
			lar = r;
			}

			no = no/10;
		}

		System.out.printf("largest number is:="+lar);

	}


}

    


   



	
	