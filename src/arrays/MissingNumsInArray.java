package arrays;

public class MissingNumsInArray {

	/*
	 * Write a program to find missing numbers in an array
	 */
	public static void main(String[] args) {

		
		int a[] = {1,2,3,4,5,7,8,9,10};
		
		int sum1 = 0;
		
		for(int i=0; i<a.length; i++)
		{
			sum1 += a[i];
		}
		
		System.out.println("Sum of elements in array: "+sum1);
		
		int sum2=0;
		
		for(int i=0; i<=10; i++)
		{
			sum2 += i;
		}
		
		System.out.println("Sum of range of elements: "+sum2);
		
		System.out.println("Missing number: "+(sum2-sum1));
		
		
	}

}
