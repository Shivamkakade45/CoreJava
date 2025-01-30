----------------------------------------------------------------------------------------------------
//Q.Write a menu driven program for following
//1.Area of Circle
//2.Area of Triangle
//3.Area of Rectangle
//4.Area of Square

import java.util.*;

public class CheckTringle_25
{

   public static void main(String[]args)

    {

       int choice,l,b,r,area,pi;
	Scanner sc = new Scanner(System.in);
	System.out.println("1).Area of circle.\n2).Area of Triangle.\n3).Area of Rectangle.\n4).Area of Square.");
	System.out.println("Enter a choice:=");
	choice = sc.nextInt();

	switch(choice)
	{
	 case 1:
		System.out.println("Area of circlr");
		System.out.println("Enter radius:= ");
		r = sc.nextInt();
		pi = 3.14
		area = (int)pi*(r*r); 
		System.out.println(area);

	default:
		System.out.println(invalid);

	}

    }

}