// WAP to check whether a year is leap year or not.

import java.util.*;

public class LeapYearApp_25

{

    public static void main (String []args)

     
    {

    Scanner sc = new Scanner (System.in);
    int year;
    System.out.println("Enter calender year:=");
    year = sc.nextInt();
    
     if (( year%400 == 0)|| (( year%4 == 0 ) && ( year%100 != 0))){

            System.out.println("Leap year");

       }

       else {

               System.out.println("Not a Leap year");

            }
      
   
   }  

} 
               
