package numbers;

public class ArmstrongNumber {

	public static void main(String[] args) {

		/*
		 * 153 -> 1 5 3
		 * 		  1*1*1  5*5*5  3*3*3
		 * 			1    120     27
		 * 			153
		 * 
		 */
		
		int n = 141;
		
		int temp = n;
		
		int r, sum = 0;
		
		while(n>0)
		{
			r = n%10;
			n = n/10;
			sum = sum + r*r*r;
			
		}
		
		if(temp==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
		
		
		
		
		
	}

}
