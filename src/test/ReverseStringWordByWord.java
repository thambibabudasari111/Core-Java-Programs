package test;

public class ReverseStringWordByWord {

	public static void main(String[] args) {

		String str = "thambi babu dasari"; 
		
		String revString = "";
		
		String[] words = str.split(" ");   //splitting string into words
		
		for(String w:words) {
			String revWords = "";
			for(int i=w.length()-1;i>=0;i--)
			{
				revString +=w.charAt(i);
			}
			revString +=revWords+" "; 
		}
		System.out.println("Reverse string: "+revString);	
	}
}
