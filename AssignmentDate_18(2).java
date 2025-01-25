// Categorize Age Group ?
//  Write a Java program to take an individual's age as input and categorize them into one of the following age groups using if-else:

//- Child (below 13 years)
//- Teenager (13 to 19 years)
//- Adult (20 to 59 years)
//- Senior citizen (60 years and above)


import java.util.*;

public class AssignmentDate_18(2)

{

  public static void main (String x[])

{

    Scanner sc = new Scanner (System.in);
    int age;
    System.out.println("Enter Number age:= ");

    age = sc.nextInt();

    if (age < 13) {

       System.out.println("Chaild");
    }

    else if (age <= 13 && age >=19) {

       System.out.println("teenager");

    }

    else if (age >= 20 &&  age <= 59) {

       System.out.println("Adult");

    }

    else if ( age >= 59 ) {

      System.out.println("Senior");
 
    }

    else  {

      System.out.println("invalid");

    }

  }

}