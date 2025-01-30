//Q. Write a program to check whether a given character is vowel or not  using switch statement


// WAP to check number is vowel or not.

import java.util.*;

public class CheckVowel_25
{

   public static void main(String[]args)

    {

        char ch;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character");
	ch = sc.next().charAt(0);

	switch(ch)
	{
	 case 'a':
		System.out.println("vowel");
		break;

	case 'e':
		System.out.println("vowel");
		break;

	case 'i':
		System.out.println("vowel");
		break;

	case 'o':
		System.out.println("vowel");
		break;

	case 'u':
		System.out.println("vowel");
		break;

	case 'A':
		System.out.println("vowel");
		break;

	case 'E':
		System.out.println("vowel");
		break;

	case 'I':
		System.out.println("vowel");
		break;

	case 'O':
		System.out.println("vowel");
		break;

	case 'U':
		System.out.println("vowel");
		break;

	default:

		System.out.println("Not vowel");

       }

   }

}
		