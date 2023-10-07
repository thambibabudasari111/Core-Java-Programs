package programs.arrays;

public class ArraySorting_BubbleSort {

	/*
	 * Sorting an array using bubble sort technique
	 */
	public static void main(String[] args) {

		//declare an array and initialize the values
		int arr[] = {20,10,39,40,29,5};
		
		boolean flag = false;
		
		int temp;
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false) break;
			else flag=false;
		}
		
		System.out.println("Sorted array: ");
		for(int i=0; i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
