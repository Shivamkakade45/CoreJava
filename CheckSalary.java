//Write a C program to input basic salary of an employee and calculate its Gross salary according to following:

//Basic Salary angle= 10000 : HRA = 20%, DA = 80%

//Basic Salary <= 20000 : HRA = 25%, DA = 90%

//Basic Salary > 20000: HRA = 30%, DA = 95%

import java.util.*;

public class CheckSalary
{


    public static void main(String x[])
    {

    Scanner sc = new Scanner (System.in);
    double Basic, HRA, DA, total;

    System.out.println("Enter a Basic Salary:= ");
    Basic = sc.nextDouble();

    System.out.println("Enter a HRA:= ");
    HRA = sc.nextDouble();

    System.out.println("Enter a DA:= ");
    DA = sc.nextDouble();

    total = Basic + Basic*HRA/100 + Basic*DA/100;
   

    double result = (Basic == 10000)? total: (Basic <= 20000 && Basic>10000)? total: (Basic>20000)?total:Basic;

    System.out.println(result);

    } 



}
