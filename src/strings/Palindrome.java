package strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		/*
		 * A palindrome string is a string that remains the same when it's
		 * characters are reversed
		 * ex: madam
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.next();
		
		String org_str = str;
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev =rev+str.charAt(i);
		}
		
		if(org_str.equals(rev))
		{
			System.out.println("Palindrome ");
		}
		else
		{
			System.out.println("Not palindrome ");
		}
		
	}
}
