import java.util.*;

public class CheckTriangleApp_25{

   public static void main(String [] args){

	int angle1, angle2, angle3;
        Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter First angle1 of angle:= ");
	angle1 = sc.nextInt();

	System.out.println("Enter Second angle2 of triangle:= ");
	angle2 = sc.nextInt();

 	System.out.println("Enter Third angle3 of triangle:= ");
	angle3 = sc.nextInt();

        if ((angle1 == angle2)  && (angle2 == angle3)){

	System.out.println(" triangle is equilateral ");

	}
	else if((angle1 == angle2) || (angle2 == angle3) || (angle3 == angle1)){

	System.out.println("triangle is Isoscale");

	}
	else {
	System.out.println("triangle is scalene");
	}

   }
    

}