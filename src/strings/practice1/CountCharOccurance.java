package strings.practice1;

public class CountCharOccurance {

	public static void main(String[] args) {

		
		String str =  "java programs practice";
		
		int len = str.length();
		
		int totalCount = str.replace("a", "").length();
		
		
		int count = len-totalCount;
		
		
		System.out.println(count);
		
		
		
		
	}

}
