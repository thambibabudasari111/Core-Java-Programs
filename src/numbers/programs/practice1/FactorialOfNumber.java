package numbers.programs.practice1;

public class FactorialOfNumber {

	public static void main(String[] args) {

		factorial(5);
	}
	
	public static void factorial(int number)
	{
		int fact = 1;
		for(int i=1; i<=number; i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial of a number: "+fact);
	}

}
