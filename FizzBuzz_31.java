import java.util.*;

class FizzBuzz_31
{
	public static void main(String x[])
	{
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number");
		n = sc.nextInt();
		
		if((n%3 == 0) && (n%5 == 0) ){
		System.out.println("FizzBuzz");
		}
		else if(n%3 == 0) {
		System.out.println("Fizz");
		}
		else if(n%5 == 0){
		System.out.println("Buzz");
		}
		else {
		System.out.println("not Fizz and not Buzzd  Number");
		}

	}


}