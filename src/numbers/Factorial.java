package numbers;

public class Factorial {

	public static void main(String[] args) {

		//5! = 5*4*3*2*1;
		
		
		int num = 5;
		
		long factorial = 1;
		
		for(int i=1; i<num; i++)
		{
			factorial += i;
		}
		
		System.out.println(factorial);
	}

}
