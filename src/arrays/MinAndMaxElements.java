package arrays;

public class MinAndMaxElements {

	public static void main(String[] args) {

		
		int a[] = {40, 59, 10, 80, 90};
		
		int max = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		System.out.println("Maximum element in array: "+ max);
		
		//int a1[] = {10, 5, 20, 30, 40};
		int min = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		System.out.println("Minimum elemenet in array: "+min);
		
	
		
	}

}
