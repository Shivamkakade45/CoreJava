import java.util.*;

class Weekday_31
{

	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Week Number"); 
		int month = sc.nextInt();

		switch(month)
		{
		case 1,2,3,4,5:
				System.out.println("Weekday");
				break;

		case 6,7:
			System.out.println("Weekend");
			break;

		default:
			System.out.println("Invalid Day");

		}
		
	}

}