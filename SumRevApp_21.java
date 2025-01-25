import java.util.*;

public class SumRevApp_21

{
   public static void main(String []x)
   {
	
     int no, num, sum=0,result

     Scanner sc = new Scanner (System.in);
     System.out.println("Enter a number");
     no = sc.nextInt();

     num = no%10;
     sum = sum + num;
     no = no / 10;
     result = num*1000; 

     num = no%10;
     sum = sum + num;
     no = no / 10;
     result = result + num*100; 
 
     num = no%10;
     sum = sum + num;
     no = no / 10;
     result = result + num*10; 

     num = no%10;
     sum = sum + num;
     no = no / 10;
     result = result + num*1; 

     

     System.out.println("Sum  of digit is:= "+sum);
     System.out.println("reverce of number is :="+result);
     


  }

}