import java.util.*;

 public class  Assignment

{

    public static void main(String x[])

   { int day;
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER A DAY NUMBER");
      day = sc.nextInt();

      if (Day == 1)
      {
         System.out.println("Monday");
      }

      else if(day == 2)
      {
         System.out.println("Thusday");
      }

      else if(day == 3)
      {
         System.out.println("wednsday");
      }

      else if(day == 4)
      {
         System.out.println("Thursday");
      }

      else if(day == 5)
      {
         System.out.println("Friday");
      }

      else if (day == 6)
      {
         System.out.println("Saturday");
      }

      else if (day == 7)
      {
         System.out.println("Sunday");
      }

      else 
      {
         System.out.print("Invalid");
      }

   }

 }