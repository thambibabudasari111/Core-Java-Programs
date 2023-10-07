package stringsPrograms;

public class Palindrome {

	public static void main(String[] args) {

		String str = "madam";
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
			
		}
		
		System.out.println("Reversed string is: "+rev);
		
		if(rev.equals(str))
		{
			System.out.println("Given string is palindrome: "+rev);
		}
		else {
			System.out.println("Not a palindrome: "+rev);
		}
		
	}

}
