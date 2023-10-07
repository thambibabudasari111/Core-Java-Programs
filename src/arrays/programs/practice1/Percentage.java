package arrays.programs.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Percentage {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		//create BufferedReader object
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ask to enter subjects
		System.out.println("How many subjects?: ");
		int n = Integer.parseInt(br.readLine());
		
		
		//create 1D array
		int marks[] = new int[n];
		
		//Enter subject details
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Enter marks: ");
			marks[i] = Integer.parseInt(br.readLine());
		}
		
		//find the total marks
		int total = 0;
		
		for(int i=0; i<n; i++)
		{
			total +=marks[i];
		}
		
		//display total marks
		System.out.println("Total marks: "+total);
		
		
		//find percentage
		float percent = (float)total/n;
		
		System.out.println("Percentage = "+percent);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
