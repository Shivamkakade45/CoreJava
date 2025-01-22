// Write a C program to input marks of five subjects Physics, Chemistry, Biology.

//Mathematics and Computer, calculate percentage and grade according to given conditions:

//percentage >= 90% : Grade A

//percentage >= 80% : Grade B

//percentage >= 70% : Grade C

//percentage >= 60% Grade D

//percentage >= 40% Grade E

//percentage < 40% : Grade F





import java.util.*;

public class PerApp
{

    public static void main(String x[])
    {

       double percentage, marks, total,phy, chem, bio;

Scanner sc = new Scanner (System.in);

System.out.println("Enter Phy marks");
phy = sc.nextDouble();


System.out.println("Enter chem marks");
chem = sc.nextDouble();

System.out.println("Enter bio marks");
bio = sc.nextDouble();

total = phy + chem + bio;

percentage = (total/300)*100;


       if (percentage >= 90){
      
           System.out.println("Grade A ");

           } 

       else if (percentage >= 80){

      
           System.out.println("Grade B ");
 
           } 

       else if (percentage >= 70){

            System.out.println("Grade C ");
       
           } 

       else if (percentage >= 60){
      
            System.out.println("Grade D ");

           } 

       else if (percentage >= 40){
      
            System.out.println("Grade E ");

         } 

       else {

            System.out.println("Grade F ");

         } 


}

}