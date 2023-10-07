package programs.arrays;

public class DuplicateElemenetsOfArray {

	public static void main(String[] args) {

		int arr[] = {2,3,4,2,5,6,4};
		
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element found: "+arr[i]);
					flag = true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate element not found");
		}
	}

}
