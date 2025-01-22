//Write a c program to check whether triangle is equilateral, isoscale or scalene.

import java.util.*;

public class CheckTriangle
{


    public static void main(String x[])
    {

    Scanner sc = new Scanner (System.in);
    int a,b,c;
    System.out.println("Enter a three Side of Triange:= ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
   
    String result = (a==b) && (a==c) && (b==c)? "Tringle":(a==b) && (a==c) && (b!=c)? "isoscale":(a!=b) && (a!=c) && (b!=c)?"scalene":"Invalid";

    System.out.println(result);

    } 



}
