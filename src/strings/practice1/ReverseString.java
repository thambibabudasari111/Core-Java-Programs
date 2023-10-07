package strings.practice1;

public class ReverseString {

	public static void main(String[] args) {

		reverseString("this is a string reverse program");
	}

	public static String reverseString(String inputString)
	{
		System.out.println("original string: "+inputString);
		System.out.println(inputString.length());
		
		String revString = "";
		
		for(int i=inputString.length()-1; i>=0; i--)
		{
			revString = revString + inputString.charAt(i);
		}
		
		System.out.println("reverse string: "+revString);
		
		return revString;
		
	}
}
