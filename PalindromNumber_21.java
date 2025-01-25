//WAP to check whether 4 digit number is palindrom or not.

import java.util.*;

public class PalindromNumber_21

{
        public static void main(String []args)
       
        {
                  
               Scanner sc = new Scanner (System.in);
               int n,rev;
               System.out.println("enter a number:= ");
               n = sc.nextInt();

               rev = (n%10)*1000  +   ((n/10)%10)*100   +  ((n/10)%10)*10  +  (n/1000);  // most important in this equation the tne value of (n) in first step not change they stay assitise in a second step 
     

               if (n == rev)
               {
                  System.out.println(" Number is Palindrom");
               }
               
               else
               {
                  System.out.println(" Number is not Palindrom");
               }

         }

}
              

