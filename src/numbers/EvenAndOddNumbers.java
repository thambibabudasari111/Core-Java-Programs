package numbers;

public class EvenAndOddNumbers {

	public static void main(String[] args) {

		
		int a[] = {1, 3, 4, 2, 6, 8, 9};
		
		//extract even numbers
		System.out.println("Even numbers: ");
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Odd numbers: ");
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);		}
		
			
		
		
	}

}
