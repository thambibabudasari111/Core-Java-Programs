package strings.practice1;

public class Palindrome {

	public static void main(String[] args) {

		palindromeString("madam");
		
	}
	
	public static  void palindromeString(String inputString)
	{
		String revString = "";
		
		System.out.println("original string: "+inputString);
		
		for(int i=inputString.length()-1; i>=0; i--)
		{
			revString =  revString + inputString.charAt(i);
		}
		
		System.out.println("reverse string: "+revString);
		
		if(revString.equals(inputString))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
	}

}
