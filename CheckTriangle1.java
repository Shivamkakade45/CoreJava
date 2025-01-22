//.Write a c program check whether number is positive, negative or zero.

import java.util.*;

public class CheskTringe1
{


    public static void main(String x[])
    {

    Scanner sc = new Scanner (System.in);
    int a,b,c;
    System.out.println("Enter a number:= ");
    a = sc.nextInt();
   
   
    String result = (a<0)? "Negative":(a>0)? "Positive":(a==0)?"zero":"Invalid";

    System.out.println(result);

    } 



}
