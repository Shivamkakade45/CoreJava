
//Q.Write a menu driven program for following
//1.Area of Circle
//2.Area of Triangle
//3.Area of Rectangle
//4.Area of Square

import java.util.*;

public class CheckAreaOfTringle_25
{

   public static void main(String[]args)

    {

        double l,b,r,w,area,pi = 3.14;
	int choice;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Area of circle.\n2.Area of Triangle.\n3.Area of Rectangle.\n4.Area of Square.");
	System.out.println("Enter a choice:=");
	choice = sc.nextInt();

	switch(choice)
	{
	 case 1:
		System.out.println("Area of circlr");
		System.out.println("Enter radius:= ");
		r = sc.nextDouble();
		area = (pi*(r*r)); 
		System.out.println(area);
		break;

		case 2:
		System.out.println("Area of Triangle");
		System.out.println("Enter l & b:= ");
		l = sc.nextDouble();
		b = sc.nextDouble();
		area = (l*b)/2; 
		System.out.println(area);
		break;

		case 3:
		System.out.println("Area of Rectangle");
		System.out.println("Enter l & w:= ");
		l = sc.nextDouble();
		w = sc.nextDouble();
		area = (l*w); 
		System.out.println(area);
		break;

		case 4:
		System.out.println("Area of Square");
		System.out.println("Enter l&l:= ");
		l = sc.nextDouble();
		l = sc.nextDouble();
		area = (l*l); 
		System.out.println(area);
		break;

	default:
		System.out.println("Invalid");

	}

    }

}