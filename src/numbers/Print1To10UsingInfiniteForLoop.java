package numbers;

public class Print1To10UsingInfiniteForLoop {

	/*
	 * To display numbers from 1 to 10 using infinite for loop
	 */
	
	
	public static void main(String[] args) {

		int x=1;
		
		for(; ;)
		{
			System.out.println(x);
			x++;
			if(x>10) break; //if x value exceeds 10, then come out of the loop
		}
		
	}

}
