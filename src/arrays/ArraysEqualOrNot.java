package arrays;

import java.util.Arrays;

public class ArraysEqualOrNot {

	public static void main(String[] args) {

		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		
		
		//approach 1 -> using built in method of arrays class
//		boolean status = Arrays.equals(a1, a2);
//		
//		if(status==true)
//		{
//			System.out.println("Arrays are equal");
//
//		}
//		else
//		{
//			System.out.println("Arrays are not equal");
//		}
		
		
		//approach 2 -> writing logic
		
		boolean status = true;
		
		if(a1.length==a2.length)
		{
			//comparing the length of elements first
			for(int i=0; i<a1.length; i++)
			{
				if(a1[i]!=a2[i])
				{
					status = false;
				}
			}
		}
		
		else
		{
			status = false;
		}
		
		if(status==true)
		System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
		
		
	}

}
