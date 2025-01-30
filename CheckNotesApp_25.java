//Write a C program to find total number of notes in given amount. How to write a C program to print total number 
//		of notes in given amount. C program to print total number of notes in given amount.
		
//		Enter the amount: 2528

//		Expected output:

//		500=5
//		100=0
//		50=0
//		20=1
//		10=0
//		5=1
//		2=1
//		1=1

import java.util.*;

public class CheckNotesApp_25

{

  public static void main (String []args)

   {
	int notes, amount;
        Scanner sc = new Scanner (System.in);
	System.out.println("Enter amount");
	amount = sc.nextInt();

	if(amount>= 500){
        notes = amount/500;
	amount = (amount - notes*500);
	System.out.println("Number of 500 notes:= "+notes);
	 }
	if (amount>= 200){
	notes = amount/200;
	amount = amount - notes*200;
	System.out.println("Number of 200 notes:= "+notes);
	}
	if (amount>= 200){
	notes = amount/100;
	amount = amount - notes*100;
	System.out.println("Number of 100 notes:= "+notes);
	}
        if (amount>= 50){
	notes = amount/50;
	amount = amount - notes*50;
	System.out.println("Number of 50 notes:= "+notes);
	}
	if (amount>= 20){
	notes = amount/20;
	amount = amount - notes*20;
	System.out.println("Number of 20 notes:= "+notes);
	}
	if (amount>= 10){
	notes = amount/10;
	amount = amount - notes*10;
	System.out.println("Number of 10 notes:= "+notes);
	}
        if (amount>= 5){
	notes = amount/5;
	amount = amount - notes*5;
	System.out.println("Number of 5 rupes:= "+notes);
	}
	if (amount>= 2){
	notes = amount/2;
	amount = amount - notes*2;
	System.out.println("Number of 2 rupes:= "+notes);
	}
	if (amount>= 1){
	notes = amount/1;
	amount = amount - notes*1;
	System.out.println("Number of 1 rupes:= "+notes);
	}
   }

}
        