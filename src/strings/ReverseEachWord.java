package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseEachWord {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the string: ");
		String str = br.readLine();
		
		String [] words = str.split(" "); //splitting string into words
		
		String reverseString = "";
		
		for(String w: words)
		{
			String reverseWord = "";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseWord = reverseWord+w.charAt(i);
			}
			
			reverseString = reverseString+reverseWord+" ";
		}
		
		System.out.println(reverseString);
		
		
		
		
		
		
		
		
		
	}

}
