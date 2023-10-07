package programs.arrays;

public class SeachNumInArray {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50};
		int searchElement=40;
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==searchElement)
			{
				System.out.println(searchElement+" is found at index "+i);
			}
		}
		
		
		
		
		
		
		
	}

}
