package strings.practice1;

public class ReverseEachWordOfString {

	/*
	 * Reverse a string word by word
	 */
	public static void main(String[] args) {

		
		String str = "my name is thambi babu"; //original string
		
		String revString = "";
	
		String[] words = str.split(" "); //splitting string into words
		
		for(String w:words)
		{
			String revWords = "";
			
			for(int i=w.length()-1; i>=0; i--)
			{
				revString = revString+w.charAt(i);
			}
			
			revString = revString+revWords+" "; //ym eman si ibmaht ubab
		}
		
		System.out.println(revString);
		
	}
}
