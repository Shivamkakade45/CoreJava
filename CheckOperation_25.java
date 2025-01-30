
import java.util.*;

public class CheckOperation_25

{

   public static void main(String [] args)

   {
	int choice, n1, n2, result;
	Scanner sc = new Scanner (System.in);
	System.out.println("1.Addition.\n2.Subtraction.\n3.Multiplication.\n4.Division.\n5.Module.\n");
	System.out.println("Enter your choice");
	choice = sc.nextInt();

	switch(choice)
	{

	case 1:
		System.out.println("Addition");
		System.out.println("Enter a number:= ");
		n1 = sc.nextInt(); 
		n2 = sc.nextInt(); 
		result = (n1+n2);
		System.out.println("Addition is:= "+result);
		break;

	case 2:
		System.out.println("Subtraction");
	        System.out.println("Enter a number:= ");
		n1 = sc.nextInt(); 
		n2 = sc.nextInt(); 
		result = (n1-n2);
		System.out.println("Subtraction is:= "+result);
		break;

	case 3:
		System.out.println("Multiplication");
		System.out.println("Enter a number:= ");
		n1 = sc.nextInt(); 
		n2 = sc.nextInt(); 
		result = (n1*n2);
		System.out.println("Multiplication is:= "+result);
		break;

	case 4:
		System.out.println("Division");
		System.out.println("Enter a number:= ");
		n1 = sc.nextInt(); 
		n2 = sc.nextInt(); 
		result = (n1/n2);
		System.out.println("Division is:= "+result);
		break;
	case 5:
		System.out.println("Module");
	        System.out.println("Enter a number:= ");
		n1 = sc.nextInt(); 
		n2 = sc.nextInt(); 
		result = (n1%n2);
		System.out.println("Module is:= "+result);
		break;
	
	default:

	       System.out.println("Invalid data");

       }

   }

}

