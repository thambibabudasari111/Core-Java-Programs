package strings;

public class GetCharFromString {

	public static void main(String[] args) {

		String str = "this is a string";
		
		char ch = getChar(str, 5);
		
		System.out.println(ch);
		
		

	}
	
	public static  char getChar(String str, int index)
	{
		return str.charAt(index);
	}

}
