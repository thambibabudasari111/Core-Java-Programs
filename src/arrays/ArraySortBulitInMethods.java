package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortBulitInMethods {

	public static void main(String[] args) {

		//declare and initialize the array
		int arr[] = {30,50,40,10,20};
		
		
		System.out.println("Before swapping: "+Arrays.toString(arr));
		
		//using built in method to sort an array
		Arrays.sort(arr);
		
		System.out.println("After swapping: "+Arrays.toString(arr));
		
		
		//reverse the sorting order using built in method
		Integer a[] = {30,50,40,10,20};
		Arrays.sort(a, Collections.reverseOrder());
		
		System.out.println("After reverse swapping: "+Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
		
	}

}
