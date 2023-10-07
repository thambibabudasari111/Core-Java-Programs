package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWordsWithBuiltInMethod {

	public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the string: ");
		String str = br.readLine();
		
		String[] words = str.split("\\s");
		
		String reverseWord = "";
		
		for(String w: words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			reverseWord = reverseWord+sb.toString()+" ";	
		}
		
		System.out.println(reverseWord);
	}

}
