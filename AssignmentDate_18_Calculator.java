// Write a Java program to build a simple calculator. The program should:

//- Take two numbers as input.
//- Take an operator (+, -, *, /) as input.
//- Perform the corresponding operation using if-else.
//- Display an error message if an invalid operator is entered or if division by zero is attempted.

import java.util.*;

 public class  AssignmentDate_18_Calculator

{

    public static void main(String x[])

   {

     double a,b;

     Scanner sc = new Scanner (System.in);
     System.out.print("ENTER NUMBER OF A:= ");
     a= sc.nextDouble();

     System.out.print("ENTER NUMBER OF B:= ");
     b= sc.nextDouble();
     
     System.out.print("ENTER OPERATOR:= ");
     char operator = sc.next().charAt(0);

     if (operator == '*'){
        System.out.println(a*b);
     }

     else if (operator == '/'){
        System.out.println(a/b);
     }

     else if (operator == '%'){
        System.out.println(a%b);
     }

     else if (operator == '+'){
        System.out.println(a+b);
     }
     else if (operator == '-'){
        System.out.println(a-b);
     }
     
     else {
       System.out.println("Invalid Operator");
     }

   }

}
