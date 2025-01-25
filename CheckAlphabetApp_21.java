// WAP check given number is alphabet or not.

import java.util.*;

public class CheckAlphabetApp_21

{
    public static void main(String[] args)

    {
	char ch;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Character:= ");
	ch = sc.next().charAt(0);

	if (((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch<= 'z'))){

	System.out.println("it is alphabet");

	}
        else {
	
	System.out.println("not alphabet");

	}

    }

}