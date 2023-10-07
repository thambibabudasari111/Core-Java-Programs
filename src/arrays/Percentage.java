package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Percentage {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ask how many subjects
		System.out.println("How many subject? ");
		int n = Integer.parseInt(br.readLine());
		
		//create 1D array with size n
		int marks[] = new int[n];
		
		//store elements into the array
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter marks: ");
			marks[i] = Integer.parseInt(br.readLine());
		}
		
		//find total marks
		int tot = 0;
		for(int i=0; i<n; i++)
		{
			tot += marks[i];
		}
		
		//display total marks
		System.out.println("Total marks: "+tot);
		
		//find percentage
		float percent = tot/n;
		System.out.println("Percental of marks: "+percent);
	}
	

}
