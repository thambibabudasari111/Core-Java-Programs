package stringsPrograms;

public class ReverseEachWord {

	public static void main(String[] args) {

		
		String str = "Java program with selenium";
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev +=str.charAt(i);
		}
		
		System.out.println("reverse string: "+rev);
		int len = rev.length();
		
		System.out.println(len);
	}

}
