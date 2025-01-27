

import java.util.*;

public class AlphaVowelNumber_22

{
    public static void main(String[] args)

    {
	
	Scanner sc = new Scanner (System.in);
	char ch;
	System.out.println("Enter Alphabet:= ");
	ch = sc.next().charAt(0);

        if (((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z'))){
	
	    System.out.println("it is alphabet");

          if (((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) || ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))){

		System.out.println("it is vowel");

          }

		else {
			System.out.println("not Vowel");
		}
	}

	else{

 		 System.out.println("Not alphabet");

	}
     }

}