//  Q4. Write a java program to input basic salary of an employee and calculate its Gross salary according to following.
			//Basic Salary <= 10000 : HRA = 20%, DA = 80%
			//Basic Salary <= 20000 : HRA = 25%, DA = 90%
			//Basic Salary > 20000 : HRA = 30%, DA = 95%

import java.util.*;

public class CheckTotalSalary_25

{

   public static void main(String [] args)

   {

	int basic, salary, hra, da;
	Scanner sc = new Scanner (System.in);
	System.out.println("enter a basic salaray");
        basic = sc.nextInt();

	if(basic <= 10000){

	System.out.println("enter da");
	da = sc.nextInt();
	System.out.println("enter a hra");
	hra = sc.nextInt();
	salary = basic + (basic*hra)/100 + (basic*da)/100;
	System.out.println("Total Salary is:= "+salary);
	}
	else if(basic <= 20000){

	System.out.println("enter da");
	da = sc.nextInt();
	System.out.println("enter a hra");
	hra = sc.nextInt();
	salary = basic + (basic*hra)/100 + (basic*da)/100;
	System.out.println("Total Salary is:= "+salary);
	}
	else if(basic > 20000){

	System.out.println("enter da");
	da = sc.nextInt();
	System.out.println("enter a hra");
	hra = sc.nextInt();
	salary = basic + (basic*hra)/100 + (basic*da)/100;
	System.out.println("Total Salary is:= "+salary);

	}
	else {

	System.out.println("Invalid data");

	}

   }

}